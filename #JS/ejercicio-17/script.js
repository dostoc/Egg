/*
17. Realizar un programa que elimine los dos últimos elementos de un array.
Mostrar el resultado
*/

var NumRandom = (max) => Math.floor(Math.random()* max);

var Remover = (arraAux) => arraAux.pop();

function general(){
    var array1 = new Array();
    var array2 = new Array();
    let max = 10;
    for (let i = 0; i < 5; i++) {
        array1.push(NumRandom(max));
        array2.push(NumRandom(max));
    }
    console.log(array1);
    console.log(array2);
      
    Remover(array1);
    Remover(array2);
		
    console.log(array1);
    console.log(array2);
}

general();



