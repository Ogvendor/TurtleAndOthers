package com.unicornWimps;

import com.PenPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
    }
    @Test
    public void turtleHasPen(){
        assertNotNull(ijapa);
        assertEquals(0,ijapa.getxCordinate());
        assertEquals(0,ijapa.getyCordinate());
        assertNotNull(ijapa.getTurtlePen());
    }
    @Test
    public void turtleIsPen(){
       turtleHasPen();
        assertNotNull(ijapa.getTurtlePen().getPosition());
        assertEquals(PenPosition.UP, ijapa.getTurtlePen().getPosition());
    }
    @Test
    public void moveForward(){
        turtleIsPen();
        ijapa.moveForward(9);
        assertEquals(0,ijapa.getyCordinate());
        assertEquals(8,ijapa.getxCordinate());
    }


}
