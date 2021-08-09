
//O(n^2) 2 vong lap long nhau = n^2 -on dinh

public class BubbleSort {
    public static void main(String[] args){
        int[] intArray = {20,35,-15,7,55,1,-22};

        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for(int i=0;i<lastUnsortedIndex;i++){
                if(intArray[i]>intArray[i+1])
                    swap(intArray,i,i+1);
            }
        }

        for (int num : intArray)
            System.out.print(num+" ");
    }

    public static void swap(int[] array,int i,int j){
        if(i==j)
            return;
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }
}
