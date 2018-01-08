package com.vbongale;

public class WeightedQuickUnionUF {

  private int[] id;
  private int[] sz;

  public WeightedQuickUnionUF(int N) {
    id = new int[N];
    for(int i=0; i<id.length; i++){
      id[i] = i;
      sz[i] = 0; // no trees in the beginning
    }
  }

  public int root(int p) {
    // Finds the root of an element p
    while(p != id[p]) p = id[p];
    return p;
  }

  public boolean connected(int p, int q) {
    int root_p = root(p);
    int root_q = root(q);
    return root_p == root_q;
  }

  public void union(int p, int q) {
    int root_p = root(p);
    int root_q = root(q);
    if(sz[root_p] > sz[root_q]) {
      id[root_q] = root_p;
      sz[root_p] += sz[root_q];
    } else {
      id[root_p] = root_q;
      sz[root_q] += sz[root_p];
    }
  }
}
