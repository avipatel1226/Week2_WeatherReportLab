// Name: Avi Patel
// Student ID: 200627226
// Lab 1 - Weather Report

import java.util.Scanner;


/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/


public class Main {
    // Midway commit - variables and input added
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
public static void main(String[] args) {


    // STEP 1: Declare variables
    String todayWeather;
    String precipitation;
    String windSpeed;
    double highTemp;
    double lowTemp;
    int uvIndex;


        // TODO: Declare your variables here
        String conditions;
        int precipitationChance;
        int windSpeed;
        double highTemp;
        double lowTemp;
        int uvIndex;

        // Midway commit 2 - input validation loops and conditionals added

        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */


        // TODO: Prompt user and read input
        System.out.print("Enter today's weather conditions: ");
        conditions = input.nextLine();

        // precipitation validation
        System.out.print("Enter chance of precipitation (0-100): ");
        precipitationChance = input.nextInt();

        while (precipitationChance < 0 || precipitationChance > 100) {
            System.out.print("Invalid. Enter chance of precipitation (0-100): ");
            precipitationChance = input.nextInt();
        }

        // wind speed validation
        System.out.print("Enter wind speed (km/h): ");
        windSpeed = input.nextInt();

        while (windSpeed < 0) {
            System.out.print("Invalid. Enter wind speed (0 or more): ");
            windSpeed = input.nextInt();
        }

        // low temp
        System.out.print("Enter daily low temperature (C): ");
        lowTemp = input.nextDouble();

        // high temp (must be >= low temp)
        System.out.print("Enter daily high temperature (C): ");
        highTemp = input.nextDouble();

        while (highTemp < lowTemp) {
            System.out.println("High temp cannot be lower than low temp.");
            System.out.print("Enter daily high temperature again (C): ");
            highTemp = input.nextDouble();
        }

        // UV index validation
        System.out.print("Enter UV index (0-11): ");
        uvIndex = input.nextInt();

        while (uvIndex < 0 || uvIndex > 11) {
            System.out.print("Invalid. Enter UV index (0-11): ");
            uvIndex = input.nextInt();
        }


        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */


        // TODO: Apply typecasting where necessary
        int highTempInt = (int) highTemp;
        int lowTempInt = (int) lowTemp;


        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */


        // TODO: Write if, if-else, or nested if statements to display tips
        String tips = "";

        if (uvIndex >= 6) {
            tips += "UV is high, use sunscreen.\n";
        } else {
            tips += "UV is not too high today.\n";
        }

        if (precipitationChance >= 50) {
            tips += "Carry an umbrella.\n";
        } else {
            tips += "Low chance of rain.\n";
        }

        if (windSpeed > 40) {
            tips += "It is very windy outside.\n";
        } else if (windSpeed > 20) {
            tips += "It is a bit windy.\n";
        } else {
            tips += "Not much wind today.\n";
        }


        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */


        // TODO: Construct your full weather report here
        String fullReport = "\nWeather Report\n"
                + "Conditions: " + conditions + "\n"
                + "Precipitation Chance: " + precipitationChance + "%\n"
                + "Wind Speed: " + windSpeed + " km/h\n"
                + "High Temp: " + highTempInt + " C\n"
                + "Low Temp: " + lowTempInt + " C\n"
                + "UV Index: " + uvIndex + "\n"
                + "\nTips:\n" + tips;


        /*
        STEP 6: Print the full weather report
        */


        // TODO: Output your report using System.out.println()
        System.out.println(fullReport);


        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */


        // TODO: Implement loop for multiple reports
        // (not doing the extra challenge in my version)


        input.close();
    }
}
