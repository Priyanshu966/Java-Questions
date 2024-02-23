public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,2);
        f1.setDenominator(5);
        System.out.println(f1.getDenominator(0));
        f1.increment();
        f1.print();
        
        Fraction f2 = new Fraction(2,3);
        f2.add(f1);
        f2.print();

        Fraction f3 = Fraction.add(f1,f2);
        f3.print();

    }
    
}
