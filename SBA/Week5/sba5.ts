class Employee{
    name1:string;
    empid:number;
    constructor(name1:string,empid:number){
        this.name1=name1;
        this.empid=empid;

    }
    display(){
        console.log("Name:", this.name1);
        console.log("Empid:",this.empid);
    }
}
var obj2=new Array(new Employee("Amal",233120),new Employee("Binu",233121),new Employee("Dona",233122),new Employee("Krishna",233123));
for(var i=0;i<obj2.length;i++){
    console.log("Details of Employee No:",i+1);
    obj2[i].display();
}