
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
