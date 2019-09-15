import java.util.Scanner;  
 
public class Assignment3_1
{
    public static double getPopulation(double init, int days)
    {
        double a = init;
        double b = init;
        int n = days/5;
         
        for(int i=1;i<=n;i++)
        {
            double temp = a; 
            a = b;             
            b = temp + b;
        }
        return a;
    }
   
    public static void main(String[] args)
    {  
        Scanner input=new Scanner(System.in);  
        System.out.println("Enter initial green crud population size: ");  
        System.out.println("or a blank line to quit: ");  
        String size=input.nextLine();  
        while ((size != null) && (size.length() > 0)) 
        {  
            double initialSize = Double.parseDouble(size);               
            System.out.println("Enter the number of days:");  
            int days = input.nextInt();  
            System.out.println("Population after "+days+" days = "+getPopulation(initialSize,days));
            
            System.out.println();  
            System.out.println("Enter initial green crud population size: ");  
            System.out.println("or a blank line to quit: ");  
            input.nextLine();  
            size=input.nextLine();  
        }
    }  
    
}  