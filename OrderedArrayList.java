class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public boolean add(T x){
    for(int i = 0; i < super.size(); i++){
      if(x.compareTo(super.get(i)) < 0){
        super.add(i, x);
        return true;
      }
    }
    return super.add(x);
  }
  public void add (int index, T x){
    add(x);
  }
  public T set(int i, T x){
    T a = super.get(i);
    super.remove(i);
    add(x);
    return a;
  }
}
