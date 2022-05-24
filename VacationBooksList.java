import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int readPagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalHours = countPages / readPagesPerHour;
        int hoursPerDay = totalHours / days;
        System.out.println(hoursPerDay);


    }
}
