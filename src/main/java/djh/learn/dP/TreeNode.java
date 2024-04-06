package djh.learn.dP;

public class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }


    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value){
        if(value == data){
            return;
        }
        if(value < data){
            if(leftNode==null){
                leftNode= new TreeNode(value);
            } else{
                leftNode.insert(value);
            }
        }
        else {
            if(rightNode==null){
                rightNode= new TreeNode(value);
            } else{
                rightNode.insert(value);
            }
        }
    }

    public void inOrderTraversal(){
        if(leftNode!= null){
            leftNode.inOrderTraversal();
        }
        System.out.println("Data is: "+data);
        if(rightNode!= null){
            rightNode.inOrderTraversal();
        }
    }

    public void preOrderTraversal(){

        System.out.print(data+" , ");
        if(leftNode!= null){
            leftNode.preOrderTraversal();
        }
        if(rightNode!= null){
            rightNode.preOrderTraversal();
        }
    }

    public TreeNode get(int value){
        if(value == data){
            return this;
        }
        if(value < data){
            if(leftNode != null){
                return leftNode.get(value);
            }
        } else{
            if(rightNode != null){
                return rightNode.get(value);
            }
        }
        return null;
    }

    public int min(){
        if(leftNode == null){
            return data;
        }else {
            return leftNode.min();
        }
    }

    public int max(){
        if(rightNode == null){
            return data;
        }else {
            return rightNode.max();
        }
    }
    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }




}
