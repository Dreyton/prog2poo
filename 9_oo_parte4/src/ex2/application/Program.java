package ex2.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ex2.entities.Comment;
import ex2.entities.Post;

public class Program {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.parse("2023-10-27T15:53:14");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dt2 = LocalDateTime.parse("27/10/2023 15:53:14", dtf);
		
		LocalDate d3 = LocalDate.of(2023, 10, 27);
		
		System.out.println(d3);
		
		Post p1 = new Post("Traveling to new zealand", "content1", 2,
				dt1);
		System.out.println(dt1);
		Comment c1 = new Comment("ok!");
		p1.addComment(c1);//FOI FEITO O RELACIONAMENTO
		
		var c2 = new Comment("bye");
		p1.addComment(c2);//MAIS UM RELACIONAMENTO
		
	}
}
