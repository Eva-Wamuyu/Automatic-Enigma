public class BST {
    BSTNode root;
    
    public BST() {
        this.root = null;
    }
    
    public void insert(String key, String value) {
        BSTNode newNode = new BSTNode(key, value);
        
        if (root == null) {
            root = newNode;
            return;
        }
        
        BSTNode current = root;
        
        while (true) {
            if (key.compareTo(current.key) < 0) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else if (key.compareTo(current.key) > 0) {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            } else {
                
                current.value = value;
                return;
            }
        }
    }
    
    public String find(String key) {
        BSTNode current = root;
        
        while (current != null) {
            if (key.compareTo(current.key) < 0) {
                current = current.left;
            } else if (key.compareTo(current.key) > 0) {
                current = current.right;
            } else {
                return current.value;
            }
        }
        
        return null;
    }
    
}
