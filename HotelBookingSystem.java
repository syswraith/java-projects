/*Develop a Java program that implements a simple hotel room booking system using two
  dimensional arrays. The system allows users to: View available and booked rooms, Book a
  room by selecting a floor and room number and exit the system when finished */
import java.util.Scanner;
public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Let's assume 5 floors and 5 rooms per floor
        boolean[][] rooms = new boolean[5][5]; // false = available, true = booked
        while (true) {
            System.out.println("\n==== HOTEL ROOM BOOKING SYSTEM ====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewRooms(rooms);
                    break;
                case 2:
                    bookRoom(rooms, sc);
                    break;
                case 3:
                    System.out.println("Thank you for using the Hotel Booking System!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }
    // Method to display rooms
    private static void viewRooms(boolean[][] rooms) {
        System.out.println("\n=== ROOM STATUS (A=Available, B=Booked) ===");
        for (int floor = 0; floor < rooms.length; floor++) {
            System.out.print("Floor " + (floor + 1) + ": ");
            for (int room = 0; room < rooms[floor].length; room++) {
                if (rooms[floor][room]) {
                    System.out.print("[B] ");
                } else {
                    System.out.print("[A] ");
                }
            }
            System.out.println();
        }
    }
    // Method to book a room
    private static void bookRoom(boolean[][] rooms, Scanner sc) {
        System.out.print("Enter floor number (1-" + rooms.length + "): ");
        int floor = sc.nextInt();
        System.out.print("Enter room number (1-" + rooms[0].length + "): ");
        int room = sc.nextInt();
        if (floor < 1 || floor > rooms.length || room < 1 || room > rooms[0].length) {
            System.out.println("Invalid floor or room number!");
            return;
        }
        if (rooms[floor - 1][room - 1]) {
            System.out.println("Sorry, that room is already booked.");
        } else {
            rooms[floor - 1][room - 1] = true;
            System.out.println("Room booked successfully!");
        }
    }
}
