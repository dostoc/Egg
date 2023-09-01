/*
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ejercicio 3</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <div class = "contenedor">
    <h1 id="ejeNro"></h1>
    <p id="p1"></p>

    <ul>
        <li id="consigna" ></li>
        <li><input id="inputDato1" type="text" placeholder="Nombre..." ></li>
        <li><input id="inputDato2" type="text" placeholder="Edad..." ></li>
        <li><button id="btn" type="submit">Enviar</button></li>
        <li><p id="respuesta"></p></li>
    </ul>

    <script src="script.js"></script>
  </div>
  </body>
</html>
*/

const ejeNro = "Ejercicio 3";

const enunciado =
" 3. Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje indicándolo.";

window.onload = contWeb;


function contWeb(){
    document.getElementById("ejeNro").innerHTML = ejeNro;
    document.getElementById("p1").innerHTML = enunciado;
    document.getElementById("consigna").innerHTML = "Indique nombre y edad";
    document.getElementById("btn").onclick = general;
     
}

function general(){
}


function usuario(){
    const nombre = document.getElementById("inputDato1").value;
    let edad = parseInt(document.getElementById("inputDato2").value);
    let mayor;
    if(edad>=18){
        mayor = "MAYOR";
    } else {
        mayor = "MENOR";
    }
    console.log(edad);
    document.getElementById("respuesta").innerHTML = `El usuario: ${nombre} es ${mayor}`;
}