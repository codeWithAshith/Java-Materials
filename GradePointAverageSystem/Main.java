package GradePointAverageSystem;

public class Main {
    public static void main(String[] args) {
        Student studentObject = new Student("Ashith");
        studentObject.add("Maths", 'A');
        studentObject.add("English", 'D');
        studentObject.add("History", 'C');
        studentObject.add("Zoology", 'A');

        System.out.println(studentObject.getName() + " has a GPA of " + studentObject.getGPA());
        System.out.println("It is obtained from these subjects");
        System.out.println("-------------");
        for (Subject subject : studentObject.getSubjects()) {
            System.out.println(subject.getName() + " - " + subject.getGrade());
        }
    }
}
