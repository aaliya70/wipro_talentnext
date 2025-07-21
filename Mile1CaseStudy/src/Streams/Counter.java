package Streams;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for file name
        System.out.println("Enter the file name");
        String fileName = scanner.nextLine();

        // Prompt for character to count
        System.out.println("Enter the character to be counted");
        char targetChar = scanner.next().charAt(0);
        targetChar = Character.toLowerCase(targetChar);

        int count = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            // Read file line by line
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                for (char ch : line.toCharArray()) {
                    if (Character.toLowerCase(ch) == targetChar) {
                        count++;
                    }
                }
            }

            fileScanner.close();

            System.out.println("File " + fileName + " has " + count +
                               " instances of letter " + targetChar);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        scanner.close();
    }
}