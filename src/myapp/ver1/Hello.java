package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args) {
        
        Console cons = System.console();
        String name = "";

        while (name.trim().toLowerCase().length() <= 0) {
            name = cons.readLine("What is your name? ");
        }

        if (name.equals("fred")) {
            System.out.println("Yabadabadoo!");
        } 
        
        else if (name.equals("barney")) {
            System.out.println("We are happy family!");
        } 
        
        else if (name.trim().equals("")) { 
            System.out.println("You did not enter your name");
        }
        else {
            System.out.printf("Hello %s. Nice to meet you!", name);
        }
    }
}
