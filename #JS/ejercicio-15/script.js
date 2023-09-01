/*
14. Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/

function EsNumero(numero){
    numero = parseInt(numero);
    if (isNaN(numero)) {
        throw alert("ERROR No es numero")        
    }
    return numero;
}

function Libro(ISBN,titulo,autor,cantPag) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.cantPag = cantPag;
}

function CrearLibro(){
    let auxLibro = new Libro();
    auxLibro.ISBN = EsNumero(prompt("ISBN"));
    auxLibro.autor = prompt("autor");
    auxLibro.cantPag = EsNumero(prompt("cantidad de pagina"));
    auxLibro.titulo = prompt("titulo");
    return auxLibro;
}

function general() {
    let libro1 = CrearLibro();
    console.log(`LIBRO....: ${libro1.titulo}
ISBN.....: ${libro1.ISBN}
AUTOR....: ${libro1.autor}
CANT PAG.: ${libro1.cantPag}
`);
}


general();
