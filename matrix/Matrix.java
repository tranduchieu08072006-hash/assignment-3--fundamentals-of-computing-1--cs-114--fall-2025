public class Matrix { 
    private int matrix[][];  

    public Matrix(int size) {
        matrix = new int[size][size]; 
        System.out.println("Your matrix is " + size + " x " + size + "\n");
    }

    public void printMatrix() { 
        for (int row = 0; row < matrix.length; row++) { 
            for (int col = 0; col < matrix[row].length; col++) { 
                if (row + col == matrix.length - 1) {
                    System.out.printf("\u001B[33m%8d\u001B[0m", matrix[row][col]);
                }else { 
                    System.out.printf("%8d", matrix[row][col]);
                }
            } 
            System.out.println();
        }   
    }  

    public void populateMatrix() {  
        int value = 1; 
        for (int row = 0; row < matrix.length; row++) { 
            for (int col = 0; col < matrix[row].length; col++) { 
                matrix[row][col] = value++; 
            }
        }
    } 

    public void swap(int x1, int y1, int x2, int y2) { 
        int tempValue = matrix[x1][y1]; // create a temporary variable to save the value 
        matrix[x1][y1] = matrix[x2][y2]; 
        matrix[x2][y2] = tempValue; // assign the value from the temporary variable 
    } 

    public void flipMatrix() { 
        int size = matrix.length; 
        for (int row = 0; row < size; row++) { 
            for (int col = 0; col < size; col++) { 
                if (row + col < size -1) { 
                    swap(row, col, size - 1 - row, size - 1 - col); 
                }
            }
        }
    }
}
