( declare AbstractSynthax_ModelElement )
( declare AbstractSynthax_Constraint )
( declare AbstractSynthax_TaggedValue )
( declare AbstractSynthax_TagDefinition )
( declare AbstractSynthax_Multiplicity )
( declare AbstractSynthax_GeneralizableElement )
( declare AbstractSynthax_Stereotype )
( declare AbstractSynthax_Geometry )
( declare AbstractSynthax_Name )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def AbstractSynthax ( struct-map
	KM3_Package
	:contents[( def AbstractSynthax_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referenceTag"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_ModelElement
			:type AbstractSynthax_TaggedValue
			:location "16:3-16:70"
			:isContainer false
			:opposite referenceValue
		) ( struct-map
			KM3_Reference
			:name "stereotype"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_ModelElement
			:type AbstractSynthax_Stereotype
			:location "17:3-17:68"
			:isContainer false
			:opposite extendedElement
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_ModelElement
			:type AbstractSynthax_Constraint
			:location "18:3-18:71"
			:isContainer false
			:opposite constrainedElement
		) ( struct-map
			KM3_Reference
			:name "taggedValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_ModelElement
			:type AbstractSynthax_TaggedValue
			:location "19:3-19:53"
			:isContainer true
		)]
	) ) ( def AbstractSynthax_Constraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constrainedElement"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AbstractSynthax_Constraint
			:type AbstractSynthax_ModelElement
			:location "23:3-23:81"
			:isContainer false
			:opposite constraint
		) ( struct-map
			KM3_Reference
			:name "constrainedStereotype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_Constraint
			:type AbstractSynthax_Stereotype
			:location "24:3-24:86"
			:isContainer false
			:opposite stereotypeConstraint
		)]
	) ) ( def AbstractSynthax_TaggedValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dataValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_TaggedValue
			:type String
			:location "28:3-28:32"
		) ( struct-map
			KM3_Reference
			:name "referenceValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_TaggedValue
			:type AbstractSynthax_ModelElement
			:location "29:3-29:71"
			:isContainer false
			:opposite referenceTag
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_TaggedValue
			:type AbstractSynthax_TagDefinition
			:location "30:3-30:56"
			:isContainer false
			:opposite typedValue
		)]
	) ) ( def AbstractSynthax_TagDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AbstractSynthax_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tagType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_TagDefinition
			:type String
			:location "34:3-34:30"
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_TagDefinition
			:type AbstractSynthax_Multiplicity
			:location "35:3-35:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "typedValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_TagDefinition
			:type AbstractSynthax_TaggedValue
			:location "36:3-36:58"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_TagDefinition
			:type AbstractSynthax_Stereotype
			:location "37:3-37:60"
			:isContainer false
			:opposite definedTag
		)]
	) ) ( def AbstractSynthax_Multiplicity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_Multiplicity
			:type String
			:location "41:3-41:28"
		)]
	) ) ( def AbstractSynthax_GeneralizableElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def AbstractSynthax_Stereotype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AbstractSynthax_GeneralizableElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "icon"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_Stereotype
			:type AbstractSynthax_Geometry
			:location "47:3-47:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "baseClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_Stereotype
			:type AbstractSynthax_Name
			:location "48:3-48:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "definedTag"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_Stereotype
			:type AbstractSynthax_TagDefinition
			:location "49:3-49:72"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "stereotypeConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_Stereotype
			:type AbstractSynthax_Constraint
			:location "50:3-50:95"
			:isContainer true
			:opposite constrainedStereotype
		) ( struct-map
			KM3_Reference
			:name "extendedElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AbstractSynthax_Stereotype
			:type AbstractSynthax_ModelElement
			:location "51:3-51:70"
			:isContainer false
			:opposite stereotype
		)]
	) ) ( def AbstractSynthax_Geometry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_Geometry
			:type String
			:location "55:3-55:28"
		)]
	) ) ( def AbstractSynthax_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AbstractSynthax_Name
			:type String
			:location "59:3-59:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "64:2-64:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "65:2-65:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "66:2-66:18"
	) )]
) )
