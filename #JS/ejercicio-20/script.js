
/*
20. Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
muestre el siguiente array [6, 9, 12, 15, 18].
*/

let crearMatriz = () => {
    let aux = 0;
    let numArray = [];
    for (let i = 0; i < 5; i++) {
        numArray[i] = [(aux+=3)];
    }
    return numArray;
}

let matriz1 = crearMatriz();

let matriz2 = matriz1.map(e =>  parseInt(e) + 3 );
console.log(matriz2);






