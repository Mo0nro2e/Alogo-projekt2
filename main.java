public class main {
    public static void main(String[] args) {
        DictBinTree DicTree = new DictBinTree();

        DicTree.insert(25);
        DicTree.insert(20);
        DicTree.insert(215);
        DicTree.insert(34);
        DicTree.insert(64);
        DicTree.insert(12);
        DicTree.insert(13);
        DicTree.insert(16);
        DicTree.insert(18);
        DicTree.insert(77);
        DicTree.insert(66);
        DicTree.insert(889);
        DicTree.insert(12300);
        DicTree.insert(43);

        DicTree.orderedTraversal();

        System.out.println(DicTree.search(88));
        //System.out.println(DicTree.treeSize());
        //DicTree.traverseInOrder();


    }
}
