public class DualArea {
    public static int dualArea(char[][] grid, char target1, char target2) {
        int minRow = grid.length;
        int minCol = grid[0].length;
        int maxRow = -1;
        int maxCol = -1;

        boolean target1_found = false;
        boolean target2_found = false;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == target1 || grid[i][j] == target2) {
                    if (grid[i][j] == target1) {
                        target1_found = true;
                    }
                    else {
                        target2_found = true;
                    }
                    if (i < minRow) {
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
        if (target1_found && target2_found){
            int height = (maxRow - minRow) + 1;
            int width = (maxCol - minCol) + 1;
            return height * width;
        }
        return 0;
    }

    public static void main(String[] args){
        char[][] grid = {
                {'q', 'w', 'e', 'r'},
                {'t','y', 'u', 'i'},
                {'o', 'p', 'a', 's'},
                {'d', 'f', 'g', 'h'}
        };
        System.out.println(dualArea(grid, 'w', 'a'));
        System.out.println(dualArea(grid, 'q', 'z'));
    }
}
