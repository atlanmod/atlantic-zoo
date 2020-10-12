( declare JavaSource_JavaSource )
( declare JavaSource_NamedElement )
( declare JavaSource_ClassDeclaration )
( declare JavaSource_MethodDefinition )
( declare JavaSource_MethodInvocation )
( declare PrimitiveTypes_String )
( def JavaSource ( struct-map
	KM3_Package
	:contents[( def JavaSource_JavaSource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner JavaSource_JavaSource
			:type JavaSource_ClassDeclaration
			:location "12:3-12:55"
			:isContainer true
		)]
	) ) ( def JavaSource_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaSource_NamedElement
			:type String
			:location "16:3-16:27"
		)]
	) ) ( def JavaSource_ClassDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaSource_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "superclass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JavaSource_ClassDeclaration
			:type JavaSource_ClassDeclaration
			:location "20:3-20:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JavaSource_ClassDeclaration
			:type JavaSource_MethodDefinition
			:location "21:3-21:72"
			:isContainer true
			:opposite class
		)]
	) ) ( def JavaSource_MethodDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaSource_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaSource_MethodDefinition
			:type JavaSource_ClassDeclaration
			:location "25:3-25:64"
			:isContainer false
			:opposite methods
		) ( struct-map
			KM3_Reference
			:name "invocations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JavaSource_MethodDefinition
			:type JavaSource_MethodInvocation
			:location "26:3-26:57"
			:isContainer true
		)]
	) ) ( def JavaSource_MethodInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaSource_MethodInvocation
			:type JavaSource_MethodDefinition
			:location "30:3-30:44"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "35:3-35:19"
	) )]
) )
