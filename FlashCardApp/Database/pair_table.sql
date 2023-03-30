create TABLE pair_table(
	--Id of the pair
	pair_id serial primary key,
	--Term in pair
	term varchar(200),
	--definition in pair
	definition varchar(200),
	
	--set associated with the pair
	set_id integer,
	foreign key(set_id) references set_table,
	
	--folder associated with the pair
	folder_id integer,
	foreign key(folder_id) references folder_table,
	
	--User associated with the pair
	user_id integer,
	foreign key(user_id) references user_table
)