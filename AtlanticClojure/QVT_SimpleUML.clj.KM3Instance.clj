( declare SimpleUML_UMLModelElement )
( declare SimpleUML_Attribute )
( declare SimpleUML_Package )
( declare SimpleUML_PackageElement )
( declare SimpleUML_Classifier )
( declare SimpleUML_Class )
( declare SimpleUML_PrimitiveDataType )
( declare SimpleUML_Association )
( declare PrimitiveTypes_String )
( def SimpleUML ( struct-map
	KM3_Package
	:contents[( def SimpleUML_UMLModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleUML_UMLModelElement
			:type String
			:location "11:5-11:29"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleUML_UMLModelElement
			:type String
			:location "12:5-12:29"
		)]
	) ) ( def SimpleUML_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleUML_UMLModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleUML_Attribute
			:type SimpleUML_Class
			:location "16:5-16:52"
			:isContainer false
			:opposite attribute
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleUML_Attribute
			:type SimpleUML_Classifier
			:location "17:5-17:57"
			:isContainer false
			:opposite typeOpposite
		)]
	) ) ( def SimpleUML_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleUML_UMLModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleUML_Package
			:type SimpleUML_PackageElement
			:location "21:5-21:75"
			:isContainer true
			:opposite namespace
		)]
	) ) ( def SimpleUML_PackageElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SimpleUML_UMLModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleUML_PackageElement
			:type SimpleUML_Package
			:location "25:5-25:60"
			:isContainer false
			:opposite elements
		)]
	) ) ( def SimpleUML_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SimpleUML_PackageElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "typeOpposite"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleUML_Classifier
			:type SimpleUML_Attribute
			:location "29:5-29:59"
			:isContainer false
			:opposite type
		)]
	) ) ( def SimpleUML_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleUML_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleUML_Class
			:type SimpleUML_Attribute
			:location "33:5-33:69"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "general"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleUML_Class
			:type SimpleUML_Class
			:location "34:5-34:61"
			:isContainer false
			:opposite generalOpposite
		) ( struct-map
			KM3_Reference
			:name "generalOpposite"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleUML_Class
			:type SimpleUML_Class
			:location "35:5-35:61"
			:isContainer false
			:opposite general
		) ( struct-map
			KM3_Reference
			:name "reverse"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleUML_Class
			:type SimpleUML_Association
			:location "36:5-36:58"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "forward"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleUML_Class
			:type SimpleUML_Association
			:location "37:5-37:63"
			:isContainer false
			:opposite destination
		)]
	) ) ( def SimpleUML_PrimitiveDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleUML_Classifier]
		:structuralFeatures[]
	) ) ( def SimpleUML_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleUML_PackageElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleUML_Association
			:type SimpleUML_Class
			:location "43:5-43:54"
			:isContainer false
			:opposite reverse
		) ( struct-map
			KM3_Reference
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleUML_Association
			:type SimpleUML_Class
			:location "44:5-44:59"
			:isContainer false
			:opposite forward
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "50:3-50:19"
	) )]
) )
