class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
         if(root==null) return ans;
         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);
         while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlist = new ArrayList<>(levelsize);
            
            for(int i =0; i<levelsize ; i++){
                TreeNode currentNode = queue.poll();
            currentlist.add(currentNode.val);
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }
            }
         
         ans.add(currentlist);
         }
         return ans;
        
    }
}
