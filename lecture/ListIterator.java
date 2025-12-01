// package Lecture;

// import java.util.ArrayList;
// import java.util.ListIterator;


// public class Listiterator {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);
//         System.out.println(list);

//         ListIterator<Integer> listIterator = list.listIterator(list.size());

//         System.out.println("Backward Traversal:");

//         while (listIterator.hasPrevious()) {
//             System.out.print(listIterator.previous() + " ");
//         }

//         System.out.println();
//     }
// }

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;



public class FileHandelling {
    public static void main(String[] args) throws IOException {
       try {
           File file = new File("data.txt");
           if (file.createNewFile()){
               System.out.println("File Succesfully Created");
           }
           else {
               System.out.println("File Already  Exist");
           }
       }
       catch (IOException e){
           e.printStackTrace();
       }

       //Writing the File

       try {
           FileWriter fw =new FileWriter("data.txt");
           fw.write("Hello I AM Ayush sharma");
           fw.close();
       }
       catch (IOException e){
           e.printStackTrace();
       }
       

       //Read th File content character by character

      try {
          FileReader fr = new FileReader("data.txt");
          int ch;

          while ((ch= fr.read()) != -1){
              System.out.print((char)ch);
          }
          fr.close();
      }
      catch (IOException e){
          e.printStackTrace();
      }

        System.out.println();

      // Read The File content line by line

        try {
            BufferedReader bfr = new BufferedReader(new FileReader("data.txt"));

            String str;

            while ((str = bfr.readLine()) != null){
                System.out.println(str);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
//
        


    }
}