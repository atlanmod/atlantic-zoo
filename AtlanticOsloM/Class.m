module Class {

	type NamedElt {
		Name_Att : Text;
	};

	type Classifier : NamedElt;

	type DataType : Classifier;

	type Class : Classifier {
		Super_Ref : Class*;
		Attr_ContRef : Attribute*;
		IsAbstract_Att : Logical;
	};

	type Attribute : NamedElt {
		MultiValued_Att : Logical;
		Type_Ref : Classifier;
		Owner_Ref : Class;
	};
}