
public class ProfileFriendIterator implements FriendIterator {

    private final FriendsCollection friendsCollection;
    private int currentLocation = 0;

    public ProfileFriendIterator(FriendsCollection friendsCollection) {
        this.friendsCollection = friendsCollection;
    }

    @Override
    public Person getNext() {
        System.out.println("Iterating through a graph DFS / BFS");
        if (this.hasNext())
            return friendsCollection.getFriends().get(currentLocation++);
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentLocation < friendsCollection.getFriends().size();
    }
}
