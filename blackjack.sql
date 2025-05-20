DROP DATABASE if exists blackjack;
CREATE DATABASE blackjack;
USE blackjack;

-- CREAMOS LAS TABLAS
CREATE TABLE Juego (
    id INT primary key,
	n_jugadores INT,
	descripcion VARCHAR(255),
    nombre VARCHAR(20) UNIQUE not null
);

CREATE TABLE Jugador (
    id INT primary key auto_increment,
    idJuego INT NOT NULL,
    nombre VARCHAR(50) UNIQUE not null,
    p_jugadas INT,
    foreign key (idJuego) REFERENCES Juego(id) 
);

CREATE TABLE Partida(
	id INT primary key auto_increment,
    diamantes INT,
    idJugador INT not null,
    f_partida DATE,
    foreign key (idJugador) REFERENCES Jugador(id)
);

-- INSERTAMOS DATOS
INSERT INTO Juego (id, n_jugadores, descripcion, nombre)
VALUES (1, 6, 'Juego de cartas clásico donde se intenta llegar a 21 sin pasarse.', 'blackjack');

INSERT INTO Jugador (idJuego, nombre, p_jugadas) VALUES 
(1, 'Alice11', 6),
(1, 'Alejandro85', 4),
(1, 'Carlos77', 7),
(1, 'Diana45', 5),
(1, 'Laura45', 3),
(1, 'Francis63', 8);

-- Insertar partidas para cada jugador
-- Jugador 1: Alice11
INSERT INTO Partida (diamantes, idJugador, f_partida)
VALUES 
(10, 1, '2025-05-01'),
(12, 1, '2025-05-03'),
(8, 1, '2025-05-05'),
(15, 1, '2025-05-07'),
(10, 1, '2025-05-09'),
(18, 1, '2025-05-11');

-- Jugador 2: Alejandro85
INSERT INTO Partida (diamantes, idJugador, f_partida)
VALUES 
(5, 2, '2025-05-02'),
(9, 2, '2025-05-06'),
(7, 2, '2025-05-08'),
(6, 2, '2025-05-10');

-- Jugador 3: Carlos77
INSERT INTO Partida (diamantes, idJugador, f_partida)
VALUES 
(20, 3, '2025-05-01'),
(18, 3, '2025-05-04'),
(25, 3, '2025-05-06'),
(22, 3, '2025-05-08'),
(30, 3, '2025-05-10'),
(15, 3, '2025-05-12'),
(27, 3, '2025-05-14');

-- Jugador 4: Diana45
INSERT INTO Partida (diamantes, idJugador, f_partida)
VALUES 
(11, 4, '2025-05-02'),
(13, 4, '2025-05-05'),
(17, 4, '2025-05-07'),
(12, 4, '2025-05-09'),
(19, 4, '2025-05-11');

-- Jugador 5: Laura45
INSERT INTO Partida (diamantes, idJugador, f_partida)
VALUES 
(6, 5, '2025-05-03'),
(9, 5, '2025-05-06'),
(8, 5, '2025-05-09');

-- Jugador 6: Francis63
INSERT INTO Partida (diamantes, idJugador, f_partida)
VALUES 
(14, 6, '2025-05-01'),
(16, 6, '2025-05-04'),
(19, 6, '2025-05-07'),
(20, 6, '2025-05-10'),
(21, 6, '2025-05-12'),
(18, 6, '2025-05-14'),
(23, 6, '2025-05-16'),
(25, 6, '2025-05-18');

