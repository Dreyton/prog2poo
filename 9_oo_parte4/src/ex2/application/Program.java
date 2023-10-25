package ex2.application;

import java.time.LocalDateTime;

import ex2.entities.Comment;
import ex2.entities.Post;

public class Program {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.now();//data atual
		
		Post p1 = new Post("Traveling to new zealand", "content1", 2,
				dt1);
		System.out.println(dt1);
		Comment c1 = new Comment("ok!");
		p1.addComment(c1);//FOI FEITO O RELACIONAMENTO
		
		var c2 = new Comment("bye");
		p1.addComment(c2);//MAIS UM RELACIONAMENTO
		
	}
}
