"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Circle = void 0;
const Shape_1 = require("./Shape");
class Circle extends Shape_1.Shape {
    constructor(shape, _x, _y, _radius) {
        super(shape, _x, _y);
        this._radius = _radius;
    }
    getInfo() {
        return super.getInfo() + `, radius=${this._radius}`;
    }
    calculateArea() {
        //pi * r^2
        return Math.PI * Math.pow(this._radius, 2);
    }
}
exports.Circle = Circle;
