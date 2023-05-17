INSERT INTO products (code, name, cost_price, sales_price) VALUES (16,'AZEITE  PORTUGUÊS  EXTRA VIRGEM GALLO 500ML',18.44,20.49);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (18,'BEBIDA ENERGÉTICA VIBE 2L',8.09,8.99);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (19,'ENERGÉTICO  RED BULL ENERGY DRINK 250ML',6.56,7.29);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (20,'ENERGÉTICO RED BULL ENERGY DRINK 355ML',9.71,10.79);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (21,'BEBIDA ENERGÉTICA RED BULL RED EDITION 250ML',10.71,11.71);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (22,'ENERGÉTICO  RED BULL ENERGY DRINK SEM AÇÚCAR 250ML',6.74,7.49);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (23,'ÁGUA MINERAL BONAFONT SEM GÁS 1,5L',2.15,2.39);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (24,'FILME DE PVC WYDA 28CMX15M',3.59,3.99);
INSERT INTO products (code, name, cost_price, sales_price) VALUES (26,'ROLO DE PAPEL ALUMÍNIO WYDA 30CMX7,5M',5.21,5.79);

INSERT INTO packs (code, name, cost_price, sales_price) VALUES (1000,'BEBIDA ENERGÉTICA VIBE 2L - 6 UNIDADES',48.54,53.94);
INSERT INTO packs (code, name, cost_price, sales_price) VALUES (1010,'KIT ROLO DE ALUMINIO + FILME PVC WYDA',8.80,9.78);
INSERT INTO packs (code, name, cost_price, sales_price) VALUES (1020,'SUPER PACK RED BULL VARIADOS - 6 UNIDADES',51.81,57.00);

INSERT INTO packages (product_id, pack_id, quantity) VALUES (18,1000,6);
INSERT INTO packages (product_id, pack_id, quantity) VALUES (24,1010,1);
INSERT INTO packages (product_id, pack_id, quantity) VALUES (26,1010,1);
INSERT INTO packages (product_id, pack_id, quantity) VALUES (19,1020,3);
INSERT INTO packages (product_id, pack_id, quantity) VALUES (21,1020,3);
