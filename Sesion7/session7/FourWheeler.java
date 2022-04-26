package session7;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;
    public FourWheeler(String vID,String vName,int numWheels,boolean pSteer ){
        super(vID,vName,numWheels);
        powerSteer=pSteer;
    }
    public void showDetails(){
        System.out.println("vehicle no: "+vehicleNo);
        System.out.println("vehicle name: "+vehicleName);
        System.out.println("number of Wheels: "+wheels);
        if (powerSteer==true){
            System.out.println("power Steering: yes ");
        }else {
            System.out.println("power Steering: no");
        }
    }
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Maximum acceleration: "+speed+"kmph");
    }

    public static void main(String[] args) {
        FourWheeler objFour =new FourWheeler("LA-09 cs-1406","Volkswagen",4,true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}


