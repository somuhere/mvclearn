package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Service

public class PostService {

    public ArrayList<Post> getAllPosts() {

        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post Number 1");
        post1.setBody("Post Body Number 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post Number 2");
        post2.setBody("Post Body Number 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post Number 3");
        post3.setBody("Post Body Number 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("First Post");
        post1.setBody("My first post with Valid content");
        post1.setDate(new Date());
        posts.add(post1);
        return posts;
    }

    public void createPost(Post newPost) {

    }


}
