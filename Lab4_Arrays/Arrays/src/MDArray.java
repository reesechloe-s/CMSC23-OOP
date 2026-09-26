public class MDArray {
    public static void main(String[] args) {
        int temp;

        // 1. Create a 10x20 2-D array[cite: 5]
        // The first bracket [10] is the number of rows, the second [20] is the number of columns[cite: 5].
        int[][] grid = new int[10][20];

        // 2. Assign values to specific cells using [row][column] coordinates[cite: 5]
        grid[0][0] = 1;     // Top-left corner[cite: 5]
        grid[9][19] = 2;    // Bottom-right corner (indexes start at 0, so 10-1=9 and 20-1=19)[cite: 5]
        grid[0][9] = 13;    // First row, 10th column[cite: 5]

        // 3. Get dimensions[cite: 5]
        // Calling .length on the main grid variable gives you the number of ROWS[cite: 5].
        temp = grid.length;      // rows[cite: 5]
        System.out.println("Number of rows: " + temp);

        // Calling .length on a specific row (like row 0) gives you the number of COLUMNS in that row[cite: 5].
        temp = grid[0].length;   // columns[cite: 5]
        System.out.println("Number of columns: " + temp);

        // 4. Treat the first row as a 1-D array[cite: 5]
        // In Java, a 2D array is literally just an "array of arrays"[cite: 1, 5].
        // You can extract a single entire row and save it as a standard 1D array[cite: 5].
        int[] array = grid[0];

        // Check the length of this newly extracted 1D array[cite: 5]
        temp = array.length;
        System.out.println("Length of first row: " + temp);

        // Access the 10th element (index 9) of this extracted row[cite: 5].
        // This proves that array[9] holds the exact same data as grid[0][9][cite: 5].
        temp = array[9];
        System.out.println("Value at array[9]: " + temp);
    }
}