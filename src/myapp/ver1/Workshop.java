package myapp.ver1;

import java.io.Console;

public class Workshop {
    
    public static void main(String[] agrs) {

        String input = "";
        Integer total = 0;
        Integer count = 0;
        Console cons = System.console();

        while (!input.equals("stop")){
            input = cons.readLine("Please enter a number: ");
            input = input.trim();
            
            if (input.equals("stop")){
                break;
            }

            count++;
            total += Integer.parseInt(input);
        }

        System.out.printf("The total of adding %d numbers is: %d\n", count, total);


        /*
        Console cons = System.console();
        String number = "";
        String stop_command = "stop";
        Integer Total_Count = 0;
        
        while (!(number.trim().toLowerCase().equals(stop_command))) {

            number = cons.readLine("Enter a number: ");

            if (number.trim().toLowerCase().equals(stop_command)) {
                break;
            }
    
            else if (!(number.trim().toLowerCase().equals(stop_command))) {
                System.out.println("You have entered an invalid input.");
                break;
            }

            int count = Integer.parseInt(number.trim().toLowerCase());

            Total_Count += count;

        }

        System.out.println("The total is: " + Total_Count);
        */
    }
}
