import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in); 
        int size;  
        System.out.print("Please enter the size of your matrix: ");
        size = scanner.nextInt();
            
        while (size <= 0){ 
            System.out.print("Please enter a positive number: ");
            size = scanner.nextInt();
        }
        Matrix matrix = new Matrix(size); 

        System.out.println("Printing matrix with default values");
        matrix.printMatrix();   
        
        System.out.println("\nPopulating matrix...matrix populated\n" + "\nPrinting matrix:");
        matrix.populateMatrix(); 
        matrix.printMatrix();  

        System.out.println("\nFlipping matrix...matrix flipped\n" + "\nPrinting flipped matrix:");
        matrix.flipMatrix(); 
        matrix.printMatrix();  

        scanner.close(); 
    }
}