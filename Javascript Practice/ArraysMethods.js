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
// Map +


let num = [1, 2, 3];
let squared = num.map(num =>num*num);
console.log(num);
console.log(squared);


// Filter 
let numb = [1,2,3,4,5];
let evenNumbers = numb.filter(num => num % 2 === 0);
console.log("Initial Numbers: ",numb);
console.log("After found out even numbers: ",evenNumbers);

