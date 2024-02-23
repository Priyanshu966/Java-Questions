public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

    public void setNumerator(int num){
        this.numerator = num;
    }
    
    public int getNumerator(int num){
        return this.numerator;
    }

    public void setDenominator(int num){
        this.denominator = num;
    }
    
    public int getDenominator(int num){
        return this.denominator;
    }

    public void print(){
        System.out.println(this.numerator + "/" + this.denominator);
    }

    private void simplify(){
        int smallerNum = Math.min(numerator,denominator);
        int hcf = 1;

        for(int i = 2; i <= smallerNum; i++){
            if(numerator % i == 0 && denominator % i == 0){
                hcf = i;
            }
        }
        this.numerator = numerator / hcf;
        this.denominator = denominator / hcf;
    }

    public void increment(){
        this.numerator = this.denominator + this.numerator;
    }

    public void add(Fraction f){
        this.numerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        this.denominator = this.denominator * f.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1,Fraction f2){
        Fraction f3 = new Fraction();
        f3.numerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        f3.denominator = f1.denominator * f2.denominator;
        f3.simplify();
        return f3;

    }
}
