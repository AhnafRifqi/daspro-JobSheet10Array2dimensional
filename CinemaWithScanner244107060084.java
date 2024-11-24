import java.util.Scanner;


public class CinemaWithScanner244107060084 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int choice;
        String name;
        int row; 
        int column;

        do {
            System.out.println("\nCinema Management System");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:

                    do {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();

                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();
                        sc.nextLine(); 

                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt();
                        sc.nextLine(); 

                        if (audience[row - 1][column - 1] == null) {
                            audience[row - 1][column - 1] = name;
                            System.out.println("Seat booked successfully!");
                            break;
                        } else {
                            System.out.println("Seat is already occupied. Please choose another seat.");
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("\nAudience List:");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            System.out.print((audience[i][j] == null ? "***" : audience[i][j]) + "\t" );
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        
    }
}