/*
9. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento de la función Substring().
*/


document.getElementById("btn").onclick = separarPalabra;


function separarPalabra(){
    const frase = document.getElementById("texto").value;
    let NuevaFrase = "";
    for (let i = 0; i < frase.length; i++) {
        NuevaFrase = NuevaFrase + frase.substring(i,i+1) + " ";
    }
    document.getElementById("respuesta").innerHTML = NuevaFrase;
}











/*





var space = (texto) => {
   return texto+" ";
}

function general() {
        var textoEspaciado= "";
        //var texto = prompt('Ingrese un texto');
        let texto = "Hola Manola";
        for (let i = 0; i < texto.length; i++) {
            textoEspaciado += space(texto.substring(i,i+1))
            texto
        }
        console.log(textoEspaciado);
}
general();


let texto3 = "Hola Manola";

// split('')  convierte la cadena en un array de caracteres.
// join(' ')  une los elementos del array con un espacio vacío entre ellos
let agregar = (str) => {
    return str.split('').join('-');
}

let fraseEspacios = agregar(texto3);
console.log(fraseEspacios);




// Hola Manola -> H-o-l-a M-a-n-o-l-a



let arrayTexto3 = texto3.split(" "); // [Hola] [Manola]


let arrayTexto = (varArray) => {
    for (let i = 0; i < varArray.length; i++) {
        varArray[i] = varArray[i].split("").join("-");
    }
    return varArray.join(" ");
}

arrayTexto3 = arrayTexto(arrayTexto3);

console.log(arrayTexto3);
*/