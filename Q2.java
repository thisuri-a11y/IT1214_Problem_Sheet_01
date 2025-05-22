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
    this. licensePlate;= licensePlate;
  }

 public void setOwnerName(String ownerName){
    this.ownerName=ownerName;
  }

   public void setHoursParked(int hoursParked){
    this.hoursParked=hoursParked;
  }
}

public class ParkingLot {

}

public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        lot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        lot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        lot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

    
    }
}


