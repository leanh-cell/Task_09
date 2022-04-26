package abstractdemo;

class Cricle extends Shape{
    float area;

    @Override
    void calculate(float ral) {
      area=getPI()*ral*ral;
        System.out.println("Aera of circle is : "+area);
    }
}
