package Interfaces;


public class Program {

	public static void main(String[] args) {
		
		Salario c1 = new Conta1("felipe","programador",111);
		
        if (c1 instanceof Conta1) {
            Conta1 conta = (Conta1) c1; // Fazendo o downcast para Conta1
            System.out.println(conta.numero);
            System.out.println(conta.funcao);
        } else {
            System.out.println("O objeto não é do tipo Conta1");
        }
        
        
        
       double ss =  c1.salario(10, 100);
          
       System.out.println(ss);
        
       System.out.println("nome: " + c1.nome + " Função: " + c1.funcao + " Parcela: " + c1.parcela + " de " + c1.parcelas(ss));
     
    }

		
		
	   
		
		
		
		
		
	}
	 

