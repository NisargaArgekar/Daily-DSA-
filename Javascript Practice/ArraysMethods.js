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

//  Reduce 

let num1 = [1,2,3,4,5,6,7];
let sum = num1.reduce((sum , num1) => sum + num1 , 0);
console.log("Number given for sum: ",num1);
console.log("Calculating all Numbers:",sum);