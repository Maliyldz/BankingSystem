//200101066
//210101033

public class StackNode<T> {
    private T data;
    private StackNode<T> nextNode;
    
    public StackNode(T data){
        this.data = data;
        nextNode = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public StackNode<T> getNext(){
        return nextNode;
    }

    public void setNext(StackNode<T> next){
        this.nextNode = next;
    }
}
