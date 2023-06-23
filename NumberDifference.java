import java.lang.reflect.Array;
import java.util.*;

public class NumberDifference {

    public static void main(String[] args){
        // We read the list of Values
        System.out.println("Enter List of Values for Comparison");
        Scanner scanner = new Scanner(System.in);
        //We read the entire line into a String, and store it in an Array String
        String resultString = scanner.nextLine();
        String[] numbersArr = resultString.split("\\s*,\\s*");

        //We check if the Array has Less than two elements before proceeding
        if (numbersArr.length < 2) {
            System.out.println("0");
        } else {
            // We convert our Values to Hashset to handle duplicates
            Set<Integer> numberSet = new HashSet<>();
            for (String s : numbersArr) {
                try {
                    numberSet.add(Integer.valueOf(s));
                } catch (NumberFormatException e){
                    System.out.println("List should only contain Integers");
                    System.exit(0);
                }
            }

            //We get the Set max value
            int maxValue =  Collections.max(numberSet);
            int minValue = Collections.min(numberSet);
            int difference = maxValue - minValue;
            //Display the Maximum and Minimum Value
//            System.out.println("Max Value is maxValue " + maxValue);
//            System.out.println("Min Value is maxValue " + minValue);
            System.out.println("The difference is " + difference);
        }

    }
}
