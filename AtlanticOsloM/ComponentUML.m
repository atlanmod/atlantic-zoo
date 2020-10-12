module ComponentUML {

	type Entity {
		Methods_Ref : Method*;
		Attributes_Ref : Attribute*;
		AssociationEnds_Ref : AssociationEnd*;
	};

	type AssociationEnd {
		Type_Ref : Entity;
		Association_Ref : Association;
	};

	type Association {
		AssociationEnds_Ref : AssociationEnd#2 .. 2;
	};

	type Method {
		Entity_Ref : Entity;
	};

	type Attribute {
		Entity_Ref : Entity;
	};
}