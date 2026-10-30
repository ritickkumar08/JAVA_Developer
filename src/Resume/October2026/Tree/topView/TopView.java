package Resume.October2026.Tree.topView;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}

class Pair{
    TreeNode node;
    int column;

    public Pair(TreeNode node, int column){
        this.node = node;
        this.column = column;
    }
}

class TopView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TopView solver = new TopView();
        List<Integer> result = solver.topView(root);

        System.out.println("Top View of the Binary Tree: " + result);
    }
    public List<Integer> topView(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Map<Integer,Integer> topNodes = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()){
            Pair current = queue.poll();
            TreeNode node = current.node;
            int distance = current.column;

            if(!topNodes.containsKey(distance)){
                topNodes.put(distance,node.val);
            }

            if (node.left != null){
                queue.offer(new Pair(node.left, distance-1));
            }
            if (node.right != null){
                queue.offer(new Pair(node.right, distance+1));
            }
        }

        return new ArrayList<>(topNodes.values());
    }
}