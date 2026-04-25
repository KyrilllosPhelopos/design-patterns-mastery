import java.util.List;

public class FriendsCollection implements IterableCollection{

    private List<Person> friends;

    public FriendsCollection () {
        this.friends = List.of( new Person("kero" , "123") , new Person("sawiris" , "1233") , new Person("phelopos" , "123") );
    }

    public List<Person> getFriends() {
        return friends;
    }

    @Override
    public FriendIterator CreateFriendsIterator() {
        return new ProfileFriendIterator(this) ;
    }

    @Override
    public FriendIterator CreateFamilyIterator() {
        return new ProfileFamilyIterator(this);
    }

    @Override
    public FriendIterator CreateMutualFriendsIterator() {
        return new ProfileMutualFriendIterator(this);
    }


}
