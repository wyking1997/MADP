package Controller;

import Model.Person;
import Repository.*;

/**
 * Created by Wyking on 10/5/2016.
 */
public class Controller {
    Repository repo;

    public Controller(Repository r){
        repo = r;
    }

    public void add(Person p){
        this.repo.add(p);
    }

    public void remove(String name){
        this.repo.remove(name);
    }

    public Person[] filter(){
        return this.repo.filter();
    }

    public Person[] getAll(){return this.repo.getAll();}
}
