package com.ascending.training.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
    public static void main(String[] arg){
        Bfs queueSolution = new Bfs();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(8);
        right.left= new TreeNode(7);
        right.right=new TreeNode(9);
    }

    public List<List<Integer>> largestValues(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        // [[1], [2,3], [4,5]]
        List<List<Integer>> result = new ArrayList<>();
        queue.offer(root);
        while(!(queue.isEmpty())){
            int temp = 0;
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.val >= temp){
                    temp = node.val;
                }
                if(node.left == null){
                    queue.offer(node.left);
                }
                if(!(node.right == null)){
                    queue.offer(node.right);
                }
            }
            level.add(temp);
            result.add(level);
        }
        System.out.println(result);
        return result;
    }


}
