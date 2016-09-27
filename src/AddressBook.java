import java.util.ArrayList;

public class AddressBook 

{
	private ArrayList<BuddyInfo> addressbook;
	public AddressBook()
	{
		addressbook = new ArrayList<BuddyInfo>();
	}
	public void addBuddy(BuddyInfo info)
	{
		if(info != null)
			{
				addressbook.add(info);
			}
	}
	public void removeBuddy(int index)
	{
		if(index <=0 && index < addressbook.size())
		{
			addressbook.remove(index);
		}
	}
	
	public static void main(String[] args)
	{
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);

		
	
	}

}