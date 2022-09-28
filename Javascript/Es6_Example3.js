var x=100;
var y=200;
console.log(x+" "+y);

var $var12=200;

function example(){
    var $var12=300;
    console.log("Inside example() function = "+$var12);
}
console.log("Outside example() function = "+$var12);
example();