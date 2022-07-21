CREATE TABLE IF NOT EXISTS book(
    id int NOT NULL,
    name VARCHAR(100),
    author VARCHAR(100),
    site int,
    link text
);

ALTER TABLE book OWNER TO postgres;