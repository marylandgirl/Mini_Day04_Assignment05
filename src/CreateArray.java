import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 21, 63, 4, 51};
        String[] strs = {"Sunday","Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday"};
        char[] characters = {'a','e','i','o','u'};
        boolean[] trueorfalse = {true,false};

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Strings: " + Arrays.toString(strs));
        System.out.println("Characters: " + Arrays.toString(strs));
        System.out.println("Booleans: " + Arrays.toString(trueorfalse));
    }
}
