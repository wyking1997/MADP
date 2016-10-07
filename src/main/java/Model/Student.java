package Model;

/**
 * Created by Wyking on 10/5/2016.
 */
public class Student implements Person {
    private boolean presentation;
    private String name;
    private int age;
    private String faculty;

    public Student(boolean presentation, String name, int age, String faculty){

        this.presentation = presentation;
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    public Person getCopy(){
        return new Student(presentation, name, age, faculty);
    }

    public boolean hasPresented(){
        return presentation;
    }

    @Override
    public String toString(){
        return "Student class | Presentation = " + presentation
                + " | Name = " + name + " | Age = " + age
                + "| Faculty = " + faculty;
    }
    public String getName(){
        return this.name;
    };
}
