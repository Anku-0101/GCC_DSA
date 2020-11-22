// Data Structure are ways to arrange data in main memory(RAM) for efficent usage 
// Examples : Array, LinkedList, Stack, Queues, Graphs, BST etc

// Algorithm are sequence of steps to solve a given problem 
// Example : Sorting an array, 

// Other Terminology
// (a)Database         : Collection of information in permanent storage for faster retrival and updation
// (b)Data Warehousing : Management of huge amount of legacy data for better analysis
// (c)Big data         : Analysis of too large or complex data which cannot be dealt with traditional data processing application.

/*
           Heap

        Stack \END/
         _________________
        |_________________|
        |_________________|
        |_________________|
        Stack \START/

        Uninitialized Data |
                           | Static + Global variable 
        Initialized Data   |
        Code Segment 

        Memory (RAM)
*/

/*
    Asymptotic Notation 

Big oh notation (O)
        A function f(n) is said to be O(g(n)) iff there exists constant C & a constant n0 
        such that 

            0 <= f(n) <= g(n) for all n>n0

Big Omega Notation (_0_)
        Just link O notation provides an asymptotic upper bound, Big Omega notation
        Provides asymptotic lower bound. Let f(n) define the running time of an 
        algorithm

        F(n) is said to be big Omega (g(n)) if there exist positive constants C and 
        n0 such that,

                0 <= c g(n) <= f(x) for all n >= n0

Big Theta Notation (0)
        Let f(n) define running time of an algorithm 
        f(n) is said to be O(g(n)) and f(n) is also Big Omega of g(n)

                0 <= C2g(x) <= f(x) <= C1g(x)  for all  n >= n0

*/
