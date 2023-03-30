create TABLE folder_table(
	--Id of the folder
	folder_id serial primary key,
	--name of folder
	folder_name varchar(20) not null,
	--User associated with the folder
	user_id integer,
	
	foreign key(user_id) references user_table
)