import java.util.Scanner;
public class Treesort 
{
    public static void main(String[] args)
    {
    	//Laver et nyt træ og en scanner
    	DictBinTree tree = new DictBinTree();
    	Scanner scanner = new Scanner(System.in);

    	//insætter tal i træet, som er fået fra scanneren
   		while(scanner.hasNextInt())
   			tree.insert(scanner.nextInt());

   		//Output array som bliver givet fra træets orderesTraversal metode
    	int[] output = tree.orderedTraversal();
    	
    	//Printer output
    	for(int i : output)
			System.out.println(i);
    }
}
