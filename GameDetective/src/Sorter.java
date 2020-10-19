//Filename: Sorter.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The Sorter class sorts through the records to rearrange the data in the correct format.

class Sorter {

   /** Construct sort
   *@param list the array that needs to be sorted
   *@param item  which category is being searched for*/

   public static String[][]sort(String list[][], int item) { // Input records; item = name etc
      String temp; 
      int len = list.length - 1;
      for (int i = len; i > 1; i--)
         for (int j = 0; j < i; j++)
            if (list[j][item].compareTo(list[j+1][item]) > 0) {
            for (int k = 0; k < 6; k++)
               swap(list,j,k); // swapping all 6 items
            } // end if
         return list; // return sorted list
   } // end sort 
   
   static void swap(String list[][],int index, int item){
      String temp;
      temp = list[index][item];
      list[index][item] = list[index + 1][item];
      list[index + 1][item] = temp;
   } // end swap
} // end Sorter