var num;
num=[2,4,6,8];
console.log(num[0]);
console.log(num[1]);

var num=new Array(1,2,3,4,5);
var i;
for(i=0;i<num.length;i++){
    console.log(num[i]);
}

var rainbow=new Array("Violet","Indigo","Blue","Green","Yellow","Orange","Red");
function show(rainbow){
    for(var i=0;i<rainbow.length;i++){
        console.log(rainbow[i]);
    }
}
show(rainbow);