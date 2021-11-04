
CREATE TABLE IF NOT EXISTS product (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  product_name VARCHAR(20)  NOT NULL,
  product_description VARCHAR(100) NOT NULL,
  size  VARCHAR(10) NOT NULL,
  price  VARCHAR(10)  NOT NULL,
  INDEX(product_name)
) engine=InnoDB;