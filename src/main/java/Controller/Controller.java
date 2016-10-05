package Controller;

import Model.Person;
import Repository.Repository;

/**
 * Created by Wyking on 10/5/2016.
 */
public class Controller {
    Repository repo;

    public void add(Person p){
        this.repo.add(p);
    }

    public void remove(String name){
        this.repo.remove(name);
    }

    public Person[] filter(){
        return this.repo.filter();
    }
}
