public class ArrayAnalyzer{
    public static double getAverage(int[] numbers){
        double sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args){
        int [] scores = {90, 99, 95, 98};
        double result = getAverage(scores);
        System.out.println("The average is: " + result);
    }
}