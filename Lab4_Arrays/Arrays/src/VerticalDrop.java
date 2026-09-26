public class VerticalDrop {
    public static String readColumns(char[][] grid){
        StringBuilder readCol = new StringBuilder();
        for (int i = 0; i < grid[0].length; i++){
            for (int j = 0; j < grid.length - 1; j++){
                readCol.append(grid[j][i]);
            }
        }
        return readCol.toString();
    }

    public static void main(String[] args){
        char[][] dropGrid = {
                {'a', 'b'},
                {'c', 'd'}
        };
        System.out.println(readColumns(dropGrid));
    }
}

// CRITICAL: Use grid[0].length, NOT grid[i].length.
// 'i' is tracking the column number. If the grid has more columns than rows,
// 'i' will eventually exceed the total row count. Asking Java to check the
// length of grid[i] when row 'i' doesn't exist triggers an ArrayIndexOutOfBoundsException.
// Always measure the total column limit using a row guaranteed to exist: grid[0].
