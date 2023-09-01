const ejeNro = "Ejercicio 23";

const enunciado =
    "23. Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo amarillo, por ejemplo)";

const texto = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique nesciunt neque consequuntur vitae at? Earum numquam corporis aut saepe sapiente totam ab asperiores possimus, provident velit ullam ut est officiis similique minus consequuntur! At quo minus quod, ab praesentium ratione. Architecto dolorum nulla atque ipsa sunt earum in hic voluptatum harum quam dolores tempora error assumenda obcaecati maiores, totam omnis.";


window.onload = contWeb;


function contWeb() {
    document.getElementById("ejeNro").innerHTML = ejeNro;
    document.getElementById("p1").innerHTML = enunciado;
    document.getElementById("consigna").innerHTML = texto;
    document.getElementById("btn").onclick = general;

}

function general() {
    let txt = document.getElementById("consigna");
    let largo = document.getElementById("inputDato1").value
    console.log(largo);

    let txtArray = texto.split(" ");
    
    let texto2 = (buscarEnTexto(largo, txtArray)).join(" ");
    document.getElementById("respuesta").innerHTML = texto2;
}

function buscarEnTexto(largo, txtArray) {
    let txtArrayEncontrado = txtArray.map(e => comprobarE(e,largo));
    return txtArrayEncontrado;
}

function comprobarE(e,largo){
    let e2 = e.split("");
    if (!(e2[e.leng-1] == "," || e2[e.leng-1] == ".")){
        if (e.length == largo) {
            e = `<span class="amarillo"> ${e} </span>`;
        }
    }
    return e;
}










/*



let txt = "Cualquier frase que tenga alguna palabra de cinco letras"
let textArr = txt.split(" ");

let colorear = textArr.map( (e) => {
    if (e.length==5){
        e= `<span class="background-color: yellow"> ${e} </span>`
    }
    return e;
});

console.log(colorear);



function resaltarPalabras(texto){
    const fraseArray = texto.split();
    const palabraResaltada = fraseArray.map(element => { // 
        if (element.length === 3){
            console.log(element);
            return `<span style="background-color:yellow> ${element} </span>`;
        }
            return element;
    });
    return palabraResaltada.join(" ");
}

function general(){
    const texto = "Esta es una frase que resaltan las palabras de tres caracteres ";
    const textoResaltado = resaltarPalabras(texto);
    console.log(textoResaltado);
}
general();








<script>
        const boton = document.getElementById("btn");
        function resaltado() {
            const parrafo = document.getElementById("parrafo");
            const palabras = parrafo.textContent.split(" ");

            const resaltar = palabras.map(palabra => {
                if (palabra.length > 8) {
                    return `<span class="resaltado">${palabra}</span>`;
                }
                return palabra;
            }).join(" ");

            parrafo.innerHTML = resaltar;
        }



        boton.onclick = resaltado;
    </script>


    */
