package C1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAirlineReservation {
  private Ticket bankeTicket;
  private Ticket ogVito;
  private Ticket baeTicket;


   @BeforeEach
   public void setUp(){
      bankeTicket = new Ticket();
      bankeTicket.setTicketId(1);
   }
   @Test
   public void getTicket(){
      assertEquals(1,bankeTicket.getTicketId());
   }
   @Test
   public void createTicketWithParameters(){
      ogVito = new Ticket(2);
      assertEquals(2,ogVito.getTicketId());
   }
   @Test
    public void createTicketWithPassengerName(){
       baeTicket = new Ticket(3,"bae Escorter");
       assertEquals(3,baeTicket.getTicketId());
       assertEquals("bae Escorter",baeTicket.getPassengerName());

   }
   @Test
    void getAirlineName(){
       assertEquals("Unicorn",Ticket.getAirline());
       Ticket.setAirline("Cohort 12");
       assertEquals("Cohort 12",Ticket.getAirline());

   }







}
