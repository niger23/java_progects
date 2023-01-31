package HomeWorks.HomeWorks010;

public class DiffList<T> {
    private int len;
    private T[] arrayT;
    
    @SuppressWarnings("unchecked")
    public DiffList() {
        this.arrayT = (T[]) new Object[0];
        this.len = arrayT.length;
    }

    public DiffList(T[] arrayT) {
        this.len = arrayT.length;
        this.arrayT = arrayT;
    }

    public int getLen() {
        return this.len;
    }

    public T[] getArrayT() {
        return this.arrayT;
    }
    @SuppressWarnings("unchecked")
    public void add(T item) {
        T[] newArray = (T[]) new Object[this.getLen() +1];
        for (int i = 0; i < this.getLen(); i++) {
            newArray[i] = this.arrayT[i];
            
        }
        newArray[this.len++] = item;
        this.arrayT = newArray;
    }

    public void print() {
        // for (T t : arrayT) System.out.println(t);
        for (int i = 0; i < this.len; i++) {
            System.out.println(this.arrayT[i]);
        }
    }
    public T remove(int iDel) {
        T del = this.arrayT[iDel];
        T[] newArray = this.arrayT;
        int count = 0;
        for (int i = 0; i < this.len; i++) {
            if (i != iDel) {
                newArray[count] = this.arrayT[i];
                count++;
            }
        }
        this.arrayT = newArray;
        this.len = count; 
        return del;
    }
    public boolean removeAll(T item) {
        boolean del = false;
        T[] newArray = this.arrayT;
        int count = 0;
        for (int i = 0; i < getLen(); i++) {
            if (!this.arrayT[i].equals(item)) {
                newArray[count] = arrayT[i];
                count++;
                del = true;
            }
        }
        this.arrayT = newArray;
        this.len = count; 
        return del;
    }
    @SuppressWarnings("unchecked")
    public T getMax() {
        T result = this.arrayT[0];
        if (result instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {
                Comparable<T> elem = (Comparable<T>)this.arrayT[i];
                    if (elem.compareTo(result) > 0 ) {
                        result = this.arrayT[i];
                    }
                }
            }
            return result;
    }
    @SuppressWarnings("unchecked")
    public T getMin() {
        T result = this.arrayT[0];
        if (result instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {
                Comparable<T> elem = (Comparable<T>)this.arrayT[i];
                    if (elem.compareTo(result) < 0 ) {
                        result = this.arrayT[i];
                    }
                }
            }
            return result;
    }
    public int indexOf(T item) {
        for (int i = 0; i < this.getLen(); i++) {
            if (this.arrayT[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    public boolean contains(T item) {
        return this.indexOf(item) != -1;
    }
    @SuppressWarnings("unchecked")
    public void BubbleSort() {
        T temp = this.arrayT[0];
        for (int i = 0; i < this.getLen() - 1; i++) {
            for (int j = 0; j < this.getLen() - i - 1; j++) {
                Comparable<T> elem = (Comparable<T>)this.arrayT[j];
                T nextElem = this.arrayT[j + 1];
                if (elem.compareTo(nextElem) > 0) {
                    temp = this.arrayT[j];
                    this.arrayT[j] = this.arrayT[j+1];
                    this.arrayT[j+1] = temp;

                }
            }
        }       
    }
    @SuppressWarnings("unchecked")
    public void InsertionSort() {
        T temp = this.arrayT[0];
        for (int i = 1; i < this.getLen(); i++) {
            for (int j = i; j > 0; j--) {
                Comparable<T> elem = (Comparable<T>)this.arrayT[j];
                T prevElem = this.arrayT[j - 1];
                if (elem.compareTo(prevElem) < 0) {
                    temp = this.arrayT[j];
                    this.arrayT[j] = this.arrayT[j-1];
                    this.arrayT[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void SelectionSort() {
        T min = this.arrayT[0];
        for (int i = 0; i < this.getLen(); i++) {
            min = this.arrayT[i];
            int min_i = i;
            for (int j = i; j < this.getLen(); j++) {
                Comparable<T> elem = (Comparable<T>)this.arrayT[j];
                if (elem.compareTo(min) < 0) {
                    min = this.arrayT[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                T temp = this.arrayT[i];
                this.arrayT[i] = this.arrayT[min_i];
                this.arrayT[min_i] = temp;
            }                
            }
        }
}




