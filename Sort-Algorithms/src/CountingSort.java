//O(n)-do phuc tap khong gian O(max) vi tao mang moi
//khong on dinh
//Có những số nguyên nhỏ hơn với nhiều số đếm.
//Yêu cầu hay đòi hỏi về độ phức tạp tuyến tính.
public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = { 2, 6, 9, 8, 2, 8, 7, 10, 4, 3 };

        countingSort(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}
