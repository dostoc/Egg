let titulos =  document.getElementsByName("titulo");
let pes = document.getElementsByTagName("P");
let input = document.getElementById("123");
let boton = document.getElementById("btn");

boton.onclick = function () { // poner boton es lo mismo que repetir la linea 4 document.get..
    // Cuando se requiere hacer varias cosas al accionar el botton
    // se implenta una funcion anonima que dispara una cadena de funciones

    // recorre todos los titulos de nombre titulo ver html <h1 name="titulo">....
    titulos.forEach(e => {   // lo podemos interpretar como un array (titulos...)
        e.style.color = "red";
    });

    // entender que cuando hace un recorrido de titulos son todos los titulos del document, ver linea 1
    titulos.forEach(e => {
        e.hidden = !e.hidden; // invierte el valor hidden false= muestra  - true = oculta

    });

    // recorre todos los parrafos tag (P) y los reemplaza por "Egg" <p>.... no lo podemos interpretar como array por eso no se usa forEach
    for (const e of pes) {
        e.innerHTML = "Egg";
    }

    input.value = "Chiquito";
}

input.onkeydown = function (){ // esto se activa cada vez que se preciona una tecla
    if(input.value.length > 10) input.value = "chiquito"; 
}


