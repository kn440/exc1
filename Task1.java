public class Task1 {
    public static void main(String[] args) {
        String str=null;
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        try {
            double A =10/0;
            } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
            } 
           
        try {
            array[100]=10;
            } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации массива: " + e);
            } 
        try {
                System.out.println(str.length());
                } catch (NullPointerException e){
                System.out.println("Элемент  отсутствует: " + e);
                }     
            }
  
   

  
}
