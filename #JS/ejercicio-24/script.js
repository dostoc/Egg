const ejeNro = "Ejercicio 24";

const enunciado =
    "24. Escribir un programa de JavaScript que a través de un formulario calcule el radio de un circulo y lo muestre en el HTML.";


window.onload = contWeb;


function contWeb() {
    document.getElementById("ejeNro").innerHTML = ejeNro;
    document.getElementById("p1").innerHTML = enunciado;
    document.getElementById("consigna").innerHTML = "Calculo de RADIO";
    document.getElementById("btn").onclick = general;
}

function general() {
    let diamentro = document.getElementById("inputDato0").value;
    let superficie = document.getElementById("inputDato1").value;
    let perimetro = document.getElementById("inputDato2").value;
    let datosCircu = [diamentro,superficie,perimetro];
    
    borrar();

    calcularSuperficie(datosCircu);
}

function borrar(){
    document.getElementById("inputDato0").value = "";
    document.getElementById("inputDato1").value = ""; 
    document.getElementById("inputDato2").value = "";
}

function calcularSuperficie(datosCircu){
    let radio;
    for (let index = 0; index < datosCircu.length; index++) {
        if(datosCircu[0] != 0){
            radio =  datosCircu[0]/2;
        }
        if(datosCircu[1] != 0){
            radio = Math.sqrt((datosCircu[1]/Math.PI));
        }
        if(datosCircu[2] != 0){
            radio = (datosCircu[2]/(Math.PI*2));
        }
    }
    document.getElementById("respuesta").innerHTML = `RADIO: ${radio}`;
}



