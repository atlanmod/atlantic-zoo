( defstruct Metric :name )
( defstruct MetricValue :tag )
( defstruct StringMetricValue :value :tag )
( defstruct BooleanMetricValue :value :tag )
( defstruct IntegerMetricValue :value :tag )
( defstruct DoubleMetricValue :value :tag )