// https://leetcode.com/problems/range-sum-of-bst/

package jdh;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

 public class J230906_1 {
    static int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        bfs(root, low, high);
        return sum;
    }

    private void bfs(TreeNode head, int low, int high){
        if (head == null){
            return;
        }
        if (head.val >= low && head.val <= high){
            sum += head.val;
        }
        rangeSumBST(head.left, low, high);
        rangeSumBST(head.right, low, high);
    }

}