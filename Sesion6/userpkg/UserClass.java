package userpkg;
import java.util.ArrayList;

public class UserClass {
ArrayList myCar= new ArrayList();
public void createList(){
    myCar.add("Doll");
    myCar.add("Bus");
    myCar.add("Teddy");
    System.out.println("cart contents are : "+myCar);
}

    public static void main(String[] args) {
        UserClass objUser = new UserClass();
        objUser.createList();
        StaticMembers objStatic =new StaticMembers();
        objStatic.displayCount();
    }
}
