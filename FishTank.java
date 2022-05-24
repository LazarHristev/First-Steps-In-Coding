import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double percentAcc = Double.parseDouble(scanner.nextLine());

        int volumeCm = length * width * height;
         double volumeLt = volumeCm / 1000.0;
         double result = volumeLt - (volumeLt * (percentAcc / 100.0));
        System.out.println(result);



    }
}
