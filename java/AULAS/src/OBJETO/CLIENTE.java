package OBJETO;

public class CLIENTE {
 public String nome;
 public String sobrenome;
 public String profiss�o;
 

public CLIENTE(String string, String string2, String string3) {
 nome=string;
 sobrenome=string2;
 profiss�o=string3;
	
}


public String nomeEprofiss�o() {
 String nomeEprofiss�o = nome+" " +sobrenome+" "+profiss�o;
  return nomeEprofiss�o;
  }
}