

select COUNT(estadisticas.Asistencias_por_partido)
from estadisticas
where estadisticas.Asistencias_por_partido = (SELECT max(Asistencias_por_partido) from estadisticas);
-- 2
 
 -- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea 
-- centro o esté comprendida en otras posiciones.

select SUM(jugadores.Peso)
from jugadores inner join equipos
on jugadores.Nombre_equipo = equipos.Nombre
where jugadores.Posicion like '%C%' and equipos.Conferencia like 'East';
-- 14043

-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de 
-- jugadores que tiene el equipo Heat. 


-- CANDADO B

select count(*)
from estadisticas
where Asistencias_por_partido> (select COUNT(*)
								from jugadores
								where jugadores.Nombre_equipo like 'Heat');
-- 3

-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999

select count(partidos.temporada)
from partidos
where partidos.temporada like '99/%';
-- 1740

select count(partidos.temporada)
from partidos
where partidos.temporada like '%99%';

-- 3480

select count(*) from jugadores inner join equipos
on jugadores.Nombre_equipo = equipos.Nombre
where equipos.Conferencia like 'West' and jugadores.Procedencia LIKE 'Michigan';
-- 2
select COUNT(*)
from jugadores
where jugadores.Peso>=195;
-- 362
-- 2/362 + 0.9945 =  1.003559...... incomprobable

-- FALTA CLAVE
-- select  sum(estadisticas.Puntos_por_partido) , sum(Asistencias_por_partido) ,  sum(Tapones_por_partido)  from estadisticas
SELECT round(SUM(todo)) AS total_todo
FROM (
    SELECT AVG(estadisticas.Puntos_por_partido) + count(estadisticas.Asistencias_por_partido) + sum(estadisticas.Tapones_por_partido) AS todo
    FROM estadisticas
    INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo
    INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
    WHERE equipos.Division LIKE 'central'
) AS todos;
-- 631

select round(avg(estadisticas.Tapones_por_partido)) as tapones
from estadisticas
inner join jugadores on estadisticas.jugador = jugadores.codigo
inner join partidos on partidos.temporada = estadisticas.temporada
where  jugadores.Nombre like 'Corey Maggette' and partidos.temporada like '00/01';
-- 4

select floor(sum(estadisticas.Puntos_por_partido))
from estadisticas
inner join jugadores on estadisticas.jugador = jugadores.codigo
where jugadores.Procedencia like 'Argentina' order by Puntos_por_partido desc;
-- 191


