//the ./ means the Customer file is in the same directory(folder)
import{Customer} from './Customer'

let myCustomer = new Customer("Martin", "Dixon");

console.log(`Hello ${myCustomer.firstName} ${myCustomer.lastName}!`);