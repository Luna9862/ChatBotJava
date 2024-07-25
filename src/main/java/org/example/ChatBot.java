package org.example;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser();
        String name = askName(scanner);
        int age = guessAge(scanner);
        String birthMonth = askZodiacSign(scanner);
        int birthYear = askBirthYear(scanner);
        age = 2024 - birthYear; // Recalculate age based on birth year
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);
        tellStory(name, age, birthMonth, scanner);
    }

    private static void greetUser() {
        System.out.println("Hello! I'm your friendly chat bot.");
    }

    private static String askName(Scanner scanner) {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("I'm sorry didn't catch that. Could you please repeat what your name is?");
        String name2 = scanner.nextLine();
        System.out.println("Nice to meet you, " + name2 + "!");
        return name2;
    }

    private static int guessAge(Scanner scanner) {
        System.out.println("Let's guess your age. Are you younger or older than 18?");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("younger")) {
            System.out.println("Are you in high school? (yes/no)");
            String inHighSchool = scanner.nextLine().toLowerCase();

            if (inHighSchool.equals("yes")) {
                System.out.println("Are you a freshman, sophomore, junior, or senior?");
                String year = scanner.nextLine().toLowerCase();

                if (year.equals("freshman")) {
                    System.out.println("Are you 15 or 16 years old?");
                    String freshmanAge = scanner.nextLine();
                    return Integer.parseInt(freshmanAge);
                } else if (year.equals("junior")) {
                    System.out.println("Are you 17 years old?");
                    String juniorAge = scanner.nextLine();
                    return Integer.parseInt(juniorAge);
                } else if (year.equals("senior")) {
                    System.out.println("Are you 18 years old?");
                    String seniorAge = scanner.nextLine();
                    return Integer.parseInt(seniorAge);
                }
            }
            System.out.println("What year were you born?");
            int birthYear = scanner.nextInt();
            scanner.nextLine(); // consume newline
            return 2024 - birthYear;

        } else {
            System.out.println("What year did you graduate from high school?");
            int gradYear = scanner.nextInt();
            scanner.nextLine(); // consume newline
            return (2024 - gradYear) + 18;
        }
    }

    private static String askZodiacSign(Scanner scanner) {
        System.out.println("What's your zodiac sign?");
        String zodiac = scanner.nextLine().toLowerCase();
        String monthRange = "";

        switch (zodiac) {
            case "aries":
                monthRange = "March or April";
                break;
            case "taurus":
                monthRange = "April or May";
                break;
            case "gemini":
                monthRange = "May or June";
                break;
            case "cancer":
                monthRange = "June or July";
                break;
            case "leo":
                monthRange = "July or August";
                break;
            case "virgo":
                monthRange = "August or September";
                break;
            case "libra":
                monthRange = "September or October";
                break;
            case "scorpius":
            case "scorpio":  // In case the user uses the more common "Scorpio"
                monthRange = "October or November";
                break;
            case "sagittarius":
                monthRange = "November or December";
                break;
            case "capricornus":
            case "capricorn":  // In case the user uses the more common "Capricorn"
                monthRange = "December or January";
                break;
            case "aquarius":
                monthRange = "January or February";
                break;
            case "pisces":
                monthRange = "February or March";
                break;
            default:
                System.out.println("Unknown zodiac sign. Please try again.");
                return askZodiacSign(scanner); // Recursively ask again for a valid zodiac sign
        }

        System.out.println("Are you from " + monthRange + "?");
        String birthMonth = scanner.nextLine();
        return birthMonth;
    }

    private static int askBirthYear(Scanner scanner) {
        System.out.println("What year were you born?");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return birthYear;
    }

    private static void countToNumber(Scanner scanner) {
        System.out.println("Pick a number and I'll count to it!");
        int number = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    private static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge!");
        System.out.println("What does a computer fundamentally do?");
        System.out.println("A) Only stores data");
        System.out.println("B) Only processes data");
        System.out.println("C) Stores, retrieves, and processes data");
        System.out.println("D) Only retrieves data");

        while (true) {
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("C")) {
                System.out.println("Correct! Well done.");
                break;
            } else {
                System.out.println("Try again.");
            }
        }
    }

    private static void tellStory(String name, int age, String birthMonth, Scanner scanner) {
        System.out.println("Let's tell a story about you!");
        System.out.println("Where are you from?");
        String location = scanner.nextLine();

        System.out.println("Do you have an iPhone or Android?");
        String phone = scanner.nextLine();

        System.out.println("Once upon a time, there was a person named " + name + " who was " + age + " years old.");
        System.out.println(name + " lived in " + location + " and used an " + phone + ".");
        System.out.println("Being born in " + birthMonth  + ", " + name + " had a unique perspective on life.");
        System.out.println("And he/she lived happily ever after!");
    }
}
