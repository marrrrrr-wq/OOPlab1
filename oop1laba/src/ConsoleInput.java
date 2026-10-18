import java.util.Scanner;
import java.nio.charset.Charset;

public class ConsoleInput {
    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in, Charset.forName("ibm866"));
    }

    public Client createClient() {
        System.out.println("\n! Создание нового клиента !\n");

        System.out.print("Введите имя клиента: ");
        String name = scanner.nextLine();

        System.out.print("Введите телефон клиента: ");
        String phone = scanner.nextLine();

        System.out.print("Введите адрес клиента: ");
        String address = scanner.nextLine();

        return new Client(name, phone, address);
    }
}
