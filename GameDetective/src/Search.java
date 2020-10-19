//Filename: Search.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The Search class looks for whichever line (record) of data matches the inputed value and displays it.

import java.io.*; 
class Search { 

   /** Construct searching
   *@param fileName  the external file
   *@param data   2d array containing the records
   *@param item  which category is being searched for 
   *@param input   entered input*/

   void searching (String fileName, String data[][], int item, String input) { 
         // item = part to be found 
      boolean found = false; 
      for (int i = 0; i < data.length; i++) { // Search for records 
         if (data[i][item].equals(input)) { 
            found = true; 
            for (int k = 0; k < 6; k++) 
               System.out.print(data[i][k] + "\t\t"); // Output entire record 
            System.out.println(); 
         } // end if 
      } // end loop 
      if (!found) 
         System.out.println("No record found!"); 
   } // end searching 
} // end Search 