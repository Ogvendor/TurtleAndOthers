package C1;

public class Ticket {
    private int ticketId;
    private String passengerName;
    private String Destination;

    private static String airline = "Unicorn";


    public Ticket(){}
    public Ticket(int ticketId){
        this.ticketId = ticketId;
    }
    public Ticket(int ticketId,String passenger){
        this.ticketId = ticketId;
        passengerName = passenger;
    }

   public int getTicketId(){
       return ticketId;
   }

   public void setTicketId(int id){
       this.ticketId = id;
   }
   public void setPassengerName(String name){
        this.passengerName = name;
    }
    public String getPassengerName(){
        return passengerName;
    }

    public static String getAirline() {
        return airline;
    }

    public static void setAirline(String airline) {
        Ticket.airline = airline;
    }
}
