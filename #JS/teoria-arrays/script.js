var personajes = new Array({nombre: "pepe", apellido: "gomez"},{nombre: "paco", apellido: "Losla"},{nombre: "Juan", apellido: "Velazquez"});
var numeros = [1,2,3,4,5,6,7]; // otra manera
console.log(personajes);

personajes.reverse(); // cambia el orden, afecta directamente

personajes.forEach((e) =>console.log(e)); // forEach necesita una funcion .. en este caso flecha que itera y muestra e...
personajes.forEach((e) =>console.log(e.apellido));
personajes.forEach((e) =>console.log(`Mi nombre es ${e.nombre} ${e.apellido}`));

personajes.filter((e)=>{
    if (e.apellido.length>6){
        return e;
    }
});

personajes.filter(function(e) {
    if(e.nombre !== "pepe"){
        return e;
    }
});

numeros.map((e) => e*10); // modifica el valor de los elementos 10 , 20 .....

/* SET */
// "Filtrado de numero repetidos"
var numerosRepetidos = [1,2,2,3,4,4,4,5,5,6,7]; // otra manera
var setNumeros = new Set(numerosRepetidos); // salida por console.log Set(7) [ 1, 2, 3, 4, 5, 6, 7 ]


"aaaaasssssdddd".length; // por ejemplo tira la cantidad de letras...
"aaaaasssssdddd".split(""); // separa letra por letra.(Salida Array de string).. ver que tambien se puede hacer por variable 
var letrasRepetidas = new Set("aaaaasssssdddd".split("")); // salida Set(3) [ "a", "s", "d" ]

/* MAPA */
var mapa = new Map();
mapa.set(1,"Agustin"); // (key,"Value");
mapa.set(2,"Jona"); // (key,"Value");
mapa.set(3,"Lorenz"); // (key,"Value");