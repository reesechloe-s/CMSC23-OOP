import java.util.Scanner;
public class Lab4 {
    public static int longestStreak(int[][] grid, int ch){
        int longest_streak = 0;

        for (int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[i].length ; j++){
                if (grid[i][j] == ch){
                    int h_streak = 1;
                    int h_increment = 1;
                    while (j + h_increment < grid[i].length && grid[i][j+h_increment] == ch){
                        h_streak++;
                        h_increment++;
                    }
                    if (h_streak > longest_streak){
                        longest_streak = h_streak;
                    }

                    int v_streak = 1;
                    int v_increment = 1;
                    while(i + v_increment < grid.length && grid[i+v_increment][j] == ch){
                        v_streak++;
                        v_increment++;
                    }
                    if (v_streak > longest_streak){
                        longest_streak = v_streak;
                    }
                }
            }
        }
        return longest_streak;
    }

    public static String bestNum(int[][] grid){
        int max_streak = 0;
        int best_char = 0;

        for (int i = 0; i < grid.length; i++){+++++++++++++++
            for (int j = 0; j < grid[i].length; j++){
                int current_char = grid[i][j];
                int current_streak = longestStreak(grid, current_char);
                if (current_streak > max_streak){
                    max_streak = current_streak;
                    best_char = current_char;
                }
            }
        }
        return "Best char: " + best_char + ", Streak: " + max_streak ;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int row = scanner.nextInt();

        System.out.print("Enter col number: ");
        int col = scanner.nextInt();

        System.out.print("Enter max number: ");
        int max = scanner.nextInt();

        int[][] grid = new int[row][col];

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                grid[i][j] = (char) (Math.random() * max);

            }
        }

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter a number: ");
        int target = scanner.nextInt();

        System.out.println("Longest streak: " + longestStreak(grid, target));
        System.out.println(bestNum(grid));
    }


}


























