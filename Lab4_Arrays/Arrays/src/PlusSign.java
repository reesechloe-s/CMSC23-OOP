public class PlusSign {
    public static int countPlusSigns(char[][] grid, char target){
        int plusSigns = 0;
        for (int i = 1; i < grid.length - 1; i++){
            for (int j = 1; j < grid[i].length - 1; j++){
                if (grid[i][j] == target && grid[i-1][i] == target && grid[i+1][j] == target && grid[i][j-1] == target && grid[i][j+1] == target){
                    plusSigns++;
                }
            }
        }
        return plusSigns;
    }

    public static void main(String[] args){
        char[][] plusGrid = {
                {'o', 'x', 'o', 'o', 'o'},
                {'x', 'x', 'x', 'o', 'o'},
                {'o', 'x', 'o', 'x', 'o'},
                {'o', 'o', 'x', 'x', 'x'},
                {'o', 'o', 'o', 'x', 'o'}
        };
        System.out.println(countPlusSigns(plusGrid, 'x'));
        System.out.println(countPlusSigns(plusGrid, 'o'));
    }
}
