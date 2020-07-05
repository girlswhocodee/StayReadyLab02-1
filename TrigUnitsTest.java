package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    @Test
    public void degreesTest(){
        //Given
        SciCalculator degrees = new SciCalculator();
        degrees.setDisplayValue(75);
        TrigUnits trig = new TrigUnits();
        double expected = Math.toDegrees(75);
        //When
        trig.convertToRadians();
        double actual = degrees.getDisplayValue();
        //Then 
        Assert.assertEquals(expected, actual, 0.02);
    }
    //confused
    @Test
    public void radiansDisplayTest(){
        //Given
        TrigUnits trig = new TrigUnits();
        String expected = "Radians";
        //When
        trig.switchUnitsMode();
        String actual = trig.getTrigUnits();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    //confused
    @Test
    public void degreesDisplayTest(){
        //Given
        SciCalculator picked = new SciCalculator();
        TrigUnits trig = new TrigUnits();
        String expected = "Degrees";
        //When
        trig.switchUnitsMode();
        picked.trigUnits();
        String actual = trig.getTrigUnits();
        //Then 
        Assert.assertEquals(expected, actual);
    }


}