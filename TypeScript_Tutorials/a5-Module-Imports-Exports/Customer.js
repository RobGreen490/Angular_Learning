"use strict";
//dir shows the folder contents
//cd allows you to access folders in the terminal
//type tsc filename.ts
//type node filename.js
Object.defineProperty(exports, "__esModule", { value: true });
exports.Customer = void 0;
//export allows us to send this class to a different file
class Customer {
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
exports.Customer = Customer;
