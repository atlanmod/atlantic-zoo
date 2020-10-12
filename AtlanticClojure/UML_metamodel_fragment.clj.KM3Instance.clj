( declare UMLMetamodelFragment_Class )
( declare UMLMetamodelFragment_Generalization )
( declare UMLMetamodelFragment_Dependency )
( declare UMLMetamodelFragment_Stereotype )
( declare UMLMetamodelFragment_StateMachine )
( declare UMLMetamodelFragment_State )
( declare UMLMetamodelFragment_CompositeState )
( declare UMLMetamodelFragment_SimpleState )
( declare UMLMetamodelFragment_FinalState )
( declare UMLMetamodelFragment_StateVertex )
( declare UMLMetamodelFragment_PseudoState )
( declare UMLMetamodelFragment_Transition )
( declare UMLMetamodelFragment_Event )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def UMLMetamodelFragment ( struct-map
	KM3_Package
	:contents[( def UMLMetamodelFragment_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Class
			:type UMLMetamodelFragment_Generalization
			:location "15:3-15:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "child"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Class
			:type UMLMetamodelFragment_Generalization
			:location "16:3-16:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependency"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Class
			:type UMLMetamodelFragment_Dependency
			:location "17:3-17:55"
			:isContainer false
			:opposite client
		)]
	) ) ( def UMLMetamodelFragment_Generalization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UMLMetamodelFragment_Dependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "supplier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Dependency
			:type UMLMetamodelFragment_StateMachine
			:location "24:3-24:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "client"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Dependency
			:type UMLMetamodelFragment_Class
			:location "25:3-25:50"
			:isContainer false
			:opposite dependency
		) ( struct-map
			KM3_Reference
			:name "stereotype"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Dependency
			:type UMLMetamodelFragment_Stereotype
			:location "26:3-26:64"
			:isContainer false
			:opposite extendedElement
		)]
	) ) ( def UMLMetamodelFragment_Stereotype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "baseClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Stereotype
			:type String
			:location "30:3-30:32"
		) ( struct-map
			KM3_Reference
			:name "extendedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Stereotype
			:type UMLMetamodelFragment_Dependency
			:location "31:3-31:64"
			:isContainer false
			:opposite stereotype
		)]
	) ) ( def UMLMetamodelFragment_StateMachine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_StateMachine
			:type UMLMetamodelFragment_Class
			:location "35:3-35:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "top"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_StateMachine
			:type UMLMetamodelFragment_State
			:location "36:3-36:59"
			:isContainer true
			:opposite stateMachine
		)]
	) ) ( def UMLMetamodelFragment_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLMetamodelFragment_StateVertex]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UMLMetamodelFragment_State
			:type UMLMetamodelFragment_StateMachine
			:location "40:3-40:62"
			:isContainer false
			:opposite top
		) ( struct-map
			KM3_Reference
			:name "internal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_State
			:type UMLMetamodelFragment_Transition
			:location "41:3-41:45"
			:isContainer true
		)]
	) ) ( def UMLMetamodelFragment_CompositeState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLMetamodelFragment_State]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subvertex"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_CompositeState
			:type UMLMetamodelFragment_StateVertex
			:location "45:3-45:73"
			:isContainer true
			:opposite compositeState
		)]
	) ) ( def UMLMetamodelFragment_SimpleState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLMetamodelFragment_State]
		:structuralFeatures[]
	) ) ( def UMLMetamodelFragment_FinalState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLMetamodelFragment_State]
		:structuralFeatures[]
	) ) ( def UMLMetamodelFragment_StateVertex ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compositeState"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UMLMetamodelFragment_StateVertex
			:type UMLMetamodelFragment_CompositeState
			:location "55:3-55:72"
			:isContainer false
			:opposite subvertex
		)]
	) ) ( def UMLMetamodelFragment_PseudoState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLMetamodelFragment_StateVertex]
		:structuralFeatures[]
	) ) ( def UMLMetamodelFragment_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "trigger"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UMLMetamodelFragment_Transition
			:type UMLMetamodelFragment_Event
			:location "62:3-62:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Transition
			:type UMLMetamodelFragment_StateVertex
			:location "63:3-63:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLMetamodelFragment_Transition
			:type UMLMetamodelFragment_StateVertex
			:location "64:3-64:34"
			:isContainer false
		)]
	) ) ( def UMLMetamodelFragment_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "72:2-72:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "73:2-73:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "74:2-74:18"
	) )]
) )
