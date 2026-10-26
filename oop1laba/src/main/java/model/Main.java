package model;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "Cp866"));
        
        ConsoleInput input = new ConsoleInput();
        Client client = input.createClient();

        System.out.println("\nВы создали клиента:\n");
        System.out.println(client);
        
        Courier courier = input.createCourier();
        System.out.println("\nВы создали курьера:\n" + courier);
    }
}
