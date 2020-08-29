package Trabalho;

public class FibonatiTeste {
    public static void main(String[] args) {
      Long inicio = System.currentTimeMillis();
      System.out.println("Teste 1\n\nFibonati Normal (50) \nResultado: "+(FibonatiNormal.fibonati(50)));
      System.out.println("Tempo 1: "+ (System.currentTimeMillis() - inicio)+'\n');
      
      
      inicio = System.currentTimeMillis();
      Fibonati conta = new Fibonati(50);
      long total = conta.compute();
      System.out.println("Fibonati Paralelo (50) \nResultado: "+(total));
      System.out.println("Tempo 1: "+ (System.currentTimeMillis() - inicio));
    }
    
}
        