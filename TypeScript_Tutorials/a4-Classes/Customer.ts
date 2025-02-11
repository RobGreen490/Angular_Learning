//dir shows the folder contents
//cd allows you to access folders in the terminal
//type tsc filename.ts
//type node filename.js
//type tsc --noEmitOnError filename.ts to avoid generating .js files with compilation errors

export { }; // This makes the file a module on it's own (not associated with other files within the folder)

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
    constructor(private _firstName: string, private _lastName: string){}

    //Use get keyword to set up get method
    public get firstName(): string {
        return this._firstName;
    }
    //Use set keyword to set up get method
    public set firstName(value: string) {
        this._firstName = value;
    }

    public get lastName(): string {
        return this._lastName;
    }
    public set lastName(value: string) {
        this._lastName = value;
    }
}

let myCustomer = new Customer("bob", "Ranch");
console.log(`Hello ${myCustomer.firstName} ${myCustomer.lastName}`);