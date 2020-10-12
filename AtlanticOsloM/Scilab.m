module Scilab {

	type Man {
		Language_Att : Text;
		Title_Att : Text;
		Type_Att : Text;
		Date_Att : Text;
		Name_Att : Text;
		Keyword_Att : Text;
		Exemple_Att : Text;
		Meta_ContRef : Meta*;
	};

	type Meta {
		Meta_Att : Text;
		Path_Att : Text;
		Category_Att : Text;
		Version_CSI_Att : Text;
		Version_DOC_Att : Text;
		Author_Att : Text;
		Man_Ref : Man;
	};

	type Short_Description : Biblio {
		Name_Att : Text;
		Verb_Att : Text;
	};

	type Calling_Sequence {
		Calling_Sequence_Item_ContRef : Calling_Sequence_Item*;
	};

	type Calling_Sequence_Item {
		Calling_Sequence_Item_Att : Text;
		Calling_Sequence_Ref : Calling_Sequence;
	};

	type Param {
		Target_Att : InOut?;
		Param_Indent_ContRef : Param_Indent*;
	};

	type Param_Indent {
		Param_Ref : Param;
		Param_Description_Ref : Param_Description;
		Param_Item_ContRef : Param_Item+;
	};

	type Param_Item {
		Label_Att : Text;
		Param_Indent_Ref : Param_Indent;
		Param_Name_ContRef : Param_Name;
		Param_Description_ContRef : Param_Description;
	};

	type Param_Name {
		Verb_Att : Text;
		Param_Item_Ref : Param_Item;
	};

	type Param_Description : Used_Functions {
		Param_Indent_ContRef : Param_Indent*;
		Param_Item_Ref : Param_Item;
	};

	type Description : Used_Functions {
		Itemize_ContRef : Itemize*;
		Description_Indent_ContRef : Description_Indent*;
	};

	type Description_Indent {
		Description_Ref : Description;
		Description_Item_ContRef : Description_Item+;
	};

	type Description_Item {
		Label_Att : Text;
		Description_Indent_Ref : Description_Indent;
	};

	type AIMG {
		Verb_Att : Text;
	};

	type See_Also {
		See_Also_Item_ContRef : See_Also_Item*;
	};

	type Exemple {
		Exemple_Att : Text;
		Xml_space_Att : PreDef;
	};

	type See_Also_Item {
		See_Also_Ref : See_Also;
		Link_ContRef : Link*;
	};

	type A : AIMG {
		Href_Att : Text;
		Psppp_Ref : PSPPP;
		Authors_Item_Ref : Authors_Item;
	};

	type Img : AIMG {
		Src_Att : Text;
		Psppp_Ref : PSPPP;
	};

	type Biblio {
		P_ContRef : P*;
		Sp_ContRef : SP*;
		Pp_ContRef : PP*;
	};

	type Used_Functions : Biblio {
		Verbatim_Att : Text;
		Table_ContRef : Table*;
	};

	type PSPPP {
		Verb_Att : Text;
		Em_Att : Text;
		Bd_Att : Text;
		Tt_Att : Text;
		A_ContRef : A*;
		Link_ContRef : Link*;
		Img_ContRef : Img*;
	};

	type P : PSPPP {
		Biblio_Ref : Biblio;
	};

	type SP : PSPPP {
		Biblio_Ref : Biblio;
	};

	type PP : PSPPP {
		Biblio_Ref : Biblio;
	};

	type Itemize : Used_Functions {
		Label_Att : Text;
		Item_Ref : Item;
		Section_Ref : Section;
		Authors_Item_Ref : Authors_Item;
		Description_Ref : Description;
	};

	type Item : Used_Functions, Itemize {
		Itemize_ContRef : Itemize*;
	};

	type Table {
		Table_New_Row_ContRef : Table_New_Row+;
		Used_Functions_Ref : Used_Functions;
	};

	type Table_New_Row {
		Table_New_Column_ContRef : Table_New_Column+;
		Table_Ref : Table;
	};

	type Table_New_Column {
		Verb_Att : Text;
		Em_Att : Text;
		Bd_Att : Text;
		Tt_Att : Text;
		Table_New_Row_Ref : Table_New_Row;
	};

	type Link {
		Link_Att : Text;
		Psppp_Ref : PSPPP;
		See_Also_Item_Ref : See_Also_Item;
		Authors_Item_Ref : Authors_Item;
	};

	type Authors {
		Authors_Item_ContRef : Authors_Item+;
	};

	type Authors_Item : Biblio {
		Verb_Att : Text;
		Em_Att : Text;
		Bd_Att : Text;
		Tt_Att : Text;
		Verbatim_Att : Text;
		Label_Att : Text;
		A_ContRef : A*;
		Link_ContRef : Link*;
		Authors_Ref : Authors;
		Itemize_ContRef : Itemize+;
	};

	type Section : Used_Functions, Itemize {
		Itemize_ContRef : Itemize*;
	};

	type InOut {"in", "out"};

	type PreDef {"Preserve", "Default"};
}