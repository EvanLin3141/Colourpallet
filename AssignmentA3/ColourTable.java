package AssignmentA3;


import java.awt.*;
import java.util.*;
import java.util.List;

import AssignmentA3.utils.ConvertToInt;
import AssignmentA3.utils.ErrorChecking;


public class ColourTable {
    private int paletteSize;
    private HashSet<Colour> palette = new HashSet<>();

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
        this.performCheck(colour);
        this.palette.add(colour);
    }

    public void add(String binaryBits) {
        Colour colour = ConvertToInt.binaryToStringRGB(binaryBits);
        ErrorChecking.errorCheck(colour);
        this.performCheck(colour);
        this.palette.add(colour);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Palette has: \n");
        for (Colour color : palette) {
            result.append(color).append("\n");
        }
        return result.toString();
    }


    private void performCheck(Colour itemToCheck) {
        if (palette.size() >= paletteSize) {
            throw new IllegalStateException("Palette is full. Cannot add more colors.");
        }
        this.checkIfColourExist(itemToCheck);
    }

    private void checkIfColourExist(Colour itemToCheck) {
        if (this.palette.contains(itemToCheck)) {
            throw new IllegalStateException("This Colour already exist in our palette.");

        }
    }
}



// changed from adding list int to just adding sphere

// changed from ArrayList to Hashset to get O(1) constant time to search if colour exist
// Initially wanted to do this but realised its probably better to do in O(n) time bc we have to compare
//      All red green blue colours to see if the colours are the same