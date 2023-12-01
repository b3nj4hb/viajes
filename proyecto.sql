create database viajes;
create user viajes identified by '123456';
GRANT ALL PRIVILEGES ON viajes.* TO viajes;
FLUSH PRIVILEGES;

use viajes;

-- Datos para la tabla 'conductor'
INSERT INTO `conductor` (`co_dire_conduc`, `co_fech_naci`, `co_nomb_conduc`) VALUES
('DirecciónConductor1', '1990-01-01', 'Conductor A'),
('DirecciónConductor2', '1985-05-15', 'Conductor B'),
('DirecciónConductor3', '1988-10-20', 'Conductor C'),
('DirecciónConductor4', '1980-03-12', 'Conductor D'),
('DirecciónConductor5', '1982-07-08', 'Conductor E');

-- Datos para la tabla 'terminal'
INSERT INTO `terminal` (`te_dire_term`, `te_nomb_term`) VALUES
('Dirección1', 'Terminal A'),
('Dirección2', 'Terminal B'),
('Dirección3', 'Terminal C'),
('Dirección4', 'Terminal D'),
('Dirección5', 'Terminal E');

-- Datos para la tabla 'ruta'
INSERT INTO `ruta` (`ru_nomb_ruta`, `ru_valo_pasaj`) VALUES
('Ruta 1', '20'),
('Ruta 2', '25'),
('Ruta 3', '30'),
('Ruta 4', '15'),
('Ruta 5', '22');

-- Datos para la tabla 'flota'
INSERT INTO `flota` (`fl_nomb_flot`, `fl_codi_term`) VALUES
('Flota A', 1),
('Flota B', 2),
('Flota C', 3),
('Flota D', 4),
('Flota E', 5);

-- Datos para la tabla 'bus'
INSERT INTO `bus` (`bu_capacidad`, `bu_fech_fabri`, `bu_tipo`, `bu_codi_flot`) VALUES
(50, '2020-01-01', 'TipoA', 1),
(40, '2019-05-15', 'TipoB', 2),
(35, '2018-08-20', 'TipoC', 3),
(45, '2021-02-10', 'TipoA', 4),
(55, '2017-11-05', 'TipoB', 5);

-- Datos para la tabla 'viaje'
INSERT INTO `viaje` (`vi_fech_viaje`, `vi_nume_pasajero`, `vi_valo_pasaj`, `vi_codi_conduc`, `vi_codi_ruta`, `vi_placa`) VALUES
('2023-12-01', 100, '30', 1, 1, 1),
('2023-12-02', 120, '25', 2, 2, 2),
('2023-12-03', 80, '35', 3, 3, 3),
('2023-12-04', 150, '20', 4, 4, 4),
('2023-12-05', 90, '28', 5, 5, 5);


select * from conductor c ;
select * from ruta r ;
select * from terminal t ;

select * from flota f ;
select * from bus b ;

select * from viaje v ;