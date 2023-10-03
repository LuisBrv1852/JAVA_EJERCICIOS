package ejemplos;

import java.util.ArrayList;

public class CountDobles {
    public static  void main (String[]args){
      int [] original = {2,3,4,5,2,3,4};
      int [] numberSaved = new int [original.length];
      int numberReapts=0;
      int indexSaved=0;
      for(int i=0; i<original.length;i++) {
          boolean counted = false;
          int indexCompare=0;

          while(!counted && indexCompare<indexSaved){
              if(numberSaved[indexCompare]==original[i]){
                  counted=true;
              }
              indexCompare++;
          }


          if (!counted) {
              numberSaved[indexSaved]=original[i];
              indexSaved++;
              for (int j = 0; j < original.length; j++) {
                  if (i != j && numberSaved[i] == original[j]) {
                      numberReapts++;
                  }

              }
          }
      }
      System.out.println("We have "+numberReapts+" number with repeats");
    }


}
