package OBJETO;

public class CLIENTE {
 public String nome;
 public String sobrenome;
 public String profissão;
 

public CLIENTE(String string, String string2, String string3) {
 nome=string;
 sobrenome=string2;
 profissão=string3;
	
}


public String nomeEprofissão() {
 String nomeEprofissão = nome+" " +sobrenome+" "+profissão;
  return nomeEprofissão;
  }
}