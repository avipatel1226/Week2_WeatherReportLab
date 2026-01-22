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
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Midway commit - variables and input added

        // STEP 1: Declare variables (only once!)
        String conditions;
        int precipitationChance;
        int windSpeed;
        double highTemp;
        double lowTemp;
        int uvIndex;

        // Midway commit 2 - input validation loops and conditionals added

        // STEP 2: Get input from the user
        System.out.print("Enter today's weather conditions: ");
        conditions = input.nextLine();

        // Precipitation validation
        System.out.print("Enter chance of precipitation (0-100): ");
        precipitationChance = input.nextInt();
        while (precipitationChance < 0 || precipitationChance > 100) {
            System.out.print("Invalid. Enter chance of precipitation (0-100): ");
            precipitationChance = input.nextInt();
        }

        // Wind speed validation
        System.out.print("Enter wind speed (km/h): ");
        windSpeed = input.nextInt();
        while (windSpeed < 0) {
            System.out.print("Invalid. Enter wind speed (0 or more): ");
            windSpeed = input.nextInt();
        }

        // Low temp
        System.out.print("Enter daily low temperature (C): ");
        lowTemp = input.nextDouble();

        // High temp (must be >= low temp)
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

        // STEP 3: Typecasting
        int highTempInt = (int) highTemp;
        int lowTempInt = (int) lowTemp;

        // STEP 4: Conditional statements
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

        // STEP 5: Create full report
        String fullReport = "\nWeather Report\n"
                + "Conditions: " + conditions + "\n"
                + "Precipitation Chance: " + precipitationChance + "%\n"
                + "Wind Speed: " + windSpeed + " km/h\n"
                + "High Temp: " + highTempInt + " C\n"
                + "Low Temp: " + lowTempInt + " C\n"
                + "UV Index: " + uvIndex + "\n"
                + "\nTips:\n" + tips;

        // STEP 6: Print full report
        System.out.println(fullReport);

        input.close();

        // Final commit - full weather report output implemented
    }
}
