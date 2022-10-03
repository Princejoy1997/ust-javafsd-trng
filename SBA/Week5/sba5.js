var Employee = /** @class */ (function () {
    function Employee(name1, empid) {
        this.name1 = name1;
        this.empid = empid;
    }
    Employee.prototype.display = function () {
        console.log("Name:", this.name1);
        console.log("Empid:", this.empid);
    };
    return Employee;
}());
var obj2 = new Array(new Employee("Amal", 233120), new Employee("Binu", 233121), new Employee("Dona", 233122), new Employee("Krishna", 233123));
for (var i = 0; i < obj2.length; i++) {
    console.log("Details of Employee No:", i + 1);
    obj2[i].display();
}
