package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(getMaxFromTwo(getMaxFromTwo(first, second), third));

    }

    private int getMaxFromTwo(int one, int two) {
        return one > two || one == two ? one : two;
    }
}
