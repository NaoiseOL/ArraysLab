package ie.atu;
import java.util.Scanner;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i =0;
        ArrayList<Integer> elements = new ArrayList<>();

        elements.add(100);
        elements.add(200);
        elements.add(300);
        elements.add(400);
        elements.add(500);
        elements.add(600);
        elements.add(700);
        elements.add(800);
        elements.add(900);
        elements.add(1000);

        for(int element: elements){
            System.out.println("Element at index "+ i +": "+element);
            i++;
        }

        i=0;
        System.out.println("Please enter a new value");
        Scanner scanner = new Scanner(System.in);
        elements.add(scanner.nextInt());

        for(int element: elements){
            System.out.println("Element at index "+ i +": "+element);
            i++;
        }


        /*anArray = new int[11];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        System.out.println("Please enter a value");
        Scanner scanner = new Scanner(System.in);
        anArray[10] = scanner.nextInt();

        for(int i = 0;i<11;i++){
            System.out.println("Element at index "+i + ": " + anArray[i]);
        }*/
    }
}