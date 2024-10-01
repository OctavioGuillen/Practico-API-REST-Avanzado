-- Crear el esquema RBAC
CREATE SCHEMA IF NOT EXISTS RBAC;

-- Crear una tabla de ejemplo en el esquema RBAC
CREATE TABLE IF NOT EXISTS RBAC.usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    email VARCHAR(100)
);