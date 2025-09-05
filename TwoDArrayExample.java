public class TwoDArrayExample {
    public static void main(String[] args) {
        // Create a 2D array with 3 rows and 4 columns
        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Display the array
        System.out.println("Two-Dimensional Array Elements:");
        for (int i = 0; i < numbers.length; i++) {         // Loop through rows
            for (int j = 0; j < numbers[i].length; j++) {  // Loop through columns
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println(); // Move to next row
        }
    }
}
