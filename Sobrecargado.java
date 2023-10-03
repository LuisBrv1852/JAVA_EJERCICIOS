package ejemplos;

public class Sobrecargado {
    public static void main (String[]args){
        int a1=4,b1=5,c1=7;
        String letra="Luis";
        metodo(a1,b1,c1);
    }

    public static void metodo(int a, int b , String letra){
        System.out.println("la suma de a+b es "+(a+b)+" la letra es "+letra);
    }
    public static void metodo(int a, int b ){
        System.out.println("la resta de a-b es "+(a-b)+" la letra es ");
    }
    public static void metodo(int a, int b,int c ){
        System.out.println("la suma de a+b+c es "+(a+b+c)+" la letra es ");
    }
}
