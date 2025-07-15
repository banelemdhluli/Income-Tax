import java.util.Scanner;

public class IncomeTax{

    public static double myCalculation(double income){

        if(income < 5000)
            return 3.0/100*income;

        else if(income <= 25000)
            return 6.0/100*income;

        else if(income <= 50000)
            return 12.0/100*income;

        else if(income <= 75000)
            return 15.0/100*income;

        else if(income <= 100000)
            return 18.0/100*income;
        else
            return 21.0/100*income;
    }
    public static void main(String[]args){

        Scanner input = new Scanner(System.in); // Scanner object

        // Collect employee details

        System.out.print("Please enter name: ");
        String name = input.nextLine();

        System.out.print("Please enter employee number: ");
        int employeeNumber = input.nextInt();
        input.nextLine();

        System.out.print("Please enter income: ");
        double income = input.nextDouble();



        // myCalculation() is now inside our variable tax
        double tax;
        tax = myCalculation(income);

        // Display employee details

        System.out.println();
        System.out.println("Details");
        System.out.println("Name: " + name);
        System.out.println("Employee no: " + employeeNumber);
        System.out.println("Tax: " + tax);

        // Perform calculation of salary after tax

        double salaryafterTax;

        salaryafterTax = income - tax;

        System.out.println("Salary after tax: " + salaryafterTax);




    }
}