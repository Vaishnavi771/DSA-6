import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Treestructure{
    TreeNode  root= null;
    public TreeNode create (int[] arr) {
        root =new TreeNode(arr[0]);
        Queue<TreeNode> q=new LinkedList <>();
        q.add(root);
        int i=1;
        while(i<arr.length){
          TreeNode cur=q.poll();
            if(arr[i] != -1){
                cur.left= new TreeNode(arr[i]);
                q.add(cur.left);
            }
            i++;
            if(i> arr.length) 
            break;
            if(arr[i] != -1){
                cur.right= new TreeNode(arr[i]);
                q.add(cur.right);
            }
            i++;
          
        }
            return root;
    }
        public void levelorder(TreeNode root){
          if(root==null)
          return;
        Queue <TreeNode> q= new LinkedList<>();
        q.add(root);
            while(!q.isEmpty()){
              TreeNode cur=q.poll();
              System.out.println(cur.data+" ");
              if(cur.left!=null)
              q.add(cur.left);
              if(cur.right!=null)
              q.add(cur.right);
              
            }
        }

public void inorder(TreeNode root){
    if(root== null)
        return;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

public void preorder(TreeNode root){
    if(root==null)
      return;
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

public void postorder(TreeNode root){
    if(root==null)
    return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    }
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr= new int[n];
    Treestructure obj= new Treestructure();
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
   TreeNode root= obj.create(arr);
   System.out.println("levelorder");
   obj.levelorder(root);
   System.out.println();
   System.out.println("inorder");
   System.out.println();
   obj.inorder(root);
   System.out.println("preorder");
   System.out.println();
   obj.preorder(root);
   System.out.println("postorder");
   System.out.println();
   obj.postorder(root);
    }
}

