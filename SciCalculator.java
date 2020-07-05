package io.codedifferently;


public class SciCalculator {
    double currentValue = 0.0;
    DisplayMode displayMode = null;
    TrigFunctions trigFunctions = null;
    Memory memory = null;
    CoreFeatures coreFeatures = null;
    TrigUnits trigUnits = null;
    

    public DisplayMode getDisplay() {
        return displayMode;
    }

    public double getDisplayValue(){
        return currentValue;
    }

    public Memory getMemory(){
        return memory;
    }

    public CoreFeatures getCoreFeatures(){
        return coreFeatures;
    }

    public double clearDisplayValue(){
        return 0;
    }

    public TrigFunctions getTrigFunctions(){
        return trigFunctions;
    }

    public void setDisplayValue(double dv){
        currentValue = dv;
    }

    public TrigUnits trigUnits(){
        return trigUnits;
    }

    
}
