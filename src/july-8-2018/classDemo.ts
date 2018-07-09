class Person{
    first_name:string;
    last_name:string;
    age:number;

    constructor(first_name:string, last_name:string, age:number){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    greet(){
        console.log("Hello " + this.first_name);
    }
    ageInYears(years:number):number{
        console.log("Age Returned");
        return this.age + years;
    }

}

var p:Person = new Person("Krishna", "Mohan", 47);
p.greet();