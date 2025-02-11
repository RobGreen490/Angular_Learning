"use strict";
//To create the .js files, type tsc
//To run the .js files that were created, type node Driver
Object.defineProperty(exports, "__esModule", { value: true });
const Circle_1 = require("./Circle");
const Rectangle_1 = require("./Rectangle");
//we cannot create an object from an abstract class
//let myShape = new Shape(10, 15);
//console.log(myShape.getInfo());
let myCircle = new Circle_1.Circle("Circle", 5, 10, 20);
console.log(myCircle.getInfo());
let myRectangle = new Rectangle_1.Rectangle("Rectangle", 0, 0, 3, 7);
console.log(myRectangle.getInfo());
console.log();
let theShapes = [];
theShapes.push(myCircle);
theShapes.push(myRectangle);
for (let currentShape of theShapes) {
    console.log(currentShape.getInfo());
    console.log("Area=" + currentShape.calculateArea());
    console.log();
}
