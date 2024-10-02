import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int[] arr = {1, 4, 6, 4, 3, 7, 0, 4, 2, 4};
        int m[] = new int[10];
        m[0] = 2;

        List<Integer> list = new ArrayList<>(List.of(1, 4, 6, 4, 3, 7, 0, 4, 2, 4));//9 phan tu: Co dinh.
        list.add(10);//kiem tra kich thuoc (length) neu ma length dat MAX_SIZE thi se tang them 50% kich thuoc cu = cach tao ra mot array moi va copy data cu sang
        list.remove(9);


        for(int i = 0; i < arr.length; i++) {
            System.out.println("Index is: " + arr[i]);
        }

        System.out.println("========");

        for (int value : arr) {
            System.out.println("Value is: " + value); //i: ko biet
        }

    }
}