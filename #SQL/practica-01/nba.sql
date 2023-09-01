-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.

select jugadores.Nombre from jugadores
	order by Nombre asc;
    
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente.

select j.nombre, j.peso from jugadores j
	where j.Posicion = 'c' and j.Peso > 200
    order by j.Nombre;
    
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.

select e.nombre from equipos e
	order by e.nombre;

-- 4. Mostrar el nombre de los equipos del este (East).

select e.Nombre from equipos e
	where e.Conferencia = 'East';

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.

select e.Nombre, e.Ciudad from equipos e
	where e.Ciudad like 'c%'
    order by e.Nombre;
    
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.

select jugadores.Nombre_equipo, jugadores.Nombre from jugadores
	order by jugadores.Nombre_equipo, jugadores.Nombre;
    
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.

select jugadores.Nombre, jugadores.Nombre_equipo from jugadores
	where jugadores.Nombre_equipo = 'Raptors';
    
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
    
select * from estadisticas, jugadores
where jugadores.codigo = estadisticas.jugador
and jugadores.Nombre = 'Pau Gasol';

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.

select * from estadisticas, jugadores
where jugadores.codigo = estadisticas.jugador
and jugadores.Nombre = 'Pau Gasol'
and estadisticas.temporada = '04/05';


-- 82 partidos por temporada

select (count(*)) as pj from estadisticas e
	where e.jugador = (select j.codigo from jugadores j where j.Nombre like 'Pau Gasol' )
     group by jugador;


-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
-- promedio de puntos por temporada de toda la carrera



 select j.Nombre, e.jugador, avg(e.Puntos_por_partido) as TODO_prom_ptos_partdio, count(*) AS TEMPORADAS from estadisticas e right join jugadores j
	on j.codigo = e.jugador
    group by j.codigo;
    	
        
 

 
 
										
		
-- 11. Mostrar el número de jugadores de cada equipo.

select equipos.Nombre, count(jugadores.Nombre_equipo) as cant_jugadores from equipos inner join jugadores
	where equipos.Nombre = jugadores.Nombre_equipo
    group by equipos.Nombre;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
-- esta mal debido a que sin la cantidad de partidos jugados, puntos por partido es indefinido

SELECT jugadores.nombre, jugadores.codigo
FROM jugadores, estadisticas
WHERE jugadores.codigo = (SELECT jugador
                          FROM estadisticas
                          GROUP BY jugador
                          ORDER BY SUM(estadisticas.Puntos_por_partido) desc
                          LIMIT 1)
limit 1
;


-- 14  Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.

select p.equipo_local, p.equipo_visitante, (p.puntos_local-p.puntos_visitante)   from partidos p
	where (p.puntos_local-p.puntos_visitante) = (select max(p.puntos_local-p.puntos_visitante) as diferencia from partidos p);

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.



select p.codigo from partidos p
	where p.puntos_local>p.puntos_visitante;
    

SELECT
  p.equipo_local,
  p.equipo_visitante,
  (p.puntos_local - p.puntos_visitante) AS diferencia
FROM partidos p
WHERE (p.puntos_local - p.puntos_visitante) = (
  SELECT MAX(p.puntos_local - p.puntos_visitante) AS diferencia
  FROM partidos
) 

    
						
				