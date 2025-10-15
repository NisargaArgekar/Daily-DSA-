//function overloading

function add() 
{
    console.log(5 + 5);
}

function add(a,b) {
    console.log(a+b);
}

function add(a,b,c) {
    console.log(a+b+c);
}

function add(a,b,c,d) {
    console.log(a+b+c+d);
}

add(); // NaN
add(5,5); // NaN
add(5,5,5); // NaN
add(5,5,5,5); // 20




function add() {
    if(arguments.length === 2){
        return arguments[0] + arguments[1];
    } else if(arguments.length === 3){
        return arguments[0] + arguments[1] + arguments[2];
    } else if(arguments.length === 4){
        return arguments[0] + arguments[1] + arguments[2] + arguments[3];
    } else {
        return "Invalid number of arguments";
    }
}

console.log(add());  // 0
console.log(add(1,2)); // 3
console.log(add(1,2,3)); // 6
console.log(add(1,2,3,4)); // 10
console.log(add(1,2,3,4,5)); // Invalid number of arguments




// Rest parameters  or spread operator

function add(...numbers) {
    let sum = 0;
    for(let num of numbers) {
        sum = sum + num;
    }
    return sum;
}

console.log(add());  // 0
console.log(add(1,2,3)); // 6
console.log(add(10,20,30,40,50)); // 150
