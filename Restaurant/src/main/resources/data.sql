-- password is 'admin' (bcrypt encoded)
INSERT INTO user_table (email,password) VALUES ('menadzer1@maildrop.cc', '$2a$04$SwzgBrIJZhfnzOw7KFcdzOTiY6EFVwIpG7fkF/D1w26G1.fWsi.aK');
-- password is 'user' (bcrypt encoded)
INSERT INTO user_table (email,password) VALUES ('sanker1@maildrop.cc', '$2a$04$Amda.Gm4Q.ZbXz9wcohDHOhOBaNQAkSS1QO26Eh8Hovu3uzEpQvcq');
-- password is 'user' (bcrypt encoded)
INSERT INTO user_table (email,password) VALUES ('konobar1@maildrop.cc', '$2a$04$Amda.Gm4Q.ZbXz9wcohDHOhOBaNQAkSS1QO26Eh8Hovu3uzEpQvcq');
-- password is 'user' (bcrypt encoded)
INSERT INTO user_table (email,password) VALUES ('kuvar1@maildrop.cc', '$2a$04$Amda.Gm4Q.ZbXz9wcohDHOhOBaNQAkSS1QO26Eh8Hovu3uzEpQvcq');

INSERT INTO authority (name) VALUES ('ROLE_MANAGER');
INSERT INTO authority (name) VALUES ('ROLE_BARTENDER');
INSERT INTO authority (name) VALUES ('ROLE_WAITER');
INSERT INTO authority (name) VALUES ('ROLE_COOK');

insert into user_authority (user_id, authority_id) values (1, 1); -- menadzer has ROLE_MANAGER
insert into user_authority (user_id, authority_id) values (2, 2); -- sanker has ROLE_BARTENDER
insert into user_authority (user_id, authority_id) values (3, 3); -- konobar has ROLE_WAITER
insert into user_authority (user_id, authority_id) values (4, 4); -- kuvar has ROLE_COOK