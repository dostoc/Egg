/*
7. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
*/

function numeroCorrecto(numero) {
    let aux = numero;
    numero = parseFloat(numero);
    if (isNaN(numero)) {
        throw alert(aux + ' no es un numero');
    } else {
        return numero;
    }
}

function general() {
    let numero = 0;
    var base = numeroCorrecto(prompt('Ingrese Base numerica positiva'));
    if (base > 0) {
        console.log('BASE: ' + base);
        do {
            numero += numeroCorrecto(prompt('Ingrese numero'));
            console.log("Suma = " + numero);
        } while (base > numero);
    } else { console.log("ERROR: Valor negativo") }
}

general();