create TABLE set_table(
	--Id of the set
	set_id serial primary key,
	--folder associated with the set
	folder_id integer,
	foreign key(folder_id) references folder_table,
	
	--User associated with the set
	user_id integer,
	foreign key(user_id) references user_table
)