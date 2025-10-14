// If Statement - A student is eligible for voting if age ≥ 18.

let age = 45;
if(age >= 18) {
    console.log("Student is eligible for Voting");
} else {
    console.log("Student is not eligible for Voting");
}
console.log("Thank You!!");


//If-Else Statement - Write a program to check if a number is positive or negative.
let a = 0;
if(a >=0) {
    console.log("Positive Number");
}
else {
    console.log("Negative number");
}



//If-Else Ladder- Check if a number is positive, negative, or zero.
let number = 77;
if(number > 0){
    console.log("Positive Number");
} else if(number < 0){
    console.log("Negative Number");
} else {
    console.log("Zero");
}



//Nested If - A student passes if marks ≥ 40. If marks ≥ 80, show “Distinction”.
let marks = 89;
if(marks >= 40){
    if(marks >= 80){
        console.log("Distinction");
    }
    else {
        console.log("Pass");
    } 
} else {
        console.log("Not Distinction");
    }


//Switch Case 1. Print the grade based on letter (A=Excellent, B=Good, C=Average, D=Poor).


let grade = 'H';
switch(grade) {
    case 'A':
        console.log("Excellent");
        break;
    case 'B':
        console.log("Good");
        break;
    case 'C':
        console.log("Average");
        break;
    case 'D':
        console.log("Poor");
        break;
    default:
        console.log("Invalid Grade");
}

//2. print the season based on months in the year (3,4,5 - summer) (11,12,1,2 - winter) (6,7,8,9 - rainy)
let month = 1;
switch(month) {
    case 11:
    case 12:
    case 1:
    case 2:
        console.log("winter");
        break;
   
    case 3:
    case 4:
    case 5:
        console.log("Summer");
        break;
    
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
        console.log("Rainy");
        break;
    default:
        console.log("Invalid Month");
}








//---------- Looping constructs ---------------------

//For Loop - Print the first 10 natural numbers.
console.log("Ten first Natural Numbers: ");
for(let i=1; i<10; i++){
   console.log(i);
}
 


//While Loop - Print numbers from 1 to 5 using while loop.
let i = 1;
while (i <= 5) {
    console.log(i);
    i++;
}
//check condition later increment 

//Do - while print first 5 multiples of 2.
let j = 1;
do{
    // console.log(j * 2);
    process.stdout.write((j*2) + " - ");
    j++;
} while(j <= 5);


//Do-While Loop: ATM machine: Keep asking PIN until the user enters 1234.
// let pin;
// do {
//     prompt("Enter PIN:");
//     pin = Number(pin); //pin = parseInt(prompt("Enter your pin"));
// } while(pin !== 1234);
// console.log("PIN correct. Access granted");


//For…of Loop - Print all fruits in a basket.

let fruits = ["apple","banana","cherry"];
console.log(fruits);
for(let fruit of fruits){
console.log(fruit);
}

//For…in - Print all student details from an object.
let student = {name : "John" , age : "22" , grade: "A"};
console.log(student);
for(let key in student){
    console.log(key + ": " + student[key]);
    console.log(key);
    console.log(student.name);
    console.log(student.age);
    console.log(student.grade);
}

//forEach Loop - Print the squares of all numbers in an array.
let numbers = [1,2,3,4,5];
numbers.forEach(num => console.log(num * num));









// ------------------ control flow modifiers------------------------

//Break Statement - Question: Stop printing when number reaches 3.
for(let i=1; i<=5; i++){
    if(i === 3){
        break;
    }
    console.log(i);
}

//Continue Statement -Question: Skip printing number 3.




