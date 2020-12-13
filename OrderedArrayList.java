class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public boolean add(T x){
    if(x == null){
      throw new IllegalArgumentException();
    }

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
    if(x == null){
      throw new IllegalArgumentException();
    }
    T a = super.get(i);
    super.remove(i);
    add(x);
    return a;
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int size){
    super(size);
  }
}
