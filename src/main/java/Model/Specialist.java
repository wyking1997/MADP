package Model;

/**
 * Created by Wyking on 10/5/2016.
 */
public class Specialist implements Person {
    private boolean presentation;
    private String name;
    private int age;
    private String speciality;

    public Specialist(boolean presentation, String name, int age, String speciality){
        this.presentation = presentation;
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

    public Person getCopy(){
        return new Specialist(presentation, name, age, speciality);
    }

    public boolean hasPresented(){
        return presentation;
    }

    @Override
    public String toString(){
        return "Specialist class | presentation = " + presentation
                 + " | Name = " + name + " | Age = " + age
                 + " | Speciality = " + speciality;
    }

    public String getName(){
        return this.name;
    };
}
