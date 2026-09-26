public class BorderPatrol{
    public static int countBorderTargets(char[][] grid, char target){
        int coundBorder = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[i].length - 1){
                    if (grid[i][j] == target){
                        coundBorder++;
                    }
                }
            }
        }
        return coundBorder;
    }
    public static void main(String[] args){
        char[][] grid = {
                {'x', 'o', 'x', 'x'},
                {'x', 'x', 'y', 'o'},
                {'o', 'y', 'x', 'x'},
                {'x', 'o', 'o', 'x'}
        };
        System.out.println(countBorderTargets(grid, 'x'));
        System.out.println(countBorderTargets(grid, 'y'));
    }
}