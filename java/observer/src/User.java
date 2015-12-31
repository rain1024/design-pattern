import java.util.ArrayList;
import java.util.List;

/**
 * Created by rain on 12/31/2015.
 */
public class User implements Observer{
    private List<Event> articles;
    private String name;

    public User(String name) {
        this.name = name;
        this.articles = new ArrayList<>();
    }

    @Override
    public void update(Event event) {
        this.articles.add(event);
    }

    public void getArticles(){
        System.out.println("Feed of " + name);
        for(Object article: this.articles){
            Article a = (Article) article;
            System.out.println(a.content);
        }
    }
}
