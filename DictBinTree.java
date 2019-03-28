
public class DictBinTree implements Dict
{
	private static class Node
	{
		int value;
		Node leftChild, rightChild;
		
		public Node(int value)
		{
			this.value = value;
			leftChild = null;
			rightChild = null;
		}
	}
	
	private static Node root;
	private static int numberOfNodes;
	
	private int[] orderedArray;
	private int orderedIndex;

	public DictBinTree()
	{
		root = null;
		numberOfNodes = 0;
	}

	@Override
	public void insert(int k) 
	{
		Node y = null;
		Node x = root;
		
		while(x != null)
		{
			y = x;
			if(k < x.value)
				x = x.leftChild;
			else 
				x = x.rightChild;
		}
		
		if(y == null)
			root = new Node(k);
		else if(k < y.value)
			y.leftChild = new Node(k);
		else 
			y.rightChild = new Node(k);
	
		numberOfNodes++;
	}

	@Override
	public int[] orderedTraversal() 
	{			
		orderedArray = new int[numberOfNodes];
		orderedIndex = 0;
		traversal(root);
		return orderedArray;
	}

	public void traversal(Node x)
	{
		if(x != null)
		{
			traversal(x.leftChild);
			orderedArray[orderedIndex] = x.value;
			orderedIndex++; 
			traversal(x.rightChild);
		}
	}

	@Override
	public boolean search(int k) 
	{	
		return search(k, root);
	}

	public boolean search(int k, Node x)
	{
		if (x == null)
			return false;
		else if (x.value == k)
			return true;
		else if (x.value > k)
			return search(k, x.leftChild);
		else
			return search(k, x.rightChild);
	}
}
