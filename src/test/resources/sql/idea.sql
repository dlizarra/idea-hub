-- users
INSERT INTO "users"("id","username", "password", "enabled") VALUES (1, 'david', 'david', 1);
INSERT INTO "users"("id","username", "password", "enabled") VALUES (2, 'mark', 'mark', 1);
-- idea
INSERT INTO "idea"("id","name", "creator_id") VALUES (1, 'Project1', 1);
INSERT INTO "idea"("id","name", "creator_id") VALUES (2, 'Project2', 1);
-- role
INSERT INTO "role"("id", "rolename", "user_id") VALUES (1, 'ROLE_ADMIN', 1);
INSERT INTO "role"("id", "rolename", "user_id") VALUES (2, 'ROLE_USER', 1);
INSERT INTO "role"("id", "rolename", "user_id") VALUES (3, 'ROLE_USER', 2);
-- project2users
INSERT INTO "idea2users"("idea_id", "user_id") VALUES (1, 1);
INSERT INTO "idea2users"("idea_id", "user_id") VALUES (1, 2);
INSERT INTO "idea2users"("idea_id", "user_id") VALUES (2, 1);
