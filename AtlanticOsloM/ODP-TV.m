module ODPTV {

	type TechnologyObject {
		ImplStandard_Ref : ImplementableStandard+;
		ToImplementation_Ref : Implementation*;
	};

	type Implementation {
		ImplIXIT_Ref : IXIT*;
		ImplProduct_Ref : TechnologyObject+;
	};

	type IXIT {
		IxitImplementation_Ref : Implementation*;
	};

	type ImplementableStandard {
		TechObject_Ref : TechnologyObject+;
	};
}