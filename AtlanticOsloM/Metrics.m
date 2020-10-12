module Metrics {

	type Metric {
		Name_Att : Text;
		Values_ContRef : MetricValue*;
	};

	type MetricValue {
		Tag_Att : Text;
	};

	type StringMetricValue : MetricValue {
		Value_Att : Text;
	};

	type BooleanMetricValue : MetricValue {
		Value_Att : Logical;
	};

	type IntegerMetricValue : MetricValue {
		Value_Att : Integer32;
	};

	type DoubleMetricValue : MetricValue {
		Value_Att : Double;
	};
}