import { Shape } from "./Shape";

export class Rectangle extends Shape{
    constructor(shape: string, _x: number, _y: number, private _width: number, private _length: number){
        super(shape, _x, _y);
    }

    getInfo(): string{
        return super.getInfo() + `, width=${this._width}, length=${this._length}`;
    }

    calculateArea(): number {
        return this._width * this._length;
    }
}