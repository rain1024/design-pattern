/**
 * Created by rain on 12/31/2015.
 */
public class Application {


    public static void main(String[] args) {
        Blog sportBlog = new Blog("SPORT");
        User user1 = new User("Fan1");
        User user2 = new User("Fan2");
        sportBlog.attach(user1);
        sportBlog.attach(user2);
        sportBlog.post(new Article("football"));
        sportBlog.post(new Article("swimming"));
        user1.getArticles();
        user2.getArticles();

        sportBlog.detach(user1);

    }

}
