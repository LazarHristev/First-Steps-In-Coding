import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFish = Integer.parseInt(scanner.nextLine());
        int countVegan = Integer.parseInt(scanner.nextLine());

        double priceAllChicken = countChicken * 10.35;
        double priceAllFish = countFish * 12.40;
        double priceAllVegan = countVegan * 8.15;
        double priceAllMenu = priceAllChicken + priceAllFish + priceAllVegan;
        double desertPrice = priceAllMenu * 0.20;
        double totalPrice = priceAllMenu + desertPrice + 2.5;

        System.out.println(totalPrice);


    }
}
