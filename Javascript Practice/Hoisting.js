console.log(a);
var a = 10;
console.log(a);



// console.log(z);
// let z = 10;
// console.log(z);

//Function hoisting

//function declaration
add();
function add() {
    var a = 10;
    var b = 20;
    console.log(a + b);
}