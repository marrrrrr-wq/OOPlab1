public class Courier {
    private String name;
    private String phone_number;
    private boolean isFree; 

    public Courier(String name, String phoneNumber) {
        this.name = name;
        this.phone_number = phoneNumber;
        this.isFree = true;
    }
    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public boolean isFree() {
        return isFree;
    }
    public String toString(){
        String status = isFree ? "Свободен" : "Занят на заказе";
        return "Курьер: " + name + "\nТелефон: " + phone_number + "\nЗанятость: " + status;
    }


}