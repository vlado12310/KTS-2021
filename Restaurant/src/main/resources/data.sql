-- password is 'admin' (bcrypt encoded)
INSERT INTO USER_TABLE (email,password) VALUES ('menadzer1@maildrop.cc', '$2a$04$SwzgBrIJZhfnzOw7KFcdzOTiY6EFVwIpG7fkF/D1w26G1.fWsi.aK');
-- password is 'user' (bcrypt encoded)
INSERT INTO USER_TABLE (email,password) VALUES ('sanker1@maildrop.cc', '$2a$04$Amda.Gm4Q.ZbXz9wcohDHOhOBaNQAkSS1QO26Eh8Hovu3uzEpQvcq');
-- password is 'user' (bcrypt encoded)
INSERT INTO USER_TABLE (email,password) VALUES ('konobar1@maildrop.cc', '$2a$04$Amda.Gm4Q.ZbXz9wcohDHOhOBaNQAkSS1QO26Eh8Hovu3uzEpQvcq');
-- password is 'user' (bcrypt encoded)
INSERT INTO USER_TABLE (email,password) VALUES ('kuvar1@maildrop.cc', '$2a$04$Amda.Gm4Q.ZbXz9wcohDHOhOBaNQAkSS1QO26Eh8Hovu3uzEpQvcq');

INSERT INTO AUTHORITY (name) VALUES ('ROLE_MANAGER');
INSERT INTO AUTHORITY (name) VALUES ('ROLE_BARTENDER');
INSERT INTO AUTHORITY (name) VALUES ('ROLE_WAITER');
INSERT INTO AUTHORITY (name) VALUES ('ROLE_COOK');

INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (1, 1); -- menadzer has ROLE_MANAGER
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (2, 2); -- sanker has ROLE_BARTENDER
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (3, 3); -- konobar has ROLE_WAITER
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (4, 4); -- kuvar has ROLE_COOK

INSERT INTO DRINK_TABLE (name,price) VALUES ('VINJAK', 3);