package userpkg;

public class StaticMembers {
    public static int staticcounter=0;
    int instanCounter=0;

    static{
        System.out.println("I'm a static block");
    }
    public static void staticMethod(){
        System.out.println(" I m a static mthod");
    }
    public void displayCount(){
        staticcounter++;
        instanCounter++;
        System.out.println("Static counter is : "+staticcounter);
        System.out.println("Instance counter is: "+instanCounter);
    }

    public static void main(String[] args) {
        System.out.println("I am rhe main method");
        StaticMembers.staticMethod();
        StaticMembers objStatic1 = new StaticMembers();
        objStatic1.displayCount();
        StaticMembers objStatic2 = new StaticMembers();
        objStatic2.displayCount();
        StaticMembers objStatic3 = new StaticMembers();
        objStatic3.displayCount();
    }

}
