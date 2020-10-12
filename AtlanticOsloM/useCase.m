module UseCase {

	type Actor : NamedElement;

	type UseCase : NamedElement {
		Include_ContRef : Include+;
		Extend_ContRef : Extend+;
	};

	type Extend {
		Extension_Ref : UseCase+;
	};

	type Include {
		IncludingCase_Ref : UseCase+;
	};

	type UseCaseContainer {
		OwnedElement_ContRef : NamedElement*;
	};

	type BehavioredClassifier;

	type NamedElement {
		Name_Att : Text;
	};

	type Association : NamedElement {
		Actor_Ref : Actor?;
		UseCase_Ref : UseCase?;
	};
}