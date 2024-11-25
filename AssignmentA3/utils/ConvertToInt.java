package AssignmentA3.utils;

import AssignmentA3.Colour;

import java.util.List;

public class ConvertToInt {
    public static Colour stringRGBToInt(String red, String green , String blue) {
        int redDecimal = Integer.parseInt(red, 2);
        int greenDecimal = Integer.parseInt(green, 2);
        int blueDecimal = Integer.parseInt(blue, 2);
        return new Colour(redDecimal, greenDecimal, blueDecimal);
    }

    public static Colour binaryToStringRGB(String binary) {
        String red = binary.substring(0,8);
        String green = binary.substring(8,16);
        String blue = binary.substring(16,24);
        stringRGBToInt(red, green , blue);
        return stringRGBToInt(red, green, blue);
    }
}
