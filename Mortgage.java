import java.util.Scanner;

public class Morgage{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("PRINCIPAL:");
        int principal = scan.nextInt();

        System.out.print("ANNUAL INTEREST RATE:");
       double rate = scan.nextDouble();

        System.out.print("PERIOD  (YEAR):");
        int year= scan.nextInt();

        double monthly_rate= (rate/100)/12;

        int months =  year*12;

        double mortgage = principal*(monthly_rate*Math.pow(1+monthly_rate,months))/(Math.pow(1+monthly_rate,months)-1);
        System.out.printf("mortgage: $%.2f ",mortgage);

    }
}