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

