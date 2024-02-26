import java.util.Scanner;

public class CtoFConverter {
    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temperatureType;
        double temperature;
        double convertedTemperature;

        do {
            System.out.print("Enter the type of temperature (C for Celsius, F for Fahrenheit): ");
            temperatureType = scanner.nextLine().toUpperCase();
        } while (!temperatureType.equals("C") && !temperatureType.equals("F"));

        do {
            try {
                System.out.print("Enter temperature: ");
                temperature = scanner.nextDouble();
                if (temperatureType.equals("C")) {
                    convertedTemperature = celsiusToFahrenheit(temperature);
                    System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit\n", temperature, convertedTemperature);
                } else {
                    convertedTemperature = fahrenheitToCelsius(temperature);
                    System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius\n", temperature, convertedTemperature);
                }
                break; // exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Please enter a valid number for the temperature.");
                scanner.nextLine(); // consume invalid input
            }
        } while (true); // loop until valid input is provided
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i == 1 && j < 5) {
                            System.out.print("*");
                        } else if (i == 2 && j == 4) {
                            System.out.print("*");
                        } else if (i == 3 && j == 4) {
                            System.out.print("*");
                        } else if (i >= 4 && j == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }