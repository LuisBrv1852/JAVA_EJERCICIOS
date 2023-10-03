package ejemplos;

public class ContrarDoblesOtraVezMas {
    public static void main(String[]args){
        int a[]={1,1,3,3,4,4};
        System.out.println("Number of repeat: "+conutDoubles(a));
    }
    public static int conutDoubles(int[]a){
        int repeat=0;
        int []arraySave=new int[a.length];
        int[]arrayRepeat=new int[a.length];
        int  numberSave=0;
        for(int i=0; i<a.length;i++){
            boolean counted=false;
            int numberRepeat=1,indexOfCompare=0;

            while(!counted && indexOfCompare<numberSave){
                if(arraySave[indexOfCompare]==a[i]){
                    counted=true;
                }
                indexOfCompare++;
            }

            if(!counted) {
                arraySave[numberSave]=a[i ];
                numberSave++;
                for (int j = 0; j < a.length; j++) {
                    if (i != j ) {
                        if(a[i]==a[j]) {
                            numberRepeat++;
                        }
                    }
                }
                System.out.println("The number "+a[i]+" repeat: "+numberRepeat);
                arrayRepeat[i]=numberRepeat;
            }
        }

        for(int i=0; i<arrayRepeat.length;i++){
            if(arrayRepeat[i]>1){
                repeat++;
            }
        }

        return repeat;
    }
}
