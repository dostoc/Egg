const ejeNro = "Ejercicio 1"
const enunciado =
"1) Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario."


window.onload = contWeb;


function contWeb(){
    document.getElementById("ejeNro").innerHTML = ejeNro;
    document.getElementById("p1").innerHTML = enunciado;
    document.getElementById("conslta").innerHTML = "Ingrese como esta el clima";
    document.getElementById("btn").onclick = clima;
    
}

let clima = () => {
    let inputEjemplo = document.getElementById("inputEjemplo").value;
    if(inputEjemplo !== ""){
        document.getElementById("respuesta").innerHTML = `El clima es ${inputEjemplo}`;
        
    }else {
        document.getElementById("respuesta").innerHTML = `no ingerso valor`;

    }
}


