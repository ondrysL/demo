CREATE TABLE IF NOT EXISTS song(
    id INT NOT NULL,
    name VARCHAR(100),
    author VARCHAR(100),
    link VARCHAR(250)
);

ALTER TABLE song OWNER TO postgres;