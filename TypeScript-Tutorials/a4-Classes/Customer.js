"use strict";
//dir shows the folder contents
//cd allows you to access folders in the terminal
//type tsc filename.ts
//type node filename.js
//type tsc --noEmitOnError filename.ts to avoid generating .js files with compilation errors
Object.defineProperty(exports, "__esModule", { value: true });
//public: means the class or variable is accessible to all classes (This is the default)
//protected: means the property is only accessible in current class and subclasses
//private: means property is only accessible in the current class
class Customer {
    //THIS IS THE OLD METHOD FOR CREATING A CONSTRUCTOR
    /*
    private _firstName: string;
    private _lastName: string;
    //You have to use the keyword constructor in typescript, you can't use the class name
    constructor(firstName: string, lastName: string) {
        this._firstName = firstName;
        this._lastName = lastName;
    }
    */
    //this is the new and improved way to create a constructor, less code!
    constructor(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    //Use get keyword to set up get method
    get firstName() {
        return this._firstName;
    }
    //Use set keyword to set up get method
    set firstName(value) {
        this._firstName = value;
    }
    get lastName() {
        return this._lastName;
    }
    set lastName(value) {
        this._lastName = value;
    }
}
let myCustomer = new Customer("bob", "Ranch");
console.log(`Hello ${myCustomer.firstName} ${myCustomer.lastName}`);
