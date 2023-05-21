public class CreditPaymentService {

    public int calculate(int credit, int years){
        double monthpercent = 9.99 / 1200; // процентная ставка в месяц (=проценты/12/100)
        double period = years * 12; // период кредита в месяцах

        double payment = credit * monthpercent / (1 - Math.pow(1 + monthpercent, - period));

        return (int) payment;
    }
}