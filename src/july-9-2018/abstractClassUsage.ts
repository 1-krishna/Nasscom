abstract class Department{
    name;

    constructor(name:string){
        this.name = name;
    }
    printName():void{
        console.log("Depart Name " + this.name);
        
    }

    abstract sayHello():void;
}

class ChildClass extends Department{
    sayHello(){
        console.log("Hello " + this.name);   
    }

    constructor(name:string){
        super(name);
    }
}

var child:ChildClass = new ChildClass("krishna");

child.sayHello();
child.printName();