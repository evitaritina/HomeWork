import java.util.Scanner;




public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter array length: ");
        int size = input.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Insert array elements:");
    
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); 
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] ); 
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



