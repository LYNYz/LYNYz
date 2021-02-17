
import java.util.Scanner;

public class Tumbol {

    String name;
    int x;
    int y;
    int population;
    int availBudget;

    public Tumbol(String name, int x, int y, int population) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.population = population;
        this.availBudget = population * 5000;
    }

    void allocateBudget(int[] budget) {
        int total = 0;
        for (int i = 0; i < budget.length; i++) {
            if (budget[i] + total <= availBudget) {
                total += budget[i];
                System.out.println(i + 1);
            }
        }
        if (total == 0) {
            System.out.println("none");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int pop = scan.nextInt();
        int n = scan.nextInt();
        int[] budget = new int[n];
        for (int i = 0; i < n; i++) {
            budget[i] = scan.nextInt();
        }
        Tumbol tumbol = new Tumbol(name, x, y, pop);
        tumbol.allocateBudget(budget);
    }
}
