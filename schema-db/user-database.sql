
DROP DATABASE IF EXISTS fghservice_db;
CREATE DATABASE fghservice_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

DROP USER IF EXISTS 'fghservice_userdb'@'localhost';
CREATE USER 'fghservice_userdb'@'localhost' IDENTIFIED BY 'fghservice_userdb';

GRANT ALL PRIVILEGES ON fghservice_db.* TO 'fghservice_userdb'@'localhost';

