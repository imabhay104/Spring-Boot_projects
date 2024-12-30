---- Insert a new timetable
INSERT INTO TIMETABLE (date) VALUES ('2024-12-08');
INSERT INTO timetable (date) VALUES ('2024-12-09');
INSERT INTO timetable (date) VALUES ('2024-12-10');
INSERT INTO timetable (date) VALUES ('2024-12-11');
INSERT INTO timetable (date) VALUES ('2024-12-12');


-- Insert schedule tasks for the timetable with id 1 (e.g., '2024-12-08')
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Exercise', true, 1);
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Drink 5L water', false, 1);

-- Insert schedule tasks for the timetable with id 2 (e.g., '2024-12-09')
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Read a book', false, 2);
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Walk for 30 minutes', true, 2);

-- Insert schedule tasks for the timetable with id 3 (e.g., '2024-12-10')
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Meditate', true, 3);
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Work on project', false, 3);

-- Insert schedule tasks for the timetable with id 4 (e.g., '2024-12-11')
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Exercise', true, 4);
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Drink 5L water', true, 4);

-- Insert schedule tasks for the timetable with id 5 (e.g., '2024-12-12')
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Cook dinner', false, 5);
INSERT INTO schedule (task_name, done, timetable_id) VALUES ('Plan the day', true, 5);
