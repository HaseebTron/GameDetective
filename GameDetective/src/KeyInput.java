//Filename: KeyInput.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The KeyInput class allows for the user to enter the appropriate information in order to add a record.

import java.io.*;
class KeyInput {
    static String txt, input;
    static String items[] = new String[6];
    public static String entries(){
       DataInput keyboard = new DataInputStream(System.in);
    try{
       System.out.println("Enter Game Name");
       input = keyboard.readLine();
       txt = input; // Store name
       items[0] = input;
       int index = 1; // Get next item; item index 1 to 5
       while((input != null) && index < 6) {
          switch (index) {
             case 1: System.out.println("Enter Genre");
                break;
             case 2: System.out.println("Enter Price");
                break;
             case 3: System.out.println("Enter Release Date");
                break;
             case 4: System.out.println("Enter Rating");
                break;
             case 5: System.out.println("Enter Platform");
                break;
          } // end switch
          input = keyboard.readLine();
          txt += "#" + input;
          items[index] = input;
          index++;
       } // end while
       System.out.println("\nNew record complete.");
       System.out.println(txt);
    } catch(Exception e){}
    return txt;
   } // end entries
} // end keyInput  
        
               