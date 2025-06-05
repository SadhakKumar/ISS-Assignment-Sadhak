# Advanced SQL Queries with Constraints and Functions

### This document contains SQL queries demonstrating advanced concepts such as DROP, ALTER, AUTO INCREMENT, VIEWS, handling NULL values, GROUP BY, HAVING, and NULL functions.

# DROP Table

## Used to delete a table

```sql
CREATE TABLE TestTable(TestID INT PRIMARY KEY);

drop table TestTable;
```

![Drop](assets/Advance_Queries/Drop.png)

# Alter Table

## Adding a new column

```sql
ALTER TABLE Professors
ADD Email VARCHAR(100);

select * from Professors;
```

![Alter Image](assets/Advance_Queries/AlterTable.png)

# Modify a column

## Change the datatype of a column

```sql
ALTER TABLE Departments
MODIFY DeptName VARCHAR(150);

Desc Departments;
```

![Modify](assets/Advance_Queries/Modify.png)

# View

## View for professors with high salary

```sql
CREATE VIEW HighPaidProfessors AS
SELECT Name, Salary FROM Professors
WHERE Salary > 40000;
```

![view](assets/Advance_Queries/View.png)

# Null value

## Insert Null Value

```sql
INSERT INTO Departments (DeptID, DeptName, HeadOfDepartment)
VALUES (10, 'Civil', NULL);
```

![insert null value](assets/Advance_Queries/InsertNullValue.png)

## Query Null value

```sql
SELECT * FROM Departments
WHERE HeadOfDepartment IS NULL;
```

# Group By

```sql
SELECT DeptID, COUNT(*) AS TotalProfessors
FROM Professors
GROUP BY DeptID;
```

![group by](assets/Advance_Queries/GroupBy.png)

# Having

```sql
SELECT DeptID, AVG(Salary) AS AvgSalary
FROM Professors
GROUP BY DeptID
HAVING AVG(Salary) > 20000;
```

![having](assets/Advance_Queries/having.png)

# Null Functions

```sql
SELECT Name, IFNULL(Email, 'No Email') AS EmailStatus FROM Professors;
```

![null functions](assets/Advance_Queries/NullFunctions.png)

# Prepared Statement

```sql
PREPARE stmt FROM 'SELECT * FROM Professors WHERE DeptID = ?';
SET @dept = 1;
EXECUTE stmt USING @dept;
```

![prepare statement](assets/Advance_Queries/PrepareStatement.png)

# Stored Procedure

## Create stored procedure to get professors with salary > 25000:

```sql
DELIMITER //
CREATE PROCEDURE GetHighPaidProfessors()
BEGIN
    SELECT * FROM Professors WHERE Salary > 25000;
END //
DELIMITER ;

CALL GetHighPaidProfessors() //
```

![procedure](assets/Advance_Queries/ProcedureCreation.png)

![procedure calling](assets/Advance_Queries/ProcedureCalling.png)
