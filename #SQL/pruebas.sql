 SELECT * FROM superheroes.personajes;
 
 /*
Crear tabla
CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] nombre_base_datos

create schema if not exists pruebas
  */
create table if not exists ejem1;


CREATE TABLE  if not exists pruebas.proveedor (
  id_proveedor INT NOT NULL,
  proveedor VARCHAR(45) NOT NULL,
  direccion varchar(255) not null,
  email varchar(40),
  PRIMARY KEY (id_proveedor))
COMMENT = 'Esto es una prueba';

select * from pruebas.proveedor;

create table if not exists pruebas.cliente (
	id_nro_cliente int not null,
    id_razon_social varchar(45) not null,
    id_direccion varchar(45) not null,
    primary key(id_nro_cliente));
    
select * from cliente;

create table if not exists pruebas.peteco(
	peteco int not null,
    nombre varchar(45) not null,
    primary key(peteco))
    comment= 'prueba de peteco';
    
select * from pruebas.peteco;

drop table peteco;



