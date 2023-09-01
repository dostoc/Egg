
/*
21. Escribir un programa para obtener un array de las propiedades de un objeto Persona.
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
*/
/*
// otra forma si constructor. Seteado por parametros
const persona3 = new Object();
persona3.nombre = 'Pepito';
persona3.edad = 30 ;
persona3.sexo = 'V';
persona3.peso = 45;
persona3.altura = 160;

// si fuera el caso de agregar una variable por ejemplo persona3.colorPelo esto seria UNDEFINDED y no null...


// Este es otro modelo
const persona2 = {
    nombre : 'Paco',
    edad : 23,
    sexo : 'M',
    peso : 15,
    altura : 13
};

// CREAR OBJETO CON FUNCION CONSTRUCTORA nombre del metodo en Mayuscula 
// Persona
function Persona (nombre, edad, sexo,peso,altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura
};

//var persona4 = new Persona(nombre,edad,sexo,peso,altura);
var persona4 = new Persona('Paco','12','M',45,180);

//Creemos una relacion
function Hijo(dni,fnacimiento) {
    this.dni = dni;
    this.fnacimiento = fnacimiento;
};
var hijo1 = new Hijo(28777225,Date("01/08-2022"));
// ver que seria una extencion de Persona ...



persona4.hijo = hijo1;
console.log(persona4.hijo);

// le podemos asignar esa propiedad a Persona


const persona = new Persona (
    persona2.nombre,
    persona2.edad,
    persona2.sexo,
    persona2.peso,
    persona2.altura,
    );


// tener en cuenta que no es parte del constructor por lo que esta propiedad no existe

*/

/*DESDE ACA */



// CREAR OBJETO CON FUNCION CONSTRUCTORA nombre del metodo en Mayuscula 
// OBJETO JSON
var personaJSON = {
    nombre : 'Paco',
    edad : 23,
    sexo : 'M',
    peso : 15,
    altura : 13
}; // en la impresion este objeto : objeto

// OBJETO PERSONA
function Persona (nombre, edad, sexo,peso,altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura
};

Persona.prototype.toString = function toString(){
    var personaString = 
    `Nombre ${this.nombre} \n
     Edad ${this.edad} \n
     Sexo ${this.sexo} \n
     Peso ${this.peso} \n
     Altura ${this.altura} \n
    `
    return personaString;
}

function general() {
    //var persona4 = new Persona(nombre,edad,sexo,peso,altura);
    var persona4 = new Persona("Paco",12,"M",45,180);
    console.log("Persona 4: " + typeof persona4 + persona4.toString());
}

general();

