package p3;

public class Main {

    public static void main(String[] args) {

        int mas[];
        int[] arr = new int[10];

        arr[0] = 10;
        arr[1] = 20;

        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] massiv = {1,2,3,4,5};
        int[] massiv2 = new int[5];

        System.out.println(massiv);

        for (int i = 0; i<massiv2.length; i++){
            System.out.print(massiv2[i] + " ");
        }

        String[] arrStr = new String[5];

        for (int i=0; i<arrStr.length; i++){
            System.out.println(arrStr[i]);
        }













    }

}
