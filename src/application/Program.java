package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comentario;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException { 
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); // formata��o da vari�vel sdf (momento);
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!"); // instancia��o do objeto do coment�rio 1.
		Comentario c2 = new Comentario("Uau! Que lugar lindo!"); // instancia��o do objeto do coment�rio 2.
		
		// instancia��o da classe Post.
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), // momento do post. (Date)
									 "Viajando pela  Nova Zel�ndia", // t�tulo do post. (String)
									 "Estou viajando por este pa�s maravilhoso!", // conte�do do post. (String)
									 12); // likes do post. (Integer)
		
		p1.addComentario(c1); // adiciona o coment�rio c1 � lista, atrav�s da chamada do m�todo add.Comentario.
		p1.addComentario(c2); // adiciona o coment�rio c2 � lista, atrav�s da chamada do m�todo add.Comentario.
		
		System.out.println(p1);
		
		Comentario c3 = new Comentario("Boa noite!"); // instancia��o do objeto do coment�rio 3.
		Comentario c4 = new Comentario("Que a for�a esteja com voc�!"); // instancia��o do objeto do coment�rio 4.
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), // momento do post. (Date)
							"Boa noite � todos!", // t�tulo do post. (String)
							"At� amanh�!", // conte�do do post. (String)
							5); // likes do post. (Integer)
		
		p2.addComentario(c3); // adiciona o coment�rio c3 � lista, atrav�s da chamada do m�todo add.Comentario.
		p2.addComentario(c4); // adiciona o coment�rio c4 � lista, atrav�s da chamada do m�todo add.Comentario.
		
		System.out.println(p2);
	}

}
