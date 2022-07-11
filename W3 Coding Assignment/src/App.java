import java.io.ObjectInputFilter.Status;
import java.time.temporal.IsoFields;

import javax.swing.BoundedRangeModel;

public class App {
    public static void main(String[] args) throws Exception {
        // Create an array of int called ages that contains the following values: 3, 9,
        // 23, 64, 2, 8, 28, 93.
        int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

        // Programmatically subtract the value of the first element in the array from
        // the value in the last element of the array
        System.out.println("Last age minus first age: " + (ages[ages.length - 1] - ages[0]));

        // Add a new age to your array and repeat the step above to ensure it is dynamic
        int newAge = 45;
        int[] newArray = new int[ages.length + 1];
        for (int i = 0; i < ages.length; i++) {
            newArray[i] = ages[i];
        }
        newArray[newArray.length - 1] = newAge;
        ages = newArray;
        System.out.println("Last age minus first age: " + (ages[ages.length - 1] - ages[0]));

        // Use a loop to iterate through the array and calculate the average age. Print
        // the result to the console.
        int averageAge = 0;
        for (int age : ages) {
            averageAge += age;
        }
        System.out.println("Average Age: " + (averageAge / ages.length));

        // Create an array of String called names that contains the following values:
        // “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

        // Use a loop to iterate through the array and calculate the average number of
        // letters per name. Print the result to the console.
        int nameAverageLetters = 0;
        for (int i = 0; i < names.length; i++) {
            for (int in = 0; in < names[i].length(); in++) {
                int count = 0;
                if (Character.isLetter(names[i].charAt(in))) {
                    count++;
                }
                nameAverageLetters += count;
            }
        }
        System.out.println("Average number of letters per name: " + (nameAverageLetters / (names.length - 1)));

        // Use a loop to iterate through the array again and concatenate all the names
        // together, separated by spaces, and print the result to the console.
        String concatenatedNames = "";
        for (int i = 0; i < names.length; i++) {
            concatenatedNames += names[i];
            concatenatedNames += " ";
        }
        System.out.println(concatenatedNames);

        // How do you access the last element of any array?
        System.out.println("Last name in array: " + (names[names.length - 1]));

        // How do you access the first element of any array?
        System.out.println("First name in array: " + (names[0]));

        // Create a new array of int called nameLengths. Write a loop to iterate over
        // the previously created names array and add the length of each name to the
        // nameLengths array.
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < nameLengths.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Write a loop to iterate over the nameLengths array and calculate the sum of
        // all the elements in the array. Print the result to the console.
        int nameLengthsSum = 0;
        for (int x : nameLengths) {
            nameLengthsSum += x;
        }
        System.out.println("Sum of all name lengths: " + nameLengthsSum);

        // Write a method that takes a String, word, and an int, n, as arguments and
        // returns the word concatenated to itself n number of times.
        System.out.println(concatenateWord("hello", 3));

        // Write a method that takes two Strings, firstName and lastName, and returns a
        // full name
        System.out.println(createFullName("Derrick", "Day"));

        // Write a method that takes an array of int and returns true if the sum of all
        // the ints in the array is greater than 100.
        System.out.println("is sum of name lengths greather than 100? " + (isGreaterThan100(nameLengths)));

        // Write a method that takes an array of double and returns the average of all
        // the elements in the array.
        double[] testDoubleArray = { 5.5, 10.1, 96.89 };
        System.out.println("Average of double array: " + (averageOfDoubleArray(testDoubleArray)));

        // Write a method that takes two arrays of double and returns true if the
        // average of the elements in the first array is greater than the average of the
        // elements in the second array
        double[] testDoubleArray2 = { 5.5, 10, 96.89 };
        System.out.println("is doble array 1 greater than dobule array 2? "
                + (isDoubleArray1Greater(testDoubleArray, testDoubleArray2)));

        // Write a method called willBuyDrink that takes a boolean isHotOutside, and a
        // double moneyInPocket, and returns true if it is hot outside and if
        // moneyInPocket is greater than 10.50.
        System.out.println("Will I buy a drink? " + (willBuyDrink(true, 11.98)));

        // Create a method of your own that solves a problem. In comments, write what
        // the method does and why you created it.
        System.out.println("your username is: " + (createUsername("Derrick", "Day")));
    }

    public static String concatenateWord(String word, int n) {
        // Write a method that takes a String, word, and an int, n, as arguments and
        // returns the word concatenated to itself n number of times.
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }

    public static String createFullName(String firstName, String lastName) {
        // Write a method that takes two Strings, firstName and lastName, and returns a
        // full name
        return (firstName + " " + lastName);

    }

    public static boolean isGreaterThan100(int[] array) {
        // Write a method that takes an array of int and returns true if the sum of all
        // the ints in the array is greater than 100.
        int result = 0;
        for (int x : array) {
            result += x;
        }
        if (result > 100) {
            return true;
        } else {
            return false;
        }
    }

    public static double averageOfDoubleArray(double[] array) {
        // Write a method that takes an array of double and returns the average of all
        // the elements in the array.
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return (result / array.length);
    }

    public static boolean isDoubleArray1Greater(double[] array1, double[] array2) {
        // Write a method that takes two arrays of double and returns true if the
        // average of the elements in the first array is greater than the average of the
        // elements in the second array
        if (averageOfDoubleArray(array1) > averageOfDoubleArray(array2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        // Write a method called willBuyDrink that takes a boolean isHotOutside, and a
        // double moneyInPocket, and returns true if it is hot outside and if
        // moneyInPocket is greater than 10.50.
        if (isHotOutside == true && moneyInPocket > 10.50) {
            return true;
        } else {
            return false;
        }
    }

    public static String createUsername(String firstName, String lastName) {
        // create a username in the format of first initial of first name, last name
        // with a max length of 8 charcters. if last name is longer that 7 charchters
        // cut off last name at 7 charcters.

        // in my current role at my company this is something that we have to do all the
        // time is create usernames for new users coming into the company.
        if (lastName.length() >= 7) {
            return (firstName.charAt(0) + lastName.substring(0, 7));
        } else {
            return (firstName.charAt(0) + lastName);
        }

    }
}
