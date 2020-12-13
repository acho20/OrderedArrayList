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
}
