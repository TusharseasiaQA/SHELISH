package basicprogram;
import java.io.*;
import java.lang.*;
import java.util.*;
 
interface one {
     void show();
}
 
interface two {
    void show();
}
 
interface three extends one, two {
    public void show();
}
class child implements three {
    @Override public void show()
    {
        System.out.println("child class");
    }
 
    public void show1() { System.out.println("hello"); }
}
 
public class Multiple {
    public static void main(String[] args)
    {
        child c = new child();
        c.show();
        c.show1();
        c.show();
    }
}
