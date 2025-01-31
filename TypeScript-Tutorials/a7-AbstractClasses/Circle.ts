import {Shape} from './Shape';
export class Circle extends Shape{
    constructor(shape: string, _x: number, _y: number, private _radius: number){
        super(shape, _x, _y);
    }

    getInfo(): string{
        return super.getInfo() + `, radius=${this._radius}`;
    }

    calculateArea(): number{
        //pi * r^2
        return Math.PI * Math.pow(this._radius, 2);
    }
}