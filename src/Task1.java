import java.util.Scanner;




public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
    /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] ); // Выводим на экран, полученный массив
        }
   

       

        //Integer from the longest recurring sequence

        int count = 1, max1 = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > max1) {
                max1 = array[i];
            }
        }

        System.out.println("\n" + "Integer from the longest recurring sequence: " +max1);
    }
}



