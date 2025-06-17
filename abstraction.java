package Java_Programs.OOPS;

import Java_Programs.mypack.*;

abstract class hello{


    abstract void run();


    public void start(){

        System.out.println("This is Abstarct class method");
    }
}


public class abstraction extends demo{

    public static void run(){
        System.out.println("This is child class run method");
    }
    public static void main(String[] args) {
        var obj = new abstraction();
        obj.run();

    }
}
