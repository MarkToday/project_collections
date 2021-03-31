CREATE DATABASE test01 CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE DATABASE test02 CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE test01.`t_student` (
                             `id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
                             `name` VARCHAR ( 255 ) DEFAULT NULL,
                             `age` INT ( 11 ) DEFAULT NULL,
                             `classname` VARCHAR ( 255 ) DEFAULT NULL,
                             PRIMARY KEY ( `id` )
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;


CREATE TABLE test02.`t_teacher` (
                             `id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
                             `name` VARCHAR ( 255 ) DEFAULT NULL,
                             `age` INT ( 11 ) DEFAULT NULL,
                             `subject` VARCHAR ( 255 ) DEFAULT NULL,
                             PRIMARY KEY ( `id` )
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;