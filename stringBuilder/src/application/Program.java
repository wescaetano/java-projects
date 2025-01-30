package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice day!");
        Comment c2 = new Comment("Wow that's awesome!");

        // Create a Post object
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Trip to Japan!",
                "To start this year well, we came to Japan to enjoy the food and culture!", 55);


        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you!");

        // Create a Post object
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys",
                "See you tomorrow", 37);


        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
