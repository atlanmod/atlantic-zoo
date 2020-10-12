module DoDAF {

	type Element {
		Name_Att : Text;
		Content_Att : Text;
	};

	type System : Element {
		Decomposes_ContRef : System*;
		Fulfills_Ref : SystemRole*;
	};

	type SystemRole : Element {
		Decomposes_ContRef : SystemRole*;
		Performs_Ref : SystemFunction*;
		TerminatesAt_Ref : SystemRoleInterface;
	};

	type SystemFunction : Element {
		Decomposes_ContRef : SystemFunction*;
		Consumes_Ref : Product*;
		Produces_Ref : Product*;
		TerminatesAt_Ref : SystemProductFlow;
		MesuredBy_Ref : ConstraintOrRequirement*;
	};

	type Service : SystemFunction;

	type SystemRoleInterface : Element {
		OriginatesFrom_Ref : SystemRole;
	};

	type ServiceDependency : SystemRoleInterface;

	type ServiceProvider : SystemRole;

	type ServiceMediator : ServiceProvider;

	type ServiceRegistry : ServiceMediator;

	type ServiceLocator : ServiceMediator;

	type ServiceBroker : ServiceMediator;

	type SystemAtNode : Element {
		References_Ref : System;
		TerminatesAt_Ref : SystemAtNodeInterface;
	};

	type SystemAtNodeInterface : Element {
		OriginatesFrom_Ref : SystemAtNode;
	};

	type SystemsNode : Element {
		Groups_Ref : SystemAtNode*;
	};

	type COI : Element {
		Comprises_ContRef : Performer*;
		Defines_Ref : Vocabulary;
	};

	type Vocabulary : Element {
		Comprises_ContRef : DataReference*;
	};

	type DataReference : Element {
		DefineBy_Ref : Data;
	};

	type Performer : Element {
		Decomposes_ContRef : Performer*;
		Fulfills_Ref : OperationalRole*;
	};

	type OperationalRole : Element {
		Decomposes_ContRef : OperationalRole*;
		Accomplishes_Ref : OperationalActivity*;
	};

	type OperationalActivity : Element {
		Decomposes_ContRef : OperationalRole*;
		Supports_Ref : SystemFunction*;
	};

	type Product : Element;

	type Material : Product;

	type Data : Product;

	type SystemProductFlow : Element {
		Transports_Ref : Product*;
		OriginatesFrom_Ref : SystemFunction;
	};

	type ConstraintOrRequirement : Element;

	type Constraint : ConstraintOrRequirement;

	type QualityRequirement : ConstraintOrRequirement;

	type DIA : Element {
		Nmjic_Ref : NMJIC;
		HigherEchelon_Ref : HigherEchelon;
	};

	type NMJIC : Element {
		Dia_Ref : DIA;
	};

	type HigherEchelon : Element {
		Dia_Ref : DIA;
		Jfc_Ref : JFC;
	};

	type JFC : Element {
		HigherEchelon_Ref : HigherEchelon;
		F2c2_Ref : F2C2;
		ComponentComand_Ref : ComponentCommand;
	};

	type F2C2 : Element {
		Jfc_Ref : JFC;
	};

	type ComponentCommand : Element {
		Jfc_Ref : JFC;
	};

	type DJFLCC : ComponentCommand;

	type JFACC : ComponentCommand {
		SubordinateAirCommand_Ref : SubordinateAirCommand;
		Aoccid_ContRef : AOCCID*;
		Aoccpsc_ContRef : AOCCombatPlanStrategyCells*;
	};

	type JFMCC : ComponentCommand;

	type JFSOCC : ComponentCommand;

	type SubordinateAirCommand : Element {
		Jfacc_Ref : JFACC;
	};

	type MAW : SubordinateAirCommand;

	type WOC : SubordinateAirCommand;

	type AOCCID : Element;

	type AOCCombatPlanStrategyCells : Element;

	type ResultData {
		SourceID_Att : Text;
		TimeStamp_Att : Text;
		Cr_Ref : CollectionRequirement*;
		BdaReport_Ref : BDAReport*;
	};

	type CombatReport : ResultData {
		FriendlyUnitsInvolved_Att : Text;
		CombatLocation_Att : Text;
		ResultsAssessment_Att : Text;
		Duration_Att : Text;
	};

	type WSV : ResultData {
		MissionID_Att : Text;
		WeaponfSystemID_Att : Text;
		VideoType_Att : Text;
	};

	type MISREP : ResultData {
		MissionID_Att : Text;
		MissionObjectives_Att : Text;
		MissionAssesments_Att : Text;
	};

	type Imagery : ResultData {
		ImageType_Att : Text;
		SpectralData_Att : Text;
		GeospacialLocation_Att : Text;
		ImageSize_Att : Integer32;
	};

	type CollectionRequirement {
		SourceID_Att : Text;
		CollectionTargetID_Att : Text;
		ToBeDoneByTime_Att : Text;
		SpecialNeeds_Att : Text;
		Rd_Ref : ResultData*;
		Ato_Ref : ATO*;
		IsContainedIn_Ref : Target*;
	};

	type BDAReport {
		TargetID_Att : Text;
		ReportSourceID_Att : Text;
		AssesmentSumart_Att : Text;
		ValidityDuration_Att : Text;
		Rd_Ref : ResultData+;
		Mea_Ref : MunitionsEffectsAssesment?;
	};

	type MunitionsEffectsAssesment {
		BdaReport_Ref : BDAReport?;
		Ato_Ref : ATO;
		Tn_Ref : TargetNomination;
	};

	type ATO {
		TimePeriod_Att : Text;
		Cr_Ref : CollectionRequirement*;
		Mea_Ref : MunitionsEffectsAssesment;
		Tn_Ref : TargetNomination*;
		Rr_Ref : RestrikeRecommendation?;
	};

	type RestrikeRecommendation {
		Ato_Ref : ATO?;
		Tn_Ref : TargetNomination;
	};

	type TargetNomination {
		Ato_Ref : ATO*;
		Mea_Ref : MunitionsEffectsAssesment*;
		Rr_Ref : RestrikeRecommendation?;
		Target_Ref : Target;
	};

	type TargetMaterialsAnalysis {
		TargetID_Att : Text;
		Target_Ref : Target;
	};

	type Target {
		Cr_Ref : CollectionRequirement*;
		Tn_Ref : TargetNomination?;
		Holds_Ref : MIDB?;
		Describes_Ref : TargetMaterialsAnalysis*;
	};

	type MIDB {
		Target_Ref : Target*;
	};
}