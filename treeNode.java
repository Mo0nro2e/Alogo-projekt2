
public class treeNode {
    private int value;
    private treeNode rightChild;
    private treeNode leftChild;
    private static int counter = 0;
    private static int[] array;
    private static int i = 0;


    public treeNode(int value){
        this.value = value;
        counter++;

    }
    public void insert(int k){
        if (k == value){
            return;
        }

        if(k < this.value){
            if (leftChild == null){
                leftChild = new treeNode(k);
            }

            else {
                leftChild.insert(k);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new treeNode(k);
            } else
                rightChild.insert(k);
        }

    }

    public boolean search( int k){
        if(k == value){
            return true;
        }

        if (k < value){
            if(leftChild != null){
                return leftChild.search(k);
            }
        }

        else{
            if(rightChild != null){
                return rightChild.search(k);
            }
        }
        return false;
    }


    private void orderedArray(){

        if (leftChild != null) {
            leftChild.orderedArray();
        }

        array[i] = value;
        i++;

        if (rightChild != null) {
            rightChild.orderedArray();
        }
    }

    public int[] orderedTraversal(){
        array = new int[counter];
        orderedArray();

        /*for (int o = 0; o<array.length; o++) {
            System.out.print(array[o] + " , ");

        }*/
        return array;


    }

    /*public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }

        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public int size(){

        if(leftChild == null && rightChild == null){
            return 0;
        }

        if(leftChild != null && rightChild == null){
            return 1 + leftChild.size();
        }

        if(leftChild == null && rightChild != null){
            return 1 + rightChild.size();
        }

        else {
            return leftChild.size() + rightChild.size() + 2;
        }

    }*/

    /*
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public treeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(treeNode rightChild) {
        this.rightChild = rightChild;
    }

    public treeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(treeNode leftChild) {
        this.leftChild = leftChild;
    }*/
}
