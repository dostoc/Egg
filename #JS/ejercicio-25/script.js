let titulos = document.getElementsByName("titulo");
let pes = document.getElementsByTagName("P");
let input = document.getElementById("formInput");
let boton = document.getElementById("btn");


boton.onclick = function(){
  titulos.forEach(element => {
    element.style.color = "red";
  });

  for (const e of pes) {
    e.innerHTML = "Peteco"
    
  }

  input.value = "Lorenzo leelo";

}

input.onkeydown = function () {
  if (input.value.length > 10) input.value = "dale lorenzo";
}