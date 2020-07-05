package io.codedifferently;


import org.junit.Test;
import org.junit.Assert;

public class TrigFunctionsTest{
    @Test
    public void sineFunctionsTest() {
        //Given
        SciCalculator math = new SciCalculator();
        math.setDisplayValue(1/3);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.sin(1/3);
        //When 
        trig.sine();
        double actual = math.getDisplayValue();
        //Then 
        Assert.assertEquals(expected, actual, 0.02);
    } 
    @Test
    public void cosFunctionsTest(){
        //Given
        SciCalculator math = new SciCalculator();
        math.setDisplayValue(1/3);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.cos(1/3);
        //When 
        trig.cosine();
        double actual = math.getDisplayValue();
        //Then
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void tanFunctionsTest(){
        SciCalculator math = new SciCalculator();
        math.setDisplayValue(1/3);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.tan(1/3);
        //When
        trig.tangent();
        double actual = math.getDisplayValue();
        //Then
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test 
    public void invSineTest(){
        SciCalculator math = new SciCalculator();
        math.setDisplayValue(1/3);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.asin(1/3);
        //When 
        trig.inverseSine();
        //
        double actual = math.getDisplayValue();
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void invCosineTest(){
        SciCalculator math = new SciCalculator();
        math.setDisplayValue(2/3);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.acos(2/3);
        //When 
        trig.inverseCosine();
        //
        double actual = math.getDisplayValue();
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void invTangentTest(){
        SciCalculator math = new SciCalculator();
        math.setDisplayValue(1/3);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.atan(1/3);
        //When 
        trig.inverseTangent();
        //
        double actual = math.getDisplayValue();
        Assert.assertEquals(expected, actual, 0.02);
    }
}




