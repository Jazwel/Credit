public class CreditPaymentService {
    public double calculate(double creditSum, double months, double percent) {
        double percentMonth = percent /100/12 ;
        double coefficient = percentMonth*(Math.pow(1+percentMonth,months))/(((Math.pow(1+percentMonth,months))-1));
        double myCredit = creditSum * coefficient;
        return (int) myCredit;
    }

}
