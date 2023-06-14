package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// "static" para que eu não tenha que ter uma cópia do objeto "sdf" para cada post da aplicação.
	// irei precisar de apenas essa cópia para a aplicação inteira.
	// esse SimpleDateFormat é necessário para usar o formato da data "momento" no toString.
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>(); // classe associada tipo Lista, pois é "tem muitos".
	
	public Post() {
	}
	
	public Post (Date momento, String titulo, String conteudo, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void addComentario (Comentario comentario) { // método que adiciona comentário à Lista.
		comentarios.add(comentario);  // "comentarios" é o nome da lista.
	}
	
	public void removeComentario (Comentario comentario) { // método que remove comentário da Lista.
		comentarios.remove(comentario);  // "comentarios" é o nome da lista.
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); // instanciação do objeto "sb" tipo StringBuilder.
		sb.append(titulo + "\n"); // função .append(), significa acrescentar no final, permite concatenar Strings.
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n"); /* para exibir esse Date no StringBuilder foi necessário
												* instanciar um novo SimpleDateFormat dentro dessa classe.
												*/
		sb.append(conteudo + "\n");
		sb.append("Comentários:\n");
		for (Comentario c : comentarios) { /* foi criado um for each para exibir os comentários da lista e 
											* dentro do for each é colocado a função .append().
 											*/ 
			sb.append(c.getTexto() + "\n"); // c.getTexto() puxa o comentário (texto) do tipo String lá na classe Comentario.
		}
		
		
		
		return sb.toString(); // converte o StringBuilder para toString, para que possa exibir os dados em tela.
	}
	
}
