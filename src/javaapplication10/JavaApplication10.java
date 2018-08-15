package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class JavaApplication10 {

    public static void main(String[] args) {
      
        
        
        
        
        
        
        
        
        
        
        
        /*exercicio 7*/
       /* int dia;
        int mes;

        Scanner leitor = new Scanner(System.in);
        dia = leitor.nextInt();

        while (dia < 1 || dia > 31) {

            leitor = new Scanner(System.in);
            dia = leitor.nextInt();
        }

        Scanner ler = new Scanner(System.in);
        mes = ler.nextInt();

        while (mes < 1 || mes > 12) {
            ler = new Scanner(System.in);
            mes = ler.nextInt();

        }

        System.out.println("Seu dia é " + dia + " do mes " + mes);
        
        int jan = 31;
        int fev = 28;
        int mar = 31;
        int abr = 30;
        int mai = 31;
        int jun = 30;
        int jul = 31;
        int ago = 31;
        int set = 30;
        int out = 31;
        int nov = 30;
       
                
        int soma = 0 ;
                
                
        
        
        
        
        
        switch (mes) {
            
            case 1:
                soma = dia;
                System.out.println("O Dia " +dia+"/"+mes+"corresponde ao dia " + soma + " do ano");
                break;
            case 2:
                soma = jan+ dia;
                System.out.println("O Dia " +dia+"/"+mes+"corresponde ao dia " + soma + " do ano");
                break;
            case 3:
               soma = jan+fev+dia;
                System.out.println("O Dia " +dia+"/"+mes+"corresponde ao dia " + soma + " do ano");
                break;
            case 4:
                soma = jan+fev+mar+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;    
            case 5:
                soma = jan+fev+mar+abr+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            case 6:
                soma = jan+fev+mar+abr+mai+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            case 7:
                soma = jan+fev+mar+abr+mai+jun+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            case 8:
                soma = jan+fev+mar+abr+mai+jun+jul+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            case 9:
                soma = jan+fev+mar+abr+mai+jun+jul+ago+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            case 10:
                soma = jan+fev+mar+abr+mai+jun+jul+ago+set+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            case 11:
                soma = jan+fev+mar+abr+mai+jun+jul+ago+set+out+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            case 12:
                soma = jan+fev+mar+abr+mai+jun+jul+ago+set+out+nov+dia;
                System.out.println("O Dia " +dia+"/"+mes+" corresponde ao dia " + soma + " do ano");
                break;
            
        } */

        /*exercicio6 */
 /*
        int [] inteiro = new int [10];
        
        for(int indice = 0; indice < inteiro.length; indice++){
        Scanner leitor = new Scanner(System.in);     
       inteiro[indice] = leitor.nextInt();
       
            
        }
        for (int indice = 0; indice < inteiro.length; indice++){
        System.out.println("vetor"+inteiro[indice]);
        }       
        int soma = 0;
        for (int indice = 0; indice < inteiro.length; indice++){
             soma += inteiro[indice];
            
            
        }
        
        System.out.println(soma);
        int media = soma /10;
        
        System.out.println(media);
        
        
        for (int indice = 0; indice < inteiro.length; indice++){
          if (inteiro[indice] > media){
              System.out.println(inteiro[indice]);
          }         
        
        0,0
        
        }
         */
        ////////////
        /*exercicio4 */
 /*i0 int [] numeros = new int[7];
		
/*		Scanner leitorTeclado = new Scanner(System.in);
		int numero = leitorTeclado.nextInt();
		System.out.println(numero);
		
		for(int indice = 0; indice < numeros.length; indice++) {
			
			Scanner leitorTeclado = new Scanner(System.in);
		    numeros[indice] = leitorTeclado.nextInt();		
		}
		
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println(numeros[indice]);
		}
		
		
	    for (int indice = numeros.length - 1; indice >= 0; indice--) {
	    	System.out.println(numeros[indice]);
	    }
         */
        //////////////////
        /*exercicio 5 */
 /*String [] nomes = new String[10];
		
		for (int indice = 0; indice < nomes.length; indice++) {
		
			Scanner leitorTeclado = new Scanner(System.in);		
			nomes[indice] = leitorTeclado.nextLine();
		}
		
		Scanner leitorTeclado2 = new Scanner(System.in);
		String nome1 = leitorTeclado2.nextLine();		
		
		
		boolean iguais = false;
		
		int indice;
		
		for (indice = 0; indice < nomes.length; indice++) {
			
			// 
			if(nome1.equals(nomes[indice])) {
				
				iguais = true;
				break;
			}
		}		
		
		if(iguais) {
			
			System.out.println("Achou");
			System.out.println(indice);
		} else {
			
			System.out.println("Não");
		}*/
    }
}
