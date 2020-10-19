//Filename: ReadData.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The ReadData class reads the records.txt file using the readfile method.

import java.io.*;
class ReadData { // Read data from external file using readFile() method

   /** Construct readFile
   *@param fname  the external file (records.txt)
   *@param max   the number of files that can be read*/

   public String[] readFile(String fname, int max) { // fname = "records.txt"
   String data[] = new String[max]; // max = maximum number of records
   for(int k = 0; k < max; k++) // Initialize data array to store max records
      data[k] ="";
   int i = 0;  // Start counting records
   try {
      DataInput in = new DataInputStream(new FileInputStream(fname));
      String txt = in.readLine();
      while (txt!= null) {
         data[i++] = txt; // Store record in array, data; and increment i
         txt = in.readLine();
      } // end while
    } catch (Exception e){};
    return data;     // Return the entire array of records
    } // end readFile
} // end readData