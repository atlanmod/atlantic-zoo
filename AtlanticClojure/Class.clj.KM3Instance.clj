( declare Class_NamedElt )
( declare Class_Classifier )
( declare Class_DataType )
( declare Class_Class )
( declare Class_Attribute )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def Class ( struct-map
	KM3_Package
	:contents[( def Class_NamedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Class_NamedElt
			:type String
			:location "12:3-12:27"
		)]
	) ) ( def Class_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Class_NamedElt]
		:structuralFeatures[]
	) ) ( def Class_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Class_Classifier]
		:structuralFeatures[]
	) ) ( def Class_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Class_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Class_Class
			:type Boolean
			:location "22:3-22:34"
		) ( struct-map
			KM3_Reference
			:name "super"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Class_Class
			:type Class_Class
			:location "20:3-20:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "attr"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Class_Class
			:type Class_Attribute
			:location "21:3-21:68"
			:isContainer true
			:opposite owner
		)]
	) ) ( def Class_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Class_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiValued"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Class_Attribute
			:type Boolean
			:location "26:3-26:35"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Class_Attribute
			:type Class_Classifier
			:location "27:3-27:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Class_Attribute
			:type Class_Class
			:location "28:3-28:43"
			:isContainer false
			:opposite attr
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "33:2-33:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "34:2-34:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "35:2-35:18"
	) )]
) )
