-- SCHEMA: store-1

-- DROP SCHEMA "store-1" ;

CREATE SCHEMA "store-1"
    AUTHORIZATION postgres;
	
set schema 'public';
create table book (
        id  bigserial not null,
        description varchar(255),
        illustrations boolean,
        isbn varchar(255),
        nbOfPage int4,
        price float4,
        title varchar(255),
        primary key (id)
    );

INSERT INTO BOOK(ID, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE, TITLE) values
(1000, 'Best Java EE book ever', true, '1234-5678', 450, 49, 'Beginning Java EE 6');
INSERT INTO BOOK(ID, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE, TITLE) values
(1001, 'No, this is the best ', true, '5678-9012', 550, 53, 'Beginning Java EE 7');
INSERT INTO BOOK(ID, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE, TITLE) values
(1010, 'One ring to rule them all', false, '9012-3456', 222, 23, 'The Lord of the Rings');


