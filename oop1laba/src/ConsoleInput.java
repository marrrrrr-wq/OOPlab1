import java.util.Scanner;
import java.nio.charset.Charset;

public class ConsoleInput {
    private Scanner scanner;
    private static final String NAME_PATTERN = "^[a-zA-Zа-яА-ЯёЁ ]{1,50}$";
    private static final String PHONE_PATTERN = "^\\+7\\s?[0-9]{3}\\s?[0-9]{3}\\s?[0-9]{2}\\s?[0-9]{2}$";

    public ConsoleInput() {
        this.scanner = new Scanner(System.in, Charset.forName("ibm866"));
    }

    public Client createClient() {
        System.out.println("\n! Создание нового клиента !\n");

        String name = readValidatedString("Введите имя клиента: ", NAME_PATTERN, 
                "Ошибка: Имя должно содержать только буквы и быть длиннее 2 символов!");
                
        String phone = readValidatedString("Введите телефон клиента (в формате +7XXXXXXXXXX): ", PHONE_PATTERN, 
                "Ошибка: Неверный формат телефона! Используйте шаблон: +7 999 999 99 99");
        String address = readValidatedString("Введите адрес клиента: ", "^.+$", 
                "Ошибка: Адрес не может быть пустым!");

        return new Client(name, phone, address);
    }
    public Courier createCourier() {
        System.out.println("\n! Создание нового курьера !\n");

        String name = readValidatedString("Введите имя курьера: ", NAME_PATTERN, 
                "Ошибка: Имя должно содержать только буквы!");
                
        String phone = readValidatedString("Введите телефон курьера (в формате +7XXXXXXXXXX): ", PHONE_PATTERN, 
                "Ошибка: Неверный формат телефона!");

        return new Courier(name, phone);
    }

    private String readValidatedString(String prompt, String pattern, String errorMessage) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (input.matches(pattern)) {
                return input; 
            }
            
            System.out.println(errorMessage);
        }
    }
}

