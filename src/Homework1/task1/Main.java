package Homework1.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Message> messages = new ArrayList<>();
        messages.add(new Message(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        messages.add(new Message(2, 2, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        messages.add(new Message(3, 3, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        messages.add(new Message(4, 4, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        messages.add(new Message(5, 5, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        System.out.println(messages);
    }
}
