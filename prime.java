import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        boolean isPrime=true;
        if(n<=1)
        {
            isPrime=false;

        }
        else {
            for(int i =2 ;i<=Math.sqrt(n);i++)
            {
                if (n%i==0)
                {
                  isPrime=false;
                  break;
                }


            }

        }
        if(isPrime)
        {
            System.out.println(n+" is prime number");
        }
        else {
            System.out.println(n+ " is  not prime number");
        }

    }
}
