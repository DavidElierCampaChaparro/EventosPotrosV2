create database eventospotros;
use eventospotros;

create table eventos(
ID int primary key auto_increment,
Nombre varchar(50),
Fecha varchar(50),
Hora varchar(50),
Lugar varchar(50),
HorasCultura int,
Descripcion varchar(250)
);

insert into eventos(Nombre, Fecha, Hora, Descripcion, Lugar, HorasCultura)
			values ('Salud personal', '20 de marzo al 4 de abril', '9AM-10AM, 12PM-1PM, 5PM-6PM', 'Este evento esta impartido por fulanito perez asda adefh alke fjh', 'Aula magna', 2),
				   ('Libertad financiera', 'los dias 10, 12 y 13 de enero', 'todos los dias a las 12', 'Este evento lo traen desde adasdasdasd', 'teatro del itson', 5),
                   ('Nutricion', 'todos los dias', '10 - 12 del dia' , 'asdasdadasdasdsa', 'tutorias itson nainari', 1),
                   ('Emprendimiento y empresas' , 'del 19 de mayo al 25 de julio', 'de 8AM hasta las 6 PM' , 'Este gran evento es impartido porasdasdasdadsad', 'tutorias itson centro', 0);

