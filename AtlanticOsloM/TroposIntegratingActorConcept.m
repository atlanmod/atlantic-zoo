module IntegratingTroposActorConcept {

	type Actor;

	type Agent : Actor {
		Occupy_Ref : Position;
		Play_Ref : Role*;
	};

	type Position : Actor {
		Cover_ContRef : Role*;
	};

	type Role : Actor;
}