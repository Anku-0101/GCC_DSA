
// Map , filter and reduce 

const arr = [5,4,3,2,6];

// double - [10, 8, 6, 4, 12]
// Triple - [15, 3, 9, 6, 18]
// Binary - ["101", "100", "11", "10", "110"]

const double = arr.map((x)=>x*2);
console.log(double);

const triple = arr.map((x)=>x*3);
console.log(triple);

const binary = arr.map((x)=>{
    let res = '';
    while(x > 0){
        res += (x%2);
        x = Math.trunc(x/2);
    }
    return res.split("").reverse().join("");

})

console.log(binary);

const getBinary = function(x){
    let res = [];
    while(x > 0){
        res.push(x%2);
        x = Math.trunc(x/2);
        
    }
    console.log(res);
}

//console.log(getBinary(3));

const even = arr.filter((x) => x%2==0);
const greaterThan4 = arr.filter((x) => x > 4);

const getSum = arr.reduce(function(acc, curr){
    acc = acc + curr;
    return acc;
}, 0);

const getMax = arr.reduce(function(acc, curr){
    if(acc < curr)
        acc = curr
},arr[0]);

// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

const users =[
        {firstName : "Aman", lastName : "Kumar", age : 24},
        {firstName : "Rajesh", lastName : "Verma", age : 30},
        {firstName : "Raj", lastName : "Sahi", age : 23},
        {firstName : "Kartik", lastName : "Kamal", age : 24},
        {firstName : "Krishna", lastName : "Gopal", age : 23}
    ];
    
    // obj = {24 : 2, 30 : 1, 23 : 2
    
    const output = users.reduce(function(acc, curr){
        if(acc[curr.age]){
            acc[curr.age] = ++acc[curr.age];
        }
        else{
            acc[curr.age] = 1;
        }
        return acc;
    }, {});

console.log(output);


const users =[
        {firstName : "Aman", lastName : "Kumar", age : 24},
        {firstName : "Rajesh", lastName : "Verma", age : 30},
        {firstName : "Raj", lastName : "Sahi", age : 23},
        {firstName : "Kartik", lastName : "Kamal", age : 24},
        {firstName : "Krishna", lastName : "Gopal", age : 23}
    ];
    
    // obj = {24 : 2, 30 : 1, 23 : 2
    
    const output = users.reduce(function(acc, curr){
        if(acc[curr.age]){
            acc[curr.age] = ++acc[curr.age];
        }
        else{
            acc[curr.age] = 1;
        }
        return acc;
    }, {});

console.log(output);

const fullName = users.map((x) =>{
        return x.firstName + " " + x.lastName;
    });
console.log(fullName);


// first name of all the people whose age is less than 30

/// chaining these methods
const lessThan30 = users.filter((x)=> x.age < 30).map((x) => x.firstName);
console.log(lessThan30);

const lessThan30Reduce = users.reduce(function(acc, curr){
    if(curr.age < 30){
        acc.push(curr.firstName);
    }
    return acc;
},[])

console.log(lessThan30Reduce);
