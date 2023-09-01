/*

let texto1 = "Hola";
let texto2 = "Manola";

// split(#criterio)  divide el array con espacios nulos( letra a letra )
let arrayTexto1 = [texto1.split("")];
let arrayTexto2 = [texto2.split("")];

// concat() Concatena los dos arrays como elementos [0]txt1 [1]txt2 ....
let arrayConcatenado2 = (arrayTexto1.concat(arrayTexto2));


// Join() Une los arrays en uno solo
let arrayConcatenado = (arrayTexto1.concat(arrayTexto2)).join();
console.log(arrayTexto1.join());

console.log(arrayConcatenado);

// Ejemplo vamos a separar una frase poniendo un espacio entre los caracteres
let ejem1 = "Hola Manola como le va";
let arrayEjem1 = [ejem1.split("")]; // convertimos a array
let ejem1Concat = arrayEjem1.join(""); // une los elementos de un array (notar que los separa con ,)
console.log(ejem1Concat);

//charAt(indice) 
console.log(ejem1.charAt(1));


// indexOf(carácter,desde)
console.log(ejem1.indexOf("a",5));

// Replace(), modifica el primer elemento
console.log(ejem1Concat.replace(",","")); // borra la primera coma
console.log(ejem1Concat.replace(/,/g,"")); // repite la busqueda por todo el string /g/ dice bandera global...

*/

// Hola Manola -> H-o-l-a M-a-n-o-l-a


let texto3 = "Hola Manola";
let arrayTexto3 = texto3.split(" "); // [Hola] [Manola]


let arrayTexto = (varArray) => {
    for (let i = 0; i < varArray.length; i++) {
        varArray[i] = varArray[i].split("").join("-");
    }
    return varArray;
}

arrayTexto3 = arrayTexto(arrayTexto3);

console.log(arrayTexto3);
