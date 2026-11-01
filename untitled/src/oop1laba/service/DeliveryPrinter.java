package oop1laba.service;

import oop1laba.model.Client;
import oop1laba.model.Courier;

public class DeliveryPrinter {
    public void printInfo(Client client, Courier courier) {
        System.out.println("      ИНФОРМАЦИЯ О ДОСТАВКЕ      ");
        System.out.println("КЛИЕНТ:");
        System.out.println("  Имя: " + client.name());
        System.out.println("  Телефон: +" + client.phone());
        System.out.println("  Адрес доставки: " + client.address());
        System.out.println("---------------------------------");
        System.out.println("КУРЬЕР:");
        System.out.println("  Имя: " + courier.name());

        String statusText = courier.isBusy() ? "Занят (На вызове)" : "Свободен (Ожидает заказ)";
        System.out.println("  Статус: " + statusText);
    }
}
