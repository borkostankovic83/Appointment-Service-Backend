insert into user(id, email, first_name, last_name, password, role, registration_date) values (1, 'borko@yahoo.com', 'Borko', 'Stankovic', '1234', 'Vet', CURRENT_TIMESTAMP);
insert into user(id, email, first_name, last_name, password, role, registration_date) values (2, 'john@yahoo.com', 'John', 'Doe', '1234', 'User', CURRENT_TIMESTAMP);
insert into user(id, email, first_name, last_name, password, role, registration_date) values (3, 'mark@yahoo.com', 'Mark', 'Magic', '1234', 'Admin', CURRENT_TIMESTAMP);


insert into pet(id, user_id, pet_name, pet_type, breed, gender, age) values (1, 1, 'Viki', 'Borzoi', 'Dog', 'Male', '12');
insert into pet(id, user_id, pet_name, pet_type, breed, gender, age) values (2, 1, 'Abby', 'Husky', 'Dog', 'Female', '6');
insert into pet(id, user_id, pet_name, pet_type, breed, gender, age) values (3, 2, 'Leo', 'Borzoi', 'Dog', 'Male', '3');

