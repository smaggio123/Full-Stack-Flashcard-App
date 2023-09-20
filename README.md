# Flashcard App

## Overview

#### The goal of this app is to help students study for tests faster. This application provides numerous methods for studying flashcards in ways students might find more efficient. In other applications, there is a lack in incentive to read the whole term/definition at the start of studying a set. The applications either start the user with multiple choice or true/false questions. This can lead to the user either guessing or just reading a few words in the answer to make a more accurate guess. When the user tries to write out the term/definition, they will be unlikely to succeed because they did not read the full term/definition. This application fixes that issue by implementing a copying area. The user copies the term/definition, but the term/definition being copied disappears when the user starts typing. This forces the user to read and learn the term/definition right away. There are other learning features implemented that also help the user study. This application is meant to help students memorize terms and definitions by actively thinking about the task rather than allowing the user to simply guess at the start.

## Setup

### Back End
The following instructions are for runnning the program on local host
1.  Download Spring Boot
2.  Clone This repository
3.  Set up the database
4.  Create .env file within project folder
5.  Open up project in Spring Boot
6.  Run the code
7.  Set up front end
8.  Run front end

### Database
When making the database, take note of the username, password, database name, database port number, and host as all of this info is needed for the .env file.
1. Download Postgresql
2. Make the database for local host
3. Run the sql files in the Database folder
4. Insert a user into the user table

### .env file
It should look like this (please insert the proper data accordingly):
##### DATABASE_HOST=localhost
##### DATABASE_PORT=portNumber
##### DATABASE_NAME=nameOfDatabase
##### DATABASE_USERNAME=yourUserName
##### DATABASE_PASSWORD=yourPassword

### Front End
https://github.com/smaggio123/Front-End-Flashcard-App
