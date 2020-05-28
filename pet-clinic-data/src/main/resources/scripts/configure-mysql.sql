CREATE DATABASE spring_pet_clinic_dev;
CREATE DATABASE spring_pet_clinic_prod;

CREATE USER 'spring_pet_clinic_dev'@'localhost' IDENTIFIED BY 'guru';
CREATE USER 'spring_pet_clinic_dev'@'%' IDENTIFIED BY 'guru';
CREATE USER 'spring_pet_clinic_prod'@'localhost' IDENTIFIED BY 'guru';
CREATE USER 'spring_pet_clinic_prod'@'%' IDENTIFIED BY 'guru';

GRANT SELECT ON sfg_dev.* TO 'spring_pet_clinic_dev'@'localhost';
GRANT INSERT ON sfg_dev.* TO 'spring_pet_clinic_dev'@'localhost';
GRANT UPDATE ON sfg_dev.* TO 'spring_pet_clinic_dev'@'localhost';
GRANT DELETE ON sfg_dev.* TO 'spring_pet_clinic_dev'@'localhost';
GRANT SELECT ON sfg_dev.* TO 'spring_pet_clinic_dev'@'%';
GRANT INSERT ON sfg_dev.* TO 'spring_pet_clinic_dev'@'%';
GRANT UPDATE ON sfg_dev.* TO 'spring_pet_clinic_dev'@'%';
GRANT DELETE ON sfg_dev.* TO 'spring_pet_clinic_dev'@'%';

GRANT SELECT ON sfg_prod.* TO 'spring_pet_clinic_prod'@'localhost';
GRANT INSERT ON sfg_prod.* TO 'spring_pet_clinic_prod'@'localhost';
GRANT UPDATE ON sfg_prod.* TO 'spring_pet_clinic_prod'@'localhost';
GRANT DELETE ON sfg_prod.* TO 'spring_pet_clinic_prod'@'localhost';
GRANT SELECT ON sfg_prod.* TO 'spring_pet_clinic_prod'@'%';
GRANT INSERT ON sfg_prod.* TO 'spring_pet_clinic_prod'@'%';
GRANT UPDATE ON sfg_prod.* TO 'spring_pet_clinic_prod'@'%';
GRANT DELETE ON sfg_prod.* TO 'spring_pet_clinic_prod'@'%';