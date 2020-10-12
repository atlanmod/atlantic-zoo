module IEEE1471 {

	type Viewpoint {
		Source_Ref : ViewpointImport+;
		Covers_Ref : Concern+;
		SupplierDependency_Ref : ViewpointDependency*;
		ClientDependency_Ref : ViewpointDependency*;
		IsImportTo_Ref : Stakeholder?;
		ArchitecturalConstruct_ContRef : ArchitecturalConstruct*;
		Process_ContRef : Process;
	};

	type Concern;

	type Stakeholder {
		Concerns_Ref : Concern?;
	};

	type ViewpointImport;

	type ViewpointDependency {
		Supplier_Ref : Viewpoint;
		Client_Ref : Viewpoint;
	};

	type Process {
		Methodology_Ref : Technique+;
	};

	type Technique {
		Methods_Ref : AnalysisMethod*;
		Applies_Ref : Rule+;
	};

	type AnalysisMethod {
		Analysis_Ref : Language;
	};

	type ArchitecturalConstruct;

	type Rule : ArchitecturalConstruct {
		Techniques_Ref : Technique+;
		Guidance_Ref : Language;
	};

	type ModelOrganization : Rule;

	type ModellingRule;

	type Language : ArchitecturalConstruct;

	type Mapping : ArchitecturalConstruct {
		Input_Ref : Language;
		Ouput_Ref : Language;
	};

	type Pattern : ArchitecturalConstruct;
}