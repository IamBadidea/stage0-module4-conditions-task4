package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    private int result;
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        if (first > second) {
            result = 10;
        } else {
            result = -10;
        }
    }
}
