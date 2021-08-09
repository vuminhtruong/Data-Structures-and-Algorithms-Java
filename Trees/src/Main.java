public class Main {
    public static void main (String[] args){
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();
        intTree.delete(25);

        System.out.println(intTree.get(29));
        System.out.println(intTree.get(2132));

        System.out.println(intTree.min()+" "+ intTree.max());
    }
}
