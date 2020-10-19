//Filename: Records.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The Records class sperates the records information into 6 different components with a 2d array.

import java.util.StringTokenizer;
class Records { // Separate a line of record into 6 component parts

   /** Construct getRecords
   *@param data   2d array containing the records*/

   public String[][] getRecords(String data[]){
      int n = data.length;
      String records[][] = new String [n][6]; // Store records in 2-dimensional array
      for(int p = 0; p < n; p++) // Initialize all records
         for(int q = 0; q < 6; q++)
            records[p][q]="";
      for(int line = 0; line < n; line++){
         if(data[line].equals(""))break;
            StringTokenizer st = new StringTokenizer(data[line],"#");
            int i = 0;
            while(st.hasMoreTokens()&& i < 6){
               records[line][i] = st.nextToken(); // Store each item of the record
               System.out.print(records[line][i] + "\t\t");
               i++;
            } // end while
            System.out.println();
       } // end for
       return records;     // Return the 2-dimensional array records
    } // end getRecords
} // end Records