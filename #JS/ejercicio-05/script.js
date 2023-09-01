const ejeNro = "Ejercicio 5";

const enunciado = "5. Construir un programa que simule un menú de opciones para realizar las cuatro operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores numéricos enteros. El usuario, además, debe especificar la operación con el primer carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’ o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.";

window.onload = contWeb;



function contWeb() {
    document.getElementById("ejeNro").innerHTML = ejeNro;
    document.getElementById("p1").innerHTML = enunciado;
    document.getElementById("consigna").innerHTML = "Seleccion Calculo";
    calculos();
}

function calculos() {
        document.getElementById('btn-sum').onclick = suma
        document.getElementById('btn-res').onclick = resta
        document.getElementById('btn-mul').onclick = multiplicar
        document.getElementById('btn-div').onclick = dividir
        
}

// crea un array de dos valores



function valoresEntrada(){
    let numA = parseFloat(document.getElementById('inputDato1').value);
    let numB = parseFloat(document.getElementById('inputDato2').value);
    return [numA,numB];
}

/*
Desectruturacion de array

const array = [1, 2];
const [a, b, c = 0] = array;

console.log(a); // 1
console.log(b); // 2
console.log(c); // 0 (valor predeterminado)

*/

function suma(){
    let [numA,numB] = valoresEntrada();
    document.getElementById('respuesta').innerHTML = `(+) = ${numA + numB}`;
}
function resta(){
    let [numA,numB] = valoresEntrada();
    document.getElementById('respuesta').innerHTML = `(-) = ${numA - numB}`;
}
function multiplicar(){
    let [numA,numB] = valoresEntrada();
    document.getElementById('respuesta').innerHTML = `(*) = ${numA * numB}`;
}
function dividir(){
    let [numA,numB] = valoresEntrada();
    
    if (numB == 0) {
        document.getElementById('respuesta').innerHTML = `ERROR`;
    } else {
        
        document.getElementById('respuesta').innerHTML = `(/) = ${(numA / numB).toFixed(4)}`;
    }
}

