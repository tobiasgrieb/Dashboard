DROP TABLE IF EXISTS EXERCISES;

CREATE TABLE EXERCISES
(
   id VARCHAR(255) NOT NULL,
   exercise VARCHAR(75) NOT NULL,
   primary key(id)
);

INSERT INTO EXERCISES (id, exercise) VALUES ('b8b2dc38-6847-4107-81ca-7dc55cbb4243', 'Breathing');
INSERT INTO EXERCISES (id, exercise) VALUES ('54c5c5e7-a6f8-47ac-80cc-6037218c96c0', 'Pushups');
INSERT INTO EXERCISES (id, exercise) VALUES ('45aa6c57-8f78-4ee3-9178-cbda2259aaba', 'Running');