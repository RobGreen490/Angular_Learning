"use strict";
//To create the .js files, type tsc
//To run the .js files that were created, type node Driver
Object.defineProperty(exports, "__esModule", { value: true });
exports.Shape = void 0;
class Shape {
    constructor(_shape, _x, _y) {
        this._shape = _shape;
        this._x = _x;
        this._y = _y;
    }
    getInfo() {
        return `${this._shape}: x=${this._x}, y=${this._y}`;
    }
}
exports.Shape = Shape;
