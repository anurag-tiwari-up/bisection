import java.util.Scanner;
public class Bis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,x,fx;
        System.out.println("enter a : ");
        a = sc.nextFloat();
        System.out.println("enter b : ");
        b = sc.nextFloat();
        sc.close();
        for(int i=0; i<11;i++)
        {
            x=(a+b)/2;
            fx = x*x*x -(4*x) - 9;

            if(fx>0)
            {
                b=x;
            }
            else
            {
                a=x;
            }
            System.out.println("iteration : " + i + "the root is : " + x + "function fx : "+ fx);
        }
    }
}