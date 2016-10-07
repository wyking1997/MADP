package View;

import Controller.Controller;
import Model.Person;
import Model.Specialist;
import Model.Student;
import Model.Teacher;

import java.util.Scanner;

/**
 * Created by Wyking on 10/5/2016.
 */
public class View {
    Controller c;

    public View(Controller cc){
        c = cc;
        populateController();
    }

    public void start(){
        System.out.println("List of persons");
        Person[] persones = c.getAll();
        for(Person p : persones)
            if (p!=null) System.out.println(p.toString());

        System.out.println("\n\nPersones witch have presentation");
        persones = c.filter();
        for(Person p : persones)
            if (p!=null) System.out.println(p.toString());
    }

    private int getOption(){
        System.out.print(" option---> ");
        Scanner scan = new Scanner(System.in);
        String optionn = scan.nextLine();
        int option;
        try{
            option = Integer.parseInt(optionn);
            return option;
        } catch (Exception e){
            System.out.println("Wrong option!");
            return getOption();
        }
    }

    private void populateController(){
        Specialist s = new Specialist(true,"Comiati Sorin", 19, "computer science");
        c.add(s);
        s = new Specialist(true, "Irina Suciu", 19, "Databases");
        c.add(s);
        s = new Specialist(false, "Simona Comiati", 21, "Farmacy");
        c.add(s);
        Student st = new Student(false, "Pop Maria", 21, "UMF");
        c.add(st);
        st = new Student(true, "Anca Pop", 21, "UTC");
        c.add(st);
        st = new Student(false, "Pop Maria", 21, "UTC");
        c.add(st);
        Teacher t = new Teacher(true, "Rares Boian", 40, "Operating Systems");
        c.add(t);
        t = new Teacher(false, "Mihis nustiucum", 84, "nothing");
        c.add(t);
    }

}
