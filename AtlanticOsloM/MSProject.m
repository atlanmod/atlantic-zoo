module MSProject {

	type MSProject {
		Tasks_ContRef : Task+;
	};

	type NamedElement {
		Name_Att : Text;
	};

	type Task : NamedElement {
		UID_Att : Text;
		Predecessors_Ref : Task*;
	};
}