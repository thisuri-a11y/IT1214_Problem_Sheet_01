public class Ticket {
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNumber, String customerName, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getCustomerName() {
        return customerName;

            //setters

  public void setTicketNumber(int ticketNumber){
    this. ticketNumber= ticketNumber;
  }

 public void setCustomerName(String customerName){
    this.customerName=customerName;
  }

   public void setSeatNumber(int seatNumber){
    this.seatNumber=seatNumber;

    
    
    }
}

public class BookingSystem {
    
}

public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        system.bookTicket(new Ticket(1, "Alice", 1));
        system.bookTicket(new Ticket(2, "Bob", 2));
        system.bookTicket(new Ticket(3, "Charlie", 3));

        system.cancelTicket(2);
        system.bookTicket(new Ticket(4, "David", 2));

        system.displayTickets();
    }
}

