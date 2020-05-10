import java.io.*;

/** calls methods Add, Find, Remove, and printTree from BinaryTree to 
 *       add, find, remove, and print node data with given parameters
 *
 * @author Max Sydow
 * @version.1 7/12/2018
 */

public class Main
{
/** instantiate BinaryTree object   */
private static BinaryTree myTree = new BinaryTree();
public static void main(String args[])
    {   
       /**  adding, finding, and removing entries */ 
        
       myTree.Add("Bob", "Smith", "555-235-1111", "bsmith@somewhere.com");        
       myTree.Add("Jane", "Williams", "555-235-1112", "jw@something.com");
       myTree.Add("Mohammed", "al-Salam", "555-235-1113", "mas@someplace.com");
       myTree.Add("Pat", "Jones", "555-235-1114", "pjones@homesweethome.com");
       myTree.Add("Billy", "Kidd", "555-235-1115", "billy_the_kid@nowhere.com");
       myTree.Add("H.", "Houdini", "555-235-1116", "houdini@noplace.com");
       myTree.Add("Jack", "Jones", "555-235-1117", "jjones@hill.com");
       myTree.Add("Jill", "Jones", "555-235-1118", "jillj@hill.com");
       myTree.Add("John", "Doe", "555-235-1119", "jdoe@somedomain.com");
       myTree.Add("Jane", "Doe", "555-235-1120", "jdoe@somedomain.com");       
       myTree.Find("Pat", "Jones");
       myTree.Find("Billy", "Kidd");
       myTree.Remove("John", "Doe");
       myTree.Add("Test", "Case", "555-235-1121", "Test_Case@testcase.com");
       myTree.Add("Nadezhda", "Kanachekhovskaya", "555-235-1122", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru");
       myTree.Add("Jo", "Wu", "555-235-1123", "wu@h.com");
       myTree.Add("Millard", "Fillmore", "555-235-1124", "millard@theactualwhitehouse.us");
       myTree.Add("Bob", "vanDyke", "555-235-1125", "vandyke@nodomain.com");
       myTree.Add("Upside", "Down", "555-235-1126", "upsidedown@rightsideup.com");
       myTree.Find("Jack", "Jones");
       myTree.Find("Nadezhda", "Kanachekhovskaya");
       myTree.Remove("Pat", "Jones");
       myTree.Remove("Jill", "Jones");       
       myTree.Remove("John", "Doe");
       myTree.Find("Pat", "Jones");
       myTree.Find("Jill", "Jones");
       myTree.Find("John", "Doe");      
       /** prints tree - names in alphabetical order following inorder traversal of tree  */
      myTree.printTree("Bob", "Smith");
       
       
    }
    
}