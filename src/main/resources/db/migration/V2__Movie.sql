CREATE TABLE IF NOT EXISTS movie(
    id INT NOT NULL,
    name VARCHAR(100),
    director VARCHAR(100),
    length VARCHAR(100),
    link VARCHAR(100)
);

ALTER TABLE movie OWNER TO postgres;