INSERT INTO popularity_data(category_id, popularity, aggregation_date, offer_id, stock) VALUES (4, 10, NOW(), 7854323, 310);
INSERT INTO popularity_data(category_id, popularity, aggregation_date, offer_id, stock) VALUES (4, 101, NOW(), 7853211, 3);
INSERT INTO popularity_data(category_id, popularity, aggregation_date, offer_id, stock) VALUES (1, 4, NOW(), 785411, 4);


INSERT INTO category(category_id, name, parent_id,leaf) VALUES (1, 'Root 1', NULL,FALSE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (2, 'Root 2', NULL,FALSE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (3, 'Root 3', NULL,FALSE);


INSERT INTO category(category_id, name, parent_id,leaf) VALUES (11, 'Child 1 Root 1', 1,FALSE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (12, 'Child 2 Root 1', 1,TRUE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (13, 'Child 3 Root 1', 1,TRUE);

INSERT INTO category(category_id, name, parent_id,leaf) VALUES (21, 'Child 1 Root 2', 2,TRUE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (22, 'Child 2 Root 2', 2,TRUE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (23, 'Child 3 Root 2', 2,TRUE);

INSERT INTO category(category_id, name, parent_id,leaf) VALUES (31, 'Child 1 Root 3', 3,TRUE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (32, 'Child 2 Root 3', 3,TRUE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (33, 'Child 3 Root 3', 3,TRUE);

INSERT INTO category(category_id, name, parent_id,leaf) VALUES (111, 'Child 1 Child 1 Root 1', 11,FALSE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (112, 'Child 2 Child 1 Root 1', 11,FALSE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (113, 'Child 3 Child 1 Root 1', 11,FALSE);

INSERT INTO category(category_id, name, parent_id,leaf) VALUES (1111, 'Child 1 Child 1 Child 1 Root 1', 111, TRUE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (1112, 'Child 1 Child 2 Child 1 Root 1', 111, TRUE);
INSERT INTO category(category_id, name, parent_id,leaf) VALUES (1113, 'Child 1 Child 3 Child 1 Root 1', 111, TRUE );
COMMIT;