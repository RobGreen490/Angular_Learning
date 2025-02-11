//You may have to switch to MS Command Prompt to avoid powershells execution policy issues. To do this:
    //1. Open a terminal
    //2. Select the drop-down arrow on the right side of the terminal tab and select Command Prompt (CMD).

//In the terminal, **type tsc HelloWorld.ts ** to transpile this code so our browser can understand and use the file/run this program.
//After running tsc filename, **type node HelloWorld.js ** to run the new generated file.
export {}; // This makes the file a module on it's own (not associated with other files within the folder)

console.log("Hello World!");


//assigning variables
let found: boolean = true;
let grade: number = 88.6;
let integer: number = 1;
let firstName: string = "Robert";
let myData1: any = 50;
let myData2: any = true;
let myData3: any = "Robert";

console.log(found);
console.log("The grade is: " +grade);
console.log("Hi " + firstName);

console.log(`Hi ${firstName}.`);