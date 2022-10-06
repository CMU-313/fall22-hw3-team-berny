alter table T_DOCUMENT add column DOC_COUNTRY_OF_RESIDENCE_C varchar(500);
alter table T_DOCUMENT add column DOC_RACE_C varchar(500);
-- update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';