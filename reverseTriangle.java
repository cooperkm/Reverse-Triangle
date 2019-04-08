
import java.lang.StringBuilder;

import java.util.Scanner;

public class reverseTriangle{

    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");


        int number = input.nextInt();

        StringBuilder row = new StringBuilder(number);

        input.close();


        // For loop builds the string. i.e if n = 4, row = "1234"
        for(int i = 1; i <= number; i++){
            row.append(i);
        }

        //prints the first row
        System.out.println(row);

        //Recursive function that shifts all integers to the right
        //Uses (number - 1) because the first row as already been printed
        shiftRight(row, number - 1);

    }

    static void shiftRight(StringBuilder row, int n){

        //base case
        if(n < 1){
            return;
        }

        //appends a '-' to the start of the string. i.e "-1234"
        row.insert(0,'-');

        //deletes last char in the string. i.e "-123"
        row.deleteCharAt(row.length() - 1);

        System.out.println(row);

        //Recursive call
        shiftRight(row, n - 1);



    }
}