insert into roles(id, name) values 
(1, 'User'),
(2, 'Admin'),
(3, 'Estudiante'),
(4, 'direc');


insert into personas(id, rol_id, full_name, last_name, programming_language) values
(1, 1,'java', 'molina', 'valentina'),
(2, 2,'html', 'lopez', 'laura'),
(3, 3,'css', 'jaramillo','luisa'),
(6, 4,'spring', 'lopera', 'ximena');

insert into passport(id, expiration, number, person_id)values
(1, '2026-02-06', 'NUM123', 1),
(2, '2021-04-08', 'NUM456', 2),
(3, '2025-08-09', 'NUM789', 3);

insert into project(id, name)values
(1, 'tecn'),
(2, 'digi'),
(3, 'desa');

insert into personas_project(persona_id, project_id)values
(1,1),
(2,2),
(3,3);
