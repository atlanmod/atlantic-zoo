( declare IEEE1471_Viewpoint )
( declare IEEE1471_Concern )
( declare IEEE1471_Stakeholder )
( declare IEEE1471_ViewpointImport )
( declare IEEE1471_ViewpointDependency )
( declare IEEE1471_Process )
( declare IEEE1471_Technique )
( declare IEEE1471_AnalysisMethod )
( declare IEEE1471_ArchitecturalConstruct )
( declare IEEE1471_Rule )
( declare IEEE1471_ModelOrganization )
( declare IEEE1471_ModellingRule )
( declare IEEE1471_Language )
( declare IEEE1471_Mapping )
( declare IEEE1471_Pattern )
( def IEEE1471 ( struct-map
	KM3_Package
	:contents[( def IEEE1471_Viewpoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_ViewpointImport
			:location "19:3-19:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "covers"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_Concern
			:location "20:3-20:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "supplierDependency"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_ViewpointDependency
			:location "21:3-21:77"
			:isContainer false
			:opposite supplier
		) ( struct-map
			KM3_Reference
			:name "clientDependency"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_ViewpointDependency
			:location "22:3-22:73"
			:isContainer false
			:opposite client
		) ( struct-map
			KM3_Reference
			:name "isImportTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_Stakeholder
			:location "23:3-23:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "architecturalConstruct"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_ArchitecturalConstruct
			:location "24:3-24:74"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Viewpoint
			:type IEEE1471_Process
			:location "25:3-25:41"
			:isContainer true
		)]
	) ) ( def IEEE1471_Concern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IEEE1471_Stakeholder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "concerns"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Stakeholder
			:type IEEE1471_Concern
			:location "31:3-31:37"
			:isContainer false
		)]
	) ) ( def IEEE1471_ViewpointImport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IEEE1471_ViewpointDependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "supplier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_ViewpointDependency
			:type IEEE1471_Viewpoint
			:location "38:3-38:64"
			:isContainer false
			:opposite supplierDependency
		) ( struct-map
			KM3_Reference
			:name "client"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_ViewpointDependency
			:type IEEE1471_Viewpoint
			:location "39:3-39:60"
			:isContainer false
			:opposite clientDependency
		)]
	) ) ( def IEEE1471_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "methodology"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Process
			:type IEEE1471_Technique
			:location "45:3-45:43"
			:isContainer false
		)]
	) ) ( def IEEE1471_Technique ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IEEE1471_Technique
			:type IEEE1471_AnalysisMethod
			:location "49:3-49:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "applies"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Technique
			:type IEEE1471_Rule
			:location "50:3-50:55"
			:isContainer false
			:opposite techniques
		)]
	) ) ( def IEEE1471_AnalysisMethod ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "analysis"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_AnalysisMethod
			:type IEEE1471_Language
			:location "54:3-54:33"
			:isContainer false
		)]
	) ) ( def IEEE1471_ArchitecturalConstruct ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IEEE1471_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_ArchitecturalConstruct]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "techniques"
			:upper -1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Rule
			:type IEEE1471_Technique
			:location "63:3-63:60"
			:isContainer false
			:opposite applies
		) ( struct-map
			KM3_Reference
			:name "guidance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Rule
			:type IEEE1471_Language
			:location "64:3-64:33"
			:isContainer false
		)]
	) ) ( def IEEE1471_ModelOrganization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_Rule]
		:structuralFeatures[]
	) ) ( def IEEE1471_ModellingRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IEEE1471_Language ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_ArchitecturalConstruct]
		:structuralFeatures[]
	) ) ( def IEEE1471_Mapping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_ArchitecturalConstruct]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "input"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Mapping
			:type IEEE1471_Language
			:location "75:3-75:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "ouput"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IEEE1471_Mapping
			:type IEEE1471_Language
			:location "76:3-76:30"
			:isContainer false
		)]
	) ) ( def IEEE1471_Pattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IEEE1471_ArchitecturalConstruct]
		:structuralFeatures[]
	) )]
) )
