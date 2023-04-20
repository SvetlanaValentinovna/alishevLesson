package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иван", "25B");
        Teacher teacher = new Teacher("Борис Николаевич", "Информатика");

        student.printInfo();
        teacher.printInfo();


    }
}
