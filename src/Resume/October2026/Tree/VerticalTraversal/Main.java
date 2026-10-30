package Resume.October2026.Tree.VerticalTraversal;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        val = value;
    }
}

class VerticalTraversal {

    static class Entry {
        int column;
        int row;
        int value;

        Entry(int column, int row, int value) {
            this.column = column;
            this.row = row;
            this.value = value;
        }
    }

    // Stores every node with its
    // column, row, and value.
    private void dfs( TreeNode node, int row, int column, List<Entry> nodes) {
        if (node == null) {
            return;
        }

        nodes.add(new Entry(column, row, node.val));

        // Moving left increases the row
        // and decreases the column.
        dfs(node.left, row + 1, column - 1, nodes);

        // Moving right increases both
        // the row and column.
        dfs(node.right, row + 1, column + 1, nodes);
    }

    // Returns nodes grouped by vertical
    // columns from left to right.
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Entry> nodes = new ArrayList<>();

        dfs(root, 0, 0, nodes);

        // Entries are ordered by column then row, then node value.
        nodes.sort((a, b) -> {
            if (a.column != b.column) {
                return Integer.compare(a.column, b.column);
            }

            if (a.row != b.row) {
                return Integer.compare(a.row, b.row);
            }

            return Integer.compare(a.value, b.value);
        });

        List<List<Integer>> answer = new ArrayList<>();

        Integer previousColumn = null;

        // A new group is started whenever the column changes.
        for (Entry entry : nodes) {
            if (previousColumn == null || entry.column != previousColumn) {
                answer.add(new ArrayList<>());
                previousColumn = entry.column;
            }

            answer.get(answer.size() - 1).add(entry.value);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        VerticalTraversal solution = new VerticalTraversal();

        System.out.println(
            solution.verticalTraversal(root)
        );
    }
}