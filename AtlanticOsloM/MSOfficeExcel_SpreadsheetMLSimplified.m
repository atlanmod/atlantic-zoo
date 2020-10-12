module SpreadsheetMLSimplified {

	type DateTimeType {
		Year_Att : Integer32;
		Month_Att : Integer32;
		Day_Att : Integer32;
		Hour_Att : Integer32;
		Minute_Att : Integer32;
		Second_Att : Integer32;
	};

	type ValueType {
		Vt_data_Ref : Data;
	};

	type StringValue : ValueType {
		Value_Att : Text;
	};

	type NumberValue : ValueType {
		Value_Att : Double;
	};

	type DateTimeTypeValue : ValueType {
		Value_ContRef : DateTimeType;
	};

	type BooleanValue : ValueType {
		Value_Att : Logical;
	};

	type ErrorValue : ValueType;

	type Workbook {
		Wb_worksheets_ContRef : Worksheet*;
	};

	type Worksheet {
		Ws_workbook_Ref : Workbook;
		Ws_table_ContRef : Table?;
		Name_Att : Text;
	};

	type Table {
		T_worksheet_Ref : Worksheet;
		T_cols_ContRef : Column*;
		T_rows_ContRef : Row*;
	};

	type TableElement {
		Index_Att : Integer32;
	};

	type ColOrRowElement : TableElement {
		Hidden_Att : Logical;
		Span_Att : Integer32;
	};

	type Column : ColOrRowElement {
		C_table_Ref : Table;
		AutoFitWidth_Att : Logical;
		Width_Att : Double;
	};

	type Row : ColOrRowElement {
		R_table_Ref : Table;
		R_cells_ContRef : Cell*;
		AutoFitHeight_Att : Logical;
		Height_Att : Double;
	};

	type Cell : TableElement {
		C_row_Ref : Row;
		ArrayRange_Att : Text;
		Formula_Att : Text;
		HRef_Att : Text;
		MergeAcross_Att : Double;
		MergeDown_Att : Double;
		C_data_ContRef : Data?;
	};

	type Data {
		D_cell_Ref : Cell;
		Value_ContRef : ValueType;
	};
}