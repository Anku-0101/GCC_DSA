/*
    any composite number can be factorized , assuming n is a composite no.
    n = m * p;
    m, p is not 1 and n ; [It has factors other than 1 and itself]
    what is the maximum m and p can take simultaneously

    AM >= GM inequality ???  and the maxima exist when numbers are equal., 

    m = p ;
    m ^2 = n ;
    or, m = sqrt(n) ;

    36 = 6*6   ;
    36 = 36*1  ;
    48 = 6*7   sqrt(n) ;
    48 = 24*2; 

    i = 2; i < n/2; i++ n = 10000; 5000 O(n/2) ~ O(n) 
    i = 2; i*i <n; i++  n =10000; 100   O(sqrt(n)) 
    Space Complexity : O(1) ; int n ; sf(%d, &n) 
       

    Sieve : Time Complexity: O(cuberoot(n)/log(n)) ; O(100/6) = 16; O(21/6) ~ 4
    Space Complexity : O(n) ; arr[n]; arr[101]


*/