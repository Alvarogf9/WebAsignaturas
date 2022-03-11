insert into asignaturas (id, nombre, descripcion, curso)
 select 1, 'Matematicas', 'matesavanzadas', '3' from dual where not exists (select 1 from asignaturas where id = 1);

insert into asignaturas (id, nombre, descripcion, curso)
 select 2, 'Ingles', 'inglesavanzado', '4' from dual where not exists (select 1 from asignaturas where id = 2);
