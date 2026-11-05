package Resume.October2026.Tree.Vertical;


import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){};
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();

        System.out.println(
                solution.verticalTraversal(root)
        );
    }
    class Entry{
        int data;
        int row;
        int col;

        public Entry(int data, int row, int col){
            this.data = data;
            this.col = col;
            this.row = row;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        List<Entry> nodes = new ArrayList<>();
        preOrder(root, 0, 0, nodes);

        nodes.sort((a,b) -> {
            if(a.col != b.col){
                return Integer.compare(a.col, b.col);
            }
            if (a.row != b.row){
                return Integer.compare(a.row, b.row);
            }

            return Integer.compare(a.data, b.data);
        });

        Integer previousCol = null;
        for(Entry enty: nodes){
            if(previousCol == null || enty.col != previousCol){
                answer.add(new ArrayList<>());
                previousCol = enty.col;
            }
            answer.get(answer.size()-1).add(enty.data);
        }

        return answer;
    }

    private void preOrder(TreeNode root, int row, int col, List<Entry> nodes) {
        if(root == null){
            return;
        }
        nodes.add(new Entry(root.val, row, col));

        preOrder(root.left, row+1, col-1, nodes);
        preOrder(root.right, row+1, col+1, nodes);
    }
}