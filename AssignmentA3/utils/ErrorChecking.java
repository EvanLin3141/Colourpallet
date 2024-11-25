package AssignmentA3.utils;

import AssignmentA3.Colour;

public class ErrorChecking {
    public static void errorCheck(int red, int green, int blue) {
        if (red > 255 || green > 255 || blue > 255) {
            throw new IllegalArgumentException("Colour Invalid");
        }
    }

    public static void errorCheck(Colour colour) {
        if (colour.getRed() > 255 || colour.getGreen() > 255 || colour.getBlue() > 255) {
            throw new IllegalArgumentException("Colour Invalid");
        }
    }
}


//wanted to intially return boolean but realise there was no need as a out illegal argument can do it for us.

