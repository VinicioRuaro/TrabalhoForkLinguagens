package Trabalho;

import java.util.concurrent.RecursiveTask;

public class Fibonati extends RecursiveTask<Long> {
    long atual;
    static long um = 1; 
    static long zero = 0;
    
    public Fibonati(long atual) {
        this.atual=atual;
    }
    
    @Override
    protected Long compute(){
        if(atual == um){
            return um;
        }
        else if(atual == zero){
            return zero;
        }
        
        Fibonati c1 = new Fibonati(atual-1);
        Fibonati c2 = new Fibonati(atual-2);
        c1.fork();
        c2.fork();
        long c1Resultado = c1.join();  
        long c2Resultado = c2.join();
        return c1Resultado + c2Resultado;
        }
        
    
}
   

