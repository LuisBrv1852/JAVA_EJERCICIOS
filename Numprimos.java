package ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class Numprimos {
    public static void main(String[]args){
        int numPrimeUno=2, numPrimoDos=11, numInicio=1, numFinal=100;

        System.out.println("The number is:"+contador(numPrimeUno,numPrimoDos,numInicio,numFinal));
    }
    public static int contador(int numPrimeUno, int numPrimoDos,int numInicio,int numFinal){
        int primos=0;
        ArrayList <Integer> L1= new ArrayList<>();
        for(int i=numInicio;i<numFinal;i++){
         if(i%numPrimeUno!=0 && i%numPrimoDos!=0){
             L1.add(0);
             //System.out.println(i);
         }if(i%numPrimeUno==0 && i!=0){
                //System.out.println(i +" es primo del numero "+numPrimeUno+"  "+i%numPrimeUno);
                L1.add(2);
         }if(i%numPrimoDos==0 && i!=0){
                //System.out.println(i +" es primo del numero "+numPrimoDos+"  "+i%numPrimoDos);
                L1.add(2);
         }
        }

        Collections.sort(L1);
        for(int i=numInicio;i<numFinal;i++){
            if(L1.get(i)>0){
            primos++;
            }
        }
        return primos;

    }
}
