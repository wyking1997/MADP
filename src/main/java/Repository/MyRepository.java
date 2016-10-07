package Repository;

import Model.Person;

/**
 * Created by Wyking on 10/5/2016.
 */
public class MyRepository implements Repository {

    Person[] v;
    int last;
    int capacity;

    public MyRepository(int capacity){
        this.capacity = capacity;
        v = new Person[capacity];
        last = -1;
    }

    public void resize(){
        capacity *= 2;
        Person[] a = new Person[capacity];
        for (int i = 0; i <= last ; i++)
            a[i] = v[i];
        v = a;
    }

    public void add(Person p){
        if (capacity - 1 == last)
            resize();
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
        Person[] w = new Person[last];
        int i = -1;
        for (Person p : v){
            if (p != null && p.hasPresented())
                w[++i] = p.getCopy();
        }
        return w;
    };

    public Person[] getAll(){
        return v;
    }

    public boolean search(String name){
        for (Person p : v){
            if (p.getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    };
}
