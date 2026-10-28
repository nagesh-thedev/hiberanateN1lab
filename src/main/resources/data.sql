
-- Departments
INSERT IGNORE INTO department (id, name) VALUES
(1, 'Engineering'),
(2, 'Human Resources'),
(3, 'Finance');

-- Employees
INSERT IGNORE INTO employee (id, name, email, department_id) VALUES
(1, 'Rahul Sharma', 'rahul.sharma@example.com', 1),
(2, 'Priya Reddy', 'priya.reddy@example.com', 1),
(3, 'Arjun Kumar', 'arjun.kumar@example.com', 1),

(4, 'Sneha Patel', 'sneha.patel@example.com', 2),
(5, 'Vikram Singh', 'vikram.singh@example.com', 2),
(6, 'Ananya Das', 'ananya.das@example.com', 2),

(7, 'Kiran Rao', 'kiran.rao@example.com', 3),
(8, 'Meera Nair', 'meera.nair@example.com', 3),
(9, 'Rohit Verma', 'rohit.verma@example.com', 3);
