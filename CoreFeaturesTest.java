package io.codedifferently;


import org.junit.Assert;
import org.junit.Test;

//import org.junit.Assert;

public class CoreFeaturesTest {
    @Test
    public void additionTest() {
        //Given
        SciCalculator addition = new SciCalculator();
        addition.setDisplayValue(0);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.add(11);
        double expected = 11;
        double actual = addition.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    private void assertEquals(double expected, double actual) {
    }

    @Test
    public void subtractionTest() {
        //Given
        SciCalculator subtraction = new SciCalculator();
        subtraction.setDisplayValue(20);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.subtract(10);
        double expected = 10;
        double actual = subtraction.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest() {
        //Given
        SciCalculator multiplication = new SciCalculator();
        multiplication.setDisplayValue(20);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.multiply(10);
        double expected = 200;
        double actual = multiplication.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void divisionTest() {
        //Given
        SciCalculator division = new SciCalculator();
        division.setDisplayValue(10);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.divide(2);
        double expected = 5;
        double actual = division.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void squareTest() {
        //Given
        SciCalculator square = new SciCalculator();
        square.setDisplayValue(5);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.square();
        double expected = 25;
        double actual = square.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void squareRootTest() {
        //Given
        SciCalculator sqrt = new SciCalculator();
        sqrt.setDisplayValue(100);
        CoreFeatures coreFeatures = new CoreFeatures(0);
        // When
        coreFeatures.sqrt();
        double expected = 10;
        double actual = sqrt.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void exponentTest() {
        //Given
        SciCalculator exp = new SciCalculator();
        exp.setDisplayValue(17);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.exp(5);
        double expected = 1419857;
        double actual = exp.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void inverseNumberTest() {
        //Given
        SciCalculator inversenum = new SciCalculator();
        inversenum.setDisplayValue(20);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.inverseNumber();
        double expected = 0.05;
        double actual = inversenum.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void invertSignTest() {
        //Given
        SciCalculator invertsign = new SciCalculator();
        invertsign.setDisplayValue(20);
        CoreFeatures coreFeatures = new CoreFeatures();
        // When
        coreFeatures.invertSign();
        double expected = -20;
        double actual = invertsign.getDisplayValue();
        //Then
        assertEquals(expected, actual);
    }

    @Test 
    public void errTest() {
        //Given
        SciCalculator error = new SciCalculator();
        error.setDisplayValue(8/0);
        CoreFeatures coreFeatures = new CoreFeatures();
        //When
        coreFeatures.err();
        String expected = "error";
        double actual = error.getDisplayValue();
        //Then
        Assert.assertEquals (expected, actual);
    }
    @Test
    public void naturalLogTest() {
        //Given
        SciCalculator natlog = new SciCalculator();
        natlog.setDisplayValue(30);
        CoreFeatures coreFeatures = new CoreFeatures();
        //When
        coreFeatures.naturalLog();
        double expected = 3.4;
        double actual = natlog.getDisplayValue();
        //Then
        assertEquals (expected, actual);
    }
    @Test
    public void randomNumberTest() {   
        //Given
        SciCalculator random = new SciCalculator();
        random.setDisplayValue(20);
        CoreFeatures coreFeatures = new CoreFeatures();
        //When
        coreFeatures.randomNumber();
        double expected = Math.random();
        double actual = random.getDisplayValue();
        //Then
        assertEquals (expected, actual);
    }
    @Test
    public void roundNumberTest(){
            //Given
            SciCalculator roundnumber = new SciCalculator();
            roundnumber.setDisplayValue(32.6);
            CoreFeatures coreFeatures = new CoreFeatures();
            //When
            coreFeatures.roundNumber();
            double expected = 33;
            double actual = roundnumber.getDisplayValue();
            //Then
            assertEquals (expected, actual);
    }
}   