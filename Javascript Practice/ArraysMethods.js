let numbers = [1,5,4,3,6,7,9];
console.log(numbers.indexOf(7));

console.log(numbers);
numbers.sort();
console.log(numbers);

console.log(numbers.reverse());

let fruits = ["apple", "Mango" ,"Cherry"];
// fruits.forEach(fruit => console.log(fruit));
fruits.forEach(fruit => process.stdout.write(fruit + " "));

// Higher order function 
// Map 


let num = [1, 2, 3];
let squared = num.map(num =>num*num);
console.log(num);
console.log(squared);