public class App {
    public static void main(String[] args) throws Exception {
        int[][] arr2d = createArray2d(3, 3);
        printArray2d(arr2d);
    }

    public static void printArray2d(int[][] array2d) {

        System.out.println("The array created is shown belows:");
        for(int i = 0; i < array2d.length; i++) {
            for(int j = 0; j < array2d[0].length; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createArray2d(int rows, int cols) {
        int[][] arr2d = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr2d[i][j] = (int)(Math.random() * 100);
            }
        }

        return arr2d;
    }

    
}
