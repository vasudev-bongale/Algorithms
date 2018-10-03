# Dynamic Connectivity

* Provides two operations

  * Union - Connect two objects
  * Find - Is there a path between two objects? - boolean

* Model the objects are numbers 0.. N-1

* Connections? - Reflexive, Symmetric, Transitive.

* Divide the objects into connected components - subsets of objects that are mutually connected.(max)

* Find - Checking if two objects are in same component.

* Union - Merge the components

  #### Implementation

* Create a **Union-Find** data type (API)

  * **Quick-find**: (Greedy Approach) array id[] of size N, p and q are connected iff they have same id. 
    * find: check if p and q have same id
    * union: change the entires to a common value. 
    * Drawback: Union is expensive! (Quadratic time - they are not scalable
  * **Quick-Union**:  (Lazy Approach)
    * Integer array of N elements
    * id[i] is parent of i
    * Each element would have a root
    * find: Check if p and q have same root
    * union: set id of one root to id of other root. (Add a root under another root, or make a common root)
    * Find is slower and expensive, worst case, can be as long as N if the tree gets taller, but is better than quick-find. So lets improve this
  * **Weighted-Quick-Union**
    * Avoid tall trees! - Keep track of the number of objects in the tree and add the shorter tree under the taller trees, not the other way round.
    * Now, the complexity reduces to log N.
    * This can be further improved by compressing the path traversed to find the root
  * **Weighted-Quick-Union with path compression**
    * Add the node to the root directly.

* **Applications**
  * Percolation Model 

