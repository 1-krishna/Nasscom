function greeter(person :string){
    return "Hello " + person;
}

let user:string = "Krishna";
console.log(greeter(user));
document.body.innerHTML = greeter(user);