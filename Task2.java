

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10,11};

        int[] array3 = subArrays(array1, array2);
    }

    public static int[] subArrays(int[] array1, int[] array2) {
        if(array1.length != array2.length) throw new RuntimeException("Длины массивов не равны!!!");
        int[] resultArr = new int[array1.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = array1[i] - array2[i];
        }
        return resultArr;
    }

    
}