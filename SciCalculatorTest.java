package io.codedifferently;

//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest{
    @Test
    public void setDisplayValueTest(){
        //Given
        SciCalculator two = new SciCalculator();
        //When
        double expected = 0.0;
        double actual = two.getDisplayValue();
        //Then 
        Assert.assertEquals(expected, actual, 0.02);
    }
}