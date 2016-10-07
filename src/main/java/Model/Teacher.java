package Model;

/**
 * Created by Wyking on 10/5/2016.
 */
public class Teacher implements Person {
    private boolean presentation;
    private String name;
    private int age;
    private String teaching;

    public Teacher(boolean presentation, String name, int age, String teaching){

        this.presentation = presentation;
        this.name = name;
        this.age = age;
        this.teaching = teaching;
    }

    public Person getCopy(){
        return new Teacher(presentation, name, age, teaching);
    }

    public boolean hasPresented(){
        return presentation;
    }

    @Override
    public String toString(){
        return "Teacher class | Presentation = " + presentation
                + " | Name = " + name + " | Age = " + age
                + " | Teaching = " + teaching;
    }

    public String getName(){
        return this.name;
    };
}
