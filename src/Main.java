import com.google.common.primitives.Shorts;

public class Main {
    public static void main(String[] args) {
        short a = 4;
        short b = 4;
        int output = Shorts.compare(a, b);
        System.out.println("Сравнивая " + a
                + " и " + b + " : "
                + output);


        short a2 = 4;
        short b2 = 2;
        int output2 = Shorts.compare(a2, b2);
        System.out.println("Comparing " + a2
                + " and " + b2 + " : "
                + output2);


        short a3 = 2;
        short b3 = 4;
        int output3 = Shorts.compare(a3, b3);
        System.out.println("Comparing " + a3
                + " and " + b3 + " : "
                + output3);
    }
}