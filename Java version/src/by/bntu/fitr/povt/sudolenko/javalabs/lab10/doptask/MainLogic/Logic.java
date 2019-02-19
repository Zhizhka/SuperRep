package by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.MainLogic;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.doptask.UserInput.Input;

import java.util.Random;

public class Logic {
    public static int c1(int diop, int trys){
        int res = 0, minv = 1, maxv= diop, x = 0, otv, hod;
        while (true){
            x = (minv + maxv) / 2;
            otv = Input.inp("Your number is " + String.valueOf(x) +
                    "? Please, say 1 - it is true or else - it is false\n");
            if (otv == 1) {
                res = 1;
                break;
            }
            else{
                hod = Input.inp("Please, say is your number bigger or smaller than my" +
                        ": 1 - bigger, else - smaller\n");
                if (hod == 1){
                    minv = x;
                    trys -= 1;
                }
                else{
                    maxv = x;
                    trys -= 1;
                }
            }
            if (minv == maxv){
                res = 2;
                break;
            }
            if (trys == 0){
                break;
            }
        }
        return res;
    }
    public static int c2(int diop, int trys){
        Random rand = new Random();
        int res = 0, x = 0, otv;
        while (true){
            x = rand.nextInt(diop) + 1;
            otv = Input.inp("Your number is " + String.valueOf(x) +
                    "? Please, say 1 - it is true or else - it is false\n");
            if (otv == 1) {
                res = 1;
                break;
            }
            else{
               trys -= 1;
            }
            if (trys == 0){
                break;
            }
        }
        return res;
    }
}