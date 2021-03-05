package OBJETO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Coleções {

	public static void main(String[] args) {
		Collection <String> estoque = new ArrayList<String>();
		estoque.add("Refrigerante");
		estoque.add("Suco");
		estoque.add("Chá");
		estoque.add("Café");
		 Collection <String> estoque2 = Arrays.asList("Milk Shake","Soda Italiana");
		 estoque.addAll(estoque2);
		 System.out.println("Produtos do Estoque :" + estoque);
         estoque.remove("Café");
         System.out.println("Produtos do Estoque :" + estoque);
         
         
	}

}
