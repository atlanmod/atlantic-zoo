( declare AntScripts_NamedElement )
( declare AntScripts_DescribableElement )
( declare AntScripts_CommentableElement )
( declare AntScripts_Project )
( declare AntScripts_Property )
( declare AntScripts_Target )
( declare AntScripts_TaskElement )
( declare AntScripts_Attribute )
( declare AntScripts_Task )
( declare AntScripts_TaskParameter )
( declare PrimitiveTypes_String )
( def AntScripts ( struct-map
	KM3_Package
	:contents[( def AntScripts_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AntScripts_NamedElement
			:type String
			:location "14:3-14:26"
		)]
	) ) ( def AntScripts_DescribableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_DescribableElement
			:type String
			:location "18:3-18:38"
		)]
	) ) ( def AntScripts_CommentableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "comment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_CommentableElement
			:type String
			:location "22:3-22:34"
		)]
	) ) ( def AntScripts_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AntScripts_NamedElement AntScripts_DescribableElement AntScripts_CommentableElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AntScripts_Project
			:type AntScripts_Property
			:location "31:3-31:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "targets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AntScripts_Project
			:type AntScripts_Target
			:location "32:3-32:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultTarget"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Project
			:type AntScripts_Target
			:location "33:3-33:41"
			:isContainer false
		)]
	) ) ( def AntScripts_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "37:3-37:31"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "39:3-39:32"
		) ( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "40:3-40:35"
		) ( struct-map
			KM3_Attribute
			:name "refid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "41:3-41:32"
		) ( struct-map
			KM3_Attribute
			:name "resource"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "43:3-43:35"
		) ( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "44:3-44:31"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "45:3-45:30"
		) ( struct-map
			KM3_Attribute
			:name "environment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "46:3-46:38"
		) ( struct-map
			KM3_Attribute
			:name "classpath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "48:3-48:36"
		) ( struct-map
			KM3_Attribute
			:name "classpathref"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "49:3-49:39"
		) ( struct-map
			KM3_Attribute
			:name "prefix"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Property
			:type String
			:location "50:3-50:33"
		)]
	) ) ( def AntScripts_Target ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AntScripts_NamedElement AntScripts_DescribableElement AntScripts_CommentableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "if"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Target
			:type String
			:location "54:3-54:29"
		) ( struct-map
			KM3_Attribute
			:name "unless"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AntScripts_Target
			:type String
			:location "55:3-55:33"
		) ( struct-map
			KM3_Reference
			:name "tasks"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AntScripts_Target
			:type AntScripts_Task
			:location "56:3-56:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "depends"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AntScripts_Target
			:type AntScripts_Target
			:location "57:3-57:43"
			:isContainer false
		)]
	) ) ( def AntScripts_TaskElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AntScripts_NamedElement AntScripts_CommentableElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AntScripts_TaskElement
			:type AntScripts_Attribute
			:location "61:3-61:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AntScripts_TaskElement
			:type AntScripts_TaskElement
			:location "62:3-62:59"
			:isContainer true
		)]
	) ) ( def AntScripts_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AntScripts_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AntScripts_Attribute
			:type String
			:location "66:3-66:27"
		)]
	) ) ( def AntScripts_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AntScripts_TaskElement]
		:structuralFeatures[]
	) ) ( def AntScripts_TaskParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AntScripts_TaskElement]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "82:2-82:18"
	) )]
) )
