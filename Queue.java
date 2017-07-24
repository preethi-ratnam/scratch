import java.util.Stack;

public class Queue{
  Stack<String> st,st1;
  public Queue() {
    st=new Stack<String>();
    st1=new Stack<String>();
  }
  
  public void enqueue(String s) {
    st.push(s);
    
  }
  
  public String dequeue() {
    this.move(st,st1);
    /*for(;!(st.empty());){
    String s1=st.pop();
      st1.push(s1);
    }*/
    String s3=st1.pop();
    this.move(st1,st);
    /*for(;!(st1.empty());)
    {
      String s1=st1.pop();
      st.push(s1);
    }*/
    return s3;
    //return st.pop();
    
  }
  private void move(Stack<String> src,Stack<String> dest)
  {
    for(;!(src.empty());)
    {
      String s=src.pop();
      dest.push(s);
    }
  }
  
  
  public static void main(String args[]){
    Queue q = new Queue();
    q.enqueue("hi");
    q.enqueue("hello");
    //q.dequeue(); // should return hi
    System.out.println(q.dequeue());
    q.enqueue("this"); //
    System.out.println(q.dequeue()); // should return hello
    System.out.println(q.dequeue()); // should return this
    System.out.println(q.dequeue());
    
    
	/*
    Stack<String> st = new Stack<String>();
    st.push("hi");    
    st.push("hello");
    System.out.println(st.pop() + " " + st.pop());
    */
  }
}
