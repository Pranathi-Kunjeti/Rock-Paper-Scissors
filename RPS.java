import java.util.*;
import java.lang.Math;

public class RPS
{
    static void choice(int n)
    {
        switch(n)
        {
            case 1:
                System.out.println("rock");
                break;
            case 2:
                System.out.println("paper");
                break;
            case 3:
                System.out.println("scissors");
                break;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int user,comp;
        while(true)
            {
                System.out.println("1.rock\t 2.Paper");
                System.out.println("3.Scissors\t4.end");
                System.out.print("Select anything you want: ");
                user=sc.nextInt();
            if(user<1||user>4)
            {
                System.out.println("Enter correct choice");
                continue;
            }
            if(user==4)
            {
                break;
            }
            System.out.print("Player chose ");
            choice(user);

            comp=(int)(Math.random()*3)+1;

            System.out.print("computer chose ");
            choice(comp);

            int u=(int)Math.pow(2,user-1);
            int c=(int)Math.pow(2,comp-1);

            if(u==c)
            {
                System.out.println("draw!, try again\n");
                continue;
            }

            if(u+c!=5)
            {
                if(u>c)
                {
                    System.out.println("user won!");
                }
                else
                    System.out.println("computer won!");
            }
            else
            {
                if(u<c)
                {
                    System.out.println("user won!");
                }
                else
                    System.out.println("computer won!");
            }
            System.out.println();
            
        }
        System.out.println("End");
        System.out.println("See you later:)");
    }
}