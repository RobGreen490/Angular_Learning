"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
//the ./ means the Customer file is in the same directory(folder)
const Customer_1 = require("./Customer");
let myCustomer = new Customer_1.Customer("Martin", "Dixon");
console.log(`Hello ${myCustomer.firstName} ${myCustomer.lastName}!`);
