DROP TABLE IF EXISTS EXERCISES;

CREATE TABLE EXERCISES
(
   id VARCHAR(255) NOT NULL,
   date DATE,
   breathingRepetitions INT(100),
   primary key(id)
);

INSERT INTO EXERCISES (id, date, breathingRepetitions) VALUES ('b8b2dc38-6847-4107-81ca-7dc55cbb4243', '2020-01-12',  30);
INSERT INTO EXERCISES (id, date, breathingRepetitions) VALUES ('54c5c5e7-a6f8-47ac-80cc-6037218c96c0', '2020-03-04', 40);
INSERT INTO EXERCISES (id, date, breathingRepetitions) VALUES ('45aa6c57-8f78-4ee3-9178-cbda2259aaba', '2020-05-18', 30);