package ejemplos;

public class Modulos {
    public static void main (String[]args){
        for(int i=0;i<11;i++){
            for(int j=1; j<11;j++){
                System.out.print(i+"%"+j+"="+(i%j)+"\t");
            }
            System.out.println("");
        }
    }
}
