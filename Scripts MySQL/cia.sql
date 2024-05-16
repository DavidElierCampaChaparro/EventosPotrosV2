create database cia;
use cia;

create table personas(
ID bigint primary key,
Nombre varchar(70),
HorasCultura int,
contrasena varchar(20),
esAdmin boolean default false
);

insert into personas(ID, Nombre, HorasCultura, contrasena, esAdmin) 
			values  (245178, 'David Elier Campa Chaparro', 50, 'contrasena123', true),
					(245177, 'Maximiliano Reyna', 10, 'contrasena123', false),
                    (123456,'Daniel Campoa' , 40, 'contrasena123', false),
                    (123455, 'Pablo', 0, 'contrasena123', false);
                    
insert into personas(ID, Nombre, HorasCultura, contrasena, esAdmin) values (1, 'admin', 1, '1', true);