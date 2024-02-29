public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setCoefficient(2,2);
        p1.setCoefficient(3,3);
        p1.setCoefficient(5,4);
        p1.print();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(1,1);
        p2.setCoefficient(2,5);
        p2.setCoefficient(7,6);
        p2.print();

        Polynomial p3 = Polynomial.add(p1,p2);
        p3.print();

        Polynomial p4 = Polynomial.subtract(p1,p2);
        p4.print();

        Polynomial p5 = Polynomial.multiply(p1,p2);
        p5.print();
        
    }
    
}
