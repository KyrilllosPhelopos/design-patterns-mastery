//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    NewsletterManagement newsletterManagement = new NewsletterManagement();

    Subscriber kyrillos = new reader("Kyrillos");
    Subscriber abanoub = new reader("Abanoub");

    newsletterManagement.subscribe(EventType.POST , kyrillos);
    newsletterManagement.subscribe(EventType.POST , abanoub);
    newsletterManagement.subscribe(EventType.BLOG , kyrillos);

    newsletterManagement.addPost(new Post("this is my first post"));
    newsletterManagement.addPost(new Post("this is my second post"));

    newsletterManagement.addBlog(new Blog("this is my first Blog"));


}
