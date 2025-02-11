//dir shows the folder contents
//cd allows you to access folders in the terminal
//type tsc filename.ts
//type node filename.js

//export allows us to send this class to a different file
export class Customer {

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