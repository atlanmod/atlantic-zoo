module Requirement {

	type Model {
		Abstract_ContRef : @[AbstractDocument.AbstractDocument]?;
		Description_ContRef : @[ProductDescription.ProductDescription]?;
	};

	type @[AbstractDocument.Purpose] {
		Id_Att : Text;
		Version_Att : Text;
		Release_Att : Text;
		Description_Att : Text;
	};

	type @[AbstractDocument.IntendedAudience] {
		Readers_Att : @[AbstractDocument.READERS_KIND]?;
	};

	type @[AbstractDocument.READERS_KIND] {"Developer", "ProjectManager", "MarketingStaff", "User", "Tester", "DocumentationWriter"};

	type @[AbstractDocument.Scope] {
		Description_Att : Text;
		Problem_ContRef : @[AbstractDocument.BusinessProblem]?;
		Mission_ContRef : @[AbstractDocument.ProjectMission]?;
		Background_ContRef : @[AbstractDocument.BusinessBackground]?;
		Goals_ContRef : @[AbstractDocument.ProjectObjective]*;
	};

	type @[AbstractDocument.Reference] {
		Title_Att : Text;
		Author_Att : Text;
		Version_Att : Integer32;
		Date_Att : Logical;
		Location_Att : Text;
	};

	type @[AbstractDocument.Information] {
		Body_Att : Text;
	};

	type @[AbstractDocument.AbstractDocument] {
		IntendedAudience_ContRef : @[AbstractDocument.IntendedAudience]?;
		References_ContRef : @[AbstractDocument.Reference]*;
		Purpose_ContRef : @[AbstractDocument.Purpose]?;
		Scope_ContRef : @[AbstractDocument.Scope]?;
	};

	type @[AbstractDocument.BusinessBackground] {
		Overview_Att : Text;
	};

	type @[AbstractDocument.BusinessProblem] {
		Problem_Att : Text;
	};

	type @[AbstractDocument.ProjectMission] {
		Mission_Att : Text;
	};

	type @[AbstractDocument.ProjectObjective] {
		Title_Att : Text;
		Description_Att : Text;
	};

	type @[AbstractDocument.BusinessObjective] : @[AbstractDocument.ProjectObjective];

	type @[AbstractDocument.TechnicalObjective] : @[AbstractDocument.ProjectObjective];

	type @[AbstractDocument.BusinessCase] : @[AbstractDocument.ProjectObjective];

	type @[ProductDescription.ProductDescription] {
		OwnedRequirement_ContRef : @[ProductDescription.AbstractRequirement]*;
		Constraints_Ref : @[ProductDescription.Constraint]*;
		Characteristics_Ref : @[ProductDescription.Characteristic]*;
		UserDocumentation_Ref : @[ProductDescription.UserDocumentation]?;
		Perspective_Ref : @[ProductDescription.Perspective]?;
		OperatingEnvironment_Ref : @[ProductDescription.OperatingEnvironment]?;
	};

	type @[ProductDescription.Perspective] : @[AbstractDocument.Information];

	type @[ProductDescription.Characteristic] : @[AbstractDocument.Information] {
		Priority_Att : @[ProductDescription.Priority]?;
	};

	type @[ProductDescription.Priority] {"low", "medium", "high"};

	type @[ProductDescription.OperatingEnvironment] {
		HardwarePlatform_ContRef : @[ProductDescription.HardwarePlatform]*;
		OperatingSystem_ContRef : @[ProductDescription.OperatingSystem]*;
	};

	type @[ProductDescription.HardwarePlatform] : @[AbstractDocument.Information];

	type @[ProductDescription.OperatingSystem] : @[AbstractDocument.Information];

	type @[ProductDescription.Constraint] : @[AbstractDocument.Information];

	type @[ProductDescription.UserDocumentation] : @[AbstractDocument.Information] {
		Format_Att : @[ProductDescription.Format]?;
		Standard_Att : Text;
	};

	type @[ProductDescription.SystemFeature] : @[ProductDescription.Feature] {
		Conditions_ContRef : @[ProductDescription.Condition]*;
		Flows_ContRef : @[ProductDescription.EventFlow]*;
	};

	type @[ProductDescription.EventFlow] {
		Elements_ContRef : @[ProductDescription.SequentialElement]*;
		Name_Att : Text;
	};

	type @[ProductDescription.AbstractRequirement] {
		Seq_number_Att : Integer32;
		Description_Att : Text;
		Priority_Att : @[ProductDescription.Priority]?;
		SimpleFeatures_ContRef : @[ProductDescription.SimpleFeature]*;
	};

	type @[ProductDescription.FunctionalRequirement] : @[ProductDescription.AbstractRequirement] {
		SystemFeatures_ContRef : @[ProductDescription.SystemFeature]*;
	};

	type @[ProductDescription.Condition];

	type @[ProductDescription.PreCondition] : @[ProductDescription.Condition];

	type @[ProductDescription.PostCondition] : @[ProductDescription.Condition];

	type @[ProductDescription.SafetyRequirement] : @[ProductDescription.AbstractRequirement];

	type @[ProductDescription.PerformanceRequirement] : @[ProductDescription.AbstractRequirement];

	type @[ProductDescription.SecurityRequirement] : @[ProductDescription.AbstractRequirement];

	type @[ProductDescription.SoftwareQuality] : @[ProductDescription.AbstractRequirement];

	type @[ProductDescription.Format] {"Word", "PDF", "Excel", "PPT"};

	type @[ProductDescription.Action] : @[ProductDescription.SequentialElement];

	type @[ProductDescription.SequentialElement] : @[AbstractDocument.Information] {
		Step_Att : Integer32;
	};

	type @[ProductDescription.Response] : @[ProductDescription.SequentialElement];

	type @[ProductDescription.Stimulus] : @[ProductDescription.SequentialElement];

	type @[ProductDescription.DesignConstraintRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.BusinessRuleRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.BusinessAutomationRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.UIRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.GeneralRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.InstallationRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.MigrationRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.OperationalRequirement] : @[ProductDescription.FunctionalRequirement];

	type @[ProductDescription.SimpleFeature] : @[ProductDescription.Feature];

	type @[ProductDescription.Feature] {
		Name_Att : Text;
		Short_description_Att : Text;
		Priority_Att : @[ProductDescription.Priority]?;
		Cost_Att : Double;
		Risk_Att : Text;
	};
}