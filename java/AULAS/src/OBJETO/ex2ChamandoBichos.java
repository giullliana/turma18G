package OBJETO;

public class ex2ChamandoBichos {

	public static void main(String[] args) {
		ex1Heran�a cachorro =new ex1Heran�a();
		cachorro.setNome("Cachorro");
		cachorro.setCorre("Corre");
		cachorro.setEmiteSom("Late");
		cachorro.setIdade(5);
		
		ex1Heran�a CAvalo =new ex1Heran�a();
		CAvalo.setNome("Cavalo");
		CAvalo.setCorre("Corre");
		CAvalo.setEmiteSom("Relinchar");
		CAvalo.setIdade(12);
		
		ex1Heran�a Pregui�a =new ex1Heran�a();
		Pregui�a.setNome("Pregui�a");
		Pregui�a.setCorre("N�o Corre");
		Pregui�a.setEmiteSom("Ronrona");
		Pregui�a.setSubirArvores("Escala Arvores");
		
		ex1Heran�a[] Animais = new ex1Heran�a[3];
		Animais[0]=cachorro;
		Animais[1]=CAvalo;
		Animais[2]=Pregui�a;
		
		for(ex1Heran�a animal:Animais) {
			System.out.println(animal.getNome() +" "+ animal.isEmiteSom());
		}
				
		
		
	}

}
