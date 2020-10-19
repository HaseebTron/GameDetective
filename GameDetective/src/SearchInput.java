//Filename: SearchInput.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The SearchInput class recieves keyboard inputs to use for searching for the correct item.

import java.io.*; 
class SearchInput { // Prepare keyboard to receive data 

   /** Construct keyInput
   *@param fileName  the external file
   *@param data   2d array containing the records
   *@param item  which category is being searched for*/

   public void keyInput (String fileName, String data[][], int item) 
   { 
      DataInput d = new DataInputStream(System.in); 
      String input; 
      Search s = new Search(); 
      System.out.println("\nEnter the game name (case sensitive) to search for: ");
      try { 
            input = d.readLine();
            if (input!=null)
            { 
               System.out.println("Searching...\n");
               s.searching(fileName,data,item,input);
            } 
      } catch (IOException ignored) { } 
   } // end keyInput 
} // end SearchInput 