( declare Make_Makefile )
( declare Make_Element )
( declare Make_Rule )
( declare Make_Macro )
( declare Make_ShellLine )
( declare Make_Comment )
( declare Make_Dependency )
( declare Make_RuleDep )
( declare Make_FileDep )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def Make ( struct-map
	KM3_Package
	:contents[( def Make_Makefile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_Makefile
			:type String
			:location "14:5-14:29"
		) ( struct-map
			KM3_Reference
			:name "comment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Make_Makefile
			:type Make_Comment
			:location "15:5-15:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Make_Makefile
			:type Make_Element
			:location "16:5-16:57"
			:isContainer true
		)]
	) ) ( def Make_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_Element
			:type String
			:location "23:5-23:29"
		)]
	) ) ( def Make_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Make_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dependencies"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Make_Rule
			:type Make_Dependency
			:location "28:5-28:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "shellLines"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Make_Rule
			:type Make_ShellLine
			:location "29:5-29:87"
			:isContainer true
			:opposite ruleShellLine
		)]
	) ) ( def Make_Macro ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Make_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_Macro
			:type String
			:location "34:5-34:30"
		)]
	) ) ( def Make_ShellLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "command"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_ShellLine
			:type String
			:location "40:5-40:32"
		) ( struct-map
			KM3_Attribute
			:name "display"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_ShellLine
			:type Boolean
			:location "41:5-41:33"
		) ( struct-map
			KM3_Reference
			:name "ruleShellLine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_ShellLine
			:type Make_Rule
			:location "42:5-42:58"
			:isContainer false
			:opposite shellLines
		)]
	) ) ( def Make_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_Comment
			:type String
			:location "47:5-47:29"
		)]
	) ) ( def Make_Dependency ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Make_RuleDep ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Make_Dependency]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ruledep"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_RuleDep
			:type Make_Rule
			:location "57:5-57:30"
			:isContainer false
		)]
	) ) ( def Make_FileDep ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Make_Dependency]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Make_FileDep
			:type String
			:location "62:5-62:29"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "69:2-69:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "70:2-70:19"
	) )]
) )
