# About

This is a binary search tree created using Java.  It is a data structure used to store and search names in a binary tree.   It uses inorder traversal to navigate the entries in the tree alphabetically; the algorithm starts with the left-most node in the left-most subtree followed by its root then goes to the root's right node.  This subtree's root is then the left-most node in the next-higher level subtree, and the process repeats.

A **Node** class is used to create the entries, while the **BinaryTree** class builds and traverses the tree, and the **Main** class contains the names used and calls the other classes to work together.

# Class descriptions

### Node
(Node.java)

* 

## BinaryTree
(BinaryTree.java)

* **add()** and **rAdd()** -
&nbsp; &nbsp; &nbsp; &nbsp;  **rAdd()** is a recursive function that places a new node _tempNode_ in the left or right subtree according to its comparison with the root of the subtress.  
&nbsp; &nbsp; &nbsp; &nbsp;  **add()** adds node using parameters in **Main** class and calls **rAdd()** for proper ordering



* uses a Node object to create a binary tree using inorder traversal by
 *    adding, removing, and looking up nodes
 *    prints the tree using inorder traversal so that node names are in alphabetical order
 *    instantiates Node object tempNode as needed
