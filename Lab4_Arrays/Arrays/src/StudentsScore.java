public class StudentsScore {
    public static void main(String[] args) {
        String[] student = {"Anna", "Belen", "Cesca", "Drew", "Eric"};
        double[] score = {95, 90, 92, 88, 97};
        double sum = 0;
        System.out.println("Student scores: \n");

        for (int i = 0; i < score.length; i++) {
            System.out.println(student[i] + "\t" + score[i]);
            sum += score[i];
        }

        double average = sum / score.length;
        System.out.println("\nThe average score is " + average + "\n");
    }
}
