
public class BuddyInfo 
{
	
	private String name;
	private String address;
	private long phonenumber;
	
	public BuddyInfo(String n, String a, int p)
	{
		this.name = n;
		this.address = a;
		this.phonenumber = p;
	}
	// Constructor with name address and phone number 

	public String getName() {
		return name;
	}
	// returns the name of buddy

	public void setName(String name) {
		this.name = name;
	}
	// sets name of buddy 

	public String getAddress() {
		return address;
	}
    // return address of buddy 
	public void setAddress(String address) {
		this.address = address;
	}
	// set address of buddy 
	public long getPhonenumber() {
		return phonenumber;
	}
	// return buddy phone number 
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);

		// TODO Auto-generated method stub

	}

}