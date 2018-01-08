package com.vbongale;

public class QuickUnionUF {

  private int[] id;

  public QuickUnionUF(int N) {
    id = new int[N];
    for(int i = 0; i< id.length; i++) {
      id[i] = i;
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
    id[root_p] = root_q;
  }
}
