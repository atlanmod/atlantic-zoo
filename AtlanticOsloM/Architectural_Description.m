module ArchitecturalDescription {

	type Architecture {
		DescribedBy_Ref : ArchitectureDescription;
	};

	type ArchitectureDescription {
		Selects_Ref : ArchitectureView+;
		OrganizedBy_ContRef : ArchitectureView+;
	};

	type ArchitectureView {
		SelectedBy_Ref : ArchitectureDescription+;
		Constituents_ContRef : ModelElement+;
		ConformsTo_Ref : ArchitectureViewPoint+;
	};

	type ArchitectureViewPoint {
		Defines_Ref : MainView;
		Views_Ref : ArchitectureView+;
	};

	type MainView {
		IsProjectedOnto_Ref : ArchitectureView+;
		ConsistsOf_ContRef : ModelElement+;
	};

	type ModelElement;
}