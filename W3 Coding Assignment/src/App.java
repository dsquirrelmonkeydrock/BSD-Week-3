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
    }

}
