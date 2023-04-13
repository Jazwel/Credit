
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        System.out.println("Минимальный платеж. Кредит на год");
        System.out.println(service.calculate (1000000, 12, 9.99));
        System.out.println("Минимальный платеж. Кредит на 2 года");
        System.out.println(service.calculate (1000000, 24, 9.99));
        System.out.println("Минимальный платеж. Кредит на 3 года");
        System.out.println(service.calculate (1000000, 36, 9.99));


    }
}