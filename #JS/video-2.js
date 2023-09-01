var persona = {
    apellido: "Poste",
    nombre: "Jona",
    edad: 45,
    nacimiento: new Date("01/01/1981"),
    mascotas: [
        {
            apodo: "Chiquito",
            numeroId: 123,
            nacimiento: new Date("03/02/2006"),

        }, {
            apodo: "Malva",
            numeroId: 123,
            nacimiento: new Date("03/02/2006"),

        }
    ]

};

class Mascota {
    apodo;
    numeroId;
    nacimiento;
}

var m = new Mascota();

m.apodo = "Filomena";
m.numeroId = 1234;
m.nacimiento = new Date("01/02-2000");


console.log(m);
