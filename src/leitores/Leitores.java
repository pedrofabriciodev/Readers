package leitores;

public class Leitores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p [] = new Pessoa[2];
		Livro [] l = new Livro[3];
				
		
		p[0] = new Pessoa("Mari Elisa", 18, "Feminino");
		p[0].fazerAniversario();
		
		
		l[0] = new Livro("cidade da lua crescente casa de terra e sangue", "Sarah J.Maas", 896, p[0]);
		l[1] = new Livro("Cidade da lua crescente Casa de Ceu e sopro", "Sarah J.Maas", 924, p[0]);
		l[1] = new Livro("Cidade da lua crescente casa de chama e sombra ", "Sarah J.Maas", 938, p[0]);
		
		l[0].abrir();
		l[0].folhear(800);
		
		
		System.out.println(l[0].detalhes());
	}

}
