package session7;

public class partTimeEmployee extends Employee {
    String shift;

    public partTimeEmployee(String id,String name,int sal,String shift) {
        super (id,name,sal);
        this.shift=shift;
    }
    @Override
    public void displayDetails(){
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working Shift: "+shift);
    }

    public static void main(String[] args) {
        Employee objEmp = new Employee("E001","Maria Nemeth",40000);
        objEmp.calcCommission(2000F);
         objEmp.displayDetails();
        System.out.println("------------------");
        Employee objEmp1 = new partTimeEmployee("E002","Rob Smith",30000,"day");
        objEmp1.displayDetails();
    }
}

