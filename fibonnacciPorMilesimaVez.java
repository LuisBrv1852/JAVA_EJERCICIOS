package ejemplos;

public class fibonnacciPorMilesimaVez {
    public static void main(String[]args) {
        //0,1,1,2,3,5,8,13,21,34
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < 10; i++ ) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }

}
