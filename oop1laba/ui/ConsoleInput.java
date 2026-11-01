package oop1laba.ui;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner = new Scanner(System.in);

    public String readString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Ошибка! Поле не может быть пустым. Попробуйте еще раз.");
        }
    }

    public String readPhone(String prompt) {
        while (true) {
            System.out.print(prompt + "+7");
            String phone = scanner.nextLine().trim();
            String digits = phone.replaceAll("[^0-9]", "");

            if (digits.length() == 11 && digits.startsWith("8")) {
                return "7" + digits.substring(1);
            }
            if (digits.length() == 11 && digits.startsWith("7")) {
                return digits;
            }
            if (digits.length() == 10) {
                return "7" + digits;
            }
            System.out.println("Ошибка! Неверный формат. Введите 10 или 11 цифр номера телефона.");
        }
    }
}
