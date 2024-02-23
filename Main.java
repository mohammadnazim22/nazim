package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("please provide an OS to run our phone");

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        OS os = OSFactory.factoryMethod(str);

        os.printMobile();


    }
}
