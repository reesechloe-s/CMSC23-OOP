public class BuddySystem {
    public static int countHorizontalPairs(char[][] grid, char target){
        int num_pairs = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length - 1; j++){
                if (grid[i][j] == target){
                    if (grid[i][j+1] == target){
                        num_pairs++;
                    }
                }
            }
        }
        return num_pairs;
    }

    public static void main(String[] args){
        char[][] grid = {
                {'x', 'x', 'x'}
        };
        System.out.println(countHorizontalPairs(grid, 'x'));
    }
}
