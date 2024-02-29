// Polynomial Class Problem

// Implement a polynomial class, that contains following functions -
// 1. setCoefficient -
// This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
// 2. add -
// Adds two polynomials and returns a new polynomial which has the result.
// 3. subtract -
// Subtracts two polynomials and returns a new polynomial which has the result.
// 4. multiply -
// Multiplies two polynomials and returns a new polynomial which has the result.
// 5. print -
// Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
// Print pattern for a single term : "x"
// And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
// Note : Only keep those terms which have non - zero coefficients.
// Sample Input 1 :
// P1 : 1x2 2x3 4x6 
// P2 : 3x4 1x2
// Sample Output 1 :
// P1 + P2 = 2x2 2x3 3x4 4x6
// Sample Input 2 :
// P1 : 1x2 2x3 4x6 
// P2 : 3x4 1x2
// Sample Output 2 :
// P1 - P2 = 2x3 -3x4 4x6



public class Polynomial {
    private DynamicArray data = new DynamicArray();

    public void setCoefficient(int degree, int coefficient){
        data.set(degree,coefficient);
    }
    
    public int getCoefficient(int index){
        if(index >= data.length()){
            return -1;
        }
        return data.get(index);
    }

    public static Polynomial add(Polynomial p1, Polynomial p2){
        Polynomial newPolynomial = new Polynomial();
        int i = 0;
        int j = 0; 
        while(i < p1.data.length() && j < p2.data.length()){
            newPolynomial.setCoefficient(i,p1.getCoefficient(i) + p2.getCoefficient(i));
            i++;
            j++;
        }
        while(i < p1.data.length()){
            newPolynomial.setCoefficient(i,p1.getCoefficient(j));
            i++;
        }
        while(j < p2.data.length()){
            newPolynomial.setCoefficient(j,p2.getCoefficient(j));
            j++;
        }

        return newPolynomial;

    }

    public static Polynomial subtract(Polynomial p1, Polynomial p2){
        Polynomial newPolynomial = new Polynomial();

        int i = 0;
        int j = 0;

        while(i < p1.data.length() && j < p2.data.length()){
            newPolynomial.setCoefficient(i, p1.getCoefficient(i) - p2.getCoefficient(i));
            i++;
            j++;
        }
        while(i < p1.data.length()){
            newPolynomial.setCoefficient(i, p1.getCoefficient(i));
            i++;
        }
        while(j < p2.data.length()){
            newPolynomial.setCoefficient(j, -1 *  p2.getCoefficient(j));
            j++;
        }

        return newPolynomial;
    }

    public static Polynomial multiply(Polynomial p1, Polynomial p2){
        Polynomial newPolynomial = new Polynomial();

        for(int i = 0; i < p1.data.length(); i++){
            if(p1.getCoefficient(i) == 0){
                continue;
            }
            for(int j = 0; j < p2.data.length(); j++){
                if(p2.getCoefficient(j) == 0){
                    continue;
                }
                newPolynomial.setCoefficient(i + j, p1.getCoefficient(i) * p2.getCoefficient(j));
            }
        }
        return newPolynomial;
    }

    public void print(){
        boolean firstPrint = true; 
        for(int i = 0; i < data.length(); i++){
            if(data.get(i) == 0){
                continue;
            }else{
                if(firstPrint){
                    System.out.print("");
                    firstPrint = false;
                    System.out.print(data.get(i) + "x^" + i);
                }else if(data.get(i) > 0){
                    System.out.print(" + ");
                    System.out.print(data.get(i) + "x^" + i);

                }else if(data.get(i) < 0){
                    System.out.print(" - ");
                    System.out.print(-1 * data.get(i) + "x^" + i);

                }
                
            }
            
        }
        System.out.println("");
    }
    
}
