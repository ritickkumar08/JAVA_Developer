package Resume.October2026.Tree.verticalTraversal1;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        val = value;
    }
}

class Entry{
    int val;
    int row;
    int col;

    Entry(int val, int row, int col){
        this.val = val;
        this.row = row;
        this.col = col;
    }
}

class VerticalTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        VerticalTraversal solution = new VerticalTraversal();

        System.out.println(solution.verticalTraversal(root));
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
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

            return Integer.compare(a.val, b.val);
        });


        List<List<Integer>> answer = new ArrayList<>();
        Integer previousCol = null;

        for (Entry entry : nodes) {
            if(previousCol == null || entry.col != previousCol){
                answer.add(new ArrayList<>());
                previousCol = entry.col;
            }
            answer.get(answer.size()-1).add(entry.val);
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