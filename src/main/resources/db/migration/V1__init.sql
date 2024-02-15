CREATE TABLE IF NOT EXISTS items (
    id BIGSERIAL,
    name VARCHAR(50),
    price DOUBLE PRECISION,
    short_description VARCHAR(100),
    long_description TEXT,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS inventories (
    id BIGSERIAL,
    quantity INTEGER,
    PRIMARY KEY (id)
);