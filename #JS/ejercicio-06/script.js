

/*
6. Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.

*/


function verificarParidad(numero){
    return (numero % 2=== 0);
}

function general(){
    try {
        numero = parseFloat(prompt('Ingrese un numero entero'));
        if (typeof numero != "number" ){
            throw alert('no es un numero');
        }
        if (numero%1 !=0 ){
            throw alert('no es un entero');
        }
        if (numero === 0) {
            alert('No es ni par ni impar');
        } else if (verificarParidad(numero)===2){
            console.log("PAR");
        } else {
            console.log("Impar");
        }
        
    } catch (error) {
        throw error;
    }
}

general();