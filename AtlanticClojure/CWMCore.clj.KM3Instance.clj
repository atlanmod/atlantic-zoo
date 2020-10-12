( declare CWMCore_VisibilityKind )
( declare CWMCore_BooleanExpression )
( declare CWMCore_ModelElement )
( declare CWMCore_Dependency )
( declare CWMCore_Constraint )
( declare CWMCore_Feature )
( declare CWMCore_StructuralFeature )
( declare CWMCore_Attribute )
( declare CWMCore_NameSpace )
( declare CWMCore_Classifier )
( declare CWMCore_Package )
( declare CWMCore_Class )
( declare CWMCore_Datatype )
( declare CWMCore_Subsystem )
( declare CWMCore_Model )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def CWMCore ( struct-map
	KM3_Package
	:contents[( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public_vis"
		:location "15:3-15:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private_vis"
		:location "16:3-16:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected_vis"
		:location "17:3-17:28"
	)] ) ) ( def CWMCore_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "expresssion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMCore_BooleanExpression
			:type String
			:location "21:3-21:34"
		)]
	) ) ( def CWMCore_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMCore_ModelElement
			:type String
			:location "30:3-30:27"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMCore_ModelElement
			:type VisibilityKind
			:location "31:3-31:41"
		) ( struct-map
			KM3_Reference
			:name "contraints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMCore_ModelElement
			:type CWMCore_Constraint
			:location "32:3-32:71"
			:isContainer false
			:opposite constrainedElements
		) ( struct-map
			KM3_Reference
			:name "clientDependencies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMCore_ModelElement
			:type CWMCore_Dependency
			:location "33:3-33:67"
			:isContainer false
			:opposite clients
		) ( struct-map
			KM3_Reference
			:name "supplierDependencies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMCore_ModelElement
			:type CWMCore_Dependency
			:location "34:3-34:71"
			:isContainer false
			:opposite suppliers
		) ( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CWMCore_ModelElement
			:type CWMCore_NameSpace
			:location "35:3-35:65"
			:isContainer false
			:opposite ownedElements
		) ( struct-map
			KM3_Reference
			:name "importers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMCore_ModelElement
			:type CWMCore_Package
			:location "36:3-36:64"
			:isContainer false
			:opposite importedElements
		)]
	) ) ( def CWMCore_Dependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMCore_Dependency
			:type String
			:location "40:3-40:27"
		) ( struct-map
			KM3_Reference
			:name "clients"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CWMCore_Dependency
			:type CWMCore_ModelElement
			:location "41:3-41:71"
			:isContainer false
			:opposite clientDependencies
		) ( struct-map
			KM3_Reference
			:name "suppliers"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CWMCore_Dependency
			:type CWMCore_ModelElement
			:location "42:3-42:75"
			:isContainer false
			:opposite supplierDependencies
		)]
	) ) ( def CWMCore_Constraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMCore_Constraint
			:type CWMCore_BooleanExpression
			:location "46:3-46:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "constrainedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMCore_Constraint
			:type CWMCore_ModelElement
			:location "47:3-47:73"
			:isContainer false
			:opposite contraints
		)]
	) ) ( def CWMCore_Feature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CWMCore_Feature
			:type CWMCore_Classifier
			:location "51:3-51:57"
			:isContainer false
			:opposite features
		)]
	) ) ( def CWMCore_StructuralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_Feature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMCore_StructuralFeature
			:type CWMCore_Classifier
			:location "55:3-55:31"
			:isContainer false
		)]
	) ) ( def CWMCore_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_StructuralFeature]
		:structuralFeatures[]
	) ) ( def CWMCore_NameSpace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMCore_NameSpace
			:type CWMCore_ModelElement
			:location "61:3-61:76"
			:isContainer true
			:opposite namespace
		)]
	) ) ( def CWMCore_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_NameSpace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "features"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CWMCore_Classifier
			:type CWMCore_Feature
			:location "65:3-65:70"
			:isContainer true
			:opposite owner
		)]
	) ) ( def CWMCore_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_NameSpace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "importedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMCore_Package
			:type CWMCore_ModelElement
			:location "69:3-69:69"
			:isContainer false
			:opposite importers
		)]
	) ) ( def CWMCore_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_Classifier]
		:structuralFeatures[]
	) ) ( def CWMCore_Datatype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_Classifier]
		:structuralFeatures[]
	) ) ( def CWMCore_Subsystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_Classifier CWMCore_Package]
		:structuralFeatures[]
	) ) ( def CWMCore_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMCore_Package]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "87:2-87:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "88:2-88:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "89:2-89:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "90:2-90:18"
	) )]
) )
