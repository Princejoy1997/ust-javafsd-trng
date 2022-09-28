function add(n1,n2){
    var sum=n1+n2
    console.log("The sum of the values entered "+sum);
}
add(12,13);

function show(num1,num2=200){
    console.log("num1 = "+num1);
    console.log("num2 = "+num2);
}
show(100);

function show(a,...args){
    console.log(a+" "+args);
}
show(50,60,70,80,90,100);