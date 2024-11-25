package AssignmentA3;


import java.awt.*;
import java.util.*;
import java.util.List;

import AssignmentA3.utils.ConvertToInt;


public class ColourTable {
    private int paletteSize;
    private ArrayList<Colour> palette = new ArrayList<>();
    private ConvertToInt convert;

    public ColourTable(int paletteSize) {
        if (paletteSize <= 1 || !Calculate.log(paletteSize)) {
            throw new IllegalArgumentException("Palette size needs to be greater " +
                    "than 1 & to the power of 2");
        } else {
            this.paletteSize = paletteSize;
        }
    }

    public int getSize() {
        return this.paletteSize;
    }

    public void add(int red, int green, int blue) {
        errorcheck(red, green, blue);

        Colour colour = new Colour(red, green, blue);
        this.palette.add(colour);
    }

    public void add(String binaryBits) {
        Colour colour = ConvertToInt.binaryToStringRGB(binaryBits);
        errorcheck(colour);
        this.palette.add(colour);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Palette has: \n");
        for (Colour color : palette) {
            result.append(color).append("\n");
        }
        return result.toString();
    }

    public boolean errorcheck(int red, int green, int blue) {
        if (red > 255 || green > 255 || blue > 255) {
            throw new IllegalArgumentException("Colour Invalid");
        } else {
            return true;
        }
    }

    public boolean errorcheck(Colour colour) {
        if (colour.getRed() > 255 || colour.getGreen() > 255 || colour.getBlue() > 255) {
            throw new IllegalArgumentException("Colour Invalid");
        } else {
            return true;
        }
    }


}



// changed from adding list int to just adding sphere