public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма ежемесячного платежа на 1 год: " + service.calculate(1_000_000, 1));

        System.out.println();
        System.out.println("Сумма ежемесячного платежа на 2 года: " + service.calculate(1_000_000, 2));

        System.out.println();
        System.out.println("Сумма ежемесячного платежа на 3 года: " + service.calculate(1_000_000, 3));
    }
}