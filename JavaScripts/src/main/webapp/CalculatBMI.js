
var massR = prompt("Enter the Mass of Ratan ");
var heightR = prompt("Enter the Height of Ratan ");
var massA = prompt("Enter the Mass of Anu");
var heightA = prompt("Enter the Height of Anu ");

var BMIR , BMIA ;

BMIR = massR/(heightR*heightR) ;
BMIA = massA/(heightA*heightA) ;

console.log(BMIR);
console.log(BMIA);

document.write("BMI of Ratan = " + BMIR +"\n");
document.write("BMI of Anu = " + BMIA +"\n");


let HigherBMIR= true ;
console.log(HigherBMIR);
document.write("BMI of Ratanis Higher " + HigherBMIR +"\n");



