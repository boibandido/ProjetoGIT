
package floricultura;

import java.util.Scanner;




public class Floricultura {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome da flor : ");
        String nome = leitor.next();
        
        System.out.println("Digite o agente polinizador: ");
        for (AgentePolinizador agentePolinizador : AgentePolinizador.values()){
            System.out.println(agentePolinizador);
        }        
        String agente = leitor.next();
        AgentePolinizador polinizador = AgentePolinizador.valueOf(agente);
        
        Flor florzinha = new Rosa(nome, polinizador);
        
        // criando produto
        
        System.out.println("Código do produto");
        Integer codigo = leitor.nextInt();
        
        System.out.println("Digite o valor do produto");
        double valorCompra = leitor.nextDouble();
    
    
    
    
    
    
    
    
    
    }
    
}
