package GradePointAverageSystem;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Subject> subjects;

    public Student(String name) {
        this.name = name;
        subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(String subject, Character grade) {
        subjects.add(new Subject(subject, grade));
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public double getGPA() {
        double totalGPA = 0.0;
        for (Subject subject : subjects) {
            switch (subject.getGrade()) {
                case 'A' -> totalGPA += 4.0;
                case 'B' -> totalGPA += 3.0;
                case 'C' -> totalGPA += 2.0;
                case 'D' -> totalGPA += 1.0;
                case 'F' -> totalGPA += 0.0;
                default -> {
                }
            }
        }
        return totalGPA;
    }
}
