( defstruct IdentifiedElement :identifier )
( defstruct MElement :identifier )
( defstruct MElementReference :referencedElement )
( defstruct Module :identifier )
( defstruct ModuleMember :module :identifier )
( defstruct ImportDirective :module :importedElements )
( defstruct ExportDirective :module :exportedElements )
( defstruct Value )
( defstruct NumericalValue )
( defstruct StringValue :value )
( defstruct IntegerValue :value )
( defstruct DecimalValue :value )
( defstruct BooleanValue :value )
( defstruct DerivedType :module :identifier )
( defstruct TypeReference )
( defstruct IntrinsicTypeReference :typeIdentifier )
( defstruct DerivedTypeReference :type )
( defstruct Field :owner :type :identifier )
( defstruct Collection :identifier )
( defstruct ComputedValue :identifier )
( defstruct Expression )
( defstruct InitializationExpression :type )
( defstruct WhereExpression :type )
( defstruct IdentityExpression :identity :type )
( defstruct QueryExpression :whereExpression )
( defstruct EqualExpression :leftValue :rightValue :whereExpression )
( defstruct InExpression :value :collection :whereExpression )
( defstruct CollectionExpression :inExpression :collectionValue )
( defstruct ValueExpression )
( defstruct DefaultValueExpression )
( defstruct StandardValueExpression :value )
( defstruct Language :module :identifier )
( defstruct Entity :module :identifier )
