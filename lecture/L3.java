package lecture;

public class Lec3 {
    
    public static void main(String[] args) {
        // Step 1: Create an array of size 5
        int[] marks = new int[5];

        // Step 2: Assign values
        marks[0] = 90;
        marks[1] = 85;
        marks[2] = 70;
        marks[3] = 95;
        marks[4] = 88;

        // Step 3: Print values using a loop
        System.out.println("Marks of students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // Step 4: Using enhanced for loop (shorter way)
        System.out.println("\nPrinting again using enhanced for loop:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}


