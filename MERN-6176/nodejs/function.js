// normal function 
function myFunc(name) {
    console.log("this is normal function", name);
}

myFunc("deep", "mohan", "dummer")

// arrow function
const myAFunction = (greet) => {
    console.log("hello", greet);
}

myAFunction("How are you !")


// var function
const square = function (x) {
    return x * x;
}

console.log(square(10));



console.log("----------callback---------");

function myCall(callback) {
    const name = "cul"
    console.log(callback(name));
}

myCall(myFunc)

