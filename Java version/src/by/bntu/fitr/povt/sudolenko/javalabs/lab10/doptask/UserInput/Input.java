package by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.UserInput;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.View.Output;

import java.util.Scanner;

public class Input {
    private static Scanner read = new Scanner(System.in);
    public static int inp(String msg) {
        int index = 0;
        Output.print(msg);
        try {
            index = read.nextInt();
        }
        catch (Exception e){
            read.nextLine();
            Output.print("That not an integer number!\n Please, input again.");
            inp(msg);
        }
        if (index < 0){
            Output.print("That number is negative!\n Please, input again.");
            inp(msg);
        }
        return index;
    }
}