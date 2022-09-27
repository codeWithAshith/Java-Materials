package GradePointAverageSystem;

public class Subject {
    private String name;
    private char grade;

    public Subject(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }
}
