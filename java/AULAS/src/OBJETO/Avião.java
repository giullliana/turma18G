package OBJETO;

public class Avi�o {
	public String asa;
	public String turbina;
	public String tripula��o;

public Avi�o(String parte1,String parte2,String parte3) {
	asa = parte1;
	turbina =parte2;
	tripula��o=parte3;
}


public String decolar() {
	String decolar = asa+" "+turbina+" "+tripula��o;
	return decolar;
	 	  
}
}
