//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    FriendsCollection friendsCollection = new FriendsCollection();

    var iterator = friendsCollection.CreateFriendsIterator();

    while(iterator.hasNext())
        System.out.println(iterator.getNext().getName());

}
