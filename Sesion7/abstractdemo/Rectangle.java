package abstractdemo;

public class Rectangle extends Shape{
        float perimeter;
        float length=10;
        @Override
        void calculate(float with){
            perimeter=2*(length+with);
            System.out.println("Perimeter of the Rectangle is: "+perimeter);
        }
    }

