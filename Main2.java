public class Vehicle {
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    public Vehicle(String licensePlate, String ownerName, int hoursParked) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getHoursParked() {
        return hoursParked;
    }

//setters

  public void setLicensePlate(String licensePlate){
    this. licensePlate= licensePlate;
  }

 public void setOwnerName(String ownerName){
    this.ownerName=ownerName;
  }

   public void setHoursParked(String licensePlate,String ownerName,int hoursParked){
    this.hoursParked=hoursParked;
  }
}

//method
public void display(){
   public void setHoursParked(int hoursParked){
  System.out.println("License space: "+ licensePlate + ",Owner's Name: "+ ownerName + ",horsepark: "+ hoursParked);
  } 
}


public class ParkingLot {

}

public class Main2 {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        lot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        lot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        lot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

    
    }
}


