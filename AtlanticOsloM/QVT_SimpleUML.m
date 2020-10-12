module SimpleUML {

	type UMLModelElement {
		Kind_Att : Text;
		Name_Att : Text;
	};

	type Attribute : UMLModelElement {
		Owner_Ref : Class;
		Type_Ref : Classifier;
	};

	type Package : UMLModelElement {
		Elements_ContRef : PackageElement*;
	};

	type PackageElement : UMLModelElement {
		Namespace_Ref : Package;
	};

	type Classifier : PackageElement {
		TypeOpposite_Ref : Attribute*;
	};

	type Class : Classifier {
		Attribute_ContRef : Attribute*;
		General_Ref : Class*;
		GeneralOpposite_Ref : Class*;
		Reverse_Ref : Association*;
		Forward_Ref : Association*;
	};

	type PrimitiveDataType : Classifier;

	type Association : PackageElement {
		Source_Ref : Class;
		Destination_Ref : Class;
	};
}