class DayPrice{
    int day,price;
    DayPrice(int day, int price){
        this.day=day;
        this.price=price;
        
    }
}


class StockSpanner {

 Stack<DayPrice> st;
 int day;
    public StockSpanner() {
        st= new Stack<>();
        day=-1; //index
        st.push(new DayPrice(day,0));
    }
    
    public int next(int price) {
        day=day+1;
        while(st.size()>1 && st.peek().price<=price){
            st.pop();
        }
        int span=day-st.peek().day;
        st.push(new DayPrice(day,price));
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
