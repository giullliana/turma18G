package OBJETO;

public class ex2ChamandoBichos {

	public static void main(String[] args) {
		ex1Herança cachorro =new ex1Herança();
		cachorro.setNome("Cachorro");
		cachorro.setCorre("Corre");
		cachorro.setEmiteSom("Late");
		cachorro.setIdade(5);
		
		ex1Herança CAvalo =new ex1Herança();
		CAvalo.setNome("Cavalo");
		CAvalo.setCorre("Corre");
		CAvalo.setEmiteSom("Relinchar");
		CAvalo.setIdade(12);
		
		ex1Herança Preguiça =new ex1Herança();
		Preguiça.setNome("Preguiça");
		Preguiça.setCorre("Não Corre");
		Preguiça.setEmiteSom("Ronrona");
		Preguiça.setSubirArvores("Escala Arvores");
		
		ex1Herança[] Animais = new ex1Herança[3];
		Animais[0]=cachorro;
		Animais[1]=CAvalo;
		Animais[2]=Preguiça;
		
		for(ex1Herança animal:Animais) {
			System.out.println(animal.getNome() +" "+ animal.isEmiteSom());
		}
				
		
		
	}

}
