
package Trabalho;

public class FibonatiNormal {
     
    public static long fibonati(int x){
        if(x==1){
            return 1;
        }
        else if(x==0){
            return 0;
        }
        return (fibonati(x-1)+fibonati(x-2));
    }
}
