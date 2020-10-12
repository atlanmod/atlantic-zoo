module PNML {

	type LocatedElement {
		Location_Att : Text;
	};

	type IdedElement : LocatedElement {
		Id_Att : Text;
	};

	type URI : LocatedElement {
		Value_Att : Text;
	};

	type PNMLDocument : LocatedElement {
		Xmlns_ContRef : URI;
		Nets_ContRef : NetElement+;
	};

	type NetElement : IdedElement {
		Type_ContRef : URI;
		Document_Ref : PNMLDocument;
		Contents_ContRef : NetContent*;
		Name_ContRef : Name?;
	};

	type NetContent : LocatedElement {
		Net_Ref : NetElement;
		Name_ContRef : Name?;
	};

	type LabeledElement : LocatedElement {
		Labels_ContRef : Label*;
	};

	type Label : LocatedElement {
		Text_Att : Text;
		LabeledElement_Ref : LabeledElement;
	};

	type Name : LabeledElement {
		Net_Ref : NetElement?;
		NetContent_Ref : NetContent?;
	};

	type NetContentElement : NetContent, IdedElement;

	type Arc : NetContent, IdedElement {
		Source_Ref : NetContentElement;
		Target_Ref : NetContentElement;
	};

	type Place : NetContentElement;

	type Transition : NetContentElement;
}