/**
 * Created by Wyking on 10/5/2016.

 9. La o conferinta participa profesori, studenti si

 specialisti din industrie. Sa se afiseze toti participantii

 care au prezentat o lucrare.

 */

import Controller.Controller;
import Repository.*;
import View.View;

public class Main {

    public static void main(String[] args){

        System.out.println("Heloo");

        int capacity = 1;
        Repository repo = new MyRepository(capacity);
        Controller c = new Controller(repo);
        View v = new View(c);
        v.start();
    }
}
