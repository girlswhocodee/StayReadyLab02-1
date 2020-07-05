package io.codedifferently;

public class DisplayMode {
    
    private String switchMode = "";

    // constructor??? public DisplayMode(){}

    //Set the display to the mode given
    public String switchDisplayMode(String mode){
        return switchMode = mode;
    }

    //Should rotate through the options
    //Options are Decimal, Hexadecimal, Binary, Octal
    public String switchDisplayMode(){
       String[] modes = new String[4];
       modes[0] = "Decimal";
       modes[1] = "Hexadecimal";
       modes[2] = "Binary";
       modes[3] = "Octal";
       if(getMode() == "Decimal")
       {return modes[0];}
       if(getMode() == "Hexadecimal")
       {return modes[1];}
       if(getMode() == "Binary")
       {return modes[2];}
       if(getMode() == "Octal")
       {return modes[3];}
       else{return null;}
    }

    public String getMode(){
        return switchMode;
    }
}