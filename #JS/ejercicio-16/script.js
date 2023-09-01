/*
16. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
y los muestre por pantalla.
*/

/*
function NumRandom(max){
    return Math.floor(Math.random()* max);
}
*/

var NumRandom = (max) => Math.floor(Math.random()* max);

function general(){
    var array1 = new Array();
    var array2 = new Array();
    let max = 10;
    for (let i = 0; i < 5; i++) {
        array1.push(NumRandom(max));
        array2.push(NumRandom(max));
    }
    console.log(array1);
    console.log(array2);
}

general();
