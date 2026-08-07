import java.util.Vector;

class Stack { 
    
     Vector<Integer> v = new Vector<>(); 

         void push(int val)
	 { 
        	v.add(val); 
   	 } 

        void pop() 
	{ 
       		if (!empty()) 
		{
            		v.remove(v.size() - 1); 
        	}
   	 } 

        int top() 
	{ 
        	if (empty()) 
		{
            		throw new RuntimeException("Stack is empty");
        	}
        return v.get(v.size() - 1); 
    	} 

         boolean empty() 
	{ 
        	return v.isEmpty(); 
    	} 

    public static void main(String[] args) 
	{ 
        Stack s = new Stack();         
	s.push(10); 
        s.push(20); 
        s.push(30); 

        while (!s.empty())
	 { 
            System.out.println(s.top());             
            s.pop();         
	} 
    }
}
