const prompt = require('prompt-sync')();

let number = prompt("Enter a number : ");

if(number % 2 == 0){
    console.log("It is even");
}
else{
    console.log("It is odd");
}