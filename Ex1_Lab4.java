import java.util.Scanner;
public class Ex1_Lab4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив: ");
        String input = "";
        for (int i = 0; ; i++) {
            String t = sc.next();
            if (t.equals("quit")) {
                break;
            }
            else {
                try {
                    int exam = Integer.parseInt(t);
                    input += t;
                }
                catch (Exception e) {
                    System.out.println("Введено не число!");
                }
            }
        }
        int [] arr = new int[input.length()];
        String [] mass = input.split("");
        for (int i = 0; i<input.length(); i++) {
            arr[i] = Integer.parseInt(mass[i]);
        }
        double [] arr2 = new double[arr.length];
        double sum = arr[0];
        arr2[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
           arr2[i] = sum/((double)i);
           sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
