package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;
	
	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addItem(String thisItem) {
		//start my attempt
		if(head==null) {
			head = new ListItem(thisItem);
			return true;
		}
		
		ListItem current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new ListItem(thisItem);
		//end my attempt
		
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
	
		return null;//return true
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listItems() {
		// TODO Auto-generated method stub
		//start my attempt
		ListItem tmp=head;
		while (tmp!=null) {
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
		//end my attempt
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		
		//start my attempt
		if (head==null) {
			return false;
		}
		ListItem current=head;
		while(current.next!=null) {
			if(current.next.data==thisItem) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
		//end my attempt
		return null;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}
