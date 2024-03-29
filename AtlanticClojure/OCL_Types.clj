( defstruct Type )
( defstruct BasicType )
( defstruct InstanceType :classifier )
( defstruct EnumType :enumLiteral )
( defstruct OclAnyType )
( defstruct OclTypeType )
( defstruct CollectionType :elementType )
( defstruct IntegerType )
( defstruct RealType )
( defstruct StringType )
( defstruct BooleanType )
( defstruct Classifier )
( defstruct EnumLiteral )
( defstruct SetType :elementType )
( defstruct SequenceType :elementType )
( defstruct BagType :elementType )
