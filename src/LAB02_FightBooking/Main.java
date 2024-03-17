package LAB02_FightBooking;

import java.util.Scanner;
class FlightBooking {
    private String flightId = "OOP24";
    private static int seatAvailable = 180;
    public void bookTicket(int userId) {
        seatAvailable--;
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public void confirmTicket(int userId) {
        System.out.print("--User " + userId + " Confirmed--[Seat Available: " + seatAvailable + "]");
    }

    public void cancelTicket(int userId) {
        seatAvailable++;
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }
    public void reset() {
        seatAvailable = 180;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            FlightBooking flightBooking = new FlightBooking();
            String[] tasks = scanner.nextLine().split(" ");
            for (int j = 0; j < tasks.length; j += 2) {
                int userId = Integer.parseInt(tasks[j]);
                String task = tasks[j + 1];

                if (task.equals("Booking")) {
                    flightBooking.bookTicket(userId);
                }
                else if (task.equals("Confirmed")) {
                    flightBooking.confirmTicket(userId);
                }
                else if (task.equals("Cancel")) {
                    flightBooking.cancelTicket(userId);
                }
            }
            System.out.println();
            flightBooking.reset();
        }
    }
}