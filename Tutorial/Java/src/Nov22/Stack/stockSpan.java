import java.util.*;
 
public class StockSpan {
 
    static void calculateSpan(int price[], int n, int S[])
    {
        // Create a stack and push index of first element
        // to it
        Stack<Integer> st = new Stack<>();
        st.push(0);
 
        // Span value of first element is always 1
        S[0] = 1;
 
        // Calculate span values for rest of the elements
        for (int i = 1; i < n; i++) {
 
            // Pop elements from stack while stack is not
            // empty and top of stack is smaller than
            // price[i]
            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();
 
            // If stack becomes empty, then price[i] is
            // greater than all elements on left of it,
            // i.e., price[0], price[1], ..price[i-1]. Else
            // price[i] is greater than elements after top
            // of stack
            S[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
 
            // Push this element to stack
            st.push(i);
        }
    }

    static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];
 
        // Fill the span values in array S[]
        calculateSpan(price, n, S);
 
        // print the calculated span values
        printArray(S);
    }
}