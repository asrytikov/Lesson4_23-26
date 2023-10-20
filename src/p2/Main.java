package p2;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i<10; i=i+2){
            System.out.println("Hello" + i);
        }

        int i = 1;
        for(;i<9;){
            System.out.println("test" + (i*i));
            i++;
        }

        System.out.println(i);

        while (i>0){
            System.out.print(i + " ");
            i--;
        }

        while (true){
            System.out.println("Test");
            i++;
            if (i == 5) break;
        }

        for (int j=0; j<20; j++){
            if (j==10) continue;
            System.out.println(j);
        }
        int n = 5;

        do{
            System.out.println(n);
            n--;
        }while (n>0);


    }

}
