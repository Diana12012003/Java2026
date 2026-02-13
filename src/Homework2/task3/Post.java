package Homework2.task3;

import java.util.ArrayList;
import java.util.List;

public class Post {
    public int id;
    public int userId;
    private String title;
    private String body;
    private PostStatus status;          // ← enum
    public List<Comment> comments = new ArrayList<Comment>();

    public Post(int id, int userId, String title, String body, PostStatus status) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
        this.status = status;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void print() {
        System.out.println(this);
        if (!comments.isEmpty()) {
            System.out.println("  Comments (" + comments.size() + "):");
            for (Comment c : comments) {
                System.out.println("    " + c);
            }
        } else {
            System.out.println("No comments");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", status=" + status +
                ", comments=" + comments.size() +
                '}';
    }
}
