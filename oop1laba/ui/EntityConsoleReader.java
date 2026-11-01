package oop1laba.ui;

import oop1laba.model.Client;
import oop1laba.model.Courier;

public class EntityConsoleReader {
    private final ConsoleInput input;

    public EntityConsoleReader(ConsoleInput input) {
        this.input = input;
    }

    public Client readClient() {
        System.out.println("\n--- Регистрация Клиента ---");
        String name = input.readString("Введите имя клиента: ");
        String phone = input.readPhone("Введите номер телефона: ");
        String address = input.readString("Введите адрес доставки: ");
        return new Client(name, phone, address);
    }

    public Courier readCourier() {
        System.out.println("\n--- Регистрация Курьера ---");
        String name = input.readString("Введите имя курьера: ");
        return new Courier(name,  false);
    }
}
