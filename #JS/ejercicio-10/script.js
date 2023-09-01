/*
10. Escribir una función flecha que reciba una palabra y la devuelva al revés.
*/

/**********************************/
function suma(numA) {
    return numA + 100;
}

(numA) => { // se suprime funcion ()
    return numA + 100;
}

(a) => a + 100; // () se sacan los parentesis

// 3. Suprime los parentesis del argumento
a => a + 100;

/*********************************/


function inverirTxt(texto){
    let invertido = "";
    for (let i = texto.length ; i > 0; i--) {
        invertido += texto.substring(i-1,i);
    }
    return invertido;
}

function general() {
    var textoEspaciado= "";
    var textoInv =  inverirTxt(prompt('Ingrese un texto'));
    console.log(textoInv);
}

general();



/**********************/

var inverirTxt = (texto) => {
    let invertido = "";
    for (let i = texto.length ; i > 0; i--) {
        invertido += texto.substring(i-1,i);
    }
    return invertido;
}

var general = () =>  {
    var textoEspaciado= "";
    var textoInv =  inverirTxt(prompt('Ingrese un texto'));
    console.log(textoInv);
}

general();


