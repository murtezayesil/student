import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.print( showTwos(number) );
    }

    private static String showTwos(int number)
    {
        String answer = number + " = ";

        while ( number % 2 == 0 )
        {
            if ( number % 2 == 0 )
            {
                answer += "2 * ";
                number /= 2 ;
            }
        }
        answer += number;

        return answer;
    }
}
