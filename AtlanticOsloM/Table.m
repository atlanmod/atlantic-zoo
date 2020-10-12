module Table {

	type Table {
		Rows_ContRef : Row+;
	};

	type Row {
		Cells_ContRef : Cell+;
	};

	type Cell {
		Content_Att : Text;
	};
}