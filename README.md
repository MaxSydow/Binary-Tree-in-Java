# About

This is a binary search tree created using Java.  It is a data structure used to store and search names in a binary tree.   It uses inorder traversal to navigate the entries in the tree alphabetically; the algorithm starts with the left-most node in the left-most subtree followed by its root then goes to the root's right node.  This subtree's root is then the left-most node in the next-higher level subtree, and the process repeats.

A **Node** class is used to create the entries, while the **BinaryTree** class builds and traverses the tree, and the **Main** class contains the names used and calls the other classes to work together.

# Class descriptions

classes and functions/methods are indicated in **bold**

variables, objects, and indeces are indicated in _italics_

### Node
(Node.java)

 *  Creates a _Node_ object consisting of _first name_, _last name_, _phone number_, and _email address_ using **get()** and **set()** methods. 

### BinaryTree
(BinaryTree.java)

* **add()** and **rAdd()** 

&nbsp; &nbsp; &nbsp; &nbsp;  **rAdd()** is a recursive function that places a new node _tempNode_ in the left or right subtree according  to its comparison with &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; the root of the subtress.  

&nbsp; &nbsp; &nbsp; &nbsp;  **add()** - adds node using name parameters and calls **rAdd()** for proper ordering.

* **find()** and **rFind()**

&nbsp; &nbsp; &nbsp; &nbsp;  **rFind()** is a fecursive function that traverses the tree according to whether _tempNode_ data greater than, equal to, or less than &nbsp; &nbsp; &nbsp; &nbsp; root of subtree.

&nbsp; &nbsp; &nbsp; &nbsp;  **find()** - finds node using name parameters and calls **rAdd()** for proper ordering.

* **Remove()** - removes node using name parameters, and uses **getLeftMostChild()** helper function.

* **printTree()** - recursively traverses tree inorder to print node name data in alphabetical order.

### Main
* Instantiates _BinaryTree_ object, adds and prints _Node_ data.



