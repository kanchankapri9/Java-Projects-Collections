// hi this is kanchan feel free to connect , code, friends, help .   kanchankapri9github.io
    import java.util.*;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}

public class ExpenseTracker {          // here is the main 
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Expense\n2. View All\n3. Total Expense\n4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter category: ");
                    sc.nextLine();
                    String cat = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    expenses.add(new Expense(cat, amt));
                    break;
                case 2:
                    System.out.println("Expenses List:");
                    for (Expense e : expenses)
                        System.out.println(e.category + " - ₹" + e.amount);
                    break;
                case 3:
                    double total = 0;
                    for (Expense e : expenses) total += e.amount;
                    System.out.println("Total Expense: ₹" + total);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}
                     // You can add more functionalities.........
                     // happy copsing :)

