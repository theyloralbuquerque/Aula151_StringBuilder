package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comentario;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException { 
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); // formatação da variável sdf (momento);
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!"); // instanciação do objeto do comentário 1.
		Comentario c2 = new Comentario("Uau! Que lugar lindo!"); // instanciação do objeto do comentário 2.
		
		// instanciação da classe Post.
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), // momento do post. (Date)
									 "Viajando pela  Nova Zelândia", // título do post. (String)
									 "Estou viajando por este país maravilhoso!", // conteúdo do post. (String)
									 12); // likes do post. (Integer)
		
		p1.addComentario(c1); // adiciona o comentário c1 à lista, através da chamada do método add.Comentario.
		p1.addComentario(c2); // adiciona o comentário c2 à lista, através da chamada do método add.Comentario.
		
		System.out.println(p1);
		
		Comentario c3 = new Comentario("Boa noite!"); // instanciação do objeto do comentário 3.
		Comentario c4 = new Comentario("Que a força esteja com você!"); // instanciação do objeto do comentário 4.
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), // momento do post. (Date)
							"Boa noite à todos!", // título do post. (String)
							"Até amanhã!", // conteúdo do post. (String)
							5); // likes do post. (Integer)
		
		p2.addComentario(c3); // adiciona o comentário c3 à lista, através da chamada do método add.Comentario.
		p2.addComentario(c4); // adiciona o comentário c4 à lista, através da chamada do método add.Comentario.
		
		System.out.println(p2);
	}

}
