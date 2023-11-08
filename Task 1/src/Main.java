public class Main {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        Phone ph2 = new Phone(8_927_785_64_78L, "Samsung", 15.5);

        ph1.receiveCall("Pavel", 8_917_645_12_31L);
        ph2.receiveCall("Robert");
    }
}

class Phone {

    long phoneNumber;
    String modelPhone;
    double weightPhone;
    static String makeCountry;

    Phone() {

    }

    public Phone(long phoneNumber, String modelPhone, double weightPhone) {
        this.phoneNumber = phoneNumber;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
    }

    void receiveCall(String name) {
        receiveCall(name, 0);
    }

    void receiveCall(String name, long number) {
        System.out.println("Вам звонит: " + name + (number == 0 ? " " : (" Номер: " + number)));
    }
}
