const ejeNro = "Ejercicio 4";

const enunciado =
" 4. Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.. Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje indicándolo.";

window.onload = contWeb;


function contWeb(){
    document.getElementById("ejeNro").innerHTML = ejeNro;
    document.getElementById("p1").innerHTML = enunciado;
    document.getElementById("consigna").innerHTML = "Ingrese S o N";
    document.getElementById("btn").onclick = general;
     
}

function general(){
    let respuesta = (document.getElementById("inputDato1").value).toUpperCase();
    let validacion;
    if(respuesta == "S" || respuesta == "N") {
        validacion = "Correcta";
    } else {
        validacion = "Incorrecta";
    }
    document.getElementById("respuesta").innerHTML = `Respuesta ${validacion}`;
}
