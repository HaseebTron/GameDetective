//Filename: Search2.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The class Search 2 looks for the record that needs to be deleted the outputs the new record. 

import java.io.*;
class Search2 { // returns array after deleting

   /** Construct searching
   *@param fileName  the external file
   *@param data   2d array containing the records
   *@param item  which category is being searched for 
   *@param input   entered input*/

   void searching(String fileName, String data[][], int item, String input) {
            // item:o=name etc
      boolean found = false;
      System.out.println(data.length);
      for (int i = 0; i < data.length; i++) { // Search for records 
         if (data[i][item].equals(input)) { 
            found = true;
               System.out.println("Record deleted:");
               for (int k = 0; k < 6; k++) {
                  System.out.print(data[i][k] + "\t\t"); // Output the entire record
                  data[i][k]=""; // Erase the record items
            }
            System.out.println();
         } // end if
      } // end loop
      if(!found)
         System.out.println("No record found!");
      UpdateRecords ur = new UpdateRecords();
      ur.updateFile(fileName, data);
   } // end searching
} // end Search 2
                