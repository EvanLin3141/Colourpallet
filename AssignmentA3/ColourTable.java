package AssignmentA3;


import java.awt.*;
import java.util.*;
import java.util.List;

import AssignmentA3.utils.ConvertToInt;
import AssignmentA3.utils.ErrorChecking;


public class ColourTable {
    private int paletteSize;
    private ArrayList<Colour> palette = new ArrayList<>();

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
        ErrorChecking.errorCheck(red, green, blue);

        Colour colour = new Colour(red, green, blue);
        this.palette.add(colour);
    }

    public void add(String binaryBits) {
        Colour colour = ConvertToInt.binaryToStringRGB(binaryBits);
        ErrorChecking.errorCheck(colour);
        this.palette.add(colour);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Palette has: \n");
        for (Colour color : palette) {
            result.append(color).append("\n");
        }
        return result.toString();
    }




}



// changed from adding list int to just adding sphere