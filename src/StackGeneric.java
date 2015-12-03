
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
    
    // ��� class �ܼ����Ḯ��Ʈ�� ����.
    private class Node{
        
        private T data;
        private Node nextNode;
        
        Node(T data){
            this.data = data;
            this.nextNode = null;
        }
    }
    
    // ������, stack�� ��������Ƿ� top�� null�̴�.
    public Stack(){
        this.top = null;
    }
    
    // ������ ����ִ��� Ȯ��
    public boolean empty(){
        return (top == null);
    }
    
    // item �� ������ top�� �ִ´�.
    public void push(T item){
        
        Node newNode = new Node(item);
        newNode.nextNode = top;
        top = newNode;
        
    }
    
    // top ����� �����͸� ��ȯ�Ѵ�.
    public T peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;
    }
    
    // top ��带 ���ÿ��� �����Ѵ�.
    public T pop(){
        
        T item = peek();
        top = top.nextNode;
        return item;
    }
}
