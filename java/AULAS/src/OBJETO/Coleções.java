package OBJETO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Cole��es {

	public static void main(String[] args) {
		Collection <String> estoque = new ArrayList<String>();
		estoque.add("Refrigerante");
		estoque.add("Suco");
		estoque.add("Ch�");
		estoque.add("Caf�");
		 Collection <String> estoque2 = Arrays.asList("Milk Shake","Soda Italiana");
		 estoque.addAll(estoque2);
		 System.out.println("Produtos do Estoque :" + estoque);
         estoque.remove("Caf�");
         System.out.println("Produtos do Estoque :" + estoque);
         
         
	}

}
