package lecture;

public class Linearsearch {

    
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] marks = {90, 85, 70, 95, 88};

        int key = 95; 
        int result = linearSearch(marks, key);

        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}
