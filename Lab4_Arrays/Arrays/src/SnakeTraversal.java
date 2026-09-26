public class SnakeTraversal {
    public static String snakeRead(char[][] grid){
//        String readChar = "";
        StringBuilder readChar = new StringBuilder();
        for (int i = 0; i < grid.length; i++){
            if (i % 2 == 0){
                for (int j = 0; j < grid[i].length; j++){
//                    readChar += grid[i][j];
                    readChar.append(grid[i][j]);
                }
            } else {
                for (int j = grid[i].length - 1; j >= 0; j--){
//                    readChar += grid[i][j];
                    readChar.append(grid[i][j]);
                }
            }
        }
//        return readChar;
        return readChar.toString();
    }

    public static void main(String[] args){
        char[][] grid = {
                {'A', 'B', 'C'},
                {'F', 'E', 'D'},
                {'G', 'H', 'I'}
        };
        System.out.println(snakeRead(grid));
    }
}
