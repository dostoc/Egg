const ul = document.getElementById("lista");
const boton = document.getElementById("btn");

//NOTA: Siempre que consultamos a una APi vamos a tener demoras 

async function getAllCharacter(){
    let response = await fetch("https://rickandmortyapi.com/api/character"); // solicito la informacion (es un texto plano)
    let {results} = await response.json(); // espero
    return results;
}

function agregar(nombre){
    let li = document.createElement("li");
    li.innerHTML = nombre;
    ul.append(li);
}

boton.onclick = async function(){
    let results = await getAllCharacter();

    results.forEach(e => {
    agregar(e.name);
        
    });
}