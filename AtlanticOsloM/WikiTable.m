module WikiTable {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Table : LocatedElement {
		Border_Att : Integer32;
		Style_Att : Text;
		Class_Att : Text;
		Caption_ContRef : Caption?;
		Rows_ContRef : Row*;
	};

	type Caption : LocatedElement {
		Content_Att : Text;
	};

	type Row : LocatedElement {
		Cells_ContRef : Cell*;
	};

	type Cell : LocatedElement {
		IsHeading_Att : Logical;
		Align_Att : Text;
		Style_Att : Text;
		Content_Att : Text;
	};
}