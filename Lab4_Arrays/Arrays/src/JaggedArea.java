public class JaggedArea {
    public static int jaggedArea(char[][] grid, char target){
//        int minRow = grid.length;
//        better practice below for consistency.
//        It creates a universal mental rule for your algorithms: always start minimum trackers at the absolute ceiling, and always start maximum trackers at the absolute floor.
//        int minCol = grid[0].length;

        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;

        boolean ch_found = false;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == target){
                    ch_found = true;

                    if (i < minRow) {
                        minRow = i;
                    }
                    if (i > maxRow) {
                        maxRow = i;
                    }
                    if (j < minCol){
                        minCol = j;
                    }
                    if (j > maxCol){
                        maxCol = j;
                    }
                }
            }
        }
        int height = (maxRow - minRow) + 1;
        int width = (maxCol - minCol) + 1;
        return height * width;
    }

    public static void main(String[] args){
        char[][] grid = {
                {'a', 'b'},
                {'c', 'd', 'e', 'a', 'f'},
                {'a'}
        };
        System.out.println(jaggedArea(grid, 'a'));
        System.out.println(jaggedArea(grid, 'f'));
    }
}
