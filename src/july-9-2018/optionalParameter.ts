function optionalDisplay(name:string, email?:string){
    console.log(name);
    if(email!=undefined){
        console.log(email)
    }
}

//optionalDisplay("Krishna", "kmv@gmail.com");
optionalDisplay("Krishna");