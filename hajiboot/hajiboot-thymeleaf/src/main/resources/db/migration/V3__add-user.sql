CREATE TABLE users (username VARCHAR(100) NOT NULL PRIMARY KEY, encoded_password VARCHAR(255));
INSERT INTO users (username, encoded_password) VALUES('user1', '5efe48af58e06cab6d15beaa68ee5fd779025760181da494e0daa92f465177aaf3c65d6bdf6ef477');
INSERT INTO users (username, encoded_password) VALUES('user2', '5efe48af58e06cab6d15beaa68ee5fd779025760181da494e0daa92f465177aaf3c65d6bdf6ef477');
ALTER TABLE customers ADD username VARCHAR(100) NOT NULL DEFAULT 'user1';
ALTER TABLE customers ADD CONSTRAINT FK_CUSTOMERS_USERNAME FOREIGN KEY (username) REFERENCES users;