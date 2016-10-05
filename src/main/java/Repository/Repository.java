package Repository;

import Model.Person;

/**
 * Created by Wyking on 10/5/2016.
 */
public interface Repository {
    void add(Person p);
    void remove(String name);
    Person[] filter();
    boolean search(String name);
}
