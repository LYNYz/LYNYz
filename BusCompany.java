
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

class Bus2 {

    String id;
    int type;
    int seats;
    int bookSeats;
    boolean isActive;

    Bus2(String id, int type, int seats) {
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

    boolean reserve(int K) {
        if(K<0) {
            return false;
        }
        if(this.seats - this.bookSeats < K) {
            return false;
        }
        if(!isActive) {
            return false;
        }
        this.bookSeats += K;
        return true;
    }

    void sendToRepair() {
        this.isActive = false;
    }

    void backToService() {
        this.isActive = true;
    }
}

public class BusCompany {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus2 b = new Bus2(id, type, seats);
        int N = scan.nextInt();
        for(int i = 0; i<N;i++) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if(P == 1) {
                b.reserve(K);
            } else if(P == 2) {
                b.sendToRepair();
            } else {
                b.backToService();
            }
            b.printStats();
        }
    }
}
