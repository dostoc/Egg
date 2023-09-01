/*
23. Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
amarillo, por ejemplo)
*/

function enviarContenido() {
    let contenido = document.getElementById("input-contenido").value;
    document.getElementById("resultado").innerHTML = obtenerContenido(contenido);
}

function obtenerContenido(contenido) {
    // let tipo = parseInt(contenido); // si se ingresa un numero y a continuacion una letra funciona igual pero deja de convertir en la letra... ej 500a  = 500
    let regex = /^\d+$/; // ver notas!
    if (regex.test(contenido)) {
        return "number";
    } else {
        return "string";
    }
}

/* VER ESTO 
La expresión regular  ^\d+$  tiene el siguiente significado: 
 
-  ^  indica el inicio de la cadena. 
-  \d  representa cualquier dígito numérico del 0 al 9. 
-  +  indica que el dígito anterior puede aparecer una o más veces. 
-  $  indica el final de la cadena. 
 
En resumen, esta expresión regular verifica si una cadena consiste únicamente en dígitos numéricos. Si la cadena cumple con este patrón, se considera un número válido.

La barra inicial "/" se utiliza comúnmente para indicar el inicio de un comando o una ruta en muchos contextos, como en los comandos de línea de comandos, las rutas de archivos en sistemas operativos, las rutas URL en navegadores web, entre otros. 
 
Por ejemplo, en una ruta URL, la barra inicial "/" se utiliza para indicar el inicio de la ruta en relación con el dominio. Por ejemplo, en "https://www.example.com/ruta", la barra inicial "/" indica que la ruta comienza después del dominio "www.example.com". 
 
En el contexto de los comandos de chatbots o asistentes virtuales, la barra inicial "/" también puede utilizarse para indicar el inicio de un comando o una acción específica que el chatbot puede reconocer y responder de manera especial. 
 
Es importante tener en cuenta que el significado y el uso de la barra inicial "/" pueden variar dependiendo del contexto en el que se utilice.

*/

const itemId = document.getElementById("1"); // Debe traer 1 elemento ID...

const itemsClass = document.getElementsByClassName("item"); // trae un arrae de elementos por clase ordenados de la forma en que lo encuentra
const itemsTag = document.getElementsByTagName("h1"); // mismo que lo anterior <h1> todos los h1 </h1>
const itemsTag2 = document.h1;
