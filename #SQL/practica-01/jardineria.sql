-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.

select
o.codigo_oficina,
o.ciudad
from oficina o;


-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.

select
o.ciudad,
o.telefono
from oficina o
where o.pais like 'España';


-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
-- código de jefe igual a 7.

select
e.apellido1,
e.apellido2,
e.email
from empleado e
where e.codigo_jefe = 7;

-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.

select
e.apellido1,
e.apellido2,
e.email
from empleado e
where e.codigo_jefe is null;


-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
-- representantes de ventas.

select
e.nombre,
e.apellido1,
e.apellido2,
e.puesto
from empleado e
where e.puesto not like 'Representante Ventas';

-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.

select
c.nombre_cliente
from cliente c
where  c.pais like 'Spain';

-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.

select 
pe.estado
from pedido pe
group by pe.estado;

-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
-- en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
-- repetidos. Resuelva la consulta:
-- o Utilizando la función YEAR de MySQL.
-- o Utilizando la función DATE_FORMAT de MySQL.
-- o Sin utilizar ninguna de las funciones anteriores.

select pe.codigo_cliente
from pedido pe inner join pago pa
on pe.codigo_cliente = pa.codigo_cliente
where pa.fecha_pago between  '2008-01-01' and  '2008-12-31'
group by pe.codigo_cliente;

select pe.codigo_cliente
from pedido pe inner join pago pa
on pe.codigo_cliente = pa.codigo_cliente
where YEAR(2008-01-01) > year(pa.fecha_pago) and
	  YEAR(2008-31) < year(pa.fecha_pago)
group by pe.codigo_cliente;


SELECT pe.codigo_cliente
FROM pedido pe
INNER JOIN pago pa ON pe.codigo_cliente = pa.codigo_cliente
WHERE YEAR('2008-01-01') >= YEAR(pa.fecha_pago)
  AND YEAR('2008-12-31') <= YEAR(pa.fecha_pago)
GROUP BY pe.codigo_cliente;

SELECT pe.codigo_cliente
FROM pedido pe
INNER JOIN pago pa ON pe.codigo_cliente = pa.codigo_cliente
WHERE date_format('2008-01-01', '%Y') >= date_format(pa.fecha_pago, '%Y')
  AND date_format('2008-12-31', '%Y') <= date_format(pa.fecha_pago, '%Y')
GROUP BY pe.codigo_cliente;

-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
-- entrega de los pedidos que no han sido entregados a tiempo.

select
pe.codigo_pedido,
pe.codigo_cliente,
pe.fecha_esperada,
pe.fecha_entrega
from pedido pe
where pe.fecha_entrega > pe.fecha_esperada;



-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
-- entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
-- esperada.
-- o Utilizando la función ADDDATE de MySQL.
-- o Utilizando la función DATEDIFF de MySQL.

select 
pe.codigo_pedido,
pe.codigo_cliente,
pe.fecha_esperada,
pe.fecha_entrega
from pedido pe
where pe.fecha_entrega < adddate(fecha_esperada, interval -2 day);

select 
pe.codigo_pedido,
pe.codigo_cliente,
pe.fecha_esperada,
pe.fecha_entrega
from pedido pe
where 2 <= datediff(pe.fecha_esperada, pe.fecha_entrega );

-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.


select 
*
from pedido pe
where pe.estado like 'Rechazado' and
	  pe.fecha_entrega between '2009-01-01' and '2009-12-31';
      
select 
*
from pedido pe
where pe.estado like 'Rechazado' and
	  pe.fecha_entrega between '2009-01-01' and adddate('2009-01-01', interval 1 year);

-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de
-- cualquier año.

select 
pe.codigo_pedido, pe.codigo_cliente, pe.fecha_esperada, pe.fecha_entrega
from pedido pe
where pe.fecha_entrega like '%-01-%' ;


-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
-- Ordene el resultado de mayor a menor.

select 
*
from pago pa
where pa.forma_pago like 'Paypal' and
	  pa.fecha_pago like '2008-%'
order by id_transaccion;

-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
-- cuenta que no deben aparecer formas de pago repetidas.

select 
pa.forma_pago
from pago pa
group by pa.forma_pago;

-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
-- tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
-- venta, mostrando en primer lugar los de mayor precio.

select *
from producto p
where p.gama like 'Ornamentales' and
	  p.cantidad_en_stock >= 100
order by p.precio_venta desc;
    

-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
-- representante de ventas tenga el código de empleado 11 o 30.

select *
from cliente cl
where cl.ciudad like 'Madrid' and
	  cl.codigo_empleado_rep_ventas in (11,30);


-- Consultas multitabla (Composición interna)
-- Las consultas se deben resolver con INNER JOIN.
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante
-- de ventas.

select
cl.nombre_cliente, em.nombre, concat(em.apellido1, em.apellido2) as rep_ventas
from 
cliente cl
inner join empleado em
ON cl.codigo_empleado_rep_ventas = em.codigo_empleado;


-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
-- representantes de ventas.

SELECT cliente.codigo_cliente,cliente.nombre_cliente,concat(empleado.nombre,' ',apellido1,' ',apellido2) AS nombre_empleado, pago.fecha_pago 
from cliente
INNER JOIN pago ON pago.codigo_cliente = cliente.codigo_cliente
INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado;


-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de
-- sus representantes de ventas.

SELECT cliente.codigo_cliente,cliente.nombre_cliente,concat(empleado.nombre,' ',apellido1,' ',apellido2) AS nombre_empleado, pago.fecha_pago 
from cliente
INNER JOIN pago on pago.codigo_cliente = cliente.codigo_cliente
INNER JOIN empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
where cliente.codigo_cliente not in (select * from pago);


-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
-- junto con la ciudad de la oficina a la que pertenece el representante.

SELECT cliente.codigo_cliente,cliente.nombre_cliente,concat(empleado.nombre,' ',apellido1,' ',apellido2) AS nombre_empleado, pago.fecha_pago,oficina.ciudad as oficina 
FROM cliente
INNER JOIN pago ON pago.codigo_cliente = cliente.codigo_cliente
INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;



-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
-- representantes junto con la ciudad de la oficina a la que pertenece el representante.

SELECT cliente.codigo_cliente,cliente.nombre_cliente,concat(empleado.nombre,' ',apellido1,' ',apellido2) AS nombre_empleado, oficina.ciudad as oficina 
FROM cliente
INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina
where cliente.codigo_cliente NOT IN 
(SELECT codigo_cliente FROM pago);


-- -6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.

select * 
from oficina
inner join empleado
on empleado.codigo_oficina = oficina.codigo_oficina
where empleado.codigo_empleado in (select cliente.codigo_empleado_rep_ventas
									from cliente
									where cliente.ciudad like 'Fuenlabrada');


-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad

select cl.nombre_cliente,
	   concat(em.nombre,' ',em.apellido1,' ',em.apellido2) as ventas,
       ofi.ciudad
from cliente cl
inner join empleado em on cl.codigo_empleado_rep_ventas = em.codigo_empleado
inner join oficina ofi on ofi.codigo_oficina = em.codigo_oficina;

-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT E.NOMBRE AS EMPLEADO , X.NOMBRE AS JEFE
FROM EMPLEADO E 
INNER JOIN EMPLEADO X ON E.CODIGO_JEFE=X.CODIGO_EMPLEADO;
        
select em.nombre as empleado,
	   emp.nombre as jefe
from empleado em
inner join empleado emp on em.codigo_jefe = emp.codigo_empleado;

-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.

select cl.nombre_cliente, pd.codigo_pedido
from cliente cl
inner join pedido pd on cl.codigo_cliente = pd.codigo_cliente
	where pd.fecha_entrega > pd.fecha_esperada;

-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.

select distinct cl.nombre_cliente, g.gama
from cliente cl
inner join pedido pd on  cl.codigo_cliente = pd.codigo_cliente
inner join detalle_pedido det on pd.codigo_pedido = det.codigo_pedido
inner join producto prod on det.codigo_producto = prod.codigo_producto
inner join gama_producto g on prod.gama = g.gama;

-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.

select cl.nombre_cliente, pago.id_transaccion
from cliente cl
left join pago on pago.codigo_cliente = cl.codigo_cliente
where pago.codigo_cliente is null;

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido

select cl.nombre_cliente, ped.codigo_pedido
from cliente cl
left join pedido ped on ped.codigo_cliente = cl.codigo_cliente
where ped.codigo_pedido is null;

-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que
-- no han realizado ningún pedido.

select cl.nombre_cliente, ped.codigo_pedido
from cliente cl
left join pedido ped on ped.codigo_cliente = cl.codigo_cliente
left join pago on pago.codigo_cliente = cl.codigo_cliente
	where ped.codigo_pedido is null and ped.codigo_pedido is null;


-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina
-- asociada.

select *
from empleado em
left join oficina ofi on em.codigo_oficina = ofi.codigo_oficina
where em.codigo_oficina is null;

-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente
-- asociado.

select *
from empleado em
left join cliente cl on em.codigo_empleado = cl.codigo_empleado_rep_ventas
where cl.codigo_cliente is null;
	


-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los
-- que no tienen un cliente asociado.

select *
from empleado em
left join oficina ofi on em.codigo_oficina = ofi.codigo_oficina
left join cliente cl on em.codigo_empleado = cl.codigo_empleado_rep_ventas
where em.codigo_oficina is null and cl.codigo_cliente is null;


-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.

select *
from detalle_pedido det
left join producto pr
on det.codigo_producto = pr.codigo_producto
where det.codigo_producto is null;

-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
-- representantes de ventas de algún cliente que haya realizado la compra de algún producto
-- de la gama Frutales.


select ofis.codigo_oficina 
from oficina ofis
where ofis.codigo_oficina not in    (select distinct ofi.codigo_oficina
									from oficina ofi 
									inner join empleado emp
									on ofi.codigo_oficina = emp.codigo_oficina
									inner join cliente cl
									on emp.codigo_empleado = cl.codigo_empleado_rep_ventas
									inner join  pedido ped
									on cl.codigo_cliente  not in (select distinct ped.codigo_cliente
															   from pedido ped
															   inner join detalle_pedido det
															   on ped.codigo_pedido = det.codigo_pedido
															   inner join producto g
															   on det.codigo_producto = g.codigo_producto
															   where g.gama like 'Frutales'));


-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado
-- ningún pago.

select distinct *
from cliente
inner join pedido
inner join pago
on cliente.codigo_cliente = pago.codigo_cliente = pedido.codigo_cliente






/*

10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el
nombre de su jefe asociado.
Consultas resumen
1. ¿Cuántos empleados hay en la compañía?
2. ¿Cuántos clientes tiene cada país?
3. ¿Cuál fue el pago medio en 2009?
4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el
número de pedidos.
5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
6. Calcula el número de clientes que tiene la empresa.
7. ¿Cuántos clientes tiene la ciudad de Madrid?
8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende
cada uno.
52
10. Calcula el número de clientes que no tiene asignado representante de ventas.
11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado
deberá mostrar el nombre y los apellidos de cada cliente.
12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de
los pedidos.
14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que
se han vendido de cada uno. El listado deberá estar ordenado por el número total de
unidades vendidas.
15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el
IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el
número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
imponible, y el total la suma de los dos campos anteriores.
16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
17. La misma información que en la pregunta anterior, pero agrupada por código de producto
filtrada por los códigos que empiecen por OR.
18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se
mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21%
IVA)
Subconsultas con operadores básicos de comparación
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta
que tendrá que calcular cuál es el número total de unidades que se han vendido de cada
producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código
del producto, puede obtener su nombre fácilmente.)
4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar
INNER JOIN).
5. Devuelve el producto que más unidades tiene en stock.
6. Devuelve el producto que menos unidades tiene en stock.
7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto
Soria.
Subconsultas con ALL y ANY
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el producto que menos unidades tiene en stock.
Subconsultas con IN y NOT IN
1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún
cliente.
2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
53
4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que
no sean representante de ventas de ningún cliente.
Subconsultas con EXISTS y NOT EXISTS
1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
pago.
2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.

*/