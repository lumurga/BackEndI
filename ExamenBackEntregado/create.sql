CREATE TABLE IF NOT EXISTS Logs (LOG_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT, DATED DATETIME NOT NULL, LOGGER VARCHAR(50) NOT NULL, LEVEL VARCHAR(10) NOT NULL, MESSAGE VARCHAR(1000) NOT NULL);

CREATE TABLE IF NOT EXISTS Odontologos (ID INT PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR(100), Apellido VARCHAR(100), Matricula INT);