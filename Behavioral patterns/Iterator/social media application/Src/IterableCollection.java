public interface IterableCollection {

    public FriendIterator CreateFriendsIterator();
    public FriendIterator CreateFamilyIterator();
    public FriendIterator CreateMutualFriendsIterator();

}
