( declare ExtendedUMLCorePackage_ModelElement )
( declare ExtendedUMLCorePackage_Name )
( declare ExtendedUMLCorePackage_AssociationEnd )
( declare ExtendedUMLCorePackage_AggregationKind )
( declare ExtendedUMLCorePackage_Multiplicity )
( declare ExtendedUMLCorePackage_ChangeableKind )
( declare ExtendedUMLCorePackage_ScopeKind )
( declare ExtendedUMLCorePackage_RfIntegretyKind )
( declare ExtendedUMLCorePackage_RlIntegretyKind )
( declare ExtendedUMLCorePackage_Namespace )
( declare ExtendedUMLCorePackage_GeneralizableElement )
( declare ExtendedUMLCorePackage_Classifier )
( declare ExtendedUMLCorePackage_Class )
( declare ExtendedUMLCorePackage_Key )
( declare ExtendedUMLCorePackage_Feature )
( declare ExtendedUMLCorePackage_StructureFeature )
( declare ExtendedUMLCorePackage_Constraint )
( declare ExtendedUMLCorePackage_Attribute )
( declare ExtendedUMLCorePackage_Expression )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def ExtendedUMLCorePackage ( struct-map
	KM3_Package
	:contents[( def ExtendedUMLCorePackage_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_ModelElement
			:type ExtendedUMLCorePackage_Name
			:location "17:3-17:25"
			:isContainer false
		)]
	) ) ( def ExtendedUMLCorePackage_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_AssociationEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isNavigable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type Boolean
			:location "24:3-24:35"
		) ( struct-map
			KM3_Attribute
			:name "isOrdered"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type Boolean
			:location "25:3-25:33"
		) ( struct-map
			KM3_Reference
			:name "aggregation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type ExtendedUMLCorePackage_AggregationKind
			:location "26:3-26:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type ExtendedUMLCorePackage_Multiplicity
			:location "27:3-27:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "changeable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type ExtendedUMLCorePackage_ChangeableKind
			:location "28:3-28:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "TargetScope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type ExtendedUMLCorePackage_ScopeKind
			:location "29:3-29:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rfIntegrety"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type ExtendedUMLCorePackage_RlIntegretyKind
			:location "30:3-30:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rlIntegrety"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEnd
			:type ExtendedUMLCorePackage_RlIntegretyKind
			:location "31:3-31:43"
			:isContainer false
		)]
	) ) ( def ExtendedUMLCorePackage_AggregationKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_Multiplicity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_ChangeableKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_ScopeKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_RfIntegretyKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_RlIntegretyKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_Namespace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_ModelElement]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_GeneralizableElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_Namespace]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_GeneralizableElement]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isActive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Class
			:type Boolean
			:location "62:3-62:32"
		) ( struct-map
			KM3_Reference
			:name "mutliplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Class
			:type ExtendedUMLCorePackage_Multiplicity
			:location "63:3-63:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Class
			:type ExtendedUMLCorePackage_Key
			:location "64:3-64:59"
			:isContainer true
			:opposite classOwner
		)]
	) ) ( def ExtendedUMLCorePackage_Key ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ExtendedUMLCorePackage_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Key
			:type ExtendedUMLCorePackage_Class
			:location "68:3-68:47"
			:isContainer false
			:opposite key
		)]
	) ) ( def ExtendedUMLCorePackage_Feature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_ModelElement]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_StructureFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_Feature]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_Constraint ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ExtendedUMLCorePackage_Feature]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_StructureFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isKey"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Attribute
			:type Boolean
			:location "82:3-82:29"
		) ( struct-map
			KM3_Attribute
			:name "isUnique"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Attribute
			:type Boolean
			:location "83:3-83:32"
		) ( struct-map
			KM3_Reference
			:name "initialValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Attribute
			:type ExtendedUMLCorePackage_Expression
			:location "81:3-81:39"
			:isContainer false
		)]
	) ) ( def ExtendedUMLCorePackage_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "91:2-91:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "92:2-92:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "93:2-93:18"
	) )]
) )
