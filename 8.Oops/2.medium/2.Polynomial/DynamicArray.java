public class DynamicArray {
    private int data[];
    private int nextElementIndex;

    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }

    public int length(){
        return nextElementIndex;
    }

    public int get(int index){
        if(index >= nextElementIndex){
            return -1;
        }
        return data[index];
    }

    public void set(int index,int num){
        while(index >= data.length){
            doubleCapacity();
        }
        if(index >= nextElementIndex){
            nextElementIndex = index + 1;
        }
        data[index] = num;
    }

    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

    public void add(int num){
        if(nextElementIndex >= data.length){
            doubleCapacity();
        }
        data[nextElementIndex] = num;
        nextElementIndex++;
    }

    public void add(int index, int num){
        int temp[] = data;
        
        if(index > nextElementIndex){
            nextElementIndex = index + 1;
        }else{
            nextElementIndex++;
        }
        while(index > data.length || nextElementIndex > data.length){
            doubleCapacity();
        }
        data[index] = num;
        for(int i = index + 1; i < nextElementIndex; i++){
            data[i] = temp[i - 1];
        }

       
    }

    public void removeLast(){
        if(nextElementIndex == 0){
            return;
        }
        data[nextElementIndex - 1] = 0;
        nextElementIndex--;
    }

    public void print(){
        for(int i = 0; i < nextElementIndex; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2 * temp.length];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }
    
}
