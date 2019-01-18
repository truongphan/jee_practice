create table store1.book (
        id  bigserial not null,
        create_by varchar(100),
        create_date timestamp,
        update_by varchar(100),
        update_date timestamp,
        description varchar(255),
        illustrations boolean,
        isbn varchar(255),
        nbOfPage int4,
        price float4,
        title varchar(255),
        primary key (id)
    );

create table store1.customer (
        id  bigserial not null,
        create_by varchar(100),
        create_date timestamp,
        update_by varchar(100),
        update_date timestamp,
        address varchar(255),
        age int4,
        name varchar(255),
        uuid varchar(255),
        primary key (id)
    );

INSERT INTO BOOK(ID, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE, TITLE) values
(1000, 'Best Java EE book ever', true, '1234-5678', 450, 49, 'Beginning Java EE 6');
INSERT INTO BOOK(ID, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE, TITLE) values
(1001, 'No, this is the best ', true, '5678-9012', 550, 53, 'Beginning Java EE 7');
INSERT INTO BOOK(ID, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE, TITLE) values
(1010, 'One ring to rule them all', false, '9012-3456', 222, 23, 'The Lord of the Rings');


