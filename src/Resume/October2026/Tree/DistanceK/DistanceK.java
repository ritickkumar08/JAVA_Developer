package Resume.October2026.Tree.DistanceK;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}
class DistanceK {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode target = root.left;
        int k = 2;

        DistanceK ob = new DistanceK();
        List<Integer> ans = ob.distanceK(root,target,k);
        System.out.println(ans);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        markParents(parents, root);

        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target, true);
        int distance = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            if(distance == k) break;
            distance++;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if(current.left != null && visited.get(current.left) == null){
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }
                if (current.right != null && visited.get(current.right) == null){
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }
                if(parents.get(current) != null && visited.get(parents.get(current)) == null){
                    queue.offer(parents.get(current));
                    visited.put(parents.get(current), true);
                }
            }
        }

        List<Integer> answer = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            answer.add(current.val);
        }

        return answer;
    }
    private void markParents(Map<TreeNode, TreeNode> parents, TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            if(current.left != null){
                parents.put(current.left, current);
                queue.offer(current.left);
            }
            if (current.right != null){
                parents.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }
}