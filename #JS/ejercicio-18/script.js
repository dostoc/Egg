/*
18. A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:

a) Determinar cual de los dos elementos de texto es mayor

b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
operadores necesarios para obtener un resultado true y otro resultado false

c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
dos elementos numéricos

*/

var contarLetras = (palabra) => palabra.split("").length;
var palabras = (valores) => `1) ${valores[3]} = ${contarLetras(valores[3])}
2) ${valores[4]} = ${contarLetras(valores[4])}`;

var logicoTrue = (valores) => valores[0] || valores[2];
var logicoFalse = (valores) => valores[0] && valores[2];

var sumar = (valores) => valores[1] + valores[5];
var restar = (valores) => valores[1] - valores[5];
var multiplicar = (valores) => valores[1] * valores[5];
var dividir = (valores) => valores[1] / valores[5];

function general() {
    var valores = [true, 5, false, "hola", "adios", 2];

    console.log(palabras(valores));
    console.log("True: " + logicoTrue(valores));
    console.log("False: " + logicoFalse(valores));
    console.log("suma: " + sumar(valores));
    console.log("resta: " + restar(valores));
    console.log("multiplicacion: " + multiplicar(valores));
    console.log("division: " + dividir(valores));
}

general();



