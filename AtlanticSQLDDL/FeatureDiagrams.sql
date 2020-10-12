CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	description text,
	preliminary Boolean,
	object text,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	description text,
	editable Boolean,
	"key" Boolean,
	value text,
	name text,
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKnode__ Integer
) ;

CREATE TABLE Root (
	__IDRoot__ Integer NOT NULL,
	PRIMARY KEY Root (__IDRoot__)
) ;

CREATE TABLE Child (
	__IDChild__ Integer NOT NULL,
	PRIMARY KEY Child (__IDChild__)
) ;

CREATE TABLE XORGroup (
	__IDXORGroup__ Integer NOT NULL,
	preliminary Boolean,
	name text,
	PRIMARY KEY XORGroup (__IDXORGroup__)
) ;

CREATE TABLE ORGroup (
	__IDORGroup__ Integer NOT NULL,
	preliminary Boolean,
	name text,
	PRIMARY KEY ORGroup (__IDORGroup__)
) ;

CREATE TABLE XORGroup_cx_dst_Child (
	__IDXORGroup__ Integer NOT NULL,
	__IDChild__ Integer NOT NULL
) ;

CREATE TABLE Child_co_src_ORGroup (
	__IDChild__ Integer NOT NULL,
	__IDORGroup__ Integer NOT NULL
) ;

CREATE TABLE Child_cx_src_XORGroup (
	__IDChild__ Integer NOT NULL,
	__IDXORGroup__ Integer NOT NULL
) ;

CREATE TABLE ORGroup_no_src_Node (
	__IDORGroup__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Node_attributes_Attribute (
	__IDNode__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Child_cn_src_Node (
	__IDChild__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Node_nx_dst_XORGroup (
	__IDNode__ Integer NOT NULL,
	__IDXORGroup__ Integer NOT NULL
) ;

CREATE TABLE ORGroup_co_dst_Child (
	__IDORGroup__ Integer NOT NULL,
	__IDChild__ Integer NOT NULL
) ;

CREATE TABLE Node_no_dst_ORGroup (
	__IDNode__ Integer NOT NULL,
	__IDORGroup__ Integer NOT NULL
) ;

CREATE TABLE XORGroup_nx_src_Node (
	__IDXORGroup__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Node_cn_dst_Child (
	__IDNode__ Integer NOT NULL,
	__IDChild__ Integer NOT NULL
) ;
