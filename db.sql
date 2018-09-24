INSERT INTO sec_role (id,role)
VALUES
	(1,'ADMIN');

INSERT INTO sec_user (id, active, email, last_name, name, password)
VALUES
	(1,1,'admin@gmail.com','s','Sam','sam'),
	(2,1,'admin@gmail.com','s','youtube','youtube');

INSERT INTO user_role (user_id, role_id)
VALUES
	(1,1);