package by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.Controller;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.UserInput.Input;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.MainLogic.Logic;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.View.Output;

public class Main {
    public static void main(String args[]){
        while(true) {
            int a = Input.inp("Please, choose what do you want to do: 1 -  run the program, else - exit\n");
            if (a == 1) {
                int diap = Input.inp("Please, input the range of the numbers for my guessing\n");
                int numoftry = Input.inp("Please, input th number of tryings of guessing\n");
                int way = Input.inp("Please, choose way which I should use to guess your number: 1 - binary way,"
                        + " else - random way\n");
                int res = 0;
                if (way == 1){
                    res = Logic.c1(diap, numoftry);
                }
                else{
                    res = Logic.c2(diap, numoftry);
                }
                if (res == 1 ){
                    Output.print("I HAVE WON YOU!!!\n");
                }
                else if (res == 2){
                    Output.print("You are lier or your number is out of the range!!!\n");
                }
                else{
                    Output.print("I HAVE LOSE!!!\n");
                }
            }
            else{
                break;
            }
        }
    }
}