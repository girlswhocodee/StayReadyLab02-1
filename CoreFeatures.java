package io.codedifferently;

// accesses display functions
import java.lang.Math;




public class CoreFeatures extends DisplayMode {
    double memory = 0.0;


public CoreFeatures(double number){
    memory = number;
    //setDisplayValue(memory);
}

public CoreFeatures() {
}

//addition  
public double add(double val){
    memory = getDisplayValue() + val;
    setDisplayValue(memory);
    return memory;
}
    

private void setDisplayValue(double val) {
}

private double getDisplayValue() {
    return 0;
}

// subtraction
public double subtract(double val){
    memory = getDisplayValue() - val;
    setDisplayValue(memory);
    return memory;
}

//multiplication
public double multiply(double val){
    memory = getDisplayValue() * val;
    setDisplayValue(memory);
    return memory;
}

//division 
public double divide(double val){   
    memory = getDisplayValue() / val;
    setDisplayValue(memory);
    return memory;
}
//square 
public double square(){
    memory = getDisplayValue() * getDisplayValue();
    setDisplayValue(memory);
    return memory;
}
//sqaure root
public double sqrt(){
    memory = Math.sqrt(getDisplayValue());
    setDisplayValue(memory);
    return memory;
}
//exponent 
public double exponent(){
    memory = Math.pow(getDisplayValue(), memory);
    setDisplayValue(memory);
    return memory;
}
//inverse of the number on display
public double inverseNumber(){
    memory = 1 / getDisplayValue();
    setDisplayValue(memory);
    return memory;
}
//invert the sign of the number on display
public double invertSign(){
    memory = getDisplayValue() * -1;
    setDisplayValue(memory);
    return memory;
}
//update the display to err if an error occurs
public double err(){
    memory = getDisplayValue() / 0;
    setDisplayValue(memory);
    return memory;
}
//natural log 
public double naturalLog(){
    memory = Math.log(getDisplayValue());
    setDisplayValue(memory);
    return memory;
}
//Random number
    public double randomNumber(){
    memory = Math.random();
    setDisplayValue(memory);
    return memory;
    }
//Round number to next largest integer
    public double roundNumber(){
        memory = Math.ceil(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }

	public void exp(int i) {
	}
}
