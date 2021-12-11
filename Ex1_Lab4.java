import java.util.ArrayList;
import java.util.Scanner;
public class Ex1_Lab4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив: ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; ; i++) {
            String t = sc.next();
            if (t.equals("quit")) {
                break;
            }
            else {
                try {
                    arr.add(Integer.parseInt(t));
                }
                catch (Exception e) {
                    System.out.println("Введено не число!");
                }
            }
        }
        double [] arr2 = new double[arr.size()];
        double sum = arr.get(0);
        arr2[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
           arr2[i] = sum/((double)i);
           sum += arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
