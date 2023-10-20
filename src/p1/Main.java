package p1;

public class Main {

    public static void main(String[] args) {
        int a = 21;
        int b = 20;

        if(a>b){
            System.out.println("a>b");
        }else if (a<b){
            System.out.println("a<b");
        }else{
            System.out.println("a=b");
        }

        int c = a<b ? (a+b) : (a-b);
        System.out.println(c);

        if (a<b){
            c = a + b;
        }else{
            c = a -b;
        }
        System.out.println(c);

        int number = 10;

        switch (number){
            case 1:
                System.out.println("Number = 1");
                break;
            case 2:
            case 8:
            case 10:
                System.out.println("Number = 8");
                break;
            default:
                System.out.println("I don't know");
        }


    }

}
