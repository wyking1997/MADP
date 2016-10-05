package Repository;

import Model.Person;

/**
 * Created by Wyking on 10/5/2016.
 */
public class MyRepository implements Repository {

    Person[] v;
    int last;

    public MyRepository(){
        v = new Person[100];
        last = -1;
    }

    public void add(Person p){
        last++;
        v[last] = p;
    };

    public void remove(String name){
        for (int i = 0; i < last; i++)
            if (v[i].getName().equalsIgnoreCase(name)){
                while (i < last - 1)
                    v[i] = v[i+1];
            i++;
        }
        last--;
    };

    public Person[] filter(){
        return null;
    };

    public boolean search(String name){
        for (Person p : v){
            if (p.getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    };
}
