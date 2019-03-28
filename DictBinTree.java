
public class DictBinTree implements Dict
{
	/**
	*	innerklasse som holder information omkring hvert enkelt knude i træet.
	*/
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
	
	//Bliver brugt til orderedTraversel metoden
	private int[] orderedArray;
	private int orderedIndex;

	/**
	*	Constructor
	*/
	public DictBinTree()
	{
		root = null;
		numberOfNodes = 0;
	}

	/**
	*	Pseudokoden for indsættelse af knude i træet. 
	*	Desuden holder vi styr på mængden af knuder i træet.
	*/
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

	/**
	*	Initialiserer arrayet (attributten) og kalder traversal på root, 
	*   og til sidst returnerer arrayet, efter det er blivet fyldt af traversal metoden.
	*/
	@Override
	public int[] orderedTraversal() 
	{			
		orderedArray = new int[numberOfNodes];
		orderedIndex = 0;
		traversal(root);
		return orderedArray;
	}

	/**
	*	Inorder-tree-walk algoritmen. Indsætter noden i et array som er en attribut. Rekursiv
	*/
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

	/**
	*  Bruger implementeringen af søgning på kalder den på root-knuden.
	*/
	@Override
	public boolean search(int k) 
	{	
		return search(k, root);
	}

	/**
	*	Implementering af pseudokode. 
	*/
	private boolean search(int k, Node x)
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
