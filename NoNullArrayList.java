import java.util.ArrayList;

class NoNullArrayList<T> extends ArrayList<T>{
  public T set(int i, T x){
    if(x == null){
      throw new IllegalArgumentException();
    }else{
      return super.set(i,x);
    }
  }

  public boolean add (T x){
    if (x == null){
      throw new IllegalArgumentException();
    }else{
      return super.add(x);
    }
  }

  public void add(int index, T x){
    if(x == null){
      throw new IllegalArgumentException();
    }else{
      super.add(index, x);
    }
  }

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int size){
    super(size);
  }
}
