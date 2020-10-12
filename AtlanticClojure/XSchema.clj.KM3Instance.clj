( declare XSchema_AttributeUseType )
( declare XSchema_AnnotedElement )
( declare XSchema_Annotation )
( declare XSchema_Documentation )
( declare XSchema_ApplicationInfo )
( declare XSchema_NamedElement )
( declare XSchema_XSchema )
( declare XSchema_XSchemaContentElement )
( declare XSchema_Parameters )
( declare XSchema_Element )
( declare XSchema_Occurable )
( declare XSchema_AbstractContent )
( declare XSchema_Container )
( declare XSchema_AtomicContent )
( declare XSchema_ElementRef )
( declare XSchema_GroupRef )
( declare XSchema_All )
( declare XSchema_Group )
( declare XSchema_Choice )
( declare XSchema_Sequence )
( declare XSchema_AbstractAttributeGroupContent )
( declare XSchema_AttributeGroup )
( declare XSchema_AttributeGroupRef )
( declare XSchema_AtomicAttributeGroupContent )
( declare XSchema_Attribute )
( declare XSchema_AttributeRef )
( declare XSchema_AbstractType )
( declare XSchema_SimpleType )
( declare XSchema_ComplexType )
( declare XSchema_ComplexTypeSimpleContent )
( declare XSchema_ComplexTypeComplexContent )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def XSchema ( struct-map
	KM3_Package
	:contents[( def AttributeUseType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "null"
		:location "12:3-12:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "optional"
		:location "13:3-13:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "prohibited"
		:location "14:3-14:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "required"
		:location "15:3-15:20"
	)] ) ) ( def XSchema_AnnotedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annotations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_AnnotedElement
			:type XSchema_Annotation
			:location "19:3-19:77"
			:isContainer true
			:opposite annotedElement
		)]
	) ) ( def XSchema_Annotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "documentations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XSchema_Annotation
			:type XSchema_Documentation
			:location "24:3-24:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "applicationInfos"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XSchema_Annotation
			:type XSchema_ApplicationInfo
			:location "26:3-26:69"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "annotedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_Annotation
			:type XSchema_AnnotedElement
			:location "27:3-27:68"
			:isContainer false
			:opposite annotations
		)]
	) ) ( def XSchema_Documentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_Documentation
			:type String
			:location "31:3-31:27"
		)]
	) ) ( def XSchema_ApplicationInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_ApplicationInfo
			:type String
			:location "35:3-35:27"
		)]
	) ) ( def XSchema_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_AnnotedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_NamedElement
			:type String
			:location "39:3-39:27"
		)]
	) ) ( def XSchema_XSchema ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AnnotedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_XSchema
			:type String
			:location "43:3-43:32"
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_XSchema
			:type XSchema_XSchemaContentElement
			:location "44:3-44:77"
			:isContainer true
			:opposite schema
		)]
	) ) ( def XSchema_XSchemaContentElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "schema"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSchema_XSchemaContentElement
			:type XSchema_XSchema
			:location "48:3-48:55"
			:isContainer false
			:opposite contents
		)]
	) ) ( def XSchema_Parameters ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_XSchemaContentElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fixed"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSchema_Parameters
			:type String
			:location "54:3-54:33"
		) ( struct-map
			KM3_Attribute
			:name "default"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSchema_Parameters
			:type String
			:location "55:3-55:37"
		) ( struct-map
			KM3_Reference
			:name "typeRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSchema_Parameters
			:type XSchema_AbstractType
			:location "52:3-52:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "typeContain"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSchema_Parameters
			:type XSchema_AbstractType
			:location "53:3-53:78"
			:isContainer true
			:opposite container
		)]
	) ) ( def XSchema_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_Parameters XSchema_AtomicContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "references"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_Element
			:type XSchema_ElementRef
			:location "59:3-59:69"
			:isContainer false
			:opposite referencedElement
		)]
	) ) ( def XSchema_Occurable ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "minOccurs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_Occurable
			:type String
			:location "63:3-63:32"
		) ( struct-map
			KM3_Attribute
			:name "maxOccurs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_Occurable
			:type String
			:location "64:3-64:32"
		)]
	) ) ( def XSchema_AbstractContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_Occurable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_AbstractContent
			:type XSchema_Container
			:location "68:3-68:57"
			:isContainer false
			:opposite contents
		) ( struct-map
			KM3_Reference
			:name "complexType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_AbstractContent
			:type XSchema_ComplexType
			:location "69:3-69:58"
			:isContainer false
			:opposite content
		)]
	) ) ( def XSchema_Container ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_AbstractContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XSchema_Container
			:type XSchema_AbstractContent
			:location "73:3-73:84"
			:isContainer true
			:opposite container
		)]
	) ) ( def XSchema_AtomicContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_AbstractContent]
		:structuralFeatures[]
	) ) ( def XSchema_ElementRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AtomicContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referencedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_ElementRef
			:type XSchema_Element
			:location "80:3-80:63"
			:isContainer false
			:opposite references
		)]
	) ) ( def XSchema_GroupRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AtomicContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referencedGroup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_GroupRef
			:type XSchema_Group
			:location "84:3-84:59"
			:isContainer false
			:opposite references
		)]
	) ) ( def XSchema_All ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_Container]
		:structuralFeatures[]
	) ) ( def XSchema_Group ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_XSchemaContentElement XSchema_Container]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "references"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_Group
			:type XSchema_GroupRef
			:location "91:3-91:65"
			:isContainer false
			:opposite referencedGroup
		)]
	) ) ( def XSchema_Choice ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_Container]
		:structuralFeatures[]
	) ) ( def XSchema_Sequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_Container]
		:structuralFeatures[]
	) ) ( def XSchema_AbstractAttributeGroupContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_Occurable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_AbstractAttributeGroupContent
			:type XSchema_AttributeGroup
			:location "102:3-102:62"
			:isContainer false
			:opposite contents
		) ( struct-map
			KM3_Reference
			:name "complexType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_AbstractAttributeGroupContent
			:type XSchema_ComplexType
			:location "103:3-103:61"
			:isContainer false
			:opposite attributes
		)]
	) ) ( def XSchema_AttributeGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AbstractAttributeGroupContent XSchema_XSchemaContentElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XSchema_AttributeGroup
			:type XSchema_AbstractAttributeGroupContent
			:location "107:3-107:98"
			:isContainer true
			:opposite container
		) ( struct-map
			KM3_Reference
			:name "references"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_AttributeGroup
			:type XSchema_AttributeGroupRef
			:location "108:3-108:83"
			:isContainer false
			:opposite referencedAttributeGroup
		)]
	) ) ( def XSchema_AttributeGroupRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AtomicAttributeGroupContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referencedAttributeGroup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_AttributeGroupRef
			:type XSchema_AttributeGroup
			:location "112:3-112:77"
			:isContainer false
			:opposite references
		)]
	) ) ( def XSchema_AtomicAttributeGroupContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_AbstractAttributeGroupContent]
		:structuralFeatures[]
	) ) ( def XSchema_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_Parameters XSchema_AtomicAttributeGroupContent]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "use"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSchema_Attribute
			:type AttributeUseType
			:location "119:3-119:41"
		) ( struct-map
			KM3_Reference
			:name "references"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_Attribute
			:type XSchema_AttributeRef
			:location "120:3-120:73"
			:isContainer false
			:opposite referencedAttribute
		)]
	) ) ( def XSchema_AttributeRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AtomicAttributeGroupContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referencedAttribute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_AttributeRef
			:type XSchema_Attribute
			:location "124:3-124:67"
			:isContainer false
			:opposite references
		)]
	) ) ( def XSchema_AbstractType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XSchema_XSchemaContentElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_AbstractType
			:type XSchema_Parameters
			:location "132:3-132:62"
			:isContainer false
			:opposite typeContain
		)]
	) ) ( def XSchema_SimpleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AbstractType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "extensions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_SimpleType
			:type XSchema_ComplexTypeSimpleContent
			:location "137:3-137:70"
			:isContainer false
			:opposite base
		)]
	) ) ( def XSchema_ComplexType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_AbstractType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "extensions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_ComplexType
			:type XSchema_ComplexTypeComplexContent
			:location "142:3-142:71"
			:isContainer false
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XSchema_ComplexType
			:type XSchema_AbstractContent
			:location "143:3-143:77"
			:isContainer true
			:opposite complexType
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XSchema_ComplexType
			:type XSchema_AbstractAttributeGroupContent
			:location "144:3-144:92"
			:isContainer true
			:opposite complexType
		)]
	) ) ( def XSchema_ComplexTypeSimpleContent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_ComplexType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_ComplexTypeSimpleContent
			:type XSchema_SimpleType
			:location "148:3-148:53"
			:isContainer false
			:opposite extensions
		)]
	) ) ( def XSchema_ComplexTypeComplexContent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XSchema_ComplexType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XSchema_ComplexTypeComplexContent
			:type XSchema_ComplexType
			:location "152:3-152:54"
			:isContainer false
			:opposite extensions
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "160:2-160:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "161:2-161:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "162:2-162:19"
	) )]
) )
