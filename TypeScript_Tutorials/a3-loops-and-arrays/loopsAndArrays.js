"use strict";
//dir shows the folder contents
//cd allows you to access folders in the terminal
//type tsc filename.ts
//type node filename.js
Object.defineProperty(exports, "__esModule", { value: true });
//for loops
let reviews = [5, 5, 4, 2.5, 3];
let total = 0;
for (let i = 0; i < reviews.length; i++) {
    console.log(reviews[i]);
    total += reviews[i];
}
let average = total / reviews.length;
console.log(`Review average: ${average}`);
//simplified for loop syntax
let sports = ["Golf", "Cricket", "Tennis", "Swimming"];
sports.push("Baseball");
sports.push("Football");
for (let sport of sports) {
    if (sport == "Swimming")
        console.log(`My favorite is: ${sport}`);
    else
        console.log(sport);
}
