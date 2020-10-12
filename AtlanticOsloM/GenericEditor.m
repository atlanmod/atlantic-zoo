module Editor {

	type LocatedElement {
		Location_Att : Text;
	};

	type Editor : LocatedElement {
		Extension_Att : Text;
		AbstractElements_ContRef : AbstractElement*;
	};

	type AbstractElement : LocatedElement {
		Type_Att : Text;
		Format_ContRef : Format?;
	};

	type Block : AbstractElement {
		Blockbegin_Att : Text;
		Blockend_Att : Text;
	};

	type GroupElement : AbstractElement {
		Indent_ContRef : Indent?;
		Element_ContRef : Element*;
	};

	type Element : LocatedElement {
		Element_Att : Text;
		GroupElement_Ref : GroupElement;
	};

	type Format : LocatedElement {
		Color_ContRef : Color?;
		Font_ContRef : Font?;
	};

	type Color : LocatedElement {
		Red_Att : Integer32;
		Green_Att : Integer32;
		Blue_Att : Integer32;
	};

	type Font : LocatedElement {
		Font_Att : Text;
		Bold_Att : Logical;
		Italic_Att : Logical;
	};

	type Indent : LocatedElement {
		Retrait_Att : Text;
		GroupElementIndent_Ref : GroupElement;
	};
}