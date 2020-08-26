DROP TABLE IF EXISTS customers;

CREATE TABLE customers(
   id INT PRIMARY KEY,
   firstName VARCHAR(250) NOT NULL,
   lastName VARCHAR(250) NOT NULL,
   email VARCHAR(250) NOT NULL
);

INSERT INTO customers(id, firstName, lastName, email) VALUES (1, 'first', 'last', 'abc@gmail.com')