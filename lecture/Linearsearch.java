package lecture;

public class Linearsearch {

    // Method for linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        int[] marks = {90, 85, 70, 95, 88};

        int key = 95; // the number we want to search
        int result = linearSearch(marks, key);

        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}
