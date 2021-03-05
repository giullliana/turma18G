package OBJETO;

public class terceiro extends FuncionarioExemplo {
	private double adicional=0.00;

	public terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
		
	@Override
	public double salario() {
		return (horasTrabalhadas * valorPorHora);

}
			}

	
	
