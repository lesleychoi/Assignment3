import java.util.Scanner;

public class Assignment3_2
{
   public static void main(String [] args)
   {
       double num=1.0;
       double fact=1.0;
       double output=1.0;

       Scanner input=new Scanner(System.in);
       System.out.println("Enter a value for x: ");
       System.out.println("or a blank line to quit: ");
       double value=input.nextDouble();
       while ((value != 0) && (value>0))
       {
        double initialValue=value;               

        for (int n=1; n<=20; n++)
        {
            for (int i=1; i<=20; i++)
                num=num*value;
            for (int i=1; i<=20; i++)
                fact=fact*i;
            output=output+(num/fact);
        System.out.printf("e^%s", value);
        System.out.printf(" (n=%2s)", n);
        System.out.printf("%15.10f", output);
        System.out.println();

        System.out.println("Enter a value for x: ");
        System.out.println("or a blank line to quit: ");
        input.nextDouble();
        value=input.nextDouble();
        }
        }
    }
}

