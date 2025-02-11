//dir shows the folder contents
//cd allows you to access folders in the terminal
//type tsc filename.ts
//type node filename.js

export {}; // This makes the file a module on it's own (not associated with other files within the folder)

let found: boolean = true;
let grade: number = 88.6;
let firstName: string = "Robert";
let lastName: string = "Green";

console.log(found);
console.log("The grade is: " + grade);
console.log("Hi " + firstName + " " + lastName);
console.log(`Hi ${firstName} ${lastName}`);

