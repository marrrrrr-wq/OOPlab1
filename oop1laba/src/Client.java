
public class Client {
    private String name;
    private String phone_number;
    private String address;

    public Client (String name, String phone_number, String address) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
    }

    public String getNamme()
    { return name;}

    public String getPhone()
    { return phone_number;}

     public String getAddress()
    { return address;}

    public String toString(){
        return "Клиент: " + name + "\nТелефон: " + phone_number + "\nАдрес: " + address;
    }

}