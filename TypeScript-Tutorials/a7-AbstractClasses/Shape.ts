//To create the .js files, type tsc
//To run the .js files that were created, type node Driver

export abstract class Shape{
    constructor(private _shape: string, private _x: number, private _y: number){}

    getInfo(): string{
        return `${this._shape}: x=${this._x}, y=${this._y}`
    }

    abstract calculateArea(): number;
}