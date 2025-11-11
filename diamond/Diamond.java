import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); 
        int size; 

        System.out.print("Enter an integer: "); 
        size = scanner.nextInt(); 
        
        while(size <= 0) { 
            System.out.print("Please enter a positive number: ");
            size = scanner.nextInt();
        } 
        int half = (size / 2) + 1;  // include the middle row
        int otherHalf = size - half; 

     
        if (size % 2 != 0) { 
            for (int row = 1; row <= half; row++) { 
                for (int col = 1; col <= half - row; col++) {
                    System.out.print(" ");
                } 
                for (int col = 1; col <= row * 2 - 1; col++) {
                    System.out.print("*");
                } 
                System.out.println();
            }  
            for (int row = otherHalf ; row > 0; row--) { 
                for (int col = 1; col <= half - row; col++) {
                    System.out.print(" ");
                } 

                for (int col = 1; col <= row * 2 - 1; col++) {
                    System.out.print("*");
                } 
                System.out.println();
            }

        }else { 
            for (int i = 1; i <= size; i++) {
                System.out.print(" ");  
            } 
             System.out.println("*");

            for (int row = 1; row < half; row++) {
                for (int col = 1; col < half - row; col++) { 
                    System.out.print("  ");  
                } 
                for (int col = 1; col <= row*2; col++) {
                    System.out.print(" *");  
                } 
                System.out.println();
            } 
            for (int row = otherHalf; row > 0; row--) {
                for (int col = 1; col < half - row; col++) {
                    System.out.print("  ");  
                } 
                for (int col = 1; col <= row*2; col++) {
                    System.out.print(" *");                
                } 
                System.out.println(); 
            }     
            for (int i = 1; i <= size; i++) {
                 System.out.print(" "); 
            }
                 System.out.println("*");
        }
        
        scanner.close();
   }
}
