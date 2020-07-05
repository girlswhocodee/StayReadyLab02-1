package io.codedifferently;

public class Memory {
    double memoryValue = 0.0;

//Add the currently displayed value to the value in memory (store in memory and update display)
public void addToMemory(){
    memoryValue = memoryValue + getDisplayValue();
}

private double getDisplayValue() {
    return 0;
}

// Reset memory
public void resetMemory(){
    memoryValue = 0;
}
//Recall the current value from memory to the display
public double recallMemory(){
    return memoryValue;
}
}