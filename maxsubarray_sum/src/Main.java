import java.security.PublicKey;

public class Main {
      /* public static int printsubarray(int number[]) {
         for (int i = 0; i <= number.length; i++) {
             int start = i;
             for (int j = i; j < number.length; j++) {
                 int end = j;
                 // now print karege by help of loop
                 for (int k = start; k <= end; k++) {
                     System.out.print(" "+number[k] );
                 }
                 System.out.println();
             }
         }
          return -1;}
           */


        //MAX SUM ARRAY BY BRUTE FORCE
      /*public static void maxsubarray(int numbers[]) {
          int cs = 0;
          int ms = Integer.MIN_VALUE;
          for (int i = 0; i < numbers.length; i++) {
              int start = i;
              for (int j = i; j < numbers.length; j++) {
                  int end = j;
                  cs=0;
                  for (int k = start; k <= end; k++) {
                      cs = cs + numbers[k];
                  }System.out.println(cs);
                  if (ms < cs) {
                      ms = cs;
                  }
              }
          }


          System.out.println(+ms);}
         // return -1;}


          */
          //KADANE ALGO (MAX SUARRAY SUM) TIME COMPLEXITY BIG O(N)

          // IN THIS BASICALLY WE ARE IGNORING NEGATIVE NUMBER
    // ONLY ONE LOOP USED

        public static void kadanemaxsubarray(int number[]){
            int cs=0;
            int ms=Integer.MIN_VALUE;
            for(int i=0;i< number.length;i++){
                cs=cs+number[i];
                if(cs<0){
                    cs=0;
                }
                ms= Math.max(cs,ms);
               } System.out.println(+ms);

        }
         public static void main (String[]args){
             int numbers[] = {2, 4, 6, 8, 9};
            // printsubarray(numbers);
         //
             // maxsubarray(numbers);
           kadanemaxsubarray(numbers);
        }
     }