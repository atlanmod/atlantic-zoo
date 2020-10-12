( declare Model_Management_Package )
( declare Model_Management_Model )
( declare Model_Management_Subsystem )
( declare Model_Management_ElementImport )
( declare Core_Element )
( declare Core_ModelElement )
( declare Core_GeneralizableElement )
( declare Core_Namespace )
( declare Core_Classifier )
( declare Core_Feature )
( declare Core_Relationship )
( declare Core_Generalization )
( declare Data_Types_ScopeKind )
( declare Data_Types_VisibilityKind )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Float )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Long )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def Model_Management ( struct-map
	KM3_Package
	:contents[( def Model_Management_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_GeneralizableElement Core_Namespace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elementImport"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Model_Management_Package
			:type Model_Management_ElementImport
			:location "11:3-11:77"
			:isContainer true
			:opposite package
		)]
	) ) ( def Model_Management_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Model_Management_Package]
		:structuralFeatures[]
	) ) ( def Model_Management_Subsystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Model_Management_Package Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInstantiable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_Subsystem
			:type Boolean
			:location "18:3-18:38"
		)]
	) ) ( def Model_Management_ElementImport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Model_Management_ElementImport
			:type VisibilityKind
			:location "24:3-24:46"
		) ( struct-map
			KM3_Attribute
			:name "alias"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Model_Management_ElementImport
			:type String
			:location "25:3-25:33"
		) ( struct-map
			KM3_Attribute
			:name "isSpecification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_ElementImport
			:type Boolean
			:location "26:3-26:39"
		) ( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_ElementImport
			:type Model_Management_Package
			:location "22:3-22:58"
			:isContainer false
			:opposite elementImport
		) ( struct-map
			KM3_Reference
			:name "importedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_ElementImport
			:type Core_ModelElement
			:location "23:3-23:44"
			:isContainer false
		)]
	) )]
) )
( def Core ( struct-map
	KM3_Package
	:contents[( def Core_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Core_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type String
			:location "36:3-36:32"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type VisibilityKind
			:location "37:3-37:46"
		) ( struct-map
			KM3_Attribute
			:name "isSpecification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_ModelElement
			:type Boolean
			:location "38:3-38:39"
		) ( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Namespace
			:location "35:3-35:64"
			:isContainer false
			:opposite ownedElement
		)]
	) ) ( def Core_GeneralizableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "43:3-43:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "44:3-44:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "45:3-45:34"
		) ( struct-map
			KM3_Reference
			:name "generalization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Core_Generalization
			:location "42:3-42:65"
			:isContainer false
			:opposite child
		)]
	) ) ( def Core_Namespace ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Namespace
			:type Core_ModelElement
			:location "49:3-49:75"
			:isContainer true
			:opposite namespace
		)]
	) ) ( def Core_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_GeneralizableElement Core_Namespace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "powertypeRange"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Classifier
			:type Core_Generalization
			:location "53:3-53:69"
			:isContainer false
			:opposite powertype
		) ( struct-map
			KM3_Reference
			:name "feature"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_Classifier
			:type Core_Feature
			:location "54:3-54:69"
			:isContainer true
			:opposite owner
		)]
	) ) ( def Core_Feature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ownerScope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Feature
			:type ScopeKind
			:location "59:3-59:36"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Feature
			:type Core_Classifier
			:location "58:3-58:56"
			:isContainer false
			:opposite feature
		)]
	) ) ( def Core_Relationship ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[]
	) ) ( def Core_Generalization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Relationship]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "discriminator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type String
			:location "68:3-68:41"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "65:3-65:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "powertype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type Core_Classifier
			:location "66:3-66:67"
			:isContainer false
			:opposite powertypeRange
		) ( struct-map
			KM3_Reference
			:name "child"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "67:3-67:68"
			:isContainer false
			:opposite generalization
		)]
	) )]
) )
( def Data_Types ( struct-map
	KM3_Package
	:contents[( def ScopeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sk_instance"
		:location "75:3-75:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "sk_classifier"
		:location "76:3-76:25"
	)] ) ) ( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public"
		:location "80:3-80:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected"
		:location "81:3-81:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private"
		:location "82:3-82:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_package"
		:location "83:3-83:22"
	)] ) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "88:2-88:19"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "89:2-89:17"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "90:2-90:19"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "91:2-91:16"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "92:2-92:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "93:2-93:18"
	) )]
) )
