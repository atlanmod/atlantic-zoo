( declare DoDAF_Element )
( declare DoDAF_System )
( declare DoDAF_SystemRole )
( declare DoDAF_SystemFunction )
( declare DoDAF_Service )
( declare DoDAF_SystemRoleInterface )
( declare DoDAF_ServiceDependency )
( declare DoDAF_ServiceProvider )
( declare DoDAF_ServiceMediator )
( declare DoDAF_ServiceRegistry )
( declare DoDAF_ServiceLocator )
( declare DoDAF_ServiceBroker )
( declare DoDAF_SystemAtNode )
( declare DoDAF_SystemAtNodeInterface )
( declare DoDAF_SystemsNode )
( declare DoDAF_COI )
( declare DoDAF_Vocabulary )
( declare DoDAF_DataReference )
( declare DoDAF_Performer )
( declare DoDAF_OperationalRole )
( declare DoDAF_OperationalActivity )
( declare DoDAF_Product )
( declare DoDAF_Material )
( declare DoDAF_Data )
( declare DoDAF_SystemProductFlow )
( declare DoDAF_ConstraintOrRequirement )
( declare DoDAF_Constraint )
( declare DoDAF_QualityRequirement )
( declare DoDAF_DIA )
( declare DoDAF_NMJIC )
( declare DoDAF_HigherEchelon )
( declare DoDAF_JFC )
( declare DoDAF_F2C2 )
( declare DoDAF_ComponentCommand )
( declare DoDAF_DJFLCC )
( declare DoDAF_JFACC )
( declare DoDAF_JFMCC )
( declare DoDAF_JFSOCC )
( declare DoDAF_SubordinateAirCommand )
( declare DoDAF_MAW )
( declare DoDAF_WOC )
( declare DoDAF_AOCCID )
( declare DoDAF_AOCCombatPlanStrategyCells )
( declare DoDAF_ResultData )
( declare DoDAF_CombatReport )
( declare DoDAF_WSV )
( declare DoDAF_MISREP )
( declare DoDAF_Imagery )
( declare DoDAF_CollectionRequirement )
( declare DoDAF_BDAReport )
( declare DoDAF_MunitionsEffectsAssesment )
( declare DoDAF_ATO )
( declare DoDAF_RestrikeRecommendation )
( declare DoDAF_TargetNomination )
( declare DoDAF_TargetMaterialsAnalysis )
( declare DoDAF_Target )
( declare DoDAF_MIDB )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def DoDAF ( struct-map
	KM3_Package
	:contents[( def DoDAF_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "19:3-19:30"
		)]
	) ) ( def DoDAF_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "decomposes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_System
			:type DoDAF_System
			:location "26:3-26:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fulfills"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_System
			:type DoDAF_SystemRole
			:location "27:3-27:38"
			:isContainer false
		)]
	) ) ( def DoDAF_SystemRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "decomposes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemRole
			:type DoDAF_SystemRole
			:location "33:3-33:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "performs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemRole
			:type DoDAF_SystemFunction
			:location "34:3-34:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "terminatesAt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemRole
			:type DoDAF_SystemRoleInterface
			:location "35:3-35:74"
			:isContainer false
			:opposite originatesFrom
		)]
	) ) ( def DoDAF_SystemFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "decomposes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunction
			:type DoDAF_SystemFunction
			:location "41:3-41:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "consumes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunction
			:type DoDAF_Product
			:location "42:3-42:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "produces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunction
			:type DoDAF_Product
			:location "43:3-43:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "terminatesAt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemFunction
			:type DoDAF_SystemProductFlow
			:location "44:3-44:72"
			:isContainer false
			:opposite originatesFrom
		) ( struct-map
			KM3_Reference
			:name "mesuredBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunction
			:type DoDAF_ConstraintOrRequirement
			:location "45:3-45:52"
			:isContainer false
		)]
	) ) ( def DoDAF_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_SystemFunction]
		:structuralFeatures[]
	) ) ( def DoDAF_SystemRoleInterface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "originatesFrom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemRoleInterface
			:type DoDAF_SystemRole
			:location "55:3-55:65"
			:isContainer false
			:opposite terminatesAt
		)]
	) ) ( def DoDAF_ServiceDependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_SystemRoleInterface]
		:structuralFeatures[]
	) ) ( def DoDAF_ServiceProvider ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_SystemRole]
		:structuralFeatures[]
	) ) ( def DoDAF_ServiceMediator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ServiceProvider]
		:structuralFeatures[]
	) ) ( def DoDAF_ServiceRegistry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ServiceMediator]
		:structuralFeatures[]
	) ) ( def DoDAF_ServiceLocator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ServiceMediator]
		:structuralFeatures[]
	) ) ( def DoDAF_ServiceBroker ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ServiceMediator]
		:structuralFeatures[]
	) ) ( def DoDAF_SystemAtNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "references"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemAtNode
			:type DoDAF_System
			:location "92:3-92:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "terminatesAt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemAtNode
			:type DoDAF_SystemAtNodeInterface
			:location "93:3-93:76"
			:isContainer false
			:opposite originatesFrom
		)]
	) ) ( def DoDAF_SystemAtNodeInterface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "originatesFrom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemAtNodeInterface
			:type DoDAF_SystemAtNode
			:location "99:3-99:67"
			:isContainer false
			:opposite terminatesAt
		)]
	) ) ( def DoDAF_SystemsNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "groups"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemsNode
			:type DoDAF_SystemAtNode
			:location "105:3-105:38"
			:isContainer false
		)]
	) ) ( def DoDAF_COI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "comprises"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_COI
			:type DoDAF_Performer
			:location "113:3-113:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defines"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_COI
			:type DoDAF_Vocabulary
			:location "114:3-114:34"
			:isContainer false
		)]
	) ) ( def DoDAF_Vocabulary ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "comprises"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Vocabulary
			:type DoDAF_DataReference
			:location "120:3-120:52"
			:isContainer true
		)]
	) ) ( def DoDAF_DataReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "defineBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_DataReference
			:type DoDAF_Data
			:location "126:3-126:29"
			:isContainer false
		)]
	) ) ( def DoDAF_Performer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "decomposes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Performer
			:type DoDAF_Performer
			:location "132:3-132:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fulfills"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Performer
			:type DoDAF_OperationalRole
			:location "133:3-133:43"
			:isContainer false
		)]
	) ) ( def DoDAF_OperationalRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "decomposes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalRole
			:type DoDAF_OperationalRole
			:location "139:3-139:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "accomplishes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalRole
			:type DoDAF_OperationalActivity
			:location "140:3-140:51"
			:isContainer false
		)]
	) ) ( def DoDAF_OperationalActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "decomposes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalActivity
			:type DoDAF_OperationalRole
			:location "146:3-146:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "supports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalActivity
			:type DoDAF_SystemFunction
			:location "147:3-147:42"
			:isContainer false
		)]
	) ) ( def DoDAF_Product ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_Material ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Product]
		:structuralFeatures[]
	) ) ( def DoDAF_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Product]
		:structuralFeatures[]
	) ) ( def DoDAF_SystemProductFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemProductFlow
			:type DoDAF_Product
			:location "165:3-165:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "originatesFrom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemProductFlow
			:type DoDAF_SystemFunction
			:location "166:3-166:69"
			:isContainer false
			:opposite terminatesAt
		)]
	) ) ( def DoDAF_ConstraintOrRequirement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_Constraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ConstraintOrRequirement]
		:structuralFeatures[]
	) ) ( def DoDAF_QualityRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ConstraintOrRequirement]
		:structuralFeatures[]
	) ) ( def DoDAF_DIA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nmjic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_DIA
			:type DoDAF_NMJIC
			:location "187:3-187:42"
			:isContainer false
			:opposite dia
		) ( struct-map
			KM3_Reference
			:name "higherEchelon"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_DIA
			:type DoDAF_HigherEchelon
			:location "188:3-188:58"
			:isContainer false
			:opposite dia
		)]
	) ) ( def DoDAF_NMJIC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dia"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_NMJIC
			:type DoDAF_DIA
			:location "194:3-194:40"
			:isContainer false
			:opposite nmjic
		)]
	) ) ( def DoDAF_HigherEchelon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dia"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_HigherEchelon
			:type DoDAF_DIA
			:location "200:3-200:48"
			:isContainer false
			:opposite higherEchelon
		) ( struct-map
			KM3_Reference
			:name "jfc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_HigherEchelon
			:type DoDAF_JFC
			:location "201:3-201:48"
			:isContainer false
			:opposite higherEchelon
		)]
	) ) ( def DoDAF_JFC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "higherEchelon"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_JFC
			:type DoDAF_HigherEchelon
			:location "207:3-207:58"
			:isContainer false
			:opposite jfc
		) ( struct-map
			KM3_Reference
			:name "f2c2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_JFC
			:type DoDAF_F2C2
			:location "208:3-208:40"
			:isContainer false
			:opposite jfc
		) ( struct-map
			KM3_Reference
			:name "componentComand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_JFC
			:type DoDAF_ComponentCommand
			:location "209:3-209:63"
			:isContainer false
			:opposite jfc
		)]
	) ) ( def DoDAF_F2C2 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "jfc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_F2C2
			:type DoDAF_JFC
			:location "215:3-215:39"
			:isContainer false
			:opposite f2c2
		)]
	) ) ( def DoDAF_ComponentCommand ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "jfc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_ComponentCommand
			:type DoDAF_JFC
			:location "221:3-221:50"
			:isContainer false
			:opposite componentComand
		)]
	) ) ( def DoDAF_DJFLCC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ComponentCommand]
		:structuralFeatures[]
	) ) ( def DoDAF_JFACC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ComponentCommand]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subordinateAirCommand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_JFACC
			:type DoDAF_SubordinateAirCommand
			:location "231:3-231:76"
			:isContainer false
			:opposite jfacc
		) ( struct-map
			KM3_Reference
			:name "aoccid"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_JFACC
			:type DoDAF_AOCCID
			:location "232:3-232:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "aoccpsc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_JFACC
			:type DoDAF_AOCCombatPlanStrategyCells
			:location "233:3-233:63"
			:isContainer true
		)]
	) ) ( def DoDAF_JFMCC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ComponentCommand]
		:structuralFeatures[]
	) ) ( def DoDAF_JFSOCC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ComponentCommand]
		:structuralFeatures[]
	) ) ( def DoDAF_SubordinateAirCommand ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "jfacc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SubordinateAirCommand
			:type DoDAF_JFACC
			:location "247:3-247:60"
			:isContainer false
			:opposite subordinateAirCommand
		)]
	) ) ( def DoDAF_MAW ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_SubordinateAirCommand]
		:structuralFeatures[]
	) ) ( def DoDAF_WOC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_SubordinateAirCommand]
		:structuralFeatures[]
	) ) ( def DoDAF_AOCCID ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_AOCCombatPlanStrategyCells ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_ResultData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourceID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_ResultData
			:type String
			:location "271:3-271:31"
		) ( struct-map
			KM3_Attribute
			:name "timeStamp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_ResultData
			:type String
			:location "272:3-272:32"
		) ( struct-map
			KM3_Reference
			:name "cr"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_ResultData
			:type DoDAF_CollectionRequirement
			:location "273:3-273:57"
			:isContainer false
			:opposite rd
		) ( struct-map
			KM3_Reference
			:name "bdaReport"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_ResultData
			:type DoDAF_BDAReport
			:location "274:3-274:52"
			:isContainer false
			:opposite rd
		)]
	) ) ( def DoDAF_CombatReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ResultData]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "friendlyUnitsInvolved"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CombatReport
			:type String
			:location "280:3-280:44"
		) ( struct-map
			KM3_Attribute
			:name "combatLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CombatReport
			:type String
			:location "281:3-281:37"
		) ( struct-map
			KM3_Attribute
			:name "resultsAssessment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CombatReport
			:type String
			:location "282:3-282:40"
		) ( struct-map
			KM3_Attribute
			:name "duration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CombatReport
			:type String
			:location "283:3-283:31"
		)]
	) ) ( def DoDAF_WSV ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ResultData]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "missionID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_WSV
			:type String
			:location "289:3-289:32"
		) ( struct-map
			KM3_Attribute
			:name "weaponfSystemID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_WSV
			:type String
			:location "290:3-290:38"
		) ( struct-map
			KM3_Attribute
			:name "videoType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_WSV
			:type String
			:location "291:3-291:32"
		)]
	) ) ( def DoDAF_MISREP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ResultData]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "missionID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_MISREP
			:type String
			:location "297:3-297:32"
		) ( struct-map
			KM3_Attribute
			:name "missionObjectives"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_MISREP
			:type String
			:location "298:3-298:40"
		) ( struct-map
			KM3_Attribute
			:name "missionAssesments"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_MISREP
			:type String
			:location "299:3-299:40"
		)]
	) ) ( def DoDAF_Imagery ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_ResultData]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "imageType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Imagery
			:type String
			:location "305:3-305:32"
		) ( struct-map
			KM3_Attribute
			:name "spectralData"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Imagery
			:type String
			:location "306:3-306:35"
		) ( struct-map
			KM3_Attribute
			:name "geospacialLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Imagery
			:type String
			:location "307:3-307:41"
		) ( struct-map
			KM3_Attribute
			:name "imageSize"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Imagery
			:type Integer
			:location "308:3-308:33"
		)]
	) ) ( def DoDAF_CollectionRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourceID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CollectionRequirement
			:type String
			:location "314:3-314:31"
		) ( struct-map
			KM3_Attribute
			:name "collectionTargetID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CollectionRequirement
			:type String
			:location "315:3-315:41"
		) ( struct-map
			KM3_Attribute
			:name "toBeDoneByTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CollectionRequirement
			:type String
			:location "316:3-316:37"
		) ( struct-map
			KM3_Attribute
			:name "specialNeeds"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_CollectionRequirement
			:type String
			:location "317:3-317:35"
		) ( struct-map
			KM3_Reference
			:name "rd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_CollectionRequirement
			:type DoDAF_ResultData
			:location "318:3-318:46"
			:isContainer false
			:opposite cr
		) ( struct-map
			KM3_Reference
			:name "ato"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_CollectionRequirement
			:type DoDAF_ATO
			:location "319:3-319:40"
			:isContainer false
			:opposite cr
		) ( struct-map
			KM3_Reference
			:name "isContainedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_CollectionRequirement
			:type DoDAF_Target
			:location "320:3-320:53"
			:isContainer false
			:opposite cr
		)]
	) ) ( def DoDAF_BDAReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "targetID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_BDAReport
			:type String
			:location "326:3-326:31"
		) ( struct-map
			KM3_Attribute
			:name "reportSourceID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_BDAReport
			:type String
			:location "327:3-327:37"
		) ( struct-map
			KM3_Attribute
			:name "assesmentSumart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_BDAReport
			:type String
			:location "328:3-328:38"
		) ( struct-map
			KM3_Attribute
			:name "validityDuration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_BDAReport
			:type String
			:location "329:3-329:39"
		) ( struct-map
			KM3_Reference
			:name "rd"
			:upper -1
			:lower 1
			:isOrdered false
			:owner DoDAF_BDAReport
			:type DoDAF_ResultData
			:location "330:3-330:55"
			:isContainer false
			:opposite bdaReport
		) ( struct-map
			KM3_Reference
			:name "mea"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_BDAReport
			:type DoDAF_MunitionsEffectsAssesment
			:location "331:3-331:71"
			:isContainer false
			:opposite bdaReport
		)]
	) ) ( def DoDAF_MunitionsEffectsAssesment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bdaReport"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_MunitionsEffectsAssesment
			:type DoDAF_BDAReport
			:location "337:3-337:55"
			:isContainer false
			:opposite mea
		) ( struct-map
			KM3_Reference
			:name "ato"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_MunitionsEffectsAssesment
			:type DoDAF_ATO
			:location "338:3-338:38"
			:isContainer false
			:opposite mea
		) ( struct-map
			KM3_Reference
			:name "tn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_MunitionsEffectsAssesment
			:type DoDAF_TargetNomination
			:location "339:3-339:50"
			:isContainer false
			:opposite mea
		)]
	) ) ( def DoDAF_ATO ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "timePeriod"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_ATO
			:type String
			:location "345:3-345:33"
		) ( struct-map
			KM3_Reference
			:name "cr"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_ATO
			:type DoDAF_CollectionRequirement
			:location "346:3-346:58"
			:isContainer false
			:opposite ato
		) ( struct-map
			KM3_Reference
			:name "mea"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_ATO
			:type DoDAF_MunitionsEffectsAssesment
			:location "347:3-347:60"
			:isContainer false
			:opposite ato
		) ( struct-map
			KM3_Reference
			:name "tn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_ATO
			:type DoDAF_TargetNomination
			:location "348:3-348:53"
			:isContainer false
			:opposite ato
		) ( struct-map
			KM3_Reference
			:name "rr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_ATO
			:type DoDAF_RestrikeRecommendation
			:location "349:3-349:61"
			:isContainer false
			:opposite ato
		)]
	) ) ( def DoDAF_RestrikeRecommendation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ato"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_RestrikeRecommendation
			:type DoDAF_ATO
			:location "355:3-355:42"
			:isContainer false
			:opposite rr
		) ( struct-map
			KM3_Reference
			:name "tn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_RestrikeRecommendation
			:type DoDAF_TargetNomination
			:location "356:3-356:49"
			:isContainer false
			:opposite rr
		)]
	) ) ( def DoDAF_TargetNomination ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ato"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_TargetNomination
			:type DoDAF_ATO
			:location "362:3-362:40"
			:isContainer false
			:opposite tn
		) ( struct-map
			KM3_Reference
			:name "mea"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_TargetNomination
			:type DoDAF_MunitionsEffectsAssesment
			:location "363:3-363:62"
			:isContainer false
			:opposite tn
		) ( struct-map
			KM3_Reference
			:name "rr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_TargetNomination
			:type DoDAF_RestrikeRecommendation
			:location "364:3-364:60"
			:isContainer false
			:opposite tn
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_TargetNomination
			:type DoDAF_Target
			:location "365:3-365:43"
			:isContainer false
			:opposite tn
		)]
	) ) ( def DoDAF_TargetMaterialsAnalysis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "targetID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_TargetMaterialsAnalysis
			:type String
			:location "371:3-371:31"
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_TargetMaterialsAnalysis
			:type DoDAF_Target
			:location "372:3-372:50"
			:isContainer false
			:opposite describes
		)]
	) ) ( def DoDAF_Target ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cr"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Target
			:type DoDAF_CollectionRequirement
			:location "378:3-378:68"
			:isContainer false
			:opposite isContainedIn
		) ( struct-map
			KM3_Reference
			:name "tn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_Target
			:type DoDAF_TargetNomination
			:location "379:3-379:58"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "holds"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_Target
			:type DoDAF_MIDB
			:location "380:3-380:49"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "describes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Target
			:type DoDAF_TargetMaterialsAnalysis
			:location "381:3-381:72"
			:isContainer false
			:opposite target
		)]
	) ) ( def DoDAF_MIDB ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_MIDB
			:type DoDAF_Target
			:location "387:3-387:49"
			:isContainer false
			:opposite holds
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "397:2-397:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "398:2-398:19"
	) )]
) )
