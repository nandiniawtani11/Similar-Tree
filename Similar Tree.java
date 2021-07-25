class Solution {
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        if(left>right)
            return left+1;
        return right+1;
    }
    public List<Integer> level(TreeNode root,int level,List<Integer>list)
    {
        if(root==null)
            list.add(12);
        else if(level==1)
        {
            list.add(root.val);
        }
            
        else if(level>1)
        {
            level(root.left,level-1,list);
            level(root.right,level-1,list);
        }
        return list;
    }
    public boolean ispallindrome(List<Integer>list)
    {
        int start=0;
        int end=list.size()-1;
        while(end>start)
        {
            if(list.get(start)!=list.get(end))
            {
                System.out.println("false");
                return false;
            }
                
            start++;
            end--;
        }
        return true;
    }

    public boolean isSymmetric(TreeNode root) {
        int h=height(root);
       for(int i=1;i<=h;i++)
       {
           List<Integer> list=new ArrayList<Integer>();
           list=level(root,i,list);
           System.out.println(list);
           if(!ispallindrome(list))
               return false;
       }
        return true;
    }
}
