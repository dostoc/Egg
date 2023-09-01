/*
8. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos.
*/

function numeroCorrecto(numero) {
    let aux = numero;
    numero = parseFloat(numero);
    if (isNaN(numero)) {
        throw new Error(aux + ' no es un numero');
    }
    if (numero % 1 !== 0) {
        throw new Error(aux + ' no es un entero');
    }
    return numero;

}

function general() {
    const stop = 0;
    let auxMax, auxMin, aux;
    do {
        try {
            aux = numeroCorrecto(prompt('Ingrese numero'));
            if (aux != 0) {
                if (isNaN(auxMax)) { auxMax = aux; }
                if (isNaN(auxMin)) { auxMin = aux; }
                if (auxMax < aux) { auxMax = aux; }
                if (auxMin > aux) { auxMin = aux; }
            }

        } catch (error) {
            alert(error.message);
        }

    } while (aux !== 0);
    console.log(`Numero minimo ${auxMin} // Numero maximo ${auxMax}`);
}
general();