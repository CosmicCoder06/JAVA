package Lecture;

import java.util.ArrayList;
import java.util.ListIterator;


public class Listiterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator(list.size());

        System.out.println("Backward Traversal:");

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        System.out.println();
    }
}

// import java.io.File;
// import java.io.IOException;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.BufferedReader;



// public class FileHandelling {
//     public static void main(String[] args) throws IOException {
//        try {
//            File file = new File("data.txt");
//            if (file.createNewFile()){
//                System.out.println("File Succesfully Created");
//            }
//            else {
//                System.out.println("File Already  Exist");
//            }
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

//        //Writing the File

//        try {
//            FileWriter fw =new FileWriter("data.txt");
//            fw.write("Hello I AM Ayush sharma");
//            fw.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
       

//        //Read th File content character by character

//       try {
//           FileReader fr = new FileReader("data.txt");
//           int ch;

//           while ((ch= fr.read()) != -1){
//               System.out.print((char)ch);
//           }
//           fr.close();
//       }
//       catch (IOException e){
//           e.printStackTrace();
//       }

//         System.out.println();

//       // Read The File content line by line

//         try {
//             BufferedReader bfr = new BufferedReader(new FileReader("data.txt"));

//             String str;

//             while ((str = bfr.readLine()) != null){
//                 System.out.println(str);
//             }
//         }
//         catch (IOException e){
//             e.printStackTrace();
//         }
// //
        


//     }
// }

// import java.util.*;


// class Boy implements Comparable<Boy> {
//     private String name;
//     private int age;
//     private String branch;

//     public Boy(String name, int age, String branch){
//         this.name = name;
//         this.age = age;
//         this.branch = branch;
//     }


//     public int compareTo(Boy b){
//         return this.age-b.getAge();
//     }



//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getBranch() {
//         return branch;
//     }

//     public void setBranch(String branch) {
//         this.branch = branch;
//     }
// }

// public class comparable {
//     public static void main(String[] args) {
//         ArrayList<Boy> list = new ArrayList<>();
//         list.add(new Boy("Jatin",19,"CS"));
//         list.add(new Boy("Kanhaiya",18,"CS"));
//         list.add(new Boy("Ayush",24,"CS"));
//         list.add(new Boy("Kartik",6,"CS"));
//         list.add(new Boy("Sanat",13,"CS"));        


//         Collections.sort(list);

//         for(Boy b: list){
//             System.out.println(b.getName()+" "+b.getBranch()+" "+b.getAge());
//         }



//     }
// }

// import java.util.*;
// class Man{
//     private String name;
//     private int age;
//     private String branch;


//     public Man(String name, int age, String branch){
//         this.name = name;
//         this.age = age;
//         this.branch = branch;
//     }
//     //Creating getter


//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getBranch() {
//         return branch;
//     }
// }

// class CompareAge implements Comparator<Man> {
//     public int compare(Man m1, Man m2){
//         return Integer.compare(m1.getAge(),m2.getAge() );
//     }
// }

// class CompareName implements Comparator<Man> {
//     public int compare(Man m1, Man m2){
//         return m1.getName().compareTo(m2.getName());
//     }
// }

// class CompareBranch implements Comparator<Man> {
//     public int compare(Man m1, Man m2){
//         return m1.getBranch().compareTo(m2.getBranch());
//     }
// }


// public class comparator {
//     public static void main(String[] args) {

//         ArrayList<Man> list = new ArrayList<>();
//         list.add(new Man("Ayush Sharma",24,"DS"));
//         list.add(new Man("Nukul",20,"CSE"));
//         list.add(new Man("Shivang",18,"CSE"));
//         list.add(new Man("Pari",16,"DS"));

//         Collections.sort(list, new CompareAge());

//         System.out.println("Comparing on the Basis of Age");
//         for(Man m:list){
//             System.out.println(m.getName()+" "+m.getBranch()+" "+m.getAge());
//         }


//         Collections.sort(list, new CompareName());
//         System.out.println("Comparing on the Basis of Name");
//         for(Man m:list){
//             System.out.println(m.getName()+" "+m.getBranch()+" "+m.getAge());
//         }

//         Collections.sort(list, new CompareBranch());
//         System.out.println("Comparing on the Basis of Branch");
//         for(Man m:list){
//             System.out.println(m.getName()+" "+m.getAge()+" "+m.getBranch());
//         }





//     }
// }