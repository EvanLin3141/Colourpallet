package AssignmentA3;

public class Colour {
    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public String toString() {
        return String.format("{%d, %d, %d}", red, green, blue);
    }
}
