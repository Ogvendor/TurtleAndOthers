package C1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void switchOn() {
        //given
        Bike okada = new Bike();
        //when
        boolean switchOn = okada.switchOn();
        //check
        assertTrue(switchOn);

    }

    @Test
    public void switchOff() {
        //given
        Bike okada = new Bike();
        //when
        boolean switchOff = okada.switchOff();
        //check
        assertFalse(switchOff);

    }

    @Test
    public void accelerateBikeAtGear1() {
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(1);
        okada.setSpeed(9);

        okada.accelerate();

        System.out.println("Current Speed is" + okada.getSpeed());
        //check
        assertEquals(10, okada.getSpeed());


    }

    @Test
    public void accelerateBikeWithGear2() {
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(2);
        okada.setSpeed(24);
        okada.accelerate();

        System.out.println("Current Speed" +" is " + " = " + okada.getSpeed());
        //check
        assertEquals(26, okada.getSpeed());


    }
    @Test
    public void accelerateBikeWithGear3(){
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(3);
        okada.setSpeed(31);
        okada.accelerate();

        System.out.println("Current Speed"+"is"+ okada.getSpeed());
        //check
        assertEquals(34, okada.getSpeed());



    }
    @Test
    public void accelerateBikeWithGear4(){
        //given
        Bike okada = new Bike();
        //when
        okada.setOn(true);
        okada.setGear(4);
        okada.setSpeed(41);
        okada.accelerate();

        System.out.println("Current Speed"+"is"+ okada.getSpeed());
        //Check
        assertEquals(45,okada.getSpeed());
    }
    @Test
     public void decelerateBikeAtGear4(){
        Bike okada = new Bike();
       okada.setOn(true);
        okada.setGear(4);
       okada.setSpeed(41);
       okada.decelerate();
       assertEquals(39,okada.getSpeed());
    }
    @Test
    public void decelerateBikeAtGear3(){
        Bike okada = new Bike();
        okada.setOn(true);
        okada.setGear(3);
        okada.setSpeed(30);
        okada.decelerate();
        assertEquals(27,okada.getSpeed());

    }
    @Test
    public void decelerateBikeAtGear2(){
        Bike okada = new Bike();
        okada.setOn(true);
        okada.setGear(2);
        okada.setSpeed(20);
        okada.decelerate();
        assertEquals(18,okada.getSpeed());
    }
    @Test
    public void decelerateBikeAtGear1(){
        Bike okada = new Bike();
        okada.setOn(true);
        okada.setGear(1);
        okada.setSpeed(10);
        okada.decelerate();
        assertEquals(9,okada.getSpeed());
    }


}



