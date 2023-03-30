create TABLE user_table(
	--Id of the user
	user_id serial primary key,
	--User's username
	user_username varchar(30) not null unique,
	--user's password
	user_password varchar(50) not null,
	--Salt used for the password
	salt varchar(255) not null
)