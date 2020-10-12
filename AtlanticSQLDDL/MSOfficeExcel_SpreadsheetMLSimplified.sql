CREATE TABLE DateTimeType (
	__IDDateTimeType__ Integer NOT NULL,
	year Integer,
	month Integer,
	day Integer,
	hour Integer,
	minute Integer,
	second Integer,
	PRIMARY KEY DateTimeType (__IDDateTimeType__)
) ;

CREATE TABLE ValueType (
	__IDValueType__ Integer NOT NULL,
	FOREIGN KEY vt_data (__FKvt_data__) REFERENCES Data (__IDData__),
	PRIMARY KEY ValueType (__IDValueType__),
	__FKvt_data__ Integer
) ;

CREATE TABLE StringValue (
	__IDStringValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringValue (__IDStringValue__)
) ;

CREATE TABLE NumberValue (
	__IDNumberValue__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY NumberValue (__IDNumberValue__)
) ;

CREATE TABLE DateTimeTypeValue (
	__IDDateTimeTypeValue__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES DateTimeType (__IDDateTimeType__),
	PRIMARY KEY DateTimeTypeValue (__IDDateTimeTypeValue__),
	__FKvalue__ Integer
) ;

CREATE TABLE BooleanValue (
	__IDBooleanValue__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanValue (__IDBooleanValue__)
) ;

CREATE TABLE ErrorValue (
	__IDErrorValue__ Integer NOT NULL,
	PRIMARY KEY ErrorValue (__IDErrorValue__)
) ;

CREATE TABLE Workbook (
	__IDWorkbook__ Integer NOT NULL,
	PRIMARY KEY Workbook (__IDWorkbook__)
) ;

CREATE TABLE Worksheet (
	__IDWorksheet__ Integer NOT NULL,
	FOREIGN KEY ws_workbook (__FKws_workbook__) REFERENCES Workbook (__IDWorkbook__),
	FOREIGN KEY ws_table (__FKws_table__) REFERENCES "Table" (__IDTable__),
	name text,
	PRIMARY KEY Worksheet (__IDWorksheet__),
	__FKws_workbook__ Integer,
	__FKws_table__ Integer
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	FOREIGN KEY t_worksheet (__FKt_worksheet__) REFERENCES Worksheet (__IDWorksheet__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKt_worksheet__ Integer
) ;

CREATE TABLE TableElement (
	__IDTableElement__ Integer NOT NULL,
	"index" Integer,
	PRIMARY KEY TableElement (__IDTableElement__)
) ;

CREATE TABLE ColOrRowElement (
	__IDColOrRowElement__ Integer NOT NULL,
	hidden Boolean,
	span Integer,
	PRIMARY KEY ColOrRowElement (__IDColOrRowElement__)
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	FOREIGN KEY c_table (__FKc_table__) REFERENCES "Table" (__IDTable__),
	autoFitWidth Boolean,
	width "Double",
	PRIMARY KEY "Column" (__IDColumn__),
	__FKc_table__ Integer
) ;

CREATE TABLE Row (
	__IDRow__ Integer NOT NULL,
	FOREIGN KEY r_table (__FKr_table__) REFERENCES "Table" (__IDTable__),
	autoFitHeight Boolean,
	height "Double",
	PRIMARY KEY Row (__IDRow__),
	__FKr_table__ Integer
) ;

CREATE TABLE Cell (
	__IDCell__ Integer NOT NULL,
	FOREIGN KEY c_row (__FKc_row__) REFERENCES Row (__IDRow__),
	arrayRange text,
	formula text,
	hRef text,
	mergeAcross "Double",
	mergeDown "Double",
	FOREIGN KEY c_data (__FKc_data__) REFERENCES Data (__IDData__),
	PRIMARY KEY Cell (__IDCell__),
	__FKc_row__ Integer,
	__FKc_data__ Integer
) ;

CREATE TABLE Data (
	__IDData__ Integer NOT NULL,
	FOREIGN KEY d_cell (__FKd_cell__) REFERENCES Cell (__IDCell__),
	FOREIGN KEY value (__FKvalue__) REFERENCES ValueType (__IDValueType__),
	PRIMARY KEY Data (__IDData__),
	__FKvalue__ Integer,
	__FKd_cell__ Integer
) ;

CREATE TABLE Workbook_wb_worksheets_Worksheet (
	__IDWorkbook__ Integer NOT NULL,
	__IDWorksheet__ Integer NOT NULL
) ;

CREATE TABLE Row_r_cells_Cell (
	__IDRow__ Integer NOT NULL,
	__IDCell__ Integer NOT NULL
) ;

CREATE TABLE Table_t_cols_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Table_t_rows_Row (
	__IDTable__ Integer NOT NULL,
	__IDRow__ Integer NOT NULL
) ;
