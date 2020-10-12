module Reqtify {

	type Project {
		Documents_ContRef : Document+;
	};

	type TypedElement {
		Type_Att : Text;
	};

	type ElementWithIL : TypedElement {
		Name_Att : Text;
		Label_Att : Text;
	};

	type Document : ElementWithIL {
		Project_Ref : Project;
		Sections_ContRef : Section*;
	};

	type TextElement : ElementWithIL {
		Description_Att : Text;
	};

	type Section : TextElement {
		Document_Ref : Document?;
		SectionChildren_ContRef : Section*;
		SectionParent_Ref : Section?;
		Requirements_ContRef : AbstractRequirement*;
	};

	type AbstractRequirement : TextElement {
		Section_Ref : Section?;
		IsContained_Ref : MacroRequirement?;
		CoverLinks_ContRef : CoverLink*;
		Attribute_ContRef : Attribute*;
	};

	type Requirement : AbstractRequirement;

	type MacroRequirement : AbstractRequirement {
		Contains_ContRef : AbstractRequirement*;
	};

	type CoverLink : TypedElement {
		LinkWith_Ref : AbstractRequirement;
	};

	type Attribute : TypedElement {
		Value_Att : Text;
	};
}