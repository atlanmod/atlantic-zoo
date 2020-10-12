( declare SCADE_ListString )
( declare SCADE_ListInteger )
( declare SCADE_Model )
( declare SCADE_Implementation )
( declare SCADE_ConstBlock )
( declare SCADE_VarBlock )
( declare SCADE_GlobalVariable )
( declare SCADE_TypeBlock )
( declare SCADE_Session )
( declare SCADE_Descriptor )
( declare SCADE_StorageUnit )
( declare SCADE_StorageElement )
( declare SCADE_Object )
( declare SCADE_Block )
( declare SCADE_NodeBlock )
( declare SCADE_ModelBlock )
( declare SCADE_Expression )
( declare SCADE_Label )
( declare SCADE_ExprNull )
( declare SCADE_ConstValue )
( declare SCADE_ExprContact )
( declare SCADE_ExprCall )
( declare SCADE_Operator )
( declare SCADE_ExprId )
( declare SCADE_LocalVariable )
( declare SCADE_Node )
( declare SCADE_ParamBlock )
( declare SCADE_ParamArray )
( declare SCADE_ConstVar )
( declare SCADE_Constant )
( declare SCADE_Variable )
( declare SCADE_Type )
( declare SCADE_Table )
( declare SCADE_NamedType )
( declare SCADE_Enumeration )
( declare SCADE_Composite )
( declare SCADE_CompositeElement )
( declare SCADE_Structure )
( declare SCADE_Tuple )
( declare SCADE_EqBlock )
( declare SCADE_Equation )
( declare SCADE_Assertion )
( declare SCADE_Annotable )
( declare SCADE_Prop )
( declare SCADE_Configuration )
( declare SCADE_Project )
( declare SCADE_Element )
( declare SCADE_FileRef )
( declare SCADE_Folder )
( declare SCADE_Reference )
( declare SCADE_TypeReference )
( declare SCADE_OperatorReference )
( declare SCADE_VariableReference )
( declare SCADE_Error )
( declare SCADE_Edge )
( declare SCADE_RPoint )
( declare SCADE_RSize )
( declare SCADE_Entity )
( declare SCADE_StateObj )
( declare SCADE_GraphicalObject )
( declare SCADE_StInputOutput )
( declare SCADE_StInitInput )
( declare SCADE_StInput )
( declare SCADE_StOutput )
( declare SCADE_Transition )
( declare SCADE_State )
( declare SCADE_InitialStPtr )
( declare SCADE_StateMachine )
( declare SCADE_Base )
( declare SCADE_StateBase )
( declare SCADE_AnnNote )
( declare SCADE_AnnAttValue )
( declare SCADE_AnnNoteType )
( declare SCADE_AnnAttDefinition )
( declare SCADE_AnnAttIntValue )
( declare SCADE_AnnAttBoolValue )
( declare SCADE_AnnAttCharValue )
( declare SCADE_AnnAttRealValue )
( declare SCADE_AnnAttStringValue )
( declare SCADE_AnnAttFileValue )
( declare SCADE_AnnAttDateValue )
( declare SCADE_AnnAttOidValue )
( declare SCADE_AnnAttEnumValue )
( declare SCADE_AnnProperty )
( declare SCADE_AnnPropertyInt )
( declare SCADE_AnnPropertyBool )
( declare SCADE_AnnPropertyChar )
( declare SCADE_AnnPropertyReal )
( declare SCADE_AnnPropertyString )
( declare SCADE_AnnPropertyEnum )
( declare SCADE_AnnotSchema )
( declare SCADE_AnnCategory )
( declare SCADE_Annotability )
( declare SCADE_AnnAttGroup )
( declare SCADE_File )
( declare SCADE_MtcApplication )
( declare SCADE_CoverageFile )
( declare SCADE_CriterionFile )
( declare SCADE_MtcEntity )
( declare SCADE_HistoryEntry )
( declare SCADE_Criterion )
( declare SCADE_Instance )
( declare SCADE_AssociationClass )
( declare SCADE_Result )
( declare SCADE_Record )
( declare SCADE_Loader )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Char )
( declare PrimitiveTypes_Double )
( def SCADE ( struct-map
	KM3_Package
	:contents[( def SCADE_ListString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ListString
			:type String
			:location "16:3-16:29"
		)]
	) ) ( def SCADE_ListInteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ListInteger
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def SCADE_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object SCADE_MtcEntity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "library"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type Boolean
			:location "27:3-27:33"
		) ( struct-map
			KM3_Attribute
			:name "pathname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type String
			:location "28:3-28:33"
		) ( struct-map
			KM3_Reference
			:name "descriptor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Descriptor
			:location "29:3-29:64"
			:isContainer false
			:opposite modelD
		) ( struct-map
			KM3_Reference
			:name "project"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Project
			:location "30:3-30:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "fileRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_FileRef
			:location "31:3-31:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "storageUnitM"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_StorageUnit
			:location "32:3-32:72"
			:isContainer true
			:opposite modelS
		) ( struct-map
			KM3_Reference
			:name "enumsBlock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_ConstBlock
			:location "33:2-33:67"
			:isContainer true
			:opposite modelC
		) ( struct-map
			KM3_Reference
			:name "importedOperator"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Operator
			:location "34:2-34:66"
			:isContainer false
			:opposite modelO
		) ( struct-map
			KM3_Reference
			:name "client"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Model
			:location "35:5-35:68"
			:isContainer false
			:opposite libraries
		) ( struct-map
			KM3_Reference
			:name "libraries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Model
			:location "36:5-36:66"
			:isContainer false
			:opposite client
		) ( struct-map
			KM3_Reference
			:name "allLibry"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Model
			:location "37:5-37:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "typeM"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Type
			:location "38:3-38:61"
			:isContainer true
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Model
			:location "39:4-39:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "coverageFileM"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_CoverageFile
			:location "40:3-40:69"
			:isContainer false
			:opposite modelCov
		) ( struct-map
			KM3_Reference
			:name "criterionFileM"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_CriterionFile
			:location "41:3-41:69"
			:isContainer false
			:opposite modelCri
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Instance
			:location "42:3-42:67"
			:isContainer true
			:opposite modelI
		) ( struct-map
			KM3_Reference
			:name "all"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Operator
			:location "43:3-43:68"
			:isContainer true
			:opposite modelOp
		) ( struct-map
			KM3_Reference
			:name "application"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_MtcApplication
			:location "44:3-44:69"
			:isContainer false
			:opposite modelM
		) ( struct-map
			KM3_Reference
			:name "reference"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Reference
			:location "45:3-45:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tmpNode"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Node
			:location "46:3-46:66"
			:isContainer true
			:opposite modelN
		) ( struct-map
			KM3_Reference
			:name "constBlockK"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_ConstBlock
			:location "47:3-47:72"
			:isContainer true
			:opposite keyC
		) ( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Node
			:location "48:2-48:61"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "varBlockK"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_VarBlock
			:location "49:2-49:69"
			:isContainer true
			:opposite keyVB
		) ( struct-map
			KM3_Reference
			:name "typeBlock"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_TypeBlock
			:location "50:2-50:68"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "refinement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_NamedType
			:location "51:2-51:71"
			:isContainer true
			:opposite keyM
		) ( struct-map
			KM3_Reference
			:name "implementation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Implementation
			:location "52:2-52:77"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Constant
			:location "53:3-53:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "allConstant"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_Constant
			:location "54:3-54:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "allvariable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_GlobalVariable
			:location "55:3-55:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_GlobalVariable
			:location "56:3-56:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "allConstVar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_ConstVar
			:location "57:3-57:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "constVar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_ConstVar
			:location "58:3-58:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "constBlock"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_ConstBlock
			:location "59:3-59:72"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "varBlock"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_VarBlock
			:location "60:3-60:69"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "allNamedType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_NamedType
			:location "61:3-61:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "namedType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Model
			:type SCADE_NamedType
			:location "62:3-62:54"
			:isContainer true
		)]
	) ) ( def SCADE_Implementation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Implementation
			:type SCADE_Model
			:location "69:2-69:54"
			:isContainer false
			:opposite implementation
		) ( struct-map
			KM3_Reference
			:name "namedTypeI"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SCADE_Implementation
			:type SCADE_NamedType
			:location "70:3-70:68"
			:isContainer false
			:opposite implementation
		)]
	) ) ( def SCADE_ConstBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_ModelBlock]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "modelC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ConstBlock
			:type SCADE_Model
			:location "75:5-75:58"
			:isContainer false
			:opposite enumsBlock
		) ( struct-map
			KM3_Reference
			:name "keyC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ConstBlock
			:type SCADE_Model
			:location "76:2-76:51"
			:isContainer false
			:opposite constBlockK
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ConstBlock
			:type SCADE_Model
			:location "77:3-77:52"
			:isContainer false
			:opposite constBlock
		) ( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_ConstBlock
			:type SCADE_Constant
			:location "78:2-78:63"
			:isContainer true
			:opposite key
		)]
	) ) ( def SCADE_VarBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_ModelBlock]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_VarBlock
			:type SCADE_GlobalVariable
			:location "84:3-84:71"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "keyVB"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_VarBlock
			:type SCADE_Model
			:location "85:3-85:60"
			:isContainer false
			:opposite varBlockK
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_VarBlock
			:type SCADE_Model
			:location "86:3-86:55"
			:isContainer false
			:opposite varBlock
		)]
	) ) ( def SCADE_GlobalVariable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Variable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_GlobalVariable
			:type SCADE_VarBlock
			:location "91:3-91:53"
			:isContainer false
			:opposite variable
		)]
	) ) ( def SCADE_TypeBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_ModelBlock]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_TypeBlock
			:type SCADE_NamedType
			:location "96:3-96:61"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_TypeBlock
			:type SCADE_Model
			:location "97:3-97:54"
			:isContainer false
			:opposite typeBlock
		)]
	) ) ( def SCADE_Session ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "DefinedIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Session
			:type String
			:location "105:3-105:33"
		) ( struct-map
			KM3_Reference
			:name "descriptor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Session
			:type SCADE_Descriptor
			:location "102:3-102:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Session
			:type SCADE_Model
			:location "103:3-103:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "loadsModel"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Session
			:type SCADE_Model
			:location "104:3-104:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "loader"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Session
			:type SCADE_Loader
			:location "106:3-106:59"
			:isContainer true
			:opposite session
		)]
	) ) ( def SCADE_Descriptor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modelFileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type String
			:location "111:3-111:39"
		) ( struct-map
			KM3_Attribute
			:name "sernFileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type String
			:location "112:2-112:38"
		) ( struct-map
			KM3_Attribute
			:name "sernPersistAs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type String
			:location "113:2-113:37"
		) ( struct-map
			KM3_Attribute
			:name "rnetFileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type String
			:location "114:2-114:38"
		) ( struct-map
			KM3_Attribute
			:name "rnetPersistAs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type String
			:location "115:2-115:37"
		) ( struct-map
			KM3_Attribute
			:name "occBase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type Integer
			:location "116:2-116:38"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type Integer
			:location "117:2-117:38"
		) ( struct-map
			KM3_Attribute
			:name "nameVerify"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type Boolean
			:location "118:2-118:38"
		) ( struct-map
			KM3_Attribute
			:name "checked"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type Boolean
			:location "119:2-119:38"
		) ( struct-map
			KM3_Reference
			:name "libraryModels"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Descriptor
			:type SCADE_ListString
			:location "121:2-121:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "annTypeFiles"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Descriptor
			:type SCADE_ListString
			:location "122:2-122:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "modelD"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Descriptor
			:type SCADE_Model
			:location "123:2-123:61"
			:isContainer false
			:opposite descriptor
		)]
	) ) ( def SCADE_StorageUnit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "saoFileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type String
			:location "128:3-128:38"
		) ( struct-map
			KM3_Attribute
			:name "annFileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type String
			:location "129:2-129:37"
		) ( struct-map
			KM3_Attribute
			:name "persistAs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type String
			:location "130:2-130:37"
		) ( struct-map
			KM3_Attribute
			:name "loaded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type Boolean
			:location "131:2-131:38"
		) ( struct-map
			KM3_Attribute
			:name "saoModified"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type Boolean
			:location "132:2-132:38"
		) ( struct-map
			KM3_Attribute
			:name "annModified"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type Boolean
			:location "133:2-133:38"
		) ( struct-map
			KM3_Reference
			:name "fileRef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type SCADE_FileRef
			:location "134:2-134:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "modelS"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageUnit
			:type SCADE_Model
			:location "135:2-135:62"
			:isContainer false
			:opposite storageUnitM
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_StorageUnit
			:type SCADE_StorageElement
			:location "136:2-136:67"
			:isContainer false
			:opposite storageUnitE
		)]
	) ) ( def SCADE_StorageElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_Annotable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "storageUnitE"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StorageElement
			:type SCADE_StorageUnit
			:location "140:3-140:59"
			:isContainer false
			:opposite element
		)]
	) ) ( def SCADE_Object ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Object
			:type String
			:location "145:2-145:30"
		) ( struct-map
			KM3_Attribute
			:name "runLine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Object
			:type Integer
			:location "146:2-146:31"
		)]
	) ) ( def SCADE_Block ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_StorageElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "zoomCoeff"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Block
			:type Integer
			:location "151:3-151:34"
		) ( struct-map
			KM3_Attribute
			:name "fromat"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Block
			:type String
			:location "152:3-152:31"
		) ( struct-map
			KM3_Attribute
			:name "lanscape"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Block
			:type Boolean
			:location "153:3-153:33"
		) ( struct-map
			KM3_Attribute
			:name "defaultPageFormat"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Block
			:type Boolean
			:location "155:3-155:41"
		)]
	) ) ( def SCADE_NodeBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Block]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_NodeBlock
			:type SCADE_Node
			:location "160:3-160:30"
			:isContainer false
		)]
	) ) ( def SCADE_ModelBlock ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_Block]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "columnsSize"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_ModelBlock
			:type SCADE_ListInteger
			:location "166:2-166:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ModelBlock
			:type SCADE_Model
			:location "167:2-167:76"
			:isContainer false
		)]
	) ) ( def SCADE_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_Label
			:location "172:3-172:69"
			:isContainer true
			:opposite expression
		) ( struct-map
			KM3_Reference
			:name "exprContactE"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_ExprContact
			:location "173:3-173:67"
			:isContainer false
			:opposite initValue
		) ( struct-map
			KM3_Reference
			:name "exprCallE"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_ExprCall
			:location "174:3-174:67"
			:isContainer false
			:opposite parameter
		) ( struct-map
			KM3_Reference
			:name "dependance"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_ConstVar
			:location "175:2-175:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "subExprId"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_ExprId
			:location "176:2-176:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "paramArray"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_ParamArray
			:location "177:3-177:64"
			:isContainer false
			:opposite value
		) ( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_Constant
			:location "178:3-178:61"
			:isContainer false
			:opposite value
		) ( struct-map
			KM3_Reference
			:name "equationE"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_Equation
			:location "179:3-179:61"
			:isContainer false
			:opposite right
		) ( struct-map
			KM3_Reference
			:name "assertionE"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Expression
			:type SCADE_Assertion
			:location "180:3-180:68"
			:isContainer false
			:opposite expression
		)]
	) ) ( def SCADE_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Label
			:type SCADE_Expression
			:location "186:3-186:61"
			:isContainer false
			:opposite label
		)]
	) ) ( def SCADE_ExprNull ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Expression]
		:structuralFeatures[]
	) ) ( def SCADE_ConstValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ConstValue
			:type String
			:location "194:3-194:28"
		) ( struct-map
			KM3_Reference
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ConstValue
			:type SCADE_Object
			:location "195:3-195:27"
			:isContainer false
		)]
	) ) ( def SCADE_ExprContact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "boolAct"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ExprContact
			:type SCADE_ExprId
			:location "200:3-200:71"
			:isContainer true
			:opposite exprContactEI
		) ( struct-map
			KM3_Reference
			:name "initValue"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_ExprContact
			:type SCADE_Expression
			:location "201:3-201:83"
			:isContainer true
			:opposite exprContactE
		) ( struct-map
			KM3_Reference
			:name "calledOpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ExprContact
			:type SCADE_ExprCall
			:location "202:3-202:73"
			:isContainer true
			:opposite exprContactEC
		)]
	) ) ( def SCADE_ExprCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "numOcc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ExprCall
			:type Integer
			:location "207:3-207:33"
		) ( struct-map
			KM3_Attribute
			:name "predefOpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ExprCall
			:type Integer
			:location "208:3-208:35"
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_ExprCall
			:type SCADE_Expression
			:location "209:3-209:80"
			:isContainer true
			:opposite exprCallE
		) ( struct-map
			KM3_Reference
			:name "exprContactEC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ExprCall
			:type SCADE_ExprContact
			:location "210:3-210:68"
			:isContainer false
			:opposite calledOpr
		) ( struct-map
			KM3_Reference
			:name "operator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_ExprCall
			:type SCADE_Operator
			:location "211:3-211:43"
			:isContainer false
		)]
	) ) ( def SCADE_Operator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_StorageElement SCADE_MtcEntity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Operator
			:type String
			:location "217:2-217:32"
		) ( struct-map
			KM3_Attribute
			:name "conversion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Operator
			:type Boolean
			:location "218:2-218:35"
		) ( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Operator
			:type Boolean
			:location "219:2-219:36"
		) ( struct-map
			KM3_Attribute
			:name "index"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Operator
			:type Integer
			:location "220:3-220:33"
		) ( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Operator
			:type SCADE_LocalVariable
			:location "222:3-222:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "input"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Operator
			:type SCADE_LocalVariable
			:location "223:2-223:81"
			:isContainer true
			:opposite operatorI
		) ( struct-map
			KM3_Reference
			:name "output"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Operator
			:type SCADE_LocalVariable
			:location "224:2-224:80"
			:isContainer true
			:opposite operatorO
		) ( struct-map
			KM3_Reference
			:name "hidden"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Operator
			:type SCADE_LocalVariable
			:location "225:2-225:80"
			:isContainer true
			:opposite operatorH
		) ( struct-map
			KM3_Reference
			:name "client"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Operator
			:type SCADE_EqBlock
			:location "226:4-226:67"
			:isContainer false
			:opposite calledOperator
		) ( struct-map
			KM3_Reference
			:name "modelO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Operator
			:type SCADE_Model
			:location "227:2-227:67"
			:isContainer false
			:opposite importedOperator
		) ( struct-map
			KM3_Reference
			:name "modelOp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Operator
			:type SCADE_Model
			:location "228:3-228:57"
			:isContainer false
			:opposite all
		) ( struct-map
			KM3_Reference
			:name "criterionO"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Operator
			:type SCADE_Criterion
			:location "229:3-229:68"
			:isContainer false
			:opposite operatorC
		) ( struct-map
			KM3_Reference
			:name "intanceO"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Operator
			:type SCADE_Instance
			:location "230:3-230:68"
			:isContainer false
			:opposite operatorI
		) ( struct-map
			KM3_Reference
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Operator
			:type SCADE_Operator
			:location "231:3-231:44"
			:isContainer false
		)]
	) ) ( def SCADE_ExprId ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exprContactEI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ExprId
			:type SCADE_ExprContact
			:location "236:3-236:60"
			:isContainer false
			:opposite boolAct
		) ( struct-map
			KM3_Reference
			:name "reference"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ExprId
			:type SCADE_ConstVar
			:location "237:3-237:36"
			:isContainer false
		)]
	) ) ( def SCADE_LocalVariable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Variable]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "optional"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_LocalVariable
			:type Boolean
			:location "242:3-242:35"
		) ( struct-map
			KM3_Attribute
			:name "const"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_LocalVariable
			:type Boolean
			:location "243:3-243:35"
		) ( struct-map
			KM3_Attribute
			:name "probe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_LocalVariable
			:type Boolean
			:location "244:3-244:35"
		) ( struct-map
			KM3_Attribute
			:name "pure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_LocalVariable
			:type Boolean
			:location "245:3-245:35"
		) ( struct-map
			KM3_Attribute
			:name "initValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_LocalVariable
			:type String
			:location "246:3-246:34"
		) ( struct-map
			KM3_Reference
			:name "operatorI"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_LocalVariable
			:type SCADE_Operator
			:location "247:2-247:57"
			:isContainer false
			:opposite input
		) ( struct-map
			KM3_Reference
			:name "operatorO"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_LocalVariable
			:type SCADE_Operator
			:location "248:2-248:58"
			:isContainer false
			:opposite output
		) ( struct-map
			KM3_Reference
			:name "operatorH"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_LocalVariable
			:type SCADE_Operator
			:location "249:2-249:58"
			:isContainer false
			:opposite hidden
		) ( struct-map
			KM3_Reference
			:name "nodeL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_LocalVariable
			:type SCADE_Node
			:location "250:2-250:54"
			:isContainer false
			:opposite local
		) ( struct-map
			KM3_Reference
			:name "nodeI"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_LocalVariable
			:type SCADE_Node
			:location "251:2-251:57"
			:isContainer false
			:opposite internal
		)]
	) ) ( def SCADE_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Operator]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodeKind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_Object
			:location "256:2-256:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "eqBlock"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_EqBlock
			:location "257:3-257:67"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "paramBlock"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_ParamBlock
			:location "258:3-258:70"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "local"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_LocalVariable
			:location "259:2-259:69"
			:isContainer true
			:opposite nodeL
		) ( struct-map
			KM3_Reference
			:name "internal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_LocalVariable
			:location "260:2-260:69"
			:isContainer true
			:opposite nodeI
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_Model
			:location "261:2-261:49"
			:isContainer false
			:opposite node
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_StateMachine
			:location "262:3-262:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "modelN"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Node
			:type SCADE_Model
			:location "263:2-263:54"
			:isContainer false
			:opposite tmpNode
		)]
	) ) ( def SCADE_ParamBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_NodeBlock]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ParamBlock
			:type SCADE_Node
			:location "268:4-268:47"
			:isContainer false
			:opposite paramBlock
		) ( struct-map
			KM3_Reference
			:name "columnsSize"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_ParamBlock
			:type SCADE_ListInteger
			:location "270:2-270:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "array"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SCADE_ParamBlock
			:type SCADE_ParamArray
			:location "271:2-271:78"
			:isContainer true
			:opposite paramBlock
		)]
	) ) ( def SCADE_ParamArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Annotable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "notes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_ParamArray
			:type SCADE_ListString
			:location "277:3-277:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "paramBlock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ParamArray
			:type SCADE_ParamBlock
			:location "278:3-278:55"
			:isContainer false
			:opposite array
		) ( struct-map
			KM3_Reference
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ParamArray
			:type SCADE_Operator
			:location "279:3-279:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_ParamArray
			:type SCADE_Expression
			:location "280:3-280:75"
			:isContainer true
			:opposite paramArray
		)]
	) ) ( def SCADE_ConstVar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Annotable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ConstVar
			:type SCADE_Object
			:location "286:2-286:26"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_ConstVar
			:type SCADE_Type
			:location "287:3-287:53"
			:isContainer false
			:opposite constVar
		) ( struct-map
			KM3_Reference
			:name "client"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_ConstVar
			:type SCADE_EqBlock
			:location "288:3-288:58"
			:isContainer false
			:opposite referencedId
		)]
	) ) ( def SCADE_Constant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_ConstVar]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "imported"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Constant
			:type Boolean
			:location "293:3-293:32"
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Constant
			:type SCADE_Expression
			:location "294:3-294:70"
			:isContainer true
			:opposite constant
		) ( struct-map
			KM3_Reference
			:name "enumeration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Constant
			:type SCADE_Enumeration
			:location "295:3-295:66"
			:isContainer false
			:opposite value
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Constant
			:type SCADE_ConstBlock
			:location "296:2-296:60"
			:isContainer false
			:opposite constant
		)]
	) ) ( def SCADE_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_ConstVar]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "clock"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Variable
			:type SCADE_Variable
			:location "301:3-301:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "definition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Variable
			:type SCADE_Equation
			:location "302:2-302:53"
			:isContainer false
			:opposite left
		)]
	) ) ( def SCADE_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_Annotable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "usedType"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Type
			:type SCADE_Type
			:location "307:2-307:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Type
			:type SCADE_Model
			:location "308:3-308:51"
			:isContainer false
			:opposite typeM
		) ( struct-map
			KM3_Reference
			:name "namedTypeT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Type
			:type SCADE_NamedType
			:location "309:3-309:65"
			:isContainer false
			:opposite definition
		) ( struct-map
			KM3_Reference
			:name "tableT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Type
			:type SCADE_Table
			:location "310:3-310:54"
			:isContainer false
			:opposite typeT
		) ( struct-map
			KM3_Reference
			:name "compositeElementT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Type
			:type SCADE_CompositeElement
			:location "311:3-311:71"
			:isContainer false
			:opposite typeC
		) ( struct-map
			KM3_Reference
			:name "constVar"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Type
			:type SCADE_ConstVar
			:location "312:3-312:58"
			:isContainer false
			:opposite type
		)]
	) ) ( def SCADE_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Type]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Table
			:type Integer
			:location "316:3-316:28"
		) ( struct-map
			KM3_Reference
			:name "typeT"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Table
			:type SCADE_Type
			:location "317:3-317:49"
			:isContainer false
			:opposite tableT
		)]
	) ) ( def SCADE_NamedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_Object
			:location "323:3-323:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "refinement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_NamedType
			:location "324:3-324:62"
			:isContainer false
			:opposite refined
		) ( struct-map
			KM3_Reference
			:name "refined"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_NamedType
			:location "325:3-325:62"
			:isContainer false
			:opposite refinement
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_Operator
			:location "326:3-326:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_Operator
			:location "327:3-327:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "implementation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_Implementation
			:location "328:3-328:74"
			:isContainer false
			:opposite namedTypeI
		) ( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_Type
			:location "329:3-329:64"
			:isContainer false
			:opposite namedTypeT
		) ( struct-map
			KM3_Reference
			:name "keyM"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_Model
			:location "330:3-330:57"
			:isContainer false
			:opposite refinement
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_NamedType
			:type SCADE_TypeBlock
			:location "331:3-331:53"
			:isContainer false
			:opposite type
		)]
	) ) ( def SCADE_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SCADE_Enumeration
			:type SCADE_Constant
			:location "336:2-336:77"
			:isContainer true
			:opposite enumeration
		)]
	) ) ( def SCADE_Composite ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Composite
			:type SCADE_CompositeElement
			:location "341:3-341:71"
			:isContainer true
			:opposite key
		)]
	) ) ( def SCADE_CompositeElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "typeC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_CompositeElement
			:type SCADE_Type
			:location "347:3-347:60"
			:isContainer false
			:opposite compositeElementT
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_CompositeElement
			:type SCADE_Composite
			:location "348:3-348:48"
			:isContainer false
			:opposite element
		)]
	) ) ( def SCADE_Structure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Composite]
		:structuralFeatures[]
	) ) ( def SCADE_Tuple ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Composite]
		:structuralFeatures[]
	) ) ( def SCADE_EqBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_NodeBlock]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "equation"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SCADE_EqBlock
			:type SCADE_Equation
			:location "359:3-359:69"
			:isContainer true
			:opposite eqBlock
		) ( struct-map
			KM3_Reference
			:name "assertion"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_EqBlock
			:type SCADE_Assertion
			:location "360:3-360:66"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_EqBlock
			:type SCADE_Node
			:location "361:4-361:63"
			:isContainer false
			:opposite eqBlock
		) ( struct-map
			KM3_Reference
			:name "calledOperator"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_EqBlock
			:type SCADE_Operator
			:location "362:4-362:65"
			:isContainer false
			:opposite client
		) ( struct-map
			KM3_Reference
			:name "referencedId"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_EqBlock
			:type SCADE_ConstVar
			:location "363:3-363:63"
			:isContainer false
			:opposite client
		)]
	) ) ( def SCADE_Equation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Annotable]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rotation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Equation
			:type Integer
			:location "368:3-368:35"
		) ( struct-map
			KM3_Attribute
			:name "symetrical"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Equation
			:type Boolean
			:location "369:3-369:36"
		) ( struct-map
			KM3_Attribute
			:name "terminator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Equation
			:type Boolean
			:location "370:3-370:36"
		) ( struct-map
			KM3_Reference
			:name "eqBlock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Equation
			:type SCADE_EqBlock
			:location "371:3-371:58"
			:isContainer false
			:opposite equation
		) ( struct-map
			KM3_Reference
			:name "left"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Equation
			:type SCADE_Variable
			:location "372:3-372:67"
			:isContainer false
			:opposite definition
		) ( struct-map
			KM3_Reference
			:name "right"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Equation
			:type SCADE_Expression
			:location "373:3-373:70"
			:isContainer true
			:opposite equationE
		) ( struct-map
			KM3_Reference
			:name "outEdge"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Equation
			:type SCADE_Edge
			:location "374:4-374:71"
			:isContainer true
			:opposite dstEquation
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Equation
			:type SCADE_RPoint
			:location "375:3-375:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Equation
			:type SCADE_RSize
			:location "376:3-376:44"
			:isContainer true
		)]
	) ) ( def SCADE_Assertion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Annotable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Assertion
			:type SCADE_EqBlock
			:location "382:3-382:61"
			:isContainer false
			:opposite assertion
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Assertion
			:type SCADE_Expression
			:location "383:3-383:76"
			:isContainer true
			:opposite assertionE
		) ( struct-map
			KM3_Reference
			:name "edge"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Assertion
			:type SCADE_Edge
			:location "384:3-384:64"
			:isContainer false
			:opposite assertion
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Assertion
			:type SCADE_RPoint
			:location "385:3-385:48"
			:isContainer true
		)]
	) ) ( def SCADE_Annotable ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "DefinedIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Annotable
			:type String
			:location "391:3-391:33"
		) ( struct-map
			KM3_Reference
			:name "propA"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Annotable
			:type SCADE_Prop
			:location "390:3-390:67"
			:isContainer true
			:opposite entity
		)]
	) ) ( def SCADE_Prop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Prop
			:type String
			:location "396:3-396:28"
		) ( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Prop
			:type SCADE_ListString
			:location "398:3-398:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "entity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Prop
			:type SCADE_Annotable
			:location "399:3-399:52"
			:isContainer false
			:opposite propA
		) ( struct-map
			KM3_Reference
			:name "configurationP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Prop
			:type SCADE_Configuration
			:location "400:3-400:67"
			:isContainer false
			:opposite propC
		)]
	) ) ( def SCADE_Configuration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Configuration
			:type String
			:location "405:3-405:28"
		) ( struct-map
			KM3_Reference
			:name "propC"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Configuration
			:type SCADE_Prop
			:location "406:2-406:74"
			:isContainer true
			:opposite configurationP
		) ( struct-map
			KM3_Reference
			:name "projectC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Configuration
			:type SCADE_Project
			:location "407:2-407:69"
			:isContainer true
			:opposite configuration
		)]
	) ) ( def SCADE_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Annotable]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "pathname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Project
			:type String
			:location "412:3-412:32"
		) ( struct-map
			KM3_Reference
			:name "configuration"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Project
			:type SCADE_Configuration
			:location "413:3-413:84"
			:isContainer true
			:opposite projectC
		) ( struct-map
			KM3_Reference
			:name "fileRef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Project
			:type SCADE_FileRef
			:location "414:3-414:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Project
			:type SCADE_Element
			:location "415:3-415:66"
			:isContainer true
			:opposite root
		)]
	) ) ( def SCADE_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_MtcEntity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Element
			:type String
			:location "421:2-421:31"
		) ( struct-map
			KM3_Attribute
			:name "derived"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Element
			:type Boolean
			:location "422:2-422:34"
		) ( struct-map
			KM3_Attribute
			:name "ident"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Element
			:type String
			:location "423:3-423:37"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Element
			:type String
			:location "424:2-424:36"
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Element
			:type SCADE_Project
			:location "425:2-425:53"
			:isContainer false
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "folder"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Element
			:type SCADE_Folder
			:location "426:2-426:55"
			:isContainer false
			:opposite element
		) ( struct-map
			KM3_Reference
			:name "criterionE"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Element
			:type SCADE_Criterion
			:location "427:3-427:58"
			:isContainer false
			:opposite element
		)]
	) ) ( def SCADE_FileRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "pathname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_FileRef
			:type String
			:location "433:3-433:34"
		) ( struct-map
			KM3_Attribute
			:name "persistAs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_FileRef
			:type String
			:location "434:2-434:33"
		) ( struct-map
			KM3_Attribute
			:name "DefinedIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_FileRef
			:type String
			:location "435:2-435:33"
		)]
	) ) ( def SCADE_Folder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extensions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Folder
			:type String
			:location "440:3-440:34"
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Folder
			:type SCADE_Element
			:location "441:3-441:70"
			:isContainer true
			:opposite folder
		)]
	) ) ( def SCADE_Reference ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SCADE_TypeReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Reference]
		:structuralFeatures[]
	) ) ( def SCADE_OperatorReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Reference]
		:structuralFeatures[]
	) ) ( def SCADE_VariableReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Reference]
		:structuralFeatures[]
	) ) ( def SCADE_Error ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SCADE_Edge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "leftVarIndex"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Edge
			:type Integer
			:location "461:2-461:41"
		) ( struct-map
			KM3_Attribute
			:name "labelOrientation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Edge
			:type Integer
			:location "462:2-462:41"
		) ( struct-map
			KM3_Reference
			:name "leftVar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Edge
			:type SCADE_Variable
			:location "463:2-463:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rightExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Edge
			:type SCADE_ExprId
			:location "464:2-464:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "srcEquation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Edge
			:type SCADE_Equation
			:location "465:2-465:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assertion"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Edge
			:type SCADE_Assertion
			:location "466:2-466:67"
			:isContainer true
			:opposite edge
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Edge
			:type SCADE_RPoint
			:location "467:2-467:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dstEquation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Edge
			:type SCADE_Equation
			:location "468:2-468:58"
			:isContainer false
			:opposite outEdge
		)]
	) ) ( def SCADE_RPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SCADE_RSize ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SCADE_Entity ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "DefinedIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Entity
			:type String
			:location "479:2-479:32"
		)]
	) ) ( def SCADE_StateObj ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_Entity]
		:structuralFeatures[]
	) ) ( def SCADE_GraphicalObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_StateObj]
		:structuralFeatures[]
	) ) ( def SCADE_StInputOutput ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_GraphicalObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StInputOutput
			:type String
			:location "490:3-490:33"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StInputOutput
			:type String
			:location "491:3-491:33"
		) ( struct-map
			KM3_Attribute
			:name "clock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StInputOutput
			:type Boolean
			:location "492:3-492:34"
		) ( struct-map
			KM3_Attribute
			:name "const"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StInputOutput
			:type Boolean
			:location "493:3-493:34"
		) ( struct-map
			KM3_Attribute
			:name "optional"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StInputOutput
			:type Boolean
			:location "494:3-494:34"
		)]
	) ) ( def SCADE_StInitInput ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_StInputOutput]
		:structuralFeatures[]
	) ) ( def SCADE_StInput ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_StInputOutput]
		:structuralFeatures[]
	) ) ( def SCADE_StOutput ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_StInputOutput]
		:structuralFeatures[]
	) ) ( def SCADE_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_GraphicalObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "conditions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Transition
			:type String
			:location "510:3-510:34"
		) ( struct-map
			KM3_Attribute
			:name "transKind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Transition
			:type Integer
			:location "511:3-511:35"
		) ( struct-map
			KM3_Reference
			:name "state1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Transition
			:type SCADE_State
			:location "512:3-512:54"
			:isContainer false
			:opposite transition1
		) ( struct-map
			KM3_Reference
			:name "state2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Transition
			:type SCADE_State
			:location "513:3-513:54"
			:isContainer false
			:opposite transition2
		)]
	) ) ( def SCADE_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_GraphicalObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_State
			:type String
			:location "519:3-519:36"
		) ( struct-map
			KM3_Attribute
			:name "cx"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_State
			:type Double
			:location "520:3-520:39"
		) ( struct-map
			KM3_Attribute
			:name "cy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_State
			:type Double
			:location "521:3-521:39"
		) ( struct-map
			KM3_Reference
			:name "transition1"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_State
			:type SCADE_Transition
			:location "522:3-522:68"
			:isContainer false
			:opposite state1
		) ( struct-map
			KM3_Reference
			:name "transition2"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_State
			:type SCADE_Transition
			:location "523:3-523:68"
			:isContainer false
			:opposite state2
		) ( struct-map
			KM3_Reference
			:name "stOutput"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_State
			:type SCADE_StOutput
			:location "524:3-524:48"
			:isContainer false
		)]
	) ) ( def SCADE_InitialStPtr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_GraphicalObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "cx"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_InitialStPtr
			:type Double
			:location "530:3-530:39"
		) ( struct-map
			KM3_Attribute
			:name "cy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_InitialStPtr
			:type Double
			:location "531:3-531:39"
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_InitialStPtr
			:type SCADE_State
			:location "532:3-532:31"
			:isContainer false
		)]
	) ) ( def SCADE_StateMachine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "initialStPtr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_StateMachine
			:type SCADE_InitialStPtr
			:location "537:3-537:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_StateMachine
			:type SCADE_State
			:location "538:3-538:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_StateMachine
			:type SCADE_Transition
			:location "539:3-539:41"
			:isContainer false
		)]
	) ) ( def SCADE_Base ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "DefineIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Base
			:type String
			:location "544:3-544:31"
		)]
	) ) ( def SCADE_StateBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_Base]
		:structuralFeatures[]
	) ) ( def SCADE_AnnNote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnNote
			:type String
			:location "552:3-552:32"
		) ( struct-map
			KM3_Attribute
			:name "modified"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnNote
			:type Boolean
			:location "553:3-553:33"
		) ( struct-map
			KM3_Reference
			:name "annNoteType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnNote
			:type SCADE_AnnNoteType
			:location "554:3-554:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "annotable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnNote
			:type SCADE_Annotable
			:location "555:3-555:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "annAttValue"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SCADE_AnnNote
			:type SCADE_AnnAttValue
			:location "556:2-556:80"
			:isContainer true
			:opposite annNote
		)]
	) ) ( def SCADE_AnnAttValue ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annNote"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttValue
			:type SCADE_AnnNote
			:location "561:3-561:57"
			:isContainer false
			:opposite annAttValue
		) ( struct-map
			KM3_Reference
			:name "annAttDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttValue
			:type SCADE_AnnAttDefinition
			:location "562:3-562:50"
			:isContainer false
		)]
	) ) ( def SCADE_AnnNoteType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnNoteType
			:type String
			:location "567:3-567:28"
		) ( struct-map
			KM3_Reference
			:name "annAttDefinition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_AnnNoteType
			:type SCADE_AnnAttDefinition
			:location "568:3-568:80"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "annAttGroup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_AnnNoteType
			:type SCADE_AnnAttGroup
			:location "569:3-569:75"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnNoteType
			:type SCADE_AnnotSchema
			:location "570:3-570:64"
			:isContainer false
			:opposite annNoteType
		)]
	) ) ( def SCADE_AnnAttDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttDefinition
			:type String
			:location "575:3-575:28"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttDefinition
			:type Integer
			:location "576:3-576:29"
		) ( struct-map
			KM3_Reference
			:name "annAttGroup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttDefinition
			:type SCADE_AnnAttGroup
			:location "577:3-577:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttDefinition
			:type SCADE_AnnNoteType
			:location "578:3-578:67"
			:isContainer false
			:opposite annAttDefinition
		) ( struct-map
			KM3_Reference
			:name "annProperty"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_AnnAttDefinition
			:type SCADE_AnnProperty
			:location "580:3-580:69"
			:isContainer true
			:opposite key
		)]
	) ) ( def SCADE_AnnAttIntValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttIntValue
			:type Integer
			:location "585:3-585:30"
		)]
	) ) ( def SCADE_AnnAttBoolValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttBoolValue
			:type Boolean
			:location "590:3-590:30"
		)]
	) ) ( def SCADE_AnnAttCharValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttCharValue
			:type Char
			:location "595:3-595:27"
		)]
	) ) ( def SCADE_AnnAttRealValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttRealValue
			:type Double
			:location "600:3-600:29"
		)]
	) ) ( def SCADE_AnnAttStringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttStringValue
			:type String
			:location "605:3-605:29"
		)]
	) ) ( def SCADE_AnnAttFileValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttStringValue]
		:structuralFeatures[]
	) ) ( def SCADE_AnnAttDateValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttStringValue]
		:structuralFeatures[]
	) ) ( def SCADE_AnnAttOidValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttStringValue]
		:structuralFeatures[]
	) ) ( def SCADE_AnnAttEnumValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnAttStringValue]
		:structuralFeatures[]
	) ) ( def SCADE_AnnProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnProperty
			:type String
			:location "622:3-622:29"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnProperty
			:type Integer
			:location "623:3-623:30"
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnProperty
			:type SCADE_AnnAttDefinition
			:location "624:3-624:60"
			:isContainer false
			:opposite annProperty
		)]
	) ) ( def SCADE_AnnPropertyInt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnPropertyInt
			:type Integer
			:location "629:3-629:30"
		)]
	) ) ( def SCADE_AnnPropertyBool ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnPropertyBool
			:type Boolean
			:location "634:3-634:30"
		)]
	) ) ( def SCADE_AnnPropertyChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnPropertyChar
			:type Char
			:location "639:3-639:27"
		)]
	) ) ( def SCADE_AnnPropertyReal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnPropertyReal
			:type Double
			:location "644:3-644:29"
		)]
	) ) ( def SCADE_AnnPropertyString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnPropertyString
			:type String
			:location "649:3-649:29"
		)]
	) ) ( def SCADE_AnnPropertyEnum ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_AnnProperty]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnPropertyEnum
			:type SCADE_Object
			:location "654:3-654:29"
			:isContainer false
		)]
	) ) ( def SCADE_AnnotSchema ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "pathname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnotSchema
			:type String
			:location "659:3-659:32"
		) ( struct-map
			KM3_Reference
			:name "annNoteType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnotSchema
			:type SCADE_AnnNoteType
			:location "660:3-660:66"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "annCategory"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnotSchema
			:type SCADE_AnnCategory
			:location "661:2-661:65"
			:isContainer true
			:opposite key
		)]
	) ) ( def SCADE_AnnCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnCategory
			:type String
			:location "666:3-666:28"
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnCategory
			:type SCADE_AnnotSchema
			:location "667:3-667:62"
			:isContainer false
			:opposite annCategory
		) ( struct-map
			KM3_Reference
			:name "anootability"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_AnnCategory
			:type SCADE_Annotability
			:location "668:3-668:55"
			:isContainer true
		)]
	) ) ( def SCADE_Annotability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "minCardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Annotability
			:type Integer
			:location "673:3-673:40"
		) ( struct-map
			KM3_Attribute
			:name "maxCardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Annotability
			:type Integer
			:location "674:3-674:40"
		) ( struct-map
			KM3_Attribute
			:name "defaultNote"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Annotability
			:type Boolean
			:location "675:3-675:40"
		) ( struct-map
			KM3_Reference
			:name "annNoteType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Annotability
			:type SCADE_AnnNoteType
			:location "676:3-676:42"
			:isContainer false
		)]
	) ) ( def SCADE_AnnAttGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttGroup
			:type String
			:location "681:3-681:29"
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AnnAttGroup
			:type SCADE_AnnNoteType
			:location "682:3-682:54"
			:isContainer false
			:opposite annAttGroup
		)]
	) ) ( def SCADE_File ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SCADE_MtcEntity]
		:structuralFeatures[]
	) ) ( def SCADE_MtcApplication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "coverageFileCov"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_MtcApplication
			:type SCADE_CoverageFile
			:location "690:3-690:85"
			:isContainer true
			:opposite application
		) ( struct-map
			KM3_Reference
			:name "criterionFileCri"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_MtcApplication
			:type SCADE_CriterionFile
			:location "691:3-691:85"
			:isContainer true
			:opposite application
		) ( struct-map
			KM3_Reference
			:name "modelM"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_MtcApplication
			:type SCADE_Model
			:location "692:3-692:85"
			:isContainer true
			:opposite application
		)]
	) ) ( def SCADE_CoverageFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_File]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "record"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_CoverageFile
			:type SCADE_Record
			:location "697:3-697:70"
			:isContainer true
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "modelCov"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_CoverageFile
			:type SCADE_Model
			:location "698:2-698:82"
			:isContainer true
			:opposite coverageFileM
		) ( struct-map
			KM3_Reference
			:name "application"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_CoverageFile
			:type SCADE_MtcApplication
			:location "699:2-699:80"
			:isContainer false
			:opposite coverageFileCov
		) ( struct-map
			KM3_Reference
			:name "recordCov"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_CoverageFile
			:type SCADE_Record
			:location "700:2-700:82"
			:isContainer true
			:opposite coverageFileR
		)]
	) ) ( def SCADE_CriterionFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_File]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "application"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_CriterionFile
			:type SCADE_MtcApplication
			:location "705:3-705:86"
			:isContainer false
			:opposite criterionFileCri
		) ( struct-map
			KM3_Reference
			:name "modelCri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_CriterionFile
			:type SCADE_Model
			:location "706:2-706:83"
			:isContainer true
			:opposite criterionFileM
		) ( struct-map
			KM3_Reference
			:name "criterionC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_CriterionFile
			:type SCADE_Criterion
			:location "707:2-707:83"
			:isContainer true
			:opposite criterionFileC
		)]
	) ) ( def SCADE_MtcEntity ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_MtcEntity
			:type SCADE_File
			:location "712:3-712:30"
			:isContainer false
		)]
	) ) ( def SCADE_HistoryEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_MtcEntity]
		:structuralFeatures[]
	) ) ( def SCADE_Criterion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_MtcEntity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ident"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Criterion
			:type String
			:location "720:3-720:36"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Criterion
			:type String
			:location "721:3-721:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Criterion
			:type String
			:location "722:3-722:36"
		) ( struct-map
			KM3_Reference
			:name "criterionFileC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Criterion
			:type SCADE_CriterionFile
			:location "723:3-723:71"
			:isContainer false
			:opposite criterionC
		) ( struct-map
			KM3_Reference
			:name "operatorC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Criterion
			:type SCADE_Operator
			:location "724:3-724:82"
			:isContainer false
			:opposite criterionO
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SCADE_Criterion
			:type SCADE_Element
			:location "725:3-725:82"
			:isContainer true
			:opposite criterionE
		)]
	) ) ( def SCADE_Instance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_MtcEntity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "index"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Instance
			:type Integer
			:location "730:3-730:30"
		) ( struct-map
			KM3_Attribute
			:name "occ"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Instance
			:type String
			:location "731:3-731:29"
		) ( struct-map
			KM3_Reference
			:name "modelI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Instance
			:type SCADE_Model
			:location "732:3-732:68"
			:isContainer false
			:opposite root
		) ( struct-map
			KM3_Reference
			:name "operatorI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Instance
			:type SCADE_Operator
			:location "733:3-733:66"
			:isContainer false
			:opposite intanceO
		) ( struct-map
			KM3_Reference
			:name "associationClassI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Instance
			:type SCADE_AssociationClass
			:location "734:3-734:73"
			:isContainer false
			:opposite instanceA
		) ( struct-map
			KM3_Reference
			:name "caller"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Instance
			:type SCADE_Instance
			:location "735:3-735:70"
			:isContainer false
			:opposite called
		) ( struct-map
			KM3_Reference
			:name "called"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Instance
			:type SCADE_Instance
			:location "736:3-736:70"
			:isContainer true
			:opposite caller
		) ( struct-map
			KM3_Reference
			:name "origin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Instance
			:type SCADE_Instance
			:location "737:3-737:71"
			:isContainer false
			:opposite related
		) ( struct-map
			KM3_Reference
			:name "related"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Instance
			:type SCADE_Instance
			:location "738:3-738:70"
			:isContainer false
			:opposite origin
		)]
	) ) ( def SCADE_AssociationClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resultA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_AssociationClass
			:type SCADE_Result
			:location "743:2-743:65"
			:isContainer false
			:opposite associationClassRs
		) ( struct-map
			KM3_Reference
			:name "recordA"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_AssociationClass
			:type SCADE_Record
			:location "744:2-744:66"
			:isContainer false
			:opposite associationClassRc
		) ( struct-map
			KM3_Reference
			:name "instanceA"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_AssociationClass
			:type SCADE_Instance
			:location "745:2-745:66"
			:isContainer false
			:opposite associationClassI
		)]
	) ) ( def SCADE_Result ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_MtcEntity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "elementCount"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Result
			:type Integer
			:location "750:3-750:36"
		) ( struct-map
			KM3_Reference
			:name "associationClassRs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Result
			:type SCADE_AssociationClass
			:location "751:3-751:72"
			:isContainer false
			:opposite resultA
		) ( struct-map
			KM3_Reference
			:name "record"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Result
			:type SCADE_Record
			:location "752:3-752:68"
			:isContainer false
			:opposite result
		)]
	) ) ( def SCADE_Record ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SCADE_MtcEntity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "creator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type String
			:location "757:3-757:36"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type String
			:location "758:3-758:36"
		) ( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type String
			:location "759:3-759:34"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type String
			:location "760:3-760:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type String
			:location "761:3-761:36"
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type SCADE_CoverageFile
			:location "762:3-762:65"
			:isContainer false
			:opposite record
		) ( struct-map
			KM3_Reference
			:name "associationClassRc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type SCADE_AssociationClass
			:location "763:3-763:73"
			:isContainer false
			:opposite recordA
		) ( struct-map
			KM3_Reference
			:name "coverageFileR"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Record
			:type SCADE_CoverageFile
			:location "764:3-764:75"
			:isContainer false
			:opposite recordCov
		) ( struct-map
			KM3_Reference
			:name "result"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SCADE_Record
			:type SCADE_Result
			:location "765:3-765:72"
			:isContainer true
			:opposite record
		)]
	) ) ( def SCADE_Loader ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "descriptor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SCADE_Loader
			:type SCADE_Descriptor
			:location "770:3-770:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "session"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SCADE_Loader
			:type SCADE_Session
			:location "771:3-771:49"
			:isContainer false
			:opposite loader
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "778:2-778:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "779:2-779:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "780:2-780:19"
	) ) ( def ptyp_Char ( struct-map
		KM3_DataType
		:name "Char"
		:location "781:2-781:16"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "782:2-782:18"
	) )]
) )
