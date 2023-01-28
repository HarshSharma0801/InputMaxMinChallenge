import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int  count = 1;
       double  sum = 0;
        double  a = 0;
        double  b = 0 ;
        double  h = 0;
        double  i = 0;
        double  j = 0;
        double  sum1 =0;
        Scanner scanner = new Scanner(System.in);
        // when the loop is looped once
        while(count==1) {
            System.out.println("Enter number #"+count+" : ");

            try {
                String m = scanner.nextLine();
                double  n = Double .parseDouble(m);
                sum = n ;
                a=sum;
                b=sum;
                h = Double .max(sum,a);
                i = Double .min(sum,b);


            } catch (NumberFormatException BadUserData) {
                System.out.println("Maximum Number Entered by you is "+h);
                System.out.println("Minimum Number Entered by you is "+i);

                break;
            }
            count++;
        }
        // when looped is looped more than once
        while(count>1) {
            System.out.println("Enter number #"+count+" : ");

            try {
                String p = scanner.nextLine();
                double  q = Double .parseDouble(p);
                sum1=q;
                h = Double .max(a,sum1);
                i = Double .min(b,sum1);
                a=h;
                b=i;


            } catch (NumberFormatException BadUserData) {
                System.out.println("Maximum Number Entered by you is "+h);
                System.out.println("Minimum Number Entered by you is "+i);

                break;
            }
            count++;
        }




        }

    }
