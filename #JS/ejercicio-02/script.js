window.onload = contWeb;

const enunciado = "2. Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para calcular el área y el perímetro se utilizan las siguientes fórmulas: area = PI * radio2 perimetro = 2 * PI * radio";


function contWeb() {
    document.getElementById("nroEjercicio").innerHTML = "Ejercicio 2";
    document.getElementById("p1").innerHTML = enunciado;
    document.getElementById("consigna").innerHTML = "Ingrese el radio de la circunferencia";
    document.getElementById("btn").onclick = calcuarCircunferencia;
}


function calcuarCircunferencia() {
    let radio = document.getElementById("inputDato").value;
    let respuesta;
    if (isNaN(radio) || radio <= 0) {
        respuesta = `Ingrese valor valido`;
        document.getElementById("respuesta").innerHTML = respuesta;
    } else {
        let area = Math.PI * Math.pow(radio, 2);
        let perimetro = Math.PI * radio * 2;
        respuesta = `<p>
                Superficie.: ${area.toFixed(2)} metros2 <br>
                Perimetro..: ${perimetro.toFixed(2)} metros
                </p>`
        document.getElementById("respuesta").innerHTML = respuesta;
    }
}


