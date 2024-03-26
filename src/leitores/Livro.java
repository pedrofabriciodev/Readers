package leitores;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	public String detalhes() {
		return "Livro [\n titulo= " + titulo.toUpperCase() + 
				",\n autor= " + autor + 
				",\n totalPaginas= " + totalPaginas + 
				",\n paginaAtual= "+ paginaAtual + 
				",\n aberto= " + aberto + 
				",\n leitor= " + leitor.getNome() + 
				",\n idade= " + leitor.getIdade() + 
				",\n sexo= " + leitor.getSexo() + "\n]";
	}
	
//	CONSTRUTOR
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.paginaAtual = 0;
		this.leitor = leitor;
	}
	
//	SOBRESCREVENDO METODOS 
	
		@Override
		public void abrir() {
			// TODO Auto-generated method stub
			this.aberto = true; 
			
		}

		@Override
		public void fechar() {
			// TODO Auto-generated method stub
			this.aberto = false;
		}

		@Override
		public void folhear(int pagina) {
			// TODO Auto-generated method stub
			if (pagina > this.totalPaginas) {
				this.paginaAtual = 0;
			}else {
				this.paginaAtual=pagina;

			}		
		}

		@Override
		public void avancarPagina() {
			// TODO Auto-generated method stub
			this.paginaAtual++;
		}

		@Override
		public void voltarPagina() {
			// TODO Auto-generated method stub
			this.paginaAtual--;	
		}	

	
	
//	GETTERS E SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
}
