var numeros = [1,2,3,4,5,6,7,8];
console.log(numeros[0]);

var personas = [
    {nombre: "Agus",
    apellido: "Sosa",},
    {nombre:"jona",
    apellido: "Casas"},,
    {nombre:"cocolata",
    apellido: "Farias",},
];

console.log(personas[1]);

personas.reverse();

personas.forEach((e)=>console.log(e.nombre));

personas.forEach((e)=>console.log(e.nombre + " Persona"));

/* filter no modifica el orden*/
numeros.filter((e) => e%2==0 );

/* pero se puede agregar a otra variable */

numeros = numeros.filter((e) => e%2==0 );

numeros.map((e) => e*3);
/* lo mismo para filtros*/
numeros= numeros.map((e) => e*3);

personas.filter(
    function(e) {
        if(e.nombre !== "jona"){
            return e;
        }
    }
);
/* Otra manera de crear array....*/
var numArray = new Array(1,1,2,2,3,3,4,4,5,5,6,6,7,7);

/* Se pede filtrar o utlizar un Set ** recordar que no permite duplicados */
new Set(numArray);

/* la funcion split permite dividir un string en elementos de un array*/
/*  esta echo un "" caracter por caracter y como eso devuelve un array 
se puede hacer un set de ese y quitar los elementos duplicados */
new Set("aaabbbccc".split(""));

var mapa = new Map();

mapa.set(1,"chancho");
mapa.set(2,"perro");
mapa.set(3,"gato");

