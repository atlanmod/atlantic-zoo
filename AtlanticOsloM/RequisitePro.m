module RequisitePro {

	type DescribedElt {
		Description_Att : Text;
	};

	type NamedElt {
		Name_Att : Text;
	};

	type ContainerElt : NamedElt, DescribedElt {
		Content_ContRef : ContainedElt*;
		Packages_ContRef : Package*;
	};

	type Project : ContainerElt;

	type Package : ContainerElt {
		ParentPackage_Ref : ContainerElt;
	};

	type ContainedElt {
		Package_Ref : ContainerElt;
	};

	type TypedElt {
		Type_Att : Text;
	};

	type Document : DescribedElt, NamedElt, ContainedElt, TypedElt;

	type Attribute : TypedElt {
		Value_Att : Text;
	};

	type Requirement : NamedElt, ContainedElt, TypedElt {
		Text_Att : Text;
		Attributes_ContRef : Attribute*;
		Location_Ref : Document;
		Parent_Ref : Requirement?;
		Children_Ref : Requirement*;
		CoverLink_Ref : Requirement*;
	};
}