package AssignmentA3;
import java.lang.Math;

class Calculate {
    static boolean log(double i) {
        double log2 = Math.log(i) / Math.log(2);
        return log2 % 1 == 0;
    }
}
