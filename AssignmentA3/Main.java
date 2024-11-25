package AssignmentA3;

import java.awt.*;

public class Main {
    public static void main (String[] args) {
        ColourTable palette1 = new ColourTable(8);
        palette1.add("111111110000000011111111");
        palette1.add(255,255,255);
        System.out.println(palette1.toString());

    }
}
