public class leet236_commonancestor 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null)
        return null;

        if(root.equals(p) || root.equals(q))
        return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null)
        return root;

        return (left != null)?left:right;
    }
}
