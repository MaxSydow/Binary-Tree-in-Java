import java.io.*;

/**
 *  creates a Node object
 *     instance vairables: Fname, Lname, phone, email, left, right, parent
 * @author Max Sydow
 * @version.1 7/12/2018
 */

public class Node 
    {  
       /** declaration of instance variables  */
        public String Fname;
        public String Lname;
        public String name;
        public String phone;
        public String email;
        public Node left;
        public Node right;
        public Node parent;
        
       /** node constructor  */ 
       public Node(String newFname, String newLname, String newPhone, String newEmail, Node leftChild, Node rightChild, Node parentNode)
       {            
            Fname = newFname;
            Lname = newLname;
            phone = newPhone;
            email = newEmail;
            left = leftChild;
            right = rightChild;
            parent = parentNode;            
        }
       /** accessor and mutators for node attributes including left child, right child, and parent nodes
        * 
        */
       public String getFname()
       {
           return Fname;
       }
       public void setFname(String Fname)
       {
           this.Fname = Fname;
       }
       public String getLname()
       {
           return Lname;
       }
       public void setLname(String Lname)
       {
           this.Lname = Lname;
       }
       public String getPhone()
       {
           return phone;
       }
       public void setPhone(String Phone)
       {
           this.phone = Phone;
       }
       public String getEmail()
       {
           return email;
       }
       public void setEmail(String Email)
       {
           this.email = Email;
       }
       public Node getRightChild()
       {
           return right;
       }
       public void setRightChild(Node rightChild)
       {
           this.right = rightChild;
       }
       public boolean hasRightChild()
       {
           return right != null;
       }       
       public Node getLeftChild()
       {
           return left;
       }      
       public void setLeftChild(Node leftChild)
       {
           this.left = leftChild;
       }
       public boolean hasLeftChild()
       {
           return left != null;
       }     
       public Node getParent()
       {
           return parent;
       }
       public void setParent(Node parent)
       {
            this.parent = parent;
       }       
    }   