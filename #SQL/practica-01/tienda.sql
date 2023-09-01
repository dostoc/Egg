DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);


-- 1. Lista el nombre de todos los productos que hay en la tabla producto.

select nombre from producto;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.

select nombre, precio from producto;

-- 3. Lista todas las columnas de la tabla producto.

select * from producto;

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando
-- el valor del precio.

select nombre, round(precio) from producto order by precio;

-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
-- SELECT COUNT(ID), pais FROM Personas GROUP BY pais;

select codigo_fabricante from producto;
    
-- 6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar
-- los repetidos.

select codigo_fabricante, fabricante.nombre from producto inner join tienda.fabricante
	on codigo_fabricante = fabricante.codigo
	group by codigo_fabricante;

-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente.

select fabricante.nombre from fabricante order by nombre;

-- 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
-- ascendente y en segundo lugar por el precio de forma descendente.

select nombre from producto order by nombre;
select nombre from producto order by nombre desc;

-- 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.

select * from fabricante limit 5;

-- 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas
-- ORDER BY y LIMIT)

select producto.nombre, producto.precio from producto order by precio limit 1;

-- 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)

select producto.nombre, producto.precio from producto order by precio desc limit 1;

-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.

select producto.nombre, producto.precio from producto
	where producto.precio <= 120
    order by precio;
    
-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador
-- BETWEEN.
/*
SELECT nombre/s de la/s columna/s FROM tablaOrigen WHERE condición de
Búsqueda BETWEEN valor1 AND valor2;
SELECT * FROM Alumnos WHERE edad BETWEEN 21 AND 40;
*/
 
select * from producto
	where precio between 60 and 200;

-- 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.

select * from producto
	where producto.codigo_fabricante in (1,3,5);
    
-- 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
    
select * from producto
	where producto.nombre like '%Portátil%';
    
    
 -- MULTITABLAS
    
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante
-- y nombre del fabricante, de todos los productos de la base de datos.

select producto.codigo, producto.nombre, producto.codigo_fabricante,producto.precio, fabricante.nombre as Fabricante from producto inner join fabricante
	on producto.codigo = fabricante.codigo where producto.codigo = 1;
    
-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
-- los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
-- orden alfabético

select fabricante.nombre as Fabricante, producto.codigo, producto.nombre  from producto inner join fabricante
	on producto.codigo = fabricante.codigo
    order by fabricante.nombre;
    
-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
-- más barato.
    
select producto.nombre, producto.precio, producto.codigo_fabricante, fabricante.nombre, fabricante.codigo from producto inner join fabricante 
	on producto.codigo_fabricante = fabricante.codigo
    order by producto.precio
    limit 1;
    
-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.

select producto.nombre, fabricante.nombre from producto inner join fabricante
	on producto.codigo_fabricante = fabricante.codigo
    where fabricante.nombre = 'Lenovo';
    
-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
-- mayor que $200.

select producto.nombre, producto.precio, fabricante.nombre from producto inner join fabricante
	on producto.codigo_fabricante = fabricante.codigo
    where fabricante.nombre = 'Crucial' and producto.precio>200;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
-- Utilizando el operador IN.

select producto.nombre, fabricante.nombre from producto inner join fabricante
	on producto.codigo_fabricante = fabricante.codigo
    where fabricante.nombre in ('Asus','Hewlett-Packard');
    
-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
-- los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
-- ascendente)    

select producto.nombre, producto.precio, fabricante.nombre from producto inner join fabricante
	on producto.codigo_fabricante = fabricante.codigo
    where producto.precio>=180
    order by producto.nombre asc, producto.precio desc; 
    
-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
-- productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
-- fabricantes que no tienen productos asociados.

select fabricante.nombre, producto.nombre from fabricante left join producto
on fabricante.codigo = producto.codigo_fabricante;

-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
-- producto asociado.

select fabricante.nombre, producto.nombre from fabricante left join producto
	on fabricante.codigo = producto.codigo_fabricante
	where producto.codigo is null;
    
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).

select producto.nombre, fabricante.nombre from producto, fabricante
	where producto.codigo_fabricante = fabricante.codigo
		and fabricante.codigo in ( select fabricante.codigo
										from fabricante 
										where fabricante.nombre = 'LENOVO');


-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto
-- más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).

select producto.nombre, producto.precio from producto
	where producto.precio = (select max(producto.precio) from producto
								where producto.codigo_fabricante = (select fabricante.codigo from fabricante
																		where fabricante.nombre = 'Lenovo'));
									
                                    
-- 3. Lista el nombre del producto más caro del fabricante Lenovo.

select producto.nombre from producto
	where producto.precio = ( select max(producto.precio) from producto
											where producto.codigo_fabricante = (select codigo from fabricante
																					where fabricante.nombre = 'Lenovo'));

-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio
-- medio de todos sus productos.

select * from producto
	where producto.precio > ( select avg(producto.precio) from producto
											where producto.codigo_fabricante = (select codigo from fabricante
																					where fabricante.nombre = 'Asus'))
                                                                                    and producto.codigo_fabricante = (select codigo from fabricante
																														where fabricante.nombre = 'Asus');
                                                                                    
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o
-- NOT IN).

select fabricante.nombre from fabricante
	where fabricante.codigo in (select producto.codigo_fabricante from producto);

/*    
select * from fabricante
where codigo in (select codigo_fabricante from producto where producto.codigo_fabricante = fabricante.codigo);
*/
	
-- Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).

select fabricante.nombre from fabricante
	where fabricante.codigo not in (select producto.codigo_fabricante from producto);
    
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
-- de productos que el fabricante Lenovo.
-- Subconsultas (En la cláusula HAVING)

select fabricante.nombre from fabricante
	where fabricante.codigo in (select producto.codigo_fabricante from producto
									group by producto.codigo_fabricante
									having count(*) = ( select count(*) from producto 
															where  producto.codigo_fabricante =(select fabricante.codigo from fabricante
																			where fabricante.nombre = 'Lenovo')))
                                                                            and (fabricante.nombre != 'Lenovo');
                                                                            
-- PRACTICAS DE LOS VIDEOS
                                                                            
select f.nombre, p.nombre, p.precio from fabricante f, producto p
	where f.codigo = p.codigo_fabricante;

select f.nombre, p.nombre, p.precio from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
		and f.codigo = 7;


select f.nombre, f.codigo, p.nombre from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
		and f.codigo = 7;
    
select p.codigo, f.nombre, p.nombre, p.precio from fabricante f, producto p
	where p.codigo_fabricante = f.codigo
		and f.nombre = 'Lenovo';
        
select p.codigo, f.nombre, p.nombre, p.precio from fabricante f, producto p
	where p.codigo_fabricante = f.codigo
		and f.nombre = 'Lenovo'
        and p.precio >500;
        
/*
 INNER JOIN (LA INTERSEXION ENTRE DOS CONJUNTOS)
 Para este caso seria de los productos que tienene codigo de fabricante (CLAVE FORANEA) que coincidan con los codigos de fabricante (CLAVE ID)
 Y BISERVERSA
 */
 
select p.codigo, p.nombre, p.precio from producto p inner join fabricante f
	on p.codigo_fabricante = f.codigo;

/*
 LEFT JOIN (LOS VALORES DEL CONJUNTO DE LA IZQUIERDA + LA INTERSEXION ENTRE DOS CONJUNTOS)
 Todos los valores de la tabla de la izquierda
 + Para este caso seria de los productos que tienene codigo de fabricante (CLAVE FORANEA) que coincidan con los codigos de fabricante (CLAVE ID)

 */
 
select p.codigo, p.nombre, p.precio from producto p Left join fabricante f
	on p.codigo_fabricante = f.codigo;
    -- Da lo mismo que el anterior porque TODOS LOS PRODUCTOS TIENEN una fabricante relacionado
	
/*
 RIGTH JOIN (LOS VALORES DEL CONJUNTO DE LA IZQUIERDA + LA INTERSEXION ENTRE DOS CONJUNTOS)
 Todos los valores de la tabla de la DERECHa (fabricante)
 + Para este caso seria de los productos que tienene codigo de fabricante (CLAVE FORANEA) que coincidan con los codigos de fabricante (CLAVE ID)

 */

select * from producto p right join fabricante f
	on p.codigo_fabricante = f.codigo;
    
    -- Trae todos los fabricantes de la intereccion + los fabricantes que no tienen productos asociados
    
 -- EXIST / NOT EXIST
 
 select * from producto p
	where exists
		(select f.codigo from fabricante f
			where p.codigo_fabricante = f.codigo);
            
 select * from fabricante f
	where not exists
		(select p.codigo_fabricante from producto p
			where p.codigo_fabricante = f.codigo);
            
/*
Cross Join: Hace una multiplicacion cartesiana. Por cada producto de la tabla producto lo asocia a la tabla fabricante.
*/

select * from producto p
	Cross join fabricante f;
    

-- ORDER BY Ordena por criterio de la columna ** asc acendente por defecto.. ** desc decendente
-- Se pueden establecer criterios de ordenamiento 1,2,3,...

select * from fabricante
	order by nombre desc;
    
select * from fabricante
	order by nombre asc;

select f.nombre, p.nombre, p.precio from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
    order by f.nombre, p.nombre;
    
 select f.nombre, p.nombre, p.precio from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
    order by p.nombre, f.nombre;
    

-- GROUP BY Agrupa segun criterio, por ejempl para el ejercicio si dos 2 productos son del mismo fabricante la consulta daria 1 solo fabricante
-- tambien se puede agrupar por criterio, por ejemplo ordenar todas las marcas por origen y luego por fabricante ** No es ordenar (no repite en caso
-- que existan dos filas con el mismo criterio)

-- A TENER EN CUENTA!!!! cuando se usa una seleccion de varias columnas deben si o si estar dentro del group by
-- Otra mas usada es CASO 2

select f.nombre, f.origen, f.codigo from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
    group by f.nombre, f.origen, f.codigo;
    
-- CASO 2  COUNT  - cuenta los registros que tienen este criterio (el del select)

select f.origen, count(*) from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
    group by f.origen;

-- HAVING - Introducir criterio de agrupamiento

    select f.origen, count(*) from fabricante f, producto p
		where f.codigo = p.codigo_fabricante
		group by f.origen
		having count(*)>5; -- Que solo muestre los grupos que tengan mas de 5 registros
        
-- otro caso puede ser que muestre los fabricantes que tengan mas de 1 producto y que no sean lenovo

 select f.nombre, count(*) from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
    group by f.nombre
    having count(*)>1 and f.nombre <> 'Lenovo';
    
 select f.nombre, count(*), sum(p.precio) from fabricante f, producto p
	where f.codigo = p.codigo_fabricante
    group by f.nombre
    having sum(p.precio) > 300;


-- DE LAS PRACTICAS
select * from producto
where producto.precio = (select min(producto.precio) from producto);

UPDATE `tienda`.`producto` SET `nombre` = ' Papa te quiero por siempre' WHERE (`codigo` = '14');

 