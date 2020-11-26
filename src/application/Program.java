package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Comment c1 = new Comment("Have a nice trip!");
		
		Comment c2 = new Comment("Wow that's awesome!");
		
		Comment c3 = new Comment("good night");
		
		Comment c4 = new Comment("may the force be with you");
		
		Post p1 = new Post(new Date(),
				"Trveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		Post p2 = new Post(new Date(),
				"Good night guys",
				"See you tomorrow",
				5);
		
		p1.addComment(c1);
		p1.addComment(c2);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		sc.close();
	}

}
