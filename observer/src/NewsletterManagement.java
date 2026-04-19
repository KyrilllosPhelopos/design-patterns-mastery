import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsletterManagement {

    private Map<EventType , List<Subscriber>> subscribers;
    private List<Post> posts ;
    private List<Blog> blogs ;

    public NewsletterManagement()
    {
        this.subscribers = new HashMap<>();
        initSbucribers();
        this.posts = new ArrayList<>();
        this.blogs = new ArrayList<>();
    }

    public void initSbucribers()
    {
        this.subscribers.put(EventType.BLOG , new ArrayList<> ()) ;
        this.subscribers.put(EventType.POST , new ArrayList<> ()) ;
        this.subscribers.put(EventType.BOTH , new ArrayList<> ()) ;



    }

    public void subscribe(EventType eventType, Subscriber subscriber)
    {

        this.subscribers.get(eventType).add(subscriber);
    }

    public void unsubscribe (EventType eventType , Subscriber subscriber)
    {
        this.subscribers.get(eventType).remove(subscriber);
    }

    public void addPost(Post post)
    {
        this.posts.add(post);
        notifySubscribers(EventType.POST , "New Post was published:- " + post.getContent());

    }

    public void addBlog(Blog blog)
    {
        this.blogs.add(blog);
        notifySubscribers(EventType.BLOG , "New Blog was published:- " + blog.getContent());

    }

    public void notifySubscribers(EventType eventType , String message)
    {
        this.subscribers.get(eventType).forEach(subscriber -> subscriber.notify(message));
    }

}
