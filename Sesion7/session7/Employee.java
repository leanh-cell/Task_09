package session7;

public class Employee {
    String emID;
    String emName;
    int salary;
    float commission;
    public Employee(String id,String name,int sal){
        emID=id;
        emName=name;
        salary=sal;
    }
    public void calcCommission(float sales) {
        if (sales > 1000) {
            commission = salary * 20 / 100;
        } else {
            commission = 0;
        }
    }
    public void calcCommission(int overtime){
        if (overtime>8){
            commission=salary/30;
        }else{
           commission=0;
        }
    }
    public void displayDetails(){
        System.out.println("Employee ID: "+emID);
        System.out.println("Employee Name:"+emName);
        System.out.println("Salary:"+salary);
        System.out.println("Commission:"+commission);
    }

    public static void main(String[] args) {
            Employee objEmp=new Employee("E001","Maria Nemeth",40000);
            objEmp.calcCommission(20000F);
            objEmp.displayDetails();
    }
}
