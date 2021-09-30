import java.util.Scanner;
// make sure to comment one of the functions so that the other one will work

public class Main {

    // function goes here:
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");

        Scanner input = new Scanner(System.in);
        input.next();

        System.out.println("It's develoiper tea time!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        announceDeveloperTeaTime(); // will call this function above 
        
        System.out.println("Write code");
        System.out.println("Review Code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted");
    }
}

// Calculate meal price function with parameters: 
public class Main {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) { 
        // changed void to double since we want to return a double type

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        // System.out.println("Your total meal price is " + result);
        return result;
    }

    public static void main(String[] args) { // void is the return type 

        // calling the function above:
        calculateTotalMealPrice(15.3, .2, .08); // Order matters for parameters as well as parameters
        calculateTotalMealPrice(25.7, .15, .1);

        // because we changed void in the function, we must add the data type in the return as well:
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .5);
        System.out.println(groupTotalMealPrice);

        // to find individual price based on group (5 people total):
        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);
    }
}

// code challenge:
// Input 1: number of hours the employee works per week
// Input 2: amount of money the meployee makes per hour
// Output: employee's gross yearly salary
// Add input that accounts for vacation days --> 1 vacation day = 8 hours of work

public class Main {
    public static double calculateSalary(double weeklyHours, double moneyPerHour, int vacationDays) {
        double totalWeeklySalary = weeklyHours * moneyPerHour;
        double daysWorked = 365 - vacationDays;
        double yearlySalary = totalWeeklySalary * daysWorked;
        System.out.println("This is how much you make in a year: " + "$" + yearlySalary);
        return yearlySalary;
    }

    public static void main(String[] args) {
        double salary = calculateSalary(40, 25.50, 10);
    }
}