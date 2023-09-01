// funciones anonimas
function coolName(nombre = "X") {
    return `..*-${nombre}-*..`;
}

let mensaje = coolName(); // si esta vacio observar que "X" es el valor por defecto en caso de no pasarle nada
console.log(mensaje);

/*******************/

let coolName2 = function (nombre = "X") { // function es una variable anonima  Y!! coolName es te typeoff function
    return `..*-${nombre}-*..`;
}
console.log(mensaje);

let superCoolName = function (f, nombre) {
    return `##-${f(nombre)}-##)`;
}

let mensaje2 = superCoolName(coolName,"jona");
console.log(mensaje2);

// funcion flecha forEACH

let mascotas = ["gato", "perro", "saurio"];
mascotas.forEach(e => {console.log(e);});

// funcion break y continue
for (let i = 0; i <10; i++){
    if (i==5){
        console.log(i);
        break;
    }
    console.log("Estamos por la vuelta " + i);
}

for (let i = 0; i < 10; i++) {
    if(i == 5){
    continue;
    }
    console.log("Estamos por la vuelta " + i); // esta linea en la 5 salta es decir saltea toda.. la iteracion en esa vuelta
    }


    exterior: for (let i = 0; i < 10; i++) {
        for (let j = 0; j < 10; j++) {
        if(i == 4 && j == 4){
        console.log("Vamos a cortar ambos for");
        break exterior;
        }
        console.log(i+j+10*i);
        }}


// Arrays 
let array = [2,5,9];
array.forEach(function (elemento,indice, casco) {
  console.log("a["+indice+"] = " + elemento);
});


// for of
let frutas = ["Manzana", "Naranja", "Uva"];
for(let fruta of frutas){
console.log(fruta); // ["Manzana", "Naranja", "Uva"];
}

// for in
var empleado = new empleado {"nombre :" juan, ""}
for (let empleado of empleados){
    for(let dato in empleado){
    console.log(empleado[dato]);
    }
    }


// OBJETOS

function empleado(nombre,dni){
    this.nombre = nombre;
    this.dni = dni;
}

var empleado1 = new empleado('paco',28777225);
var empleado2 = new empleado('chicharo',28777225);
var empleado3 = new empleado('lorenzo',28777225);

var empleados = new Array();
var empleados2 = [];

empleados.push(empleado1,empleado2,empleado3);

empleados.forEach(e => {console.log(e);}); // se puede acceder a e.dni... etc...


delete empleados[1];

empleados.forEach(element => { console.log(e)});
