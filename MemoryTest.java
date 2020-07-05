package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;


public class MemoryTest {
    @Test
    public void firstMemoryTest(){
        //given 
        Memory one = new Memory();
        double expected = 0;
        //when 
        double actual = one.recallMemory();
        //then 
        Assert.assertEquals(expected, actual, 0.02);
}
    @Test
    public void storeMemoryTest(){
        //Given
        SciCalculator calc = new SciCalculator();
        calc.setDisplayValue(0);
        Memory one = new Memory();
        double expected = 0;
        //When 
        one.addToMemory();
        double actual = one.recallMemory();
        //Then 
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test 
    public void resetMemoryTest(){
        //Given
        SciCalculator calc = new SciCalculator();
        calc.setDisplayValue(55);
        Memory one = new Memory();
        double expected = 0;
        double actual = one.recallMemory();
        //When 
        one.addToMemory();
        one.resetMemory();
        //Then 
        Assert.assertEquals(expected, actual, 0.02);
    }
}