function resolver3seg(){
    return new Promise(function(resolve,reject){
        setTimeout(()=> {
            resolve("2 Hola, perdon por la demora")
        } ,3000)

    }); // necesita recibir una funcion
}

// Estados syncronicos (pendiente rechazada resuelta)

async function saludo(){
    const respuesta = await resolver3seg();
    console.log(respuesta);
}

function comprar(){
    console.log("Compre las naranjas");
}

console.log("1 Esto es un saludo");

saludo();

console.log("2 Estoy o estaba ansioso por la respuesta");



