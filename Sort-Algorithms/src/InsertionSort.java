//on dinh
public class InsertionSort {
    public static void main(String[] args){
        int[] intArray = {20,35,-15,7,57,1,-23};

        for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0&&intArray[i-1]>newElement;i--){
                intArray[i]=intArray[i-1];
            }
            intArray[i]=newElement;
        }

        for (int num : intArray)
            System.out.print(num+" ");
    }
}
