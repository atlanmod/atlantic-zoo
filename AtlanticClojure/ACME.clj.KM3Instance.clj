( declare ACME_ACMEFile )
( declare ACME_ACMEEntry )
( declare ACME_Element )
( declare ACME_Type )
( declare ACME_System )
( declare ACME_Representation )
( declare ACME_Component )
( declare ACME_ComponentInstance )
( declare ACME_ComponentType )
( declare ACME_Port )
( declare ACME_Connector )
( declare ACME_Role )
( declare ACME_Property )
( declare ACME_Link )
( declare ACME_Attachment )
( declare ACME_Binding )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def ACME ( struct-map
	KM3_Package
	:contents[( def ACME_ACMEFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ACME_ACMEFile
			:type ACME_ACMEEntry
			:location "13:3-13:46"
			:isContainer true
		)]
	) ) ( def ACME_ACMEEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ACME_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Element
			:type String
			:location "26:3-26:27"
		) ( struct-map
			KM3_Reference
			:name "representations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_Element
			:type ACME_Representation
			:location "27:3-27:68"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "property"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_Element
			:type ACME_Property
			:location "28:3-28:55"
			:isContainer true
		)]
	) ) ( def ACME_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Element]
		:structuralFeatures[]
	) ) ( def ACME_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Element ACME_ACMEEntry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "componentDeclaration"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_System
			:type ACME_ComponentInstance
			:location "38:3-38:76"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "connectorDeclaration"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_System
			:type ACME_Connector
			:location "40:3-40:86"
			:isContainer true
			:opposite system
		) ( struct-map
			KM3_Reference
			:name "attachments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_System
			:type ACME_Link
			:location "42:3-42:82"
			:isContainer true
			:opposite systemAttachment
		) ( struct-map
			KM3_Reference
			:name "bindings"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_System
			:type ACME_Link
			:location "43:3-43:76"
			:isContainer true
			:opposite systemBinding
		)]
	) ) ( def ACME_Representation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "systems"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_Representation
			:type ACME_System
			:location "51:4-51:53"
			:isContainer true
		)]
	) ) ( def ACME_Component ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACME_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_Component
			:type ACME_Port
			:location "61:3-61:48"
			:isContainer true
		)]
	) ) ( def ACME_ComponentInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Component]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "instanceOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_ComponentInstance
			:type String
			:location "67:3-67:33"
		)]
	) ) ( def ACME_ComponentType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Component ACME_ACMEEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extend"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_ComponentType
			:type String
			:location "73:3-73:29"
		)]
	) ) ( def ACME_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Element]
		:structuralFeatures[]
	) ) ( def ACME_Connector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "roles"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACME_Connector
			:type ACME_Role
			:location "88:3-88:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Connector
			:type ACME_System
			:location "89:3-89:61"
			:isContainer false
			:opposite connectorDeclaration
		)]
	) ) ( def ACME_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Element]
		:structuralFeatures[]
	) ) ( def ACME_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Property
			:type String
			:location "102:3-102:27"
		) ( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Property
			:type String
			:location "103:3-103:26"
		)]
	) ) ( def ACME_Link ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "systemBinding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Link
			:type ACME_System
			:location "109:3-109:56"
			:isContainer false
			:opposite bindings
		) ( struct-map
			KM3_Reference
			:name "systemAttachment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Link
			:type ACME_System
			:location "110:3-110:62"
			:isContainer false
			:opposite attachments
		)]
	) ) ( def ACME_Attachment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Link]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "comp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Attachment
			:type String
			:location "117:3-117:27"
		) ( struct-map
			KM3_Attribute
			:name "port"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Attachment
			:type String
			:location "118:3-118:27"
		) ( struct-map
			KM3_Attribute
			:name "con"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Attachment
			:type String
			:location "119:3-119:26"
		) ( struct-map
			KM3_Attribute
			:name "role"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Attachment
			:type String
			:location "120:3-120:27"
		)]
	) ) ( def ACME_Binding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACME_Link]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "compSrc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Binding
			:type String
			:location "127:3-127:30"
		) ( struct-map
			KM3_Attribute
			:name "portSrc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Binding
			:type String
			:location "128:3-128:30"
		) ( struct-map
			KM3_Attribute
			:name "compDest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Binding
			:type String
			:location "129:3-129:31"
		) ( struct-map
			KM3_Attribute
			:name "portDest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACME_Binding
			:type String
			:location "130:3-130:31"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "136:2-136:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "137:2-137:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "138:2-138:18"
	) )]
) )
