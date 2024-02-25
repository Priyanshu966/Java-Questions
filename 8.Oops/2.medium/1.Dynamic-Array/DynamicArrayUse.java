public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d1 = new DynamicArray();
        for(int i = 1; i <= 10; i++){
            d1.add(i);
        }
        d1.add(2,30);
        d1.print();
        d1.set(2,20);
        d1.removeLast();
        System.out.println(d1.length());
        d1.add(11,50);
        d1.print();
       
        
        
    }
    
}
