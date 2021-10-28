CREATE TABLE CLIENTE (
    id              NUMBER(3) NOT NULL,
    nm_cliente      VARCHAR2(200) NOT NULL,
    ds_endereco     VARCHAR2(200) NOT NULL,
    ds_email        VARCHAR2(200) NOT NULL
);
 
ALTER TABLE CLIENTE ADD CONSTRAINT PK_CLIENTE PRIMARY KEY ( id );
create sequence seq_cliente;


CREATE TABLE VENDA (
    id              NUMBER(3) NOT NULL,
    nm_item         VARCHAR2(200) NOT NULL,
    vl_venda        FLOAT(126) NOT NULL
);
 
ALTER TABLE VENDA ADD CONSTRAINT PK_VENDA PRIMARY KEY ( id );
create sequence seq_venda;