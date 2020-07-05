package io.codedifferently;

public class TrigUnits {
    private String setMode = "";

    String[] trigUnits = {"Degrees", "Radians"};
    
 

    //set to the trig mode given
    public void switchUnitsMode(String setting){
        setMode = setting; 
    }
    //should rotate through the options 
    //options are degrees and radians 
    public String switchUnitsMode(){
        String[] setting = new String[2];
        setting[0] = "Degrees";
        setting[1] = "Radians";
        if(getMode() == "Degrees")
        {return setting[0];}
        if(getMode() == "Radians")
        {return setting[1];}
        else{return null;}
    } 

    private String getMode(){
        return setMode;
    }


	public void convertToRadians() {
    }
    public String getTrigUnits(){
        return setMode;
    }
}