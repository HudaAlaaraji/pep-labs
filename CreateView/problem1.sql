CREATE VIEW firstname_lastname AS SELECT firstname, lastname FROM site_user;




--CREATE VIEW view_name AS
--SELECT column1, column2, ...
--FROM table_name
--WHERE condition;

--CREATE VIEW [Brazil Customers] AS
--SELECT CustomerName, ContactName
--FROM Customers
--WHERE Country = 'Brazil';
--The syntax for creating a view is as follows:

 --CREATE VIEW view_name AS sql_statement;
 --CREATE VIEW stevesview AS SELECT * FROM site_user WHERE firstname = 'Steve';

--problem1: Create a view called "firstname_lastname" in problem1.sql from the site_user table that only has the firstname and lastname columns.
--NOTE: This table should NOT have the id and age.
         