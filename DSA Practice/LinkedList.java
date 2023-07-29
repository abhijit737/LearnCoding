class Node
{
	int data;
	Node next;

		public Node(int data)
		{
			this.data=data;
			this.next= null;
	
	
		}
}


	public class LinkedList
{
		node Next;
		
		public LinkedList()
		{
			this.head = null;
		
		}
		
		public void add (int data)
		{
			Node newNode = new newNode(data);
			if(head ==null)
			{
				head=newHead;
			}
			
			else
			{
				Node current = head;
				
				while (current.next !=null)
				{
					current = current.next();
				}
				current.next =newNode;
				
			}
		}
	
	
	
	public void printList() 
	{
        Node current = this.head;
        while (current != null) 
		{
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
	
	
	
	
	public static void main(String[] args) 
	{
		LinkedList myList = new LinkedList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.printList();
	}
	
	
	
	
	} 
	
	public void insert(int data, int index) 
	{
		if (index < 0 || index > size()) 
		{
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		
		Node newNode = new Node(data);
		
		if (index == 0) 
		{
			newNode.next = this.head;
			this.head = newNode;
		} 
		else 
	{
        Node previous = this.head;
        for (int i = 0; i < index - 1; i++) 
		{
            previous = previous.next;
        }
        newNode.next = previous.next;
        previous.next = newNode;
    }
	
	public void delete(int index) 
	{
    if (index < 0 || index >= size()) 
	{
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }
    if (index == 0) 
	{
        this.head = this.head.next;
    } else 
	{
        Node previous = this.head;
        for (int i = 0; i < index - 1; i++) 
		{
            previous = previous.next;
        }
        previous.next = previous.next.next;
    }
	
	
	public void reverse() 
	{
		Node previous = null;
		Node current = this.head;
		while (current != null)
		{
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		this.head = previous;
	}
	
	
	
	
	
	
	public void remove(int value) 
	{
		if (this.head == null) 
		{
			return;
		}
		if (this.head.data == value) 
		{
			this.head = this.head.next;
			return;
		}
		Node current = this.head;
		while (current.next != null) 
		{
			if (current.next.data == value) 
			{
				current.next = current.next.next;
				return;
			}
		}
        current = current.next;
    }
	
	
	
	public boolean contains(int value) 
	{
		Node current = this.head;
		while (current != null) 
		{
			if (current.data == value) 
			{
				return true;
			}
			current = current.next;
		}
		return false;

	}

	
	
	public void insertAtIndex(int value, int index) 
	{
		if (index < 0) 
		{
			throw new IndexOutOfBoundsException("Index cannot be negative");
		}
		Node newNode = new Node(value);
		if (index == 0) 
		{
			newNode.next = this.head;
			this.head = newNode;
			return;
		}
		Node current = this.head;
		int currentIndex = 0;
		while (current != null && currentIndex < index - 1) 
		{
			current = current.next;
			currentIndex++;
		}
		if (current == null) 
		{
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	
	public int size() 
	{
		int count = 0;
		Node current = this.head;
		while (current != null) 
		{
			count++;
			current = current.next;
		}
		return count;
	}

	
}


}

	
	
	
	
	
}

	
	
}