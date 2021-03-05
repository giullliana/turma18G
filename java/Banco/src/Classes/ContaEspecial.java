package Classes;

import java.util.Scanner;

public class ContaEspecial  extends Conta{
	Scanner ler =new Scanner(System.in);
	
		private double limite;
		private double conta;
		
		
		public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
			super(numero, cpf, ativa);
			this.limite = limite;
		
		}

		

		private double getLimite() {
			return limite;
		}

		private void setLimite(double limite) {
			this.limite = limite;
		}
		@Override
		public void debito(double valor) {
			if (this.limite >= valor) {
				this.limite = this.limite - valor;
		 if(getSaldo() <0.0 && valor<=this.limite) {
			 this.setLimite(getSaldo()+this.getLimite());
			 System.out.println("Você possui um limite de Cheque Especial R$ 1.000,00 ");
			 limite =ler.nextInt();
			 }
		 
		 
		 }
			 
			
		}
		
}