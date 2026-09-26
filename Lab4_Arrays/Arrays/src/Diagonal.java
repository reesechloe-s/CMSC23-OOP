public class Diagonal {
    public static boolean isDiagonal(char[][] grid, char target){
        for (int i = 0; i < grid.length; i++){
            if (grid[i][i] != target){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        char[][] grid = {
                {'x', 'o', 'o'},
                {'o', 'x', 'o'},
                {'y', 'y', 'x'}
        };
        System.out.println(isDiagonal(grid, 'x'));
        System.out.println(isDiagonal(grid, 'o'));
    }
}
