//200101066
//210101033

import java.util.EmptyStackException;

public class SortableStack<T extends Comparable<T>>{
    private StackNode<T> top;

    public SortableStack(){
        this.top = null;
    }

    public boolean isEmpty(){
        if (top == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void push(T data){
        StackNode <T> node = new StackNode<T>(data);
        if(isEmpty()){
            top = node;
        }
        else{
            node.setNext(top);
            top = node;
        }
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            T data = top.getData();
            top = top.getNext();
            return data;
        }

    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getData();
    }

    public void sort(){
       StackNode<T> current = top;
       StackNode<T> index = null;
       T temp;

       if(isEmpty()){
        throw new EmptyStackException();
       }
       else {
        while (current != null) {
            index = current.getNext();

            while (index != null) {
                if (current.getData().compareTo(index.getData()) > 0) {
                    temp = current.getData();
                    current.setData(index.getData());
                    index.setData(temp);
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        StackNode<T> current = top;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
