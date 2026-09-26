public class MinArea {
    public static int charArea(char[][] grid, char ch){
//        grid represents the entire apt building. grid.length asks how many floors (rows) does the bldg have
//        grid[i] single floor, how many columns are in that floor
//        java lacks true 2D arrays. they are array of arrays instead

//        smallest row and col record, initialized with impossibly high number
        int minRow = grid.length;
        int minCol = grid[0].length;

//        impossibly low number (largest row and col record, initialized super low)
        int maxRow = -1;
        int maxCol = -1;

        boolean ch_found = false;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == ch){
                    ch_found = true;

                    if (i < minRow){
                        minRow = i;
                    }
                    if (i > maxRow) {
                        maxRow = i;
                    }
                    if (j < minCol) {
                        minCol = j;
                    }
                    if (j > maxCol) {
                        maxCol = j;
                    }
                }
            }
        }
        int height = (maxRow - minRow) + 1;
        int width = (maxCol - minCol) + 1;
        return height * width;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'a', 'b', 'c', 'd'},
                {'a', ' ', 'c', 'd'},
                {'x', 'b', 'c', 'a'}
        };
        System.out.println(charArea(grid, 'a'));
        System.out.println(charArea(grid, 'c'));
    }
}