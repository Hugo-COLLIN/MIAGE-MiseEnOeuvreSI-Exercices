DROP TABLE IF EXISTS clients;
 
CREATE TABLE clients (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);
 
INSERT INTO clients (first_name, last_name, mail, password) VALUES
  ('Léna', 'MOREAU', 'lena_moreau@mail.com', 'léna'),
  ('Thomas', 'DELCOURT', 'thomas_delcourt@mail.com', 'thomas'),
  ('Inès', 'CARVALHO', 'ines_carvalho@mail.com', 'inès'),
  ('Julien', 'MARTEL', 'julien_martel@mail.com', 'julien');