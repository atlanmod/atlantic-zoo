( declare Core_ModelElement )
( declare Core_Constraint )
( declare DataTypes_Expression )
( declare DataTypes_BooleanExpression )
( declare OCl_OCLExpression )
( declare OCLExpression_PreCondition )
( declare OCLExpression_PortCondition )
( declare OCLExpression_Invariant )
( declare OCLExpression_Guard )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def OCLExpression ( struct-map
	KM3_Package
	:contents[( def Core ( struct-map
		KM3_Package
		:contents[( def Core_ModelElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "constraint"
				:upper -1
				:lower 1
				:isOrdered true
				:owner Core_ModelElement
				:type Core_Constraint
				:location "17:5-17:83"
				:isContainer false
				:opposite constrainedElement
			)]
		) ) ( def Core_Constraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Core_ModelElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "constrainedElement"
				:upper -1
				:lower 1
				:isOrdered true
				:owner Core_Constraint
				:type Core_ModelElement
				:location "21:4-21:84"
				:isContainer false
				:opposite constraint
			) ( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Core_Constraint
				:type DataTypes_BooleanExpression
				:location "22:4-22:61"
				:isContainer false
				:opposite constraint
			)]
		) )]
	) ) ( def DataTypes ( struct-map
		KM3_Package
		:contents[( def DataTypes_Expression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataTypes_Expression
				:type OCl_OCLExpression
				:location "28:4-28:58"
				:isContainer false
				:opposite owner
			)]
		) ) ( def DataTypes_BooleanExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataTypes_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "constraint"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataTypes_BooleanExpression
				:type Core_Constraint
				:location "32:4-32:70"
				:isContainer true
				:opposite body
			)]
		) )]
	) ) ( def OCl ( struct-map
		KM3_Package
		:contents[( def OCl_OCLExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "owner"
				:upper 1
				:lower 0
				:isOrdered false
				:owner OCl_OCLExpression
				:type DataTypes_Expression
				:location "38:4-38:54"
				:isContainer false
				:opposite body
			)]
		) )]
	) ) ( def OCLExpression_PreCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Constraint]
		:structuralFeatures[]
	) ) ( def OCLExpression_PortCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Constraint]
		:structuralFeatures[]
	) ) ( def OCLExpression_Invariant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Constraint]
		:structuralFeatures[]
	) ) ( def OCLExpression_Guard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Constraint]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "52:2-52:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "53:2-53:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "54:2-54:18"
	) )]
) )
