package com.ptit;

import tree.TreeNode;

public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        // B1: Dieu kien dung | Bai toan co so
        if (root == null) return 0;

        int chieuCaoCayBenTrai = maxDepth(root.left);
        int chieuCaoCayBenPhai = maxDepth(root.right);

        return Math.max(chieuCaoCayBenPhai, chieuCaoCayBenTrai) + 1;
    }

    public static void main(String[] args) {

    }
}
