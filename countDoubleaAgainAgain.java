package ejemplos;

public class countDoubleaAgainAgain {
    public static void main(String[] args){
        int []array={2,2,2,3,4,4,6,6};
        System.out.println("the account of the number that repeat in the array is: "+count(array));
    }

    public static int count(int[]array){
        int repeat=0;
        int arraySave[] = new int[array.length];
        int arrayOfRepeats[] = new int[array.length];
        int indexCounted=0;

        for(int i=0; i< array.length; i++){
        boolean counted=false;
        int indexOfRevision=0 ;
        int numberOfRepetitions=1;

        while (!counted && indexOfRevision<indexCounted){
            if(array[i]==arraySave[indexOfRevision]){
                counted=true;
            }
            indexOfRevision++;
        }

        if(!counted) {
            arraySave[indexCounted]=array[i];
            indexCounted++;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    numberOfRepetitions++;
                }
            }
            System.out.println("The number "+array[i]+" repeat "+numberOfRepetitions+" times");
            arrayOfRepeats[i]=numberOfRepetitions;
        }
        }

        for(int i=0; i< array.length;i++){
            if(arrayOfRepeats[i]>1){
                repeat++;
            }
        }



        return repeat;
    }
}
