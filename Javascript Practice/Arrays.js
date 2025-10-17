// Array 
let fruits = ["apple" , "banana", "cherry"];
console.log(fruits[0]);


//Array Operation

// 1. Adding elements 
// push()
let vehicles = ["car", "truck", "train"];
vehicles.push("bus");
console.log(vehicles);


//unshift()
let numbers = [2,3,4];
numbers.unshift(1);
console.log(numbers);

// 2.Removing Elements
// pop()
let colors = ["red","green","blue"];
colors.pop();
console.log(colors);

//shift()
let animals = ["dog","cat","rabbit"];
animals.shift();
console.log(animals);

//3.Merging arrays
let a = [1,2];
let b = [3,4];
let merged = a.concat(b);
console.log(merged);


//4. Accessing and Updating
let cities = ["Delhi","Mumbai","Pune"];
console.log(cities[1]); //"Mumbai"
cities[2] = "Bangalore";
console.log(cities);

// 5. Checking elements 
let nums = [10,20,30,40];
console.log(nums.includes(20)); //true
console.log(nums.indexOf(30)); //2


//6.Extracting and Modifying

//slice()
let letters = ["a","b","c","d"];
let sliced = letters.slice(1,3);
console.log(sliced);  

//splice()
let items = ["pen","pencil","eraser"];
items.splice(1,1, "marker");
console.log(items);

// 7.Sorting and Reversing
let digits = [4,2,1,3];
digits.sort();
console.log(digits);
digits.reverse();
console.log(digits);

// 8.Transforming(Higher Order Functions)
// 1.map()
let arr = [1,2,3,4];
let double = arr.map(x => x*2);
console.log(double);

// 2. filter()
let even = arr.filter( x => x % 2 === 0);
console.log(even);

// 3.reduce()
let sum = arr.reduce((a, b) => a + b, 0);
console.log(sum);


// 9.Iteration
let names = ["John", "Jane", "Doe"];
names.forEach(n => console.log(n));

// 10. Converting and Joining
let words = ["Hello", "World"];
console.log(words.join(" "));
console.log(words.toString());

// 11. Flattening
let nested = [1,[2,[3,4]]];
console.log(nested.flat(2));

//12. Finding Elements
let scores = [50, 70, 90, 100];
console.log(scores.find(x => x > 80));
console.log(scores.findIndex(x => x > 80));

// 13. Fill 
let fillArr = [1,2,3,4];
fillArr.fill(0,1,3);
console.log(fillArr);