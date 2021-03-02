package OBJETO;

public class Avião {
	public String asa;
	public String turbina;
	public String tripulação;

public Avião(String parte1,String parte2,String parte3) {
	asa = parte1;
	turbina =parte2;
	tripulação=parte3;
}


public String decolar() {
	String decolar = asa+" "+turbina+" "+tripulação;
	return decolar;
	 	  
}
}
