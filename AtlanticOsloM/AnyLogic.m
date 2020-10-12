module AnyLogic {

	type ModelElement {
		Id_Att : Integer32;
		Name_Att : Text;
		ExcludeFromBuild_Att : Logical;
	};

	type VisualModelElement : ModelElement {
		Position_ContRef : Point;
		Label_ContRef : Point;
		PublicFlag_Att : Logical;
		PresentationFlag_Att : Logical;
		ShowLabel_Att : Logical;
	};

	type Point {
		X_Att : Integer32;
		Y_Att : Integer32;
	};

	type Model : ModelElement {
		EngineVersion_Att : Integer32;
		JavaPackageName_Att : Text;
		ActiveObjectClasses_ContRef : ActiveObjectClass*;
		Experiments_ContRef : Experiment*;
	};

	type ActiveObjectClass : ModelElement {
		ClientAreaTopLeft_ContRef : Point;
		PresentationTopGroupPersistent_Att : Logical;
		IconTopGroupPersistent_Att : Logical;
		Generic_Att : Logical;
		GenericParameters_Att : Text;
		Agent_Att : Logical;
		EnvironmentDefinesInitialLocation_Att : Logical;
		Connectors_ContRef : Connector*;
		EmbeddedObjects_ContRef : EmbeddedObject*;
		Shapes_ContRef : Shape*;
	};

	type Connector : VisualModelElement {
		SourceEmbeddedObject_Ref : EmbeddedObject;
		SourceConnectableName_Att : Text;
		TargetEmbeddedObject_Ref : EmbeddedObject;
		TargetConnectableName_Att : Text;
		Points_ContRef : Point*;
	};

	type EmbeddedObject : VisualModelElement {
		Presentation_Ref : EmbeddedObjectPresentation;
		ActiveObjectClass_ContRef : ActiveObjectClassRef;
		GenericParametersSubstitute_Att : Text;
		Parameters_ContRef : Parameter*;
	};

	type ActiveObjectClassRef {
		PackageName_Att : Text;
		ClassName_Att : Text;
	};

	type Parameter {
		Name_Att : Text;
		Value_Att : Text;
	};

	type Shape : VisualModelElement {
		AsObject_Att : Logical;
		EmbeddedIcon_Att : Logical;
		Rotation_Att : Double;
	};

	type EmbeddedObjectPresentation : Shape;

	type Experiment : ModelElement;

	type SimulationExperiment : Experiment {
		ActiveObjectClass_Ref : ActiveObjectClass;
		ClientAreaTopLeft_ContRef : Point;
		PresentationTopGroupPersistent_Att : Logical;
		IconTopGroupPersistent_Att : Logical;
		Frame_ContRef : Frame;
		CommandLineArguments_Att : Text;
		MaximumMemory_Att : Integer32;
		RandomSeed_Att : Logical;
		SeedValue_Att : Integer32;
		VmArgs_Att : Text;
		AbsoluteAccuracy_Att : Double;
		RelativeAccuracy_Att : Double;
		TimeAccuracy_Att : Double;
		FixedTimeStep_Att : Double;
		Shapes_ContRef : Shape*;
		Controls_ContRef : Control*;
		Parameters_ContRef : Parameter*;
		EnableAdaptiveFrameManagement_Att : Logical;
		EnableAntiAliasing_Att : Logical;
		EnablePanning_Att : Logical;
		EnableZoom_Att : Logical;
		ExecutionMode_Att : Text;
		CpuRatio_Att : Text;
		Title_Att : Text;
		FramesPerSecond_Att : Text;
		RealTimeScale_Att : Text;
		UiProperties_ContRef : Parameter*;
		UseCalendar_Att : Logical;
		StopOption_Att : Text;
		InitialDate_Att : Text;
		InitialTime_Att : Text;
		FinalDate_Att : Text;
		FinalTime_Att : Text;
		ModelTimeUnit_Att : Text;
	};

	type Control : VisualModelElement {
		Width_Att : Integer32;
		Height_Att : Integer32;
		AsObject_Att : Logical;
		EmbeddedIcon_Att : Logical;
		FillColor_Att : Integer32;
		TextColor_Att : Integer32;
		EnableExpression_Att : Text;
		ActionCode_Att : Text;
		LabelText_Att : Text;
		Font_ContRef : Font;
	};

	type Button : Control;

	type Frame {
		X_Att : Integer32;
		Y_Att : Integer32;
		Width_Att : Integer32;
		Height_Att : Integer32;
	};

	type Text : Shape {
		Color_Att : Integer32;
		Text_Att : Text;
		Font_ContRef : Font;
		Alignment_Att : Text;
	};

	type Font {
		Name_Att : Text;
		Size_Att : Integer32;
		Style_Att : Integer32;
	};
}