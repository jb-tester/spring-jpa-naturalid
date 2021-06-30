CREATE TABLE IF NOT EXISTS PERSON(
                                     id INT AUTO_INCREMENT  PRIMARY KEY,
                                     name VARCHAR(50) NOT NULL,
                                     age int NOT NULL,
                                     card int NOT NULL UNIQUE
);
INSERT into PERSON (name,age,card) VALUES ('irina',51,100);
INSERT into PERSON (name,age,card) VALUES ('andrey',51,101);
INSERT into PERSON (name,age,card) VALUES ('vera',25,200);
INSERT into PERSON (name,age,card) VALUES ('katya',28,201);
INSERT into PERSON (name,age,card) VALUES ('kolya',2,300);
