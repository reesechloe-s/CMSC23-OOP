public class Student {
// attributes
    int age;
    String name;
    double gpa;
//    constructor
    public Student(int age, String name, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
//    method
    public void displayInfo() {
        System.out.println(name + " (" + age + ") GPA: " + gpa);
    }
}
