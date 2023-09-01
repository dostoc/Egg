window.onload;


let personasArray = [];

function getFormValores() {
    event.preventDefault();

    personasArray = traerValores(personasArray);
    document.getElementById("respuesta").innerHTML =`<li> ${personasArray}<li>`;
    
    const lista = document.createElement("ul");

    array.forEach(persona => {
    const listItem = document.createElement("li");
    listItem.textContent = persona[0] + " " + persona[1];
    lista.appendChild(listItem);
  });

  respuestaDiv.appendChild(lista);
}
    


function traerValores(personasArray){
    let nombreInput = document.getElementsByName("nombre")[0].value;
    let apellidoInput = document.getElementsByName("apellido")[0].value;
    personasArray.push([nombreInput,apellidoInput]);
    return personasArray;
}


  

