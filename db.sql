-- Database init
CREATE DATABASE umcs;
CREATE USER spring WITH PASSWORD 'spring';
GRANT ALL PRIVILEGES ON DATABASE umcs TO spring;
\connect umcs
CREATE SCHEMA umcs;

-- Database tables
CREATE TABLE umcs.students
(
  id SERIAL PRIMARY KEY,
  name VARCHAR(64),
  surname VARCHAR(64),
  pesel VARCHAR(11)
);


-- Database access
GRANT ALL PRIVILEGES ON SCHEMA umcs TO spring;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA umcs TO spring;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA umcs To spring;
