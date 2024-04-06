package djh.learn.dP;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        if(root== null){
            root = new TreeNode(value);
        } else{
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root!= null){
            root.inOrderTraversal();
        }

    }

    public void traversePreOrder(){
        if(root!= null){
            root.preOrderTraversal();
        }

    }

    public TreeNode get(int value){
        if(root!= null){
            return root.get(value);
        }
       return null;
    }


    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }else {
            return root.min();
        }
    }

    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }else {
            return root.max();
        }
    }

    public TreeNode delete(int value){
        return delete(root,value);
    }

    public TreeNode delete(TreeNode subTreeRoot, int value) {
        if(subTreeRoot == null){
            return subTreeRoot;
        }
        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftNode(delete(subTreeRoot.getLeftNode(),value));
        } else if(value > subTreeRoot.getData()){
            subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(),value));
        } else{
            if(subTreeRoot.getLeftNode() == null){
                return subTreeRoot.getRightNode();
            } else if(subTreeRoot.getRightNode() == null){
                return subTreeRoot.getLeftNode();
            }

            subTreeRoot.setData(subTreeRoot.getRightNode().min());
            subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(),subTreeRoot.getData()));
        }
        return  subTreeRoot;
    }
}
