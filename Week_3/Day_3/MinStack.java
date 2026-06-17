class MinStack{
 Stack<Long> st = new Stack<>();
    long min = -1;

    public MinStack() {
        
    }
    
    public void push(int val) {
        long x = (long)val;
        if(st.size()==0){
            st.push(x);
            min = x;
        }
        else{
            if(x>=min) st.push(x);
            else{
                st.push(2*x-min);
                min= x;
            }
        }
    }
    
    public void pop() {
        if(st.peek()>=min) st.pop();
        else{
            long oldmin =2* min- st.peek();
            min = oldmin;
            st.pop();
        }
        
    }
    
    public int top() {
        long q =st.peek();
        if(st.size()==0) return -1;
        if(q>=min) return (int) q ;
        else{
            return (int) min;
        }

        
    }
    
    public int getMin() {
        return (int) min;
        
    }
}
