import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {


        int x = 0;  // keep the while loop going
        Scanner scnr = new Scanner(System.in);



        int y = 0;  //
        int value;                 // used to calculate hex conversion
        long total = 0;       // output number
        int length;

        String userInput;        // userInput


        System.out.print("Enter a hexadecimal number: ");
        userInput = scnr.nextLine();


        char charExtractAtTwo = userInput.charAt(1);   //character extracted at position 2


        if (charExtractAtTwo != 'x')
        {
            userInput = userInput;
        }
        else {
            userInput = userInput.substring(2,userInput.length());

        }



        length = userInput.length();          // number of characters in input
        int placement;                         // nth power

        while (x < length)
        {
            char charExtract = userInput.charAt(y);   // charExtract: character extracted
            // changes position of each character

            charExtract = Character.toUpperCase(charExtract);

            if (charExtract == 'A')
            {
                value = 10;
            }
            else if (charExtract == 'B')
            {
                value = 11;
            }
            else if (charExtract == 'C')
            {
                value = 12;
            }
            else if (charExtract == 'D')
            {
                value = 13;
            }
            else if (charExtract == 'E')
            {
                value = 14;
            }
            else if (charExtract == 'F')
            {
                value = 15;
            }
            else
            {
                //value = (int)charExtract;
                value = Character.getNumericValue(charExtract); //https://stackoverflow.com/questions/19388037/converting-characters-to-integers-in-java
            }

            placement = Math.abs(y - length + 1);
            total = value * (long)Math.pow(16,placement) + total;


            y++;
            x++;
        }
        // total = (long) total;

        System.out.print("Your number is " + total + " in decimal");







    }
}


/// hexadecimal to decimal  A37E
