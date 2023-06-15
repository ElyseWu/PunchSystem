DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS is_active;
DROP TABLE IF EXISTS pay_rate;
DROP TABLE IF EXISTS punch_time;
DROP TABLE IF EXISTS request_time_off;
DROP TABLE IF EXISTS shift_assignment;
DROP TABLE IF EXISTS time_sheet;
DROP TABLE IF EXISTS working_time;


CREATE TABLE employees
(
    id         UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    email      VARCHAR(45) UNIQUE          NOT NULL,
    password   TEXT                 NOT NULL,
    first_name VARCHAR(45),
    last_name  VARCHAR(45),
    role       VARCHAR(45)
);

CREATE TABLE is_active
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    employee_id UUID,
    is_active   BOOLEAN
);

CREATE TABLE time_sheet
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    employee_id UUID,
    total_working_time NUMERIC     NOT NULL
);

CREATE TABLE pay_rate
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    employee_id UUID,
    pay_rate    NUMERIC     NOT NULL,
    over_pay_rate NUMERIC     NOT NULL
);

CREATE TABLE punch_time
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    employee_id UUID,
    punch_time  TIMESTAMP          NOT NULL,
    in_out_or_break TEXT           NOT NULL
);

CREATE TABLE working_time
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    employee_id UUID,
    working_time NUMERIC     NOT NULL
);

CREATE TABLE request_time_off
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    employee_id UUID,
    start_time  TIMESTAMP          NOT NULL,
    end_time    TIMESTAMP      NOT NULL
);

CREATE TABLE shift_assignment
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    employee_id UUID,
    start_time  TIMESTAMP          NOT NULL,
    end_time    TIMESTAMP      NOT NULL
);

