function resolver3seg(){
    return new Promise(function(resolve,reject){      // Estados syncronicos (pendiente rechazada resuelta)
        setTimeout(()=> {  // demora en milisegundos setTimeout((..function..),3000)
            resolve("2 - Hola, perdon por la demora");
            reject("4 - ERROR ups");
        } ,3000);

    }); // necesita recibir una funcion
}

/* Esta puede ser una opcion async-await */

async function saludo(){ // funcion asincrona especificamos async especifica que es una funcion que especifica que hay elementos asyncronos
    const respuesta = await resolver3seg(); // await indica que este hay que esperar un resolve de la funcion resolver3segundos
    console.log(respuesta);
}

/* Promesa 2 estados resuelta - rechazada */
// them luego
// catch error
// finaly 
function saludo2(){
    resolver3seg()
    .then((e) => console.log(e))// luego que resolver3seg traiga su respuesa captura el mensaje de e y lo imprime (la fun. flecha)
                                //
    
    .catch((e) => console.error(e)); // para ver como funciona comentar linea 4
}



function comprar(){
    console.log("Compre las naranjas");
}

console.log("1- Esto es un saludo");

saludo2();

console.log("3 - Estoy o estaba ansioso por la respuesta");

