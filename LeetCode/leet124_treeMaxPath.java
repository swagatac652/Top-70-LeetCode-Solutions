public class leet124_treeMaxPath 
{
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root)
    {
        pathSum(root);
        return max;
    }

    public int pathSum(TreeNode root)
    {
        if(root == null) 
        return 0;

        int left = Math.max(0,pathSum(root.left));
        int right = Math.max(0,pathSum(root.right));

        max=Math.max(max,left+right+root.val);

        return Math.max(left,right)+root.val;
    }
}

