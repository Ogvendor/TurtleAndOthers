import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillers {

    @Test
    public void fromOneToFour(){
        Driller utme = new Driller();
        assertEquals(4000,utme.calculatePricePerCopy(2));
    }
    @Test
    public void fromFiveToNine(){
        Driller utme = new Driller();
        assertEquals(10800,utme.calculatePricePerCopy(6));
    }
    @Test
    public void fromTenToTwentyNine(){
        Driller utme = new Driller();
        assertEquals(17600,utme.calculatePricePerCopy(11));
    }
    @Test
    public void fromThirtyToFortyNine(){
        Driller utme = new Driller();
        assertEquals(48000,utme.calculatePricePerCopy(32));
    }
    @Test
    public void fromFiftyToNinetyNine(){
        Driller utme = new Driller();
        assertEquals(67600,utme.calculatePricePerCopy(52));
    }
    @Test
    public void fromHundredToHundredAndNine(){
        Driller utme = new Driller();
        assertEquals(216000,utme.calculatePricePerCopy(180));
    }
    @Test
    public void fromTwoHundredToFourHundredandNinetyNine(){
        Driller utme = new Driller();
        assertEquals(242000,utme.calculatePricePerCopy(220));
    }
    @Test
    public void fromFiveHundredToInfinity(){
        Driller utme = new Driller();
        assertEquals(100000000,utme.calculatePricePerCopy(100000));
    }
    }
