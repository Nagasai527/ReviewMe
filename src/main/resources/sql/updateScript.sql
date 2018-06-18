use review_me

--Insert statements for product types
INSERT INTO product(prod_Name, description) VALUES ('Apple', 'Electronic Gadgets');
INSERT INTO product(prod_Name, description, parent_product_id) VALUES ('IPhone X', 'Mobile Phone', 1);
INSERT INTO product(prod_Name, description, parent_product_id) VALUES ('IPad', 'Tablet', 1);
INSERT INTO product(prod_Name, description) VALUES ('LG', 'Electronic Appliances');
INSERT INTO product(prod_Name, description, parent_product_id) VALUES ('Model 27L', 'Washing Machine', 3);
INSERT INTO product(prod_Name, description) VALUES ('Samsung', 'Electronic Appliances');

--Insert statements for user
INSERT INTO User(name, email) VALUES ('Naga', 'naga@reviewMe.com');
INSERT INTO User(name, email) VALUES ('Durga', 'durga@corp.com');

--Insert statements for review
INSERT INTO review(product_id, description, posted_by) VALUES (2, 'Got Wonderful Features. Love it!', 1);
INSERT INTO review(product_id, description, posted_by) VALUES (2, 'Android has more features than this.', 2);
INSERT INTO review(product_id, description, posted_by) VALUES (4, 'Fully Automatic! Fantastic..!', 2);