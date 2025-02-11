//dir shows the folder contents
//cd allows you to access folders in the terminal
//type tsc filename.ts
//type node filename.js


export {}; // This makes the file a module on it's own (not associated with other files within the folder)

//for loops
let reviews: number[] = [5, 5, 4, 2.5, 3];
let total: number = 0;
for(let i = 0; i < reviews.length; i++){
    console.log(reviews[i]);
    total+= reviews[i];
}
let average: number = total / reviews.length;
console.log(`Review average: ${average}`);

//simplified for loop syntax
let sports: string[] = ["Golf", "Cricket", "Tennis", "Swimming"];
sports.push("Baseball");
sports.push("Football");
for(let sport of sports){
    if(sport == "Swimming")
        console.log(`My favorite is: ${sport}`);
    else
        console.log(sport);
}