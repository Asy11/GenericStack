
public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}


class Stack<T> {
	
private Node top;
    
    // 노드 class 단순연결리스트와 같다.
    private class Node{
        
        private T data;
        private Node nextNode;
        
        Node(T data){
            this.data = data;
            this.nextNode = null;
        }
    }
    
    // 생성자, stack이 비어있으므로 top은 null이다.
    public Stack(){
        this.top = null;
    }
    
    // 스택이 비어있는지 확인
    public boolean empty(){
        return (top == null);
    }
    
    // item 을 스택의 top에 넣는다.
    public void push(T item){
        
        Node newNode = new Node(item);
        newNode.nextNode = top;
        top = newNode;
        
    }
    
    // top 노드의 데이터를 반환한다.
    public T peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;
    }
    
    // top 노드를 스택에서 제거한다.
    public T pop(){
        
        T item = peek();
        top = top.nextNode;
        return item;
    }
}
