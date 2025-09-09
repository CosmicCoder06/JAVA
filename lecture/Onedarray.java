package lecture;

public class Onedarray {
    public static void main(String[] args) {
        
        int[] marks = new int[5];

   
        marks[0] = 90;
        marks[1] = 85;
        marks[2] = 70;
        marks[3] = 95;
        marks[4] = 88;

        
        System.out.println("Marks of students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

    
        System.out.println("\nPrinting again using enhanced for loop:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}