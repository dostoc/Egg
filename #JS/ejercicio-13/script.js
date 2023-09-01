/*
13. Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.
*/


function Persona(nombre,edad,sexo,peso,altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo; // solo H M O usar algo para verificar eso o por swich..
    this.peso = peso;
    this.altura = altura;
}

function Sexo(){
    do {
        let opcion = prompt('Ingrese (H)Hombre (M)mujer (O)otro').toUpperCase();
        console.log(opcion);
        if (opcion === "H" || opcion === "M" || opcion === "O" ) {
            return opcion;
        } else {
            console.log("Opcion no valida");
        }
    } while (true);

}

function CrearPersona(){
    var nombre = prompt('Ingrese nombre');
    var edad = parseInt(prompt('Ingrese edad'));
    var sexo = Sexo();
    var peso = parseFloat(prompt('Ingrese peso'));
    var altura = parseFloat(prompt('Ingrese altura'));
    return new Persona(nombre,edad,sexo,peso,altura);
}


function general() {
    let persona = CrearPersona();
    console.log(persona);
}


general();



/********** OTRA FORMA *************/
// NO TIENE NADA QUE VER ESTO CON EL CONSTRUCTOR Persona de ARRIBA!

let otraPersona = new OtraPersona(); // objeto vacio otra persona
otraPersona.nombre = 'Paco';
otraPersona.edad = 23;
otraPersona.sexto = 23;
otraPersona.peso = 23;
otraPersona.altura = 23;
otraPersona.pelo = 'Largo'; // notese que se puede agregar cualquier propiedad sobre la marcha...

console.log(otraPersona.constructor.name);

ler 