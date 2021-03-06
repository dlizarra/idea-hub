-- users
INSERT INTO "users"("id","username", "password", "enabled") VALUES (1, 'david', '$2a$10$.ysnHr4PeaEgfljWaHexYO41hvcqmxLFOG69179iOLkHUKXRFpXKu', 1);
INSERT INTO "users"("id","username", "password", "enabled") VALUES (2, 'mark', '$2a$10$QIWJYadawFt4QQut5MRgdeSMQKFPROQELPWphpGgHYQl3VwLsqcgS', 1);
INSERT INTO "users"("id","username", "password", "enabled") VALUES (3, 'john', '$2a$10$LUVfN36xEPS4kqD7NNUuUemaI30J6wzYpkYN6X7UzYhpDun6vaLFC', 1);
INSERT INTO "users"("id","username", "password", "enabled") VALUES (4, 'ryan', '$2a$10$RwAaoqOzsS9J1RSivRozUeOj1Bs/uExeP1TMa6wG21zwll3Yp9DUC', 1);
INSERT INTO "users"("id","username", "password", "enabled") VALUES (5, 'martin', '$2a$10$ACRP9z0Ya//Nbym3oQj9Keq4NNXwoq.oyCnUlx1819RvlzLcqDTJq/uExeP1TMa6wG21zwll3Yp9DUC', 1);

-- idea
INSERT INTO "idea"("id","name", "description", "creator_id", "creation_time") VALUES (
  1,
  'Home Medical Analysis System',
  'Description for Project 1',
  1,
  '2016-07-21'
);
INSERT INTO "idea"("id","name", "description", "creator_id", "creation_time") VALUES (
  2,
  'Experimental helping bots',
  'Description for Project 2',
  2,
  '2016-07-22'
);
INSERT INTO "idea"("id","name", "description", "creator_id", "creation_time") VALUES (
  3,
  'Instant personalized TV news reports',
  'Description for Project 3',
  3,
  '2016-07-23'
);
INSERT INTO "idea"("id","name", "description", "creator_id", "creation_time") VALUES (
  4,
  'CouchSurfing mobile app',
  'Description for Project 4',
  4,
  '2016-07-22'
);
INSERT INTO "idea"("id","name", "description", "creator_id", "creation_time") VALUES (
  5,
  'Real time kids tracking',
  'Description for Project 5',
  5,
  '2016-07-22'
);

-- role
INSERT INTO "role"("id", "rolename", "user_id") VALUES (1, 'ROLE_ADMIN', 1);
INSERT INTO "role"("id", "rolename", "user_id") VALUES (2, 'ROLE_USER', 1);
INSERT INTO "role"("id", "rolename", "user_id") VALUES (3, 'ROLE_USER', 2);
INSERT INTO "role"("id", "rolename", "user_id") VALUES (4, 'ROLE_USER', 3);
INSERT INTO "role"("id", "rolename", "user_id") VALUES (5, 'ROLE_USER', 4);
INSERT INTO "role"("id", "rolename", "user_id") VALUES (6, 'ROLE_USER', 5);

-- project2users
INSERT INTO "idea2users"("idea_id", "user_id") VALUES (1, 2);
INSERT INTO "idea2users"("idea_id", "user_id") VALUES (1, 3);
