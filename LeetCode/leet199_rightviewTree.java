import java.util.*;

public class leet199_rightviewTree 
{
    public List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null)
        {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(queue.size() > 0)
        {
            int count = queue.size();
            while(count-- > 0)
            {
                TreeNode node = queue.remove();

                if(count == 0)
                    result.add(node.val);

                if(node.left != null)
                    queue.add(node.left);
                
                if(node.right != null)
                    queue.add(node.right);
            }
        }
        return result;
    }
}
