module TextualPathExp {

	type TextualPathExp {
		Path_ContRef : Path;
	};

	type Path {
		Transitions_ContRef : Transition+;
	};

	type Transition {
		IsMultiple_Att : Logical;
	};

	type AlternativeTrans : Transition {
		AltPaths_ContRef : Path+;
	};

	type PrimitiveTrans : Transition {
		Name_Att : Text;
	};
}