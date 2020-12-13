import java.util.ArrayList;


class NoNullArrayList<T> extends ArrayList<T>{
  public T set(int i, T x){
    if(x == null){
      throw new IllegalArgumentException ();
    }else{
      return super.set(i,x);
    }
  }
}
