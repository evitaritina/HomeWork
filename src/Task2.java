import java.util.Scanner;

/**
 * Created by evita.ritina on 7/25/2018.
 */
public class Task2 {

//public class TrianglePattern {

    public static void main(String[] args) {
        // This logic will generate the triangle for given dimension
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter triangle length: ");
        int dim;
        dim = input.nextInt();

        System.out.println("Triangle length: " + dim);
        
        if ((dim % 2) == 1) {
        	for (int i = 0; i < dim; i+=2) {
                for (int k = i; k < dim; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {

                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println("");
        	}}
        	else {
        
        
        for (int i = 1; i < dim; i+=2) {
            for (int k = i; k < dim; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }}
    }
