
import java.util.Scanner;

class Bus1 {

    String id;
    int type;
    int seats;
    int bookSeats;
    boolean isActive;

    Bus1(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.bookSeats = 0;
        this.isActive = true;
    }

    void printStats() {
        System.out.println(this.id);
        if (this.type == 1) {
            System.out.println("Fan");
        } else if (this.type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.println(this.bookSeats + " " + this.seats);
        if (this.isActive == true) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }
}

public class BusCompany {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus1 b = new Bus1(id, type, seats);
        b.printStats();
    }
}
