import java.util.Scanner;
// this import is used to allow user input
// This program converts temperature from Celsius to Fahrenheit and vice versa
public class TemperatureConverter {
    public static void main(String[] args) {
        // Write your code here starting with the variables needed
        double Celsius = 0;
        double Fahrenheit = 0;
        double Celsius_to_Fahrenheit = 0;
        double Fahrenheit_to_Celsius = 0;
    // Scanner is used here to allow user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there!..What would you like to do " + " Option 1: Change from Celsius to Fahrenheit" +  "  Option 2: Change from Fahrenheit to Celsius ");
    //    the user is asked to choose an option
        int Option = scanner.nextInt();
        if(Option == 1){
            System.out.println("You have chosen option " + Option);

            scanner.nextLine();

            System.out.println("Enter the temperature value");
            // the user is asked to enter the temperature value
            double Temperature = scanner.nextDouble();
            // the temperature value is stored in the variable Temperature
          
            switch(Option){
                // the switch statement is used to check the option chosen by the user
                case 1:
                Celsius_to_Fahrenheit = (Temperature * 9/5) + 32;
                System.out.println("The converted temperature is: " + Celsius_to_Fahrenheit);
                break;

                default:
                System.out.println("Invalid option, choose the required option");
            }
            // the converted temperature is printed out

        }
        else if(Option == 2){
            // the user is asked to enter the temperature value
            System.out.println("You have chosen option " + Option);
            scanner.nextLine();
            System.out.println("Enter the temperature value");
            double Temperature = scanner.nextDouble();

            switch(Option){
                // the switch statement is used to check the option chosen by the user
                case 2:
                Fahrenheit_to_Celsius = (Temperature - 32) * 5/9;
                System.out.println("The converted temperature is: " + Fahrenheit_to_Celsius);
                break;

                default:
                System.out.println("Invalid option, choose the required option");
            }


        }
        else{
            // if the user chooses an invalid option, this message is printed out
            System.out.println("Invalid option");
        }

    }

    }

