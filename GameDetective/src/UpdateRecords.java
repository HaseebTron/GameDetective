//Filename: UpdateRecords.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The UpdateRecords class inputs the new data givin by the user into the records.txt file.

import java.io.*;
class UpdateRecords {

   /** Construct updateFile
   *@param fileName  the external file
   *@param data   2d array containing the records*/

   public static void updateFile(String fileName, String data[][]) { // records.txt
      try {
         File in = new File(fileName);
         FileOutputStream myout = new FileOutputStream(in);
         DataOutputStream myData = new DataOutputStream(myout);
         for(int i = 0; i < data.length; i++) { // update records
            String txt = "";
            if(data[i][0].equals(""))continue; // Omit the record
            for(int j = 0; j < 6; j++)
               txt +=data[i][j]+"#";
            myData.writeBytes(txt+"\r");
          }
          myout.close();
      } catch(Exception e){}
   } //end updateFile
} // end UpdateRecords
            