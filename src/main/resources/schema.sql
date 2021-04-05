CREATE SCHEMA IF NOT EXISTS job;

CREATE TABLE IF NOT EXISTS job.job_vacancy_entity (
    id SERIAL PRIMARY KEY,
vacancy_id VARCHAR(255),
description VARCHAR(255),
branded_description VARCHAR(255),
key_skills VARCHAR(255),
experience VARCHAR(255),
alternate_url VARCHAR(255),
apply_alternate_url VARCHAR(255),
code VARCHAR(255),
salary VARCHAR(255),
archived VARCHAR(255),
name VARCHAR(255),
created_at VARCHAR(255),
contacts VARCHAR(255),
response_letter_required VARCHAR(255),
published_at VARCHAR(255));