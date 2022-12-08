/*
package Easy;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;//key
    public List<Node> children;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreePreorderTraversal_0589 {
    public List<Integer> preorder(Node root) {
        List<Integer> result=new ArrayList<>();
        traverse(root,result);
        return result;
    }
    public void traverse(Node root,List<Integer> result){
        if (root==null)return;
        result.add(root.val);
        for (Node i:root.children){
            traverse(i,result);
        }
    }
}
*/
