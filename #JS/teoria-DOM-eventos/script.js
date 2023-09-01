window.onload = saludar; // le atribuimos la funcion pero no la funcion en si :/


// document.getElementById son selectores entre otros
document.getElementById("123").onmouseover = function(){ // ESTA funcio se usa para corregir el evento
    retar("soy un imput");
    // se podrian agregar varias funciones que se disparen bajo la condicion onmouseover
}


// LA DIFERENCIA CON LA ANTERIOR (RETAR) es que no necesita argumento, pero si lo hiciese necesita
// si o si la funcion anonima
document.getElementById("btn").onclick = meHicisteClick;

function saludar(){
    console.log("Bienvenido!")
}

function retar(mensajito){
    console.log(mensajito);
    
}

function meHicisteClick(){
    console.log("Me pinchaste >.<");
}
