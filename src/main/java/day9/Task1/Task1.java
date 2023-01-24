package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Vasiliy", "201GP");
        Teacher teacher = new Teacher("Ivan Petrovich", "Geometry");
        student.printInfo();
        teacher.printInfo();
    }
}
