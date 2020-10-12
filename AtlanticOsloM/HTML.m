module HTML {

	type HTML {
		Head_ContRef : HEAD;
		Body_ContRef : BODY;
	};

	type HTMLElement {
		Value_Att : Text;
		Children_ContRef : HTMLElement*;
		Parent_Ref : HTMLElement;
	};

	type HEAD : HTMLElement {
		HeadElements_ContRef : HEADElement*;
		Html_Ref : HTML;
	};

	type HEADElement : HTMLElement {
		Head_Ref : HEAD;
	};

	type LINK : HEADElement {
		Rel_Att : Text;
		Title_Att : Text;
		Ahref_Att : Text;
		Type_Att : Text;
	};

	type TITLE : HEADElement;

	type BODY : HTMLElement {
		Background_Att : Text;
		Bgcolor_Att : Text;
		Text_Att : Text;
		Link_Att : Text;
		Alink_Att : Text;
		Vlink_Att : Text;
		BodyElements_ContRef : BODYElement*;
		Html_Ref : HTML;
	};

	type BODYElement : HTMLElement {
		Body_Ref : BODY;
	};

	type H1 : BODYElement;

	type H2 : BODYElement;

	type H3 : BODYElement;

	type H4 : BODYElement;

	type EM : BODYElement;

	type STRONG : BODYElement;

	type B : BODYElement;

	type I : BODYElement;

	type TT : BODYElement;

	type PRE : BODYElement;

	type BIG : BODYElement;

	type SMALL : BODYElement;

	type SUB : BODYElement;

	type SUP : BODYElement;

	type STRIKE : BODYElement;

	type FONT : BODYElement {
		Color_Att : Text;
		Face_Att : Text;
		Size_Att : Text;
	};

	type IMG : BODYElement {
		Src_Att : Text;
		Width_Att : Text;
		Height_Att : Text;
		Alt_Att : Text;
		Align_Att : Text;
		Vspace_Att : Text;
		Hspace_Att : Text;
		Ismap_Att : Text;
		Usemap_Att : Text;
		Border_Att : Text;
	};

	type BR : BODYElement {
		Clear_Att : Text;
	};

	type MAP : BODYElement;

	type AREA : BODYElement {
		Shape_Att : Text;
		Coords_Att : Text;
		Ahref_Att : Text;
	};

	type STYLE : BODYElement;

	type EMBED : BODYElement {
		Src_Att : Text;
		Width_Att : Text;
		Height_Att : Text;
		Align_Att : Text;
		Vspace_Att : Text;
		Hspace_Att : Text;
		Border_Att : Text;
	};

	type NOEMBED : BODYElement;

	type SPAN : BODYElement {
		Style_Att : Text;
	};

	type A : BODYElement {
		Ahref_Att : Text;
		Name_Att : Text;
		Id_Att : Text;
	};

	type DIV : BODYElement {
		Align_Att : Text;
	};

	type P : BODYElement;

	type TABLEElement : BODYElement {
		Bgcolor_Att : Text;
		Background_Att : Text;
	};

	type TABLE : TABLEElement {
		Border_Att : Text;
		Width_Att : Text;
		Cellspacing_Att : Text;
		Cellpadding_Att : Text;
		Trs_ContRef : TR*;
	};

	type TR : TABLEElement {
		Valign_Att : Text;
		Align_Att : Text;
		Table_Ref : TABLE;
		Tds_ContRef : TD*;
	};

	type TD : TABLEElement {
		Colspan_Att : Text;
		Rowspan_Att : Text;
		Valign_Att : Text;
		Align_Att : Text;
		Width_Att : Text;
		Tr_Ref : TR;
	};

	type TH : TD;

	type FORM {
		Action_Att : Text;
		Method_Att : Text;
	};

	type INPUT {
		Align_Att : Text;
		Maxlength_Att : Text;
		Size_Att : Text;
		Checked_Att : Text;
		Src_Att : Text;
		InputValue_Att : Text;
		Name_Att : Text;
		Type_Att : Text;
	};

	type TEXTAREA {
		Name_Att : Text;
		Rows_Att : Text;
		Cols_Att : Text;
	};

	type SELECT {
		Multiple_Att : Text;
		Size_Att : Text;
		Name_Att : Text;
	};

	type OPTION {
		Selected_Att : Text;
		OptionValue_Att : Text;
	};

	type ListElement {
		Type_Att : Text;
	};

	type OL : ListElement {
		Start_Att : Text;
	};

	type UL : ListElement;

	type LI : ListElement {
		LiValue_Att : Text;
	};

	type DL;

	type DT;

	type DD;

	type APPLET {
		Applet_Att : Text;
		Class_Att : Text;
		Src_Att : Text;
		Align_Att : Text;
		Width_Att : Text;
		Height_Att : Text;
	};

	type PARAM {
		Name_Att : Text;
		ParamValue_Att : Text;
	};

	type OBJECT {
		Classid_Att : Text;
		Id_Att : Text;
		Data_Att : Text;
		Type_Att : Text;
		Standby_Att : Text;
	};

	type FRAMESET {
		Rows_Att : Text;
		Cols_Att : Text;
		Framespacing_Att : Text;
		Frameborder_Att : Text;
		Border_Att : Text;
	};

	type FRAME {
		Src_Att : Text;
		Name_Att : Text;
		Marginwidth_Att : Text;
		Marginheight_Att : Text;
		Scrolling_Att : Text;
		Noresize_Att : Text;
	};

	type NOFRAME;

	type IFRAME : FRAME;
}