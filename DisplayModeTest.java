package io.codedifferently;


import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest extends DisplayMode {
    //Testing if original mode is as expected
    @Test 
    public void initialModeTest(){
        //Given
        DisplayMode modes = new DisplayMode();
        modes.switchDisplayMode();
        String expected = "Decimal";
        //When 
        String actual = modes.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    //Test if it goes through the array
    @Test
    public void switchDisplayModeTest(){
        //Given 
        DisplayMode modes = new DisplayMode();
        String expected = "Decimal";
        //When
        String actual = modes.getMode();
        modes.switchDisplayMode();
        //Then 
        Assert.assertEquals(expected, actual);

    }
    //Rotation test
    @Test 
    public void displayRotateTest(){
        //Given
        DisplayMode modes = new DisplayMode();
        String expected = "Octal";
        //When 
        modes.switchDisplayMode();
        String actual = modes.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }

}