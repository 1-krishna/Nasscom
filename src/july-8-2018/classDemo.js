var Person = /** @class */ (function () {
    function Person(first_name, last_name, age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
    Person.prototype.greet = function () {
        console.log("Hello " + this.first_name);
    };
    Person.prototype.ageInYears = function (years) {
        console.log("Age Returned");
        return this.age + years;
    };
    return Person;
}());
var p = new Person("Krishna", "Mohan", 47);
p.greet();
