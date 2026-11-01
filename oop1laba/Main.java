package oop1laba;

import oop1laba.model.Client;
import oop1laba.model.Courier;
import oop1laba.service.DeliveryPrinter;
import oop1laba.ui.ConsoleInput;
import oop1laba.ui.EntityConsoleReader;

public class Main {
    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput();
        EntityConsoleReader reader = new EntityConsoleReader(consoleInput);
        DeliveryPrinter printer = new DeliveryPrinter();

        Client client = reader.readClient();
        Courier courier = reader.readCourier();

        System.out.println("\n--- Первоначальное состояние курьера ---");
        printer.printInfo(client, courier);

        Courier busyCourier = courier.withStatus(true);

        System.out.println("\n--- Состояние после назначения заказа ---");
        printer.printInfo(client, busyCourier);
    }
}

