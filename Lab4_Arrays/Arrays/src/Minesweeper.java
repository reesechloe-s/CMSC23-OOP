public class Minesweeper {
    public static int countMines(char[][] grid, int r, int c, char mine){
        int countMines = 0;
        for(int i = Math.max(0, r - 1); i <= Math.min(grid.length - 1, r + 1); i++){
            for (int j = Math.max(0, c - 1); j <= Math.min(grid[i].length - 1, c + 1); j++){
                if (i == r && j == c){
                    // skip only the eact center room
                    continue;
                }
//                if (grid[i][j] == mine && grid[i-1][j] == mine && grid[i+1][j] == mine && grid[i][j-1] == mine && grid[i][j+1] == mine){
//                    countMines++;
//                }
                if (grid[i][j] == mine){
                    countMines++;
                }
            }
        }
        return countMines;
    }
}
