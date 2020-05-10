import java.io.*;

/**
 * uses a Node object to create a binary tree using inorder traversal by
 *    adding, removing, and looking up nodes
 *    prints the tree using inorder traversal so that node names are in alphabetical order
 *    instantiates Node object tempNode as needed
 *
 * @author Max Sydow
 * @version.1 7/12/2018
 */

public class BinaryTree
{
/**  instance variable boolean isRightChild, and Node object root  */
private Node root; 
Boolean isRightChild;
/**  method to add a node @params Fname, Lname, Phone, Email, called from Main class
 *      calls rAdd 
 */
public void Add(String Fname, String Lname, String Phone, String Email)
{
    
    Node tempNode = new Node(Fname, Lname, Phone, Email, null, null, null);
    if(root == null) {
        root = tempNode;
        return;        
    }    
    else {
    rAdd(root, tempNode);
    }    
}   
/**  recursive method to add node @params root, tempNode
 *    places new node tempNode in left or right subtree according to comparison of it with root of subtree
 *    prints name, parent, and describes as left or right child
 */
public void rAdd(Node root, Node tempNode)
{
    if((tempNode.getFname().concat(tempNode.getLname()).toUpperCase()).compareTo(root.getFname().concat(root.getLname()).toUpperCase()) < 0){
        if(root.getLeftChild() == null) {
            root.setLeftChild(tempNode);
            tempNode.setParent(root);
            isRightChild = false;
            System.out.println("newNode is " + tempNode.getFname() + " " + tempNode.getLname() + ", and is the left child of " + tempNode.getParent().getFname() + " " + tempNode.getParent().getLname());           
        }
        else {
            rAdd(root.getLeftChild(), tempNode);
        }
    }
    else {
            if(root.getRightChild() == null) {
                root.setRightChild(tempNode); 
                tempNode.setParent(root);
                isRightChild = true;
                System.out.println("newNode is " + tempNode.getFname() + " " + tempNode.getLname() + ", and is the right child of " + tempNode.getParent().getFname() +" " + tempNode.getParent().getLname());
            }
            else {
               rAdd(root.getRightChild(),tempNode);                
            }
    }
}
/** method to find a node in tree @params Fname, Lname called from Main class
 *   calls rFind
 */            
public Node Find(String Fname, String Lname)
{

   if(rFind(root, Fname, Lname) == null) {
       return null;
    }  
   else {
       return(rFind(root, Fname, Lname));
    }
}
/**  recursive find method @params root, Fname, Lname
 *   traverses tree according to whether tempNode data greater than, equal to, or less than root of subtree
 */
public Node rFind(Node root, String Fname, String Lname)
{
    Node tempNode = new Node(Fname, Lname, null, null, null, null, null);
    if(tempNode == null) {
        System.out.println(Fname + " " + Lname + " not found.");
    }    
    if((Fname.concat(Lname).toUpperCase()).compareTo(root.getFname().concat(root.getLname()).toUpperCase()) == 0){
    System.out.println(Fname + " " + Lname + " found");
    return root;
    }
    else if ((Fname.concat(Lname).toUpperCase()).compareTo(root.getFname().concat(root.getLname()).toUpperCase()) < 0)
        {
            if(root.getLeftChild() == null) {
               System.out.println(Fname + " " + Lname + " not found");
               return null;
            }        
            else {
               return(rFind(root.getLeftChild(), Fname, Lname));
               
            }
        }
    
    else {
         if (root.getRightChild() == null) {               
            System.out.println(Fname + " " + Lname + " not found");
            return null;
         }
         else {
            return(rFind(root.getRightChild(), Fname, Lname));   
            
         }
    }
}        
            

/** method to remove a node, @params Fname and Lname  called from Main class
 * 
 */   
public void Remove(String Fname, String Lname)
{    
    /** use Find to check if node is in tree, if not print not found and return  */
    Node tempNode = Find(Fname, Lname);
    if(tempNode == null) {
        System.out.println(Fname + " " + Lname + " not found");
        return;
    } 
    /**  assign boolean values to instance variable isRightChild for later use   */
    if(tempNode.getParent().getRightChild() == tempNode){
        isRightChild = true;        
    }
    else {
        isRightChild = false;
    }    
    /** if the node has 2 children set it's parent's right and left child to null  */ 
    if((tempNode.hasLeftChild() == false) && (tempNode.hasRightChild() == false)) {
       System.out.println("no children");
        if(isRightChild == true) {    
            tempNode.getParent().setRightChild(null);
        }
        else {
            tempNode.getParent().setLeftChild(null);
        }
    }    
    /** if node has a right child replace it with it's right child, and if it's a
     *    right child then set it's parent's right child to the child of removed node 
     *    left child then set it's parent's left child to the child of removed node    
     */
    else if(tempNode.hasRightChild() == true) {                
       if(isRightChild == true){
           tempNode.getParent().setRightChild(tempNode.getRightChild());
           tempNode.getRightChild().setParent(tempNode.getParent());
       }
       else {
           tempNode.getParent().setLeftChild(tempNode.getRightChild());
           tempNode.getRightChild().setParent(tempNode.getParent()); 
       }
       System.out.println(Fname + " " + Lname + " removed"); 
    }   
    /** if node has a left child replace it with it's left child, and if it's a
     *    right child then set it's parent's right child to the child of removed node 
     *    left child then set it's parent's left child to the child of removed node    
     */
    else if(tempNode.hasLeftChild() == true) {
        if(isRightChild == true){
            tempNode.getParent().setRightChild(tempNode.getLeftChild());
            tempNode.getLeftChild().setParent(tempNode.getParent());
        }
        else {
           tempNode.getParent().setLeftChild(tempNode.getRightChild());
           tempNode.getRightChild().setParent(tempNode.getParent()); 
        }        
    }
    /**  if node has 2 children find the left most child of the right subtree of the node and replace the
     * removed node with it, then set it's parent's right and left child to null 
     */
    else if((tempNode.hasLeftChild() == true) && (tempNode.hasRightChild() == true)) {
        tempNode = getLeftMostChild(tempNode.getRightChild());
        if(isRightChild == true) {
            tempNode.getParent().setRightChild(null);
        }
        else {
            tempNode.getParent().setLeftChild(null);
        }
        
    }  
}
/**  helper method used to return the left most node in a subtree with root as @param tempNode
 */    
public Node getLeftMostChild(Node tempNode)
{            
        if(tempNode.getLeftChild() != null){            
           getLeftMostChild(tempNode.getLeftChild());
        }
        else {
           return tempNode;
    }
    return null;
}
/** method to call to print tree from Main class @params Fname, Lname - name of root 
 *   calls recursive print method rPrint
 */
public void printTree(String Fname, String Lname)
{
    rPrintTree(root);
}
/** recursively traverses tree inorder to print node name data in alphabetical order @param root
 */   
public void rPrintTree(Node root)
{
    if(root == null){
        return;
        }
        rPrintTree(root.getLeftChild());
        System.out.println(root.getFname() + " " + root.getLname());
        rPrintTree(root.getRightChild());
    }
}

       

