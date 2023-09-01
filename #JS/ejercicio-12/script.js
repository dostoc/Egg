/*
12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de
dato
*/


/*
function tipoDato(argumento) {
    return (typeof argumento);
}
*/

let tipoDato = aux => typeof aux;

function general() {
    var argumento = 123; // Ojo! el promp siempre devuelve sting por eso no se toma por teclado
    console.log(tipoDato(argumento));

}


general();