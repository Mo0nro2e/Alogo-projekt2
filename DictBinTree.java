public class DictBinTree implements Dict {

    private treeNode root;

    @Override
    public void insert (int k){

        if (root == null){
            root = new treeNode(k);
        }
        else{
            root.insert(k);
        }

    }

    @Override
    public boolean search(int k) {
        if(root  != null ){
            return root.search(k);
        }
        return false;
    }


    @Override
    public int[] orderedTraversal(){
        return root.orderedTraversal();

    }




}

