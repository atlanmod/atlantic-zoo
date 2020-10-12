( defstruct AbstractNode :expression )
( defstruct Node :expression )
( defstruct ConditionalNode :trueConditionNode :falseConditionNode :expression )
( defstruct Expression :expressionName )
