package Lecture;

public class TwoDarrray {
    public static void main(String[] args) {
        
        int[][] m = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        
        System.out.println("Matrix values:");
        for (int i = 0; i < m.length; i++) {          
            for (int j = 0; j < m[i].length; j++) {   
                System.out.print(m[i][j] + " ");
            }
            System.out.println();  
        }
    }
}

