package Tree;

import Tree.Tree.Node;

public class Runner
{
    public int diameterOfBinaryTree(Node root) 
    {
        if(root == null)
            return 0;
       
       DiaPair ans = getDia(root);
        
        return ans.diameter - 1;
    }
    
    DiaPair getDia(Node root)
    {
        if(root == null)
        {
            return new DiaPair(0,0);
        }
        DiaPair lst = getDia(root.left);
        DiaPair rst = getDia(root.right);
        
        DiaPair fina= new DiaPair();
        
        fina.height = 1  + max(lst.height, rst.height);
        fina.diameter = max(1 + lst.height + rst.height, lst.diameter, rst.diameter);
        
        
        return fina;
    }
    
    int max(int a, int b)
    {
        return (a > b ? a : b);
    }
    int max(int a, int b, int c)
    {
        return a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
    }
}
