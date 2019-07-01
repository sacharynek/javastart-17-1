import enums.Season;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj nazwę pory roku");

        Season value = Season.fromString(sc.nextLine());
        if (null == value) {
            System.out.println("podana pora roku nie została znaleziona");
        } else {
            value.printMonths();
        }

    }
}
