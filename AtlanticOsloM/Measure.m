module Measure {

	type ModelKind {"KM3", "UML2"};

	type RootMeasureSet {
		ModelType_Att : ModelKind;
		Categories_ContRef : Category+;
		MeasureSets_ContRef : MeasureSet*;
	};

	type Category {
		Name_Att : Text;
		Desc_Att : Text;
		Metrics_ContRef : Metric+;
		Root_Ref : RootMeasureSet;
	};

	type Metric {
		Name_Att : Text;
		Desc_Att : Text;
		PreferredValue_Att : Text;
		Category_Ref : Category;
	};

	type ElementKind {"metamodel", "model", "package", "interface", "class"};

	type MeasureSet {
		ElementName_Att : Text;
		ElementType_Att : ElementKind;
		Measures_ContRef : Measure*;
		Root_Ref : RootMeasureSet?;
		Subsets_ContRef : MeasureSet*;
		Parent_Ref : MeasureSet?;
	};

	type Measure {
		Metric_Ref : Metric;
		Owner_Ref : MeasureSet;
	};

	type IntegerMeasure : Measure {
		Value_Att : Integer32;
	};

	type DoubleMeasure : Measure {
		Value_Att : Double;
	};

	type PercentageMeasure : Measure {
		Value_Att : Double;
	};
}