/*
19. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
de 20.

*/


var NumRandom = (max) => Math.floor(Math.random() * max);
var ArrayPrimero = () => {
    let arrayUno = new Array();
    for (let i = 0; i < 50; i++) {
        arrayUno[i] = NumRandom(99);
    }
    return arrayUno;
}

var Reordenar = (arrayAux) => arrayAux.sort();

var PaseValores = (arrayOrigen) => {
    var arrayAux = arrayOrigen.slice(); 
    // basicamene javascrip hace referencia de otros valores por lo que si arrayAux se modifica, lo hace tambien arrayOrigen,
    // la forma seria duplicar el element con .slice()
    var arrayDestino = new Array();
    arrayAux = Reordenar(arrayAux);
    for (let index = 0; index < 20; index++) {
        if (index < 10) {
            arrayDestino[index] = arrayAux[index];
        } else {
            arrayDestino[index] = 0.5;
        }
    }
    return arrayDestino;
}


function general() {
    var arrayUno = new Array();
    var arrayDos = new Array();
    arrayUno = ArrayPrimero();
    arrayDos = PaseValores(arrayUno);
    console.log(arrayUno);
    console.log(arrayDos);
}

general();


