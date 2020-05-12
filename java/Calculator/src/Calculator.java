import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        String operator = input.next();
        int number2 = input.nextInt();

        switch( operator )
        {
            case "+" :  System.out.print( number + number2 );
                        break;
            case "-" :  System.out.print( number - number2 );
                        break;
            case "*" :  System.out.print( number * number2 );
                        break;
            case "/" :  if ( number2 == 0 )
                        {
                            System.out.print("Error");
                        }
                        else
                        {
                            System.out.print( number / number2 );
                        }
                        break;
            case "%" :  if ( number2 == 0 )
                        {
                            System.out.print( "Error" );
                        }
                        else
                        {
                            System.out.print(number % number2);
                        }
                        break;
            default  :  System.out.print( "Not a valid operation !" );
        }
    }
}
