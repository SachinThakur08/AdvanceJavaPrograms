var Dscore1 = prompt("Enter the Score1 Of Dolphins");
var Kscore1 = prompt("Enter the Score1 Of Koalas");
var Dscore2 = prompt("Enter the Score2 Of Dolphins");
var Kscore2 = prompt("Enter the Score2 Of Koalas");
var Dscore3 = prompt("Enter the Score3 Of Dolphins");
var Kscore3 = prompt("Enter the Score3 Of Koalas");

const ScoreDol = (Dscore1+Dscore2+Dscore3)/3;
const ScoreKoa = (Kscore1+Kscore2+Kscore3)/3;

if(ScoreDol>ScoreKoa){
	console.log("Dolphins Win the Competetion");
}
else if(ScoreKoa>ScoreDol){
	console.log("Koalas Win the Competetion");
}
else
{
	console.log("Both Wins The Competetion")
}
