package io.codedifferently;

//accesses display function 
import java.lang.Math;


public class TrigFunctions {

    double memory = 0.0;
    //sine 
    public double sine(){
        memory = Math.sin(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }
    
    private void setDisplayValue(double memory2) {
    }

    private double getDisplayValue() {
        return 0;
    }

    // cosine
    public double cosine(){
        memory = Math.cos(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }
    //tangent
    public double tangent(){
        memory = Math.tan(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }

    // inverseSine
    public double inverseSine(){
        memory = Math.asin(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }
    //inverseCosine
    public double inverseCosine(){
        memory = Math.acos(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }
    //inverseTangent
    public double inverseTangent(){
        memory = Math.atan(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }
}