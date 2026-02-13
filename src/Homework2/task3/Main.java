package Homework2.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Post> posts = new ArrayList<>();

        posts.add(new Post(1, 1, "sunt aut facere repellat provident...", "quia et suscipit...", PostStatus.PUBLISHED));
        posts.add(new Post(2, 1, "qui est esse", "est rerum tempore...", PostStatus.PUBLISHED));
        posts.add(new Post(3, 1, "ea molestias quasi exercitationem...", "et iusto sed quo...", PostStatus.DRAFT));
        posts.add(new Post(4, 1, "eum et est occaecati", "ullam et saepe reiciendis...", PostStatus.PUBLISHED));
        posts.add(new Post(5, 1, "nesciunt quas odio", "repudiandae veniam...", PostStatus.DELETED));

        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi..."));
        comments.add(new Comment(2, 1, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim..."));
        comments.add(new Comment(3, 2, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit..."));
        comments.add(new Comment(4, 3, "alias odio sit", "Lew@alysha.tv", "non et atque..."));
        comments.add(new Comment(5, 3, "vero eaque aliquid sint", "Hayden@althea.biz", "harum non quasi..."));

        for (Comment comment : comments) {
            for (Post post : posts) {
                if (post.id == comment.postId) {
                    post.addComment(comment);
                }
            }
        }


        System.out.println("Posts with comments:");
        for (Post post : posts) {
            post.print();
        }


    }
}