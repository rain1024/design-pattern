import java.util.ArrayList;
import java.util.List;

/**
 * Created by rain on 12/31/2015.
 */
public class Blog implements Subject {

    List<Observer> users;
    String name;

    public Blog(String name) {
        this.name = name;
        this.users = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer user) {
        users.add(user);
    }

    @Override
    public void detach(Observer user) {
        users.remove(user);
    }

    @Override
    public void notifyObserver(Event article) {
        for(Observer user: users){
            user.update(article);
        }

    }

    public void post(Article article){
        System.out.println("Blog " + name + " publish " + article.content);
        notifyObserver(article);
    }
}
