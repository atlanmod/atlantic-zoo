CREATE TABLE Man (
	__IDMan__ Integer NOT NULL,
	language text,
	title text,
	type text,
	date text,
	name text,
	keyword text,
	exemple text,
	PRIMARY KEY Man (__IDMan__)
) ;

CREATE TABLE Meta (
	__IDMeta__ Integer NOT NULL,
	meta text,
	path text,
	category text,
	version_CSI text,
	version_DOC text,
	author text,
	FOREIGN KEY man (__FKman__) REFERENCES Man (__IDMan__),
	PRIMARY KEY Meta (__IDMeta__),
	__FKman__ Integer
) ;

CREATE TABLE Short_Description (
	__IDShort_Description__ Integer NOT NULL,
	name text,
	PRIMARY KEY Short_Description (__IDShort_Description__)
) ;

CREATE TABLE Calling_Sequence (
	__IDCalling_Sequence__ Integer NOT NULL,
	PRIMARY KEY Calling_Sequence (__IDCalling_Sequence__)
) ;

CREATE TABLE Calling_Sequence_Item (
	__IDCalling_Sequence_Item__ Integer NOT NULL,
	FOREIGN KEY calling_Sequence (__FKcalling_Sequence__) REFERENCES Calling_Sequence (__IDCalling_Sequence__),
	PRIMARY KEY Calling_Sequence_Item (__IDCalling_Sequence_Item__),
	__FKcalling_Sequence__ Integer
) ;

CREATE TABLE Param (
	__IDParam__ Integer NOT NULL,
	target text,
	PRIMARY KEY Param (__IDParam__)
) ;

CREATE TABLE Param_Indent (
	__IDParam_Indent__ Integer NOT NULL,
	FOREIGN KEY param (__FKparam__) REFERENCES Param (__IDParam__),
	FOREIGN KEY param_Description (__FKparam_Description__) REFERENCES Param_Description (__IDParam_Description__),
	PRIMARY KEY Param_Indent (__IDParam_Indent__),
	__FKparam__ Integer,
	__FKparam_Description__ Integer
) ;

CREATE TABLE Param_Item (
	__IDParam_Item__ Integer NOT NULL,
	"label" text,
	FOREIGN KEY param_Indent (__FKparam_Indent__) REFERENCES Param_Indent (__IDParam_Indent__),
	FOREIGN KEY param_Name (__FKparam_Name__) REFERENCES Param_Name (__IDParam_Name__),
	FOREIGN KEY param_Description (__FKparam_Description__) REFERENCES Param_Description (__IDParam_Description__),
	PRIMARY KEY Param_Item (__IDParam_Item__),
	__FKparam_Description__ Integer,
	__FKparam_Indent__ Integer,
	__FKparam_Name__ Integer
) ;

CREATE TABLE Param_Name (
	__IDParam_Name__ Integer NOT NULL,
	FOREIGN KEY param_Item (__FKparam_Item__) REFERENCES Param_Item (__IDParam_Item__),
	PRIMARY KEY Param_Name (__IDParam_Name__),
	__FKparam_Item__ Integer
) ;

CREATE TABLE Param_Description (
	__IDParam_Description__ Integer NOT NULL,
	FOREIGN KEY param_Item (__FKparam_Item__) REFERENCES Param_Item (__IDParam_Item__),
	PRIMARY KEY Param_Description (__IDParam_Description__),
	__FKparam_Item__ Integer
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE Description_Indent (
	__IDDescription_Indent__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	PRIMARY KEY Description_Indent (__IDDescription_Indent__),
	__FKdescription__ Integer
) ;

CREATE TABLE Description_Item (
	__IDDescription_Item__ Integer NOT NULL,
	"label" text,
	FOREIGN KEY description_Indent (__FKdescription_Indent__) REFERENCES Description_Indent (__IDDescription_Indent__),
	PRIMARY KEY Description_Item (__IDDescription_Item__),
	__FKdescription_Indent__ Integer
) ;

CREATE TABLE AIMG (
	__IDAIMG__ Integer NOT NULL,
	PRIMARY KEY AIMG (__IDAIMG__)
) ;

CREATE TABLE See_Also (
	__IDSee_Also__ Integer NOT NULL,
	PRIMARY KEY See_Also (__IDSee_Also__)
) ;

CREATE TABLE Exemple (
	__IDExemple__ Integer NOT NULL,
	exemple text,
	xml_space text,
	PRIMARY KEY Exemple (__IDExemple__)
) ;

CREATE TABLE See_Also_Item (
	__IDSee_Also_Item__ Integer NOT NULL,
	FOREIGN KEY see_Also (__FKsee_Also__) REFERENCES See_Also (__IDSee_Also__),
	PRIMARY KEY See_Also_Item (__IDSee_Also_Item__),
	__FKsee_Also__ Integer
) ;

CREATE TABLE A (
	__IDA__ Integer NOT NULL,
	href text,
	FOREIGN KEY psppp (__FKpsppp__) REFERENCES PSPPP (__IDPSPPP__),
	FOREIGN KEY authors_Item (__FKauthors_Item__) REFERENCES Authors_Item (__IDAuthors_Item__),
	PRIMARY KEY A (__IDA__),
	__FKpsppp__ Integer,
	__FKauthors_Item__ Integer
) ;

CREATE TABLE Img (
	__IDImg__ Integer NOT NULL,
	src text,
	FOREIGN KEY psppp (__FKpsppp__) REFERENCES PSPPP (__IDPSPPP__),
	PRIMARY KEY Img (__IDImg__),
	__FKpsppp__ Integer
) ;

CREATE TABLE Biblio (
	__IDBiblio__ Integer NOT NULL,
	PRIMARY KEY Biblio (__IDBiblio__)
) ;

CREATE TABLE Used_Functions (
	__IDUsed_Functions__ Integer NOT NULL,
	PRIMARY KEY Used_Functions (__IDUsed_Functions__)
) ;

CREATE TABLE PSPPP (
	__IDPSPPP__ Integer NOT NULL,
	PRIMARY KEY PSPPP (__IDPSPPP__)
) ;

CREATE TABLE P (
	__IDP__ Integer NOT NULL,
	FOREIGN KEY biblio (__FKbiblio__) REFERENCES Biblio (__IDBiblio__),
	PRIMARY KEY P (__IDP__),
	__FKbiblio__ Integer
) ;

CREATE TABLE SP (
	__IDSP__ Integer NOT NULL,
	FOREIGN KEY biblio (__FKbiblio__) REFERENCES Biblio (__IDBiblio__),
	PRIMARY KEY SP (__IDSP__),
	__FKbiblio__ Integer
) ;

CREATE TABLE PP (
	__IDPP__ Integer NOT NULL,
	FOREIGN KEY biblio (__FKbiblio__) REFERENCES Biblio (__IDBiblio__),
	PRIMARY KEY PP (__IDPP__),
	__FKbiblio__ Integer
) ;

CREATE TABLE Itemize (
	__IDItemize__ Integer NOT NULL,
	"label" text,
	FOREIGN KEY item (__FKitem__) REFERENCES Item (__IDItem__),
	FOREIGN KEY section (__FKsection__) REFERENCES Section (__IDSection__),
	FOREIGN KEY authors_Item (__FKauthors_Item__) REFERENCES Authors_Item (__IDAuthors_Item__),
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	PRIMARY KEY Itemize (__IDItemize__),
	__FKsection__ Integer,
	__FKitem__ Integer,
	__FKdescription__ Integer,
	__FKauthors_Item__ Integer
) ;

CREATE TABLE Item (
	__IDItem__ Integer NOT NULL,
	PRIMARY KEY Item (__IDItem__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	FOREIGN KEY used_Functions (__FKused_Functions__) REFERENCES Used_Functions (__IDUsed_Functions__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKused_Functions__ Integer
) ;

CREATE TABLE Table_New_Row (
	__IDTable_New_Row__ Integer NOT NULL,
	FOREIGN KEY "table" (__FKtable__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY Table_New_Row (__IDTable_New_Row__),
	__FKtable__ Integer
) ;

CREATE TABLE Table_New_Column (
	__IDTable_New_Column__ Integer NOT NULL,
	FOREIGN KEY table_New_Row (__FKtable_New_Row__) REFERENCES Table_New_Row (__IDTable_New_Row__),
	PRIMARY KEY Table_New_Column (__IDTable_New_Column__),
	__FKtable_New_Row__ Integer
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	link text,
	FOREIGN KEY psppp (__FKpsppp__) REFERENCES PSPPP (__IDPSPPP__),
	FOREIGN KEY see_Also_Item (__FKsee_Also_Item__) REFERENCES See_Also_Item (__IDSee_Also_Item__),
	FOREIGN KEY authors_Item (__FKauthors_Item__) REFERENCES Authors_Item (__IDAuthors_Item__),
	PRIMARY KEY Link (__IDLink__),
	__FKpsppp__ Integer,
	__FKauthors_Item__ Integer,
	__FKsee_Also_Item__ Integer
) ;

CREATE TABLE Authors (
	__IDAuthors__ Integer NOT NULL,
	PRIMARY KEY Authors (__IDAuthors__)
) ;

CREATE TABLE Authors_Item (
	__IDAuthors_Item__ Integer NOT NULL,
	"label" text,
	FOREIGN KEY authors (__FKauthors__) REFERENCES Authors (__IDAuthors__),
	PRIMARY KEY Authors_Item (__IDAuthors_Item__),
	__FKauthors__ Integer
) ;

CREATE TABLE Section (
	__IDSection__ Integer NOT NULL,
	PRIMARY KEY Section (__IDSection__)
) ;

CREATE TABLE Authors_Item_itemize_Itemize (
	__IDAuthors_Item__ Integer NOT NULL,
	__IDItemize__ Integer NOT NULL
) ;

CREATE TABLE Section_itemize_Itemize (
	__IDSection__ Integer NOT NULL,
	__IDItemize__ Integer NOT NULL
) ;

CREATE TABLE Calling_Sequence_calling_Sequence_Item_Calling_Sequence_Item (
	__IDCalling_Sequence__ Integer NOT NULL,
	__IDCalling_Sequence_Item__ Integer NOT NULL
) ;

CREATE TABLE PSPPP_link_Link (
	__IDPSPPP__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Man_meta_Meta (
	__IDMan__ Integer NOT NULL,
	__IDMeta__ Integer NOT NULL
) ;

CREATE TABLE See_Also_see_Also_Item_See_Also_Item (
	__IDSee_Also__ Integer NOT NULL,
	__IDSee_Also_Item__ Integer NOT NULL
) ;

CREATE TABLE Biblio_p_P (
	__IDBiblio__ Integer NOT NULL,
	__IDP__ Integer NOT NULL
) ;

CREATE TABLE Authors_Item_a_A (
	__IDAuthors_Item__ Integer NOT NULL,
	__IDA__ Integer NOT NULL
) ;

CREATE TABLE Item_itemize_Itemize (
	__IDItem__ Integer NOT NULL,
	__IDItemize__ Integer NOT NULL
) ;

CREATE TABLE Description_Indent_description_Item_Description_Item (
	__IDDescription_Indent__ Integer NOT NULL,
	__IDDescription_Item__ Integer NOT NULL
) ;

CREATE TABLE Description_itemize_Itemize (
	__IDDescription__ Integer NOT NULL,
	__IDItemize__ Integer NOT NULL
) ;

CREATE TABLE Used_Functions_table_Table (
	__IDUsed_Functions__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;

CREATE TABLE PSPPP_img_Img (
	__IDPSPPP__ Integer NOT NULL,
	__IDImg__ Integer NOT NULL
) ;

CREATE TABLE Authors_Item_link_Link (
	__IDAuthors_Item__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE See_Also_Item_link_Link (
	__IDSee_Also_Item__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Biblio_pp_PP (
	__IDBiblio__ Integer NOT NULL,
	__IDPP__ Integer NOT NULL
) ;

CREATE TABLE Authors_authors_Item_Authors_Item (
	__IDAuthors__ Integer NOT NULL,
	__IDAuthors_Item__ Integer NOT NULL
) ;

CREATE TABLE Param_Indent_param_Item_Param_Item (
	__IDParam_Indent__ Integer NOT NULL,
	__IDParam_Item__ Integer NOT NULL
) ;

CREATE TABLE Param_Description_param_Indent_Param_Indent (
	__IDParam_Description__ Integer NOT NULL,
	__IDParam_Indent__ Integer NOT NULL
) ;

CREATE TABLE Table_New_Row_table_New_Column_Table_New_Column (
	__IDTable_New_Row__ Integer NOT NULL,
	__IDTable_New_Column__ Integer NOT NULL
) ;

CREATE TABLE Table_table_New_Row_Table_New_Row (
	__IDTable__ Integer NOT NULL,
	__IDTable_New_Row__ Integer NOT NULL
) ;

CREATE TABLE PSPPP_a_A (
	__IDPSPPP__ Integer NOT NULL,
	__IDA__ Integer NOT NULL
) ;

CREATE TABLE Param_param_Indent_Param_Indent (
	__IDParam__ Integer NOT NULL,
	__IDParam_Indent__ Integer NOT NULL
) ;

CREATE TABLE Biblio_sp_SP (
	__IDBiblio__ Integer NOT NULL,
	__IDSP__ Integer NOT NULL
) ;

CREATE TABLE Description_description_Indent_Description_Indent (
	__IDDescription__ Integer NOT NULL,
	__IDDescription_Indent__ Integer NOT NULL
) ;
