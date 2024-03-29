( defstruct OperationExp )
( defstruct PropertyOperation :isMarkedPre :source )
( defstruct OclOperation :arguments )
( defstruct ConstExp )
( defstruct IntegerConstExp :value )
( defstruct StringConstExp :value )
( defstruct RealConstExp :value )
( defstruct AttributeExp :attr :isMarkedPre :source )
( defstruct Attribute )
( defstruct NaviguationExp :assEnd :qualifierValues :isMarkedPre :source )
( defstruct AssocationEnd )
( defstruct ClassifierOperation :op :arguments :isMarkedPre :source )
( defstruct Operation )
( defstruct OclExpression )
