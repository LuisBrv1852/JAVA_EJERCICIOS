package ejemplos;

public class fibonacciAgainAgain {
    public static void main(String[]args){
    //1,1,2,3,5,8,13,18,31,49,80,129
    //0/1/2/3/4
    int a1=1,a2=1,a3=0;

    for(int i=0; i<11;i++){
        System.out.print(a1+" , ");
        a3=a1+a2;
        a1=a2;
        a2=a3;
    }


    }

}
