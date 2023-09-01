/*
11. Escribir una función que reciba un String y devuelva la palabra más larga.
                String Ejemplo: “Guia de JavaScript”
                Resultado esperado : “JavaScript”
*/

function ArrayFrase(frase) {
    return frase.split(" ");
}

function general() {
    let cantidad;
    let palabraLarga;

    var frase = prompt('Ingrese una frase');
    var arrayPalabras = ArrayFrase(frase,separador); // tiene las palabras de las frases en posiciones
    
    for (let i = 0; i < arrayPalabras.length; i++) {
        if (isNaN(cantidad)) {
            palabraLarga = arrayPalabras[i];
            cantidad = arrayPalabras[i].length;
        } else if (cantidad< arrayPalabras[i].length) {
            palabraLarga = arrayPalabras[i];
            cantidad = arrayPalabras[i].length;
        }
    }
    console.log("La palabra mas lasrga es " + palabraLarga + " y tiene " + palabraLarga.length + " caracter(es)");
}


general();