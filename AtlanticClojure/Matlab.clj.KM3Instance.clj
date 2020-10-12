( declare Matlab_Matlab )
( declare Matlab_BlockDefaults )
( declare Matlab_Model )
( declare Matlab_AnnotationDefaults )
( declare Matlab_LineDefaults )
( declare Matlab_System )
( declare Matlab_Subsystem )
( declare Matlab_Block )
( declare Matlab_Annotation )
( declare Matlab_Line )
( declare Matlab_DirectLine )
( declare Matlab_InputPort )
( declare Matlab_Branch )
( declare Matlab_BranchedLine )
( declare Matlab_Primitive )
( declare Matlab_Port )
( declare Matlab_Reference )
( declare Matlab_Masked )
( declare Matlab_Normal )
( declare Matlab_Parameter )
( declare Matlab_OutputPort )
( declare Matlab_Type )
( declare Matlab_Double )
( declare Matlab_INteger )
( declare Matlab_Enumeration )
( declare Matlab_BOolean )
( declare Matlab_TrueFalse )
( declare Matlab_Text )
( declare Matlab_Vector )
( declare Matlab_DirectBranch )
( declare Matlab_NestedBranch )
( declare Matlab_Machine )
( declare Matlab_Junction )
( declare Matlab_Transition )
( declare Matlab_Event )
( declare Matlab_Data )
( declare Matlab_Instance )
( declare Matlab_Target )
( declare Matlab_Chart )
( declare Matlab_State )
( declare Matlab_Props )
( declare Matlab_Range )
( declare Matlab_Array )
( declare Matlab_StateFlow )
( declare Matlab_TransitionTerminal )
( declare Matlab_Simulink )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def Matlab ( struct-map
	KM3_Package
	:contents[( def TrueFalse ( :literals[( struct-map
		KM3_EnumLiteral
		:name "True"
		:location "195:4-195:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "False"
		:location "196:4-196:18"
	)] ) ) ( def Matlab_Matlab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "model"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Matlab
			:type Matlab_Model
			:location "18:3-18:40"
			:isContainer true
		)]
	) ) ( def Matlab_BlockDefaults ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "blockDefaults"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_BlockDefaults
			:type String
			:location "23:3-23:36"
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_BlockDefaults
			:type Matlab_Model
			:location "24:6-24:55"
			:isContainer false
			:opposite blockDefaults
		)]
	) ) ( def Matlab_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Model
			:type String
			:location "29:3-29:27"
		) ( struct-map
			KM3_Reference
			:name "matlab"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Model
			:type Matlab_Matlab
			:location "31:3-31:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "annotationDefaults"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Model
			:type Matlab_AnnotationDefaults
			:location "32:6-32:86"
			:isContainer true
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Model
			:type Matlab_System
			:location "33:3-33:59"
			:isContainer true
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "blockDefaults"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Model
			:type Matlab_BlockDefaults
			:location "34:3-34:73"
			:isContainer true
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "lineDefaults"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Model
			:type Matlab_LineDefaults
			:location "35:3-35:71"
			:isContainer true
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "simulink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Model
			:type Matlab_Simulink
			:location "36:3-36:51"
			:isContainer false
			:opposite models
		)]
	) ) ( def Matlab_AnnotationDefaults ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "annotationDefaults"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_AnnotationDefaults
			:type String
			:location "41:3-41:41"
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_AnnotationDefaults
			:type Matlab_Model
			:location "43:6-43:60"
			:isContainer false
			:opposite annotationDefaults
		)]
	) ) ( def Matlab_LineDefaults ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lineDefaults"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_LineDefaults
			:type String
			:location "48:3-48:35"
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_LineDefaults
			:type Matlab_Model
			:location "50:6-50:54"
			:isContainer false
			:opposite lineDefaults
		)]
	) ) ( def Matlab_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_System
			:type String
			:location "55:3-55:27"
		) ( struct-map
			KM3_Reference
			:name "blocks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_System
			:type Matlab_Block
			:location "57:3-57:61"
			:isContainer true
			:opposite mySystem
		) ( struct-map
			KM3_Reference
			:name "lines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_System
			:type Matlab_Line
			:location "58:3-58:57"
			:isContainer true
			:opposite system
		) ( struct-map
			KM3_Reference
			:name "annotations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_System
			:type Matlab_Annotation
			:location "59:3-59:69"
			:isContainer true
			:opposite system
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_System
			:type Matlab_Model
			:location "60:6-60:48"
			:isContainer false
			:opposite system
		) ( struct-map
			KM3_Reference
			:name "parentSubsystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_System
			:type Matlab_Subsystem
			:location "61:6-61:62"
			:isContainer false
			:opposite system
		)]
	) ) ( def Matlab_Subsystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Block]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Subsystem
			:type Matlab_System
			:location "66:6-66:69"
			:isContainer true
			:opposite parentSubsystem
		)]
	) ) ( def Matlab_Block ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_BlockDefaults]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Block
			:type String
			:location "71:3-71:27"
		) ( struct-map
			KM3_Attribute
			:name "blockType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Block
			:type String
			:location "72:3-72:32"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Block
			:type String
			:location "73:3-73:34"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Block
			:type String
			:location "74:3-74:31"
		) ( struct-map
			KM3_Attribute
			:name "tag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Block
			:type String
			:location "75:3-75:26"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Block
			:type String
			:location "76:3-76:31"
		) ( struct-map
			KM3_Reference
			:name "mySystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Block
			:type Matlab_System
			:location "78:6-78:52"
			:isContainer false
			:opposite blocks
		) ( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Block
			:type Matlab_Port
			:location "79:6-79:63"
			:isContainer true
			:opposite portBlock
		)]
	) ) ( def Matlab_Annotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_AnnotationDefaults]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Annotation
			:type String
			:location "84:3-84:31"
		) ( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Annotation
			:type String
			:location "85:3-85:27"
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Annotation
			:type Matlab_System
			:location "87:6-87:55"
			:isContainer false
			:opposite annotations
		)]
	) ) ( def Matlab_Line ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_LineDefaults]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "points"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Line
			:type String
			:location "92:3-92:29"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Line
			:type String
			:location "93:3-93:30"
		) ( struct-map
			KM3_Reference
			:name "srcPort"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Line
			:type Matlab_OutputPort
			:location "95:3-95:61"
			:isContainer false
			:opposite owningLine
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Line
			:type Matlab_System
			:location "96:6-96:49"
			:isContainer false
			:opposite lines
		)]
	) ) ( def Matlab_DirectLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Line]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "destPort1"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_DirectLine
			:type Matlab_InputPort
			:location "101:6-101:71"
			:isContainer false
			:opposite owningDirectLine
		)]
	) ) ( def Matlab_InputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owningDirectLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_InputPort
			:type Matlab_DirectLine
			:location "106:3-106:69"
			:isContainer false
			:opposite destPort1
		) ( struct-map
			KM3_Reference
			:name "owningDirectBranch"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_InputPort
			:type Matlab_DirectBranch
			:location "107:6-107:75"
			:isContainer false
			:opposite destPort
		)]
	) ) ( def Matlab_Branch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "points"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Branch
			:type String
			:location "112:3-112:29"
		) ( struct-map
			KM3_Reference
			:name "branchedLine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Branch
			:type Matlab_BranchedLine
			:location "114:6-114:63"
			:isContainer false
			:opposite branchs
		) ( struct-map
			KM3_Reference
			:name "nestedBranch"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Branch
			:type Matlab_NestedBranch
			:location "115:6-115:63"
			:isContainer false
			:opposite branchs
		)]
	) ) ( def Matlab_BranchedLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Line]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "branchs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_BranchedLine
			:type Matlab_Branch
			:location "119:6-119:70"
			:isContainer true
			:opposite branchedLine
		)]
	) ) ( def Matlab_Primitive ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Block]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Primitive
			:type String
			:location "124:3-124:30"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Primitive
			:type Matlab_Parameter
			:location "126:6-126:73"
			:isContainer true
			:opposite primitive
		) ( struct-map
			KM3_Reference
			:name "refPort"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Primitive
			:type Matlab_Port
			:location "127:6-127:57"
			:isContainer false
			:opposite primitive
		)]
	) ) ( def Matlab_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Port
			:type String
			:location "132:3-132:30"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Port
			:type String
			:location "133:3-133:29"
		) ( struct-map
			KM3_Reference
			:name "portBlock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Port
			:type Matlab_Block
			:location "135:3-135:48"
			:isContainer false
			:opposite ports
		) ( struct-map
			KM3_Reference
			:name "primitive"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Port
			:type Matlab_Primitive
			:location "136:3-136:59"
			:isContainer false
			:opposite refPort
		)]
	) ) ( def Matlab_Reference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Block]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourceType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Reference
			:type String
			:location "141:3-141:33"
		) ( struct-map
			KM3_Attribute
			:name "sourceBlock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Reference
			:type String
			:location "142:3-142:34"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Reference
			:type Matlab_Parameter
			:location "144:6-144:76"
			:isContainer true
			:opposite le_reference
		)]
	) ) ( def Matlab_Masked ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Subsystem]
		:structuralFeatures[]
	) ) ( def Matlab_Normal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Subsystem]
		:structuralFeatures[]
	) ) ( def Matlab_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Parameter
			:type String
			:location "157:3-157:27"
		) ( struct-map
			KM3_Reference
			:name "le_reference"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Parameter
			:type Matlab_Reference
			:location "159:6-159:63"
			:isContainer false
			:opposite parameters
		) ( struct-map
			KM3_Reference
			:name "primitive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Parameter
			:type Matlab_Primitive
			:location "160:6-160:60"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def Matlab_OutputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owningLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_OutputPort
			:type Matlab_Line
			:location "165:6-165:58"
			:isContainer false
			:opposite srcPort
		)]
	) ) ( def Matlab_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Type
			:type String
			:location "170:6-170:31"
		)]
	) ) ( def Matlab_Double ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Double
			:type String
			:location "175:6-175:31"
		)]
	) ) ( def Matlab_INteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_INteger
			:type String
			:location "180:9-180:34"
		)]
	) ) ( def Matlab_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Enumeration
			:type String
			:location "185:6-185:31"
		)]
	) ) ( def Matlab_BOolean ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_BOolean
			:type TrueFalse
			:location "190:6-190:34"
		)]
	) ) ( def Matlab_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Text
			:type String
			:location "201:6-201:31"
		)]
	) ) ( def Matlab_Vector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Vector
			:type String
			:location "206:6-206:31"
		)]
	) ) ( def Matlab_DirectBranch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Branch]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_DirectBranch
			:type String
			:location "211:6-211:33"
		) ( struct-map
			KM3_Reference
			:name "destPort"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_DirectBranch
			:type Matlab_InputPort
			:location "213:6-213:72"
			:isContainer false
			:opposite owningDirectBranch
		)]
	) ) ( def Matlab_NestedBranch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Matlab_Branch]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "branchs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_NestedBranch
			:type Matlab_Branch
			:location "218:6-218:70"
			:isContainer true
			:opposite nestedBranch
		)]
	) ) ( def Matlab_Machine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Machine
			:type String
			:location "223:6-223:30"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Machine
			:type String
			:location "224:6-224:28"
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Machine
			:type Matlab_Event
			:location "226:6-226:63"
			:isContainer true
			:opposite machine
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Machine
			:type Matlab_Data
			:location "227:6-227:60"
			:isContainer true
			:opposite machine
		) ( struct-map
			KM3_Reference
			:name "instances"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Machine
			:type Matlab_Instance
			:location "228:6-228:69"
			:isContainer true
			:opposite machine
		) ( struct-map
			KM3_Reference
			:name "targets"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Machine
			:type Matlab_Target
			:location "229:6-229:65"
			:isContainer true
			:opposite machine
		) ( struct-map
			KM3_Reference
			:name "stateFlow"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Machine
			:type Matlab_StateFlow
			:location "230:6-230:58"
			:isContainer false
			:opposite machines
		)]
	) ) ( def Matlab_Junction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "_id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Junction
			:type String
			:location "235:6-235:34"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Junction
			:type String
			:location "236:6-236:28"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Junction
			:type String
			:location "237:6-237:30"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Junction
			:type String
			:location "238:6-238:34"
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Junction
			:type Matlab_State
			:location "240:6-240:51"
			:isContainer false
			:opposite junctions
		) ( struct-map
			KM3_Reference
			:name "chart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Junction
			:type Matlab_Chart
			:location "241:6-241:51"
			:isContainer false
			:opposite junctions
		)]
	) ) ( def Matlab_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "_id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Transition
			:type String
			:location "246:6-246:34"
		) ( struct-map
			KM3_Attribute
			:name "dataLimites"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type String
			:location "247:6-247:37"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type String
			:location "248:6-248:28"
		) ( struct-map
			KM3_Attribute
			:name "trigger"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type String
			:location "249:6-249:33"
		) ( struct-map
			KM3_Attribute
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type String
			:location "250:6-250:35"
		) ( struct-map
			KM3_Attribute
			:name "conditionAction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type String
			:location "251:6-251:41"
		) ( struct-map
			KM3_Attribute
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type String
			:location "252:6-252:32"
		) ( struct-map
			KM3_Reference
			:name "chart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type Matlab_Chart
			:location "254:6-254:53"
			:isContainer false
			:opposite transitions
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Transition
			:type Matlab_State
			:location "255:6-255:53"
			:isContainer false
			:opposite transitions
		)]
	) ) ( def Matlab_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type String
			:location "260:6-260:30"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type String
			:location "261:6-261:28"
		) ( struct-map
			KM3_Attribute
			:name "scope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type String
			:location "262:6-262:31"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type String
			:location "263:6-263:37"
		) ( struct-map
			KM3_Attribute
			:name "trigger"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type String
			:location "264:6-264:33"
		) ( struct-map
			KM3_Reference
			:name "machine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type Matlab_Machine
			:location "266:6-266:52"
			:isContainer false
			:opposite events
		) ( struct-map
			KM3_Reference
			:name "chart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type Matlab_Chart
			:location "267:6-267:48"
			:isContainer false
			:opposite events
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Event
			:type Matlab_State
			:location "268:6-268:48"
			:isContainer false
			:opposite events
		)]
	) ) ( def Matlab_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type String
			:location "274:3-274:27"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type String
			:location "275:6-275:28"
		) ( struct-map
			KM3_Attribute
			:name "scope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type String
			:location "276:6-276:31"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type String
			:location "277:6-277:37"
		) ( struct-map
			KM3_Attribute
			:name "units"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type String
			:location "278:6-278:31"
		) ( struct-map
			KM3_Attribute
			:name "dataType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type String
			:location "279:6-279:34"
		) ( struct-map
			KM3_Reference
			:name "props"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Data
			:type Matlab_Props
			:location "281:6-281:59"
			:isContainer true
			:opposite data
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type Matlab_State
			:location "282:6-282:46"
			:isContainer false
			:opposite data
		) ( struct-map
			KM3_Reference
			:name "chart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type Matlab_Chart
			:location "283:6-283:46"
			:isContainer false
			:opposite data
		) ( struct-map
			KM3_Reference
			:name "machine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Data
			:type Matlab_Machine
			:location "284:6-284:50"
			:isContainer false
			:opposite data
		)]
	) ) ( def Matlab_Instance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "_id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Instance
			:type String
			:location "289:6-289:34"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Instance
			:type String
			:location "290:6-290:28"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Instance
			:type String
			:location "291:6-291:30"
		) ( struct-map
			KM3_Reference
			:name "machine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Instance
			:type Matlab_Machine
			:location "293:6-293:55"
			:isContainer false
			:opposite instances
		)]
	) ) ( def Matlab_Target ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type String
			:location "298:6-298:30"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type String
			:location "299:6-299:28"
		) ( struct-map
			KM3_Attribute
			:name "codeCommand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type String
			:location "300:6-300:37"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type String
			:location "301:6-301:37"
		) ( struct-map
			KM3_Attribute
			:name "makeCommand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type String
			:location "302:6-302:37"
		) ( struct-map
			KM3_Attribute
			:name "codeFlags"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type String
			:location "303:6-303:35"
		) ( struct-map
			KM3_Attribute
			:name "checksumOld"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type String
			:location "304:6-304:37"
		) ( struct-map
			KM3_Reference
			:name "machine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Target
			:type Matlab_Machine
			:location "306:6-306:53"
			:isContainer false
			:opposite targets
		)]
	) ) ( def Matlab_Chart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Chart
			:type String
			:location "311:6-311:30"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Chart
			:type String
			:location "312:6-312:28"
		) ( struct-map
			KM3_Attribute
			:name "_id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Chart
			:type String
			:location "313:6-313:34"
		) ( struct-map
			KM3_Attribute
			:name "decomposotion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Chart
			:type String
			:location "314:6-314:39"
		) ( struct-map
			KM3_Attribute
			:name "updateMethode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Chart
			:type String
			:location "315:6-315:39"
		) ( struct-map
			KM3_Attribute
			:name "sampleTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Chart
			:type String
			:location "316:6-316:36"
		) ( struct-map
			KM3_Reference
			:name "junctions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Chart
			:type Matlab_Junction
			:location "318:6-318:67"
			:isContainer true
			:opposite chart
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Chart
			:type Matlab_Event
			:location "319:6-319:61"
			:isContainer true
			:opposite chart
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Chart
			:type Matlab_Transition
			:location "320:6-320:71"
			:isContainer true
			:opposite chart
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Chart
			:type Matlab_Data
			:location "321:6-321:58"
			:isContainer true
			:opposite chart
		) ( struct-map
			KM3_Reference
			:name "states"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Chart
			:type Matlab_State
			:location "322:6-322:61"
			:isContainer true
			:opposite chart
		)]
	) ) ( def Matlab_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "327:6-327:30"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "328:6-328:28"
		) ( struct-map
			KM3_Attribute
			:name "_id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "329:6-329:34"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "330:6-330:30"
		) ( struct-map
			KM3_Attribute
			:name "entryAction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "331:6-331:37"
		) ( struct-map
			KM3_Attribute
			:name "exitAction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "332:6-332:36"
		) ( struct-map
			KM3_Attribute
			:name "duringAction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "333:6-333:38"
		) ( struct-map
			KM3_Attribute
			:name "eventActions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "334:6-334:38"
		) ( struct-map
			KM3_Attribute
			:name "decomposition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "335:6-335:39"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type String
			:location "336:6-336:34"
		) ( struct-map
			KM3_Reference
			:name "junctions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_State
			:type Matlab_Junction
			:location "338:6-338:67"
			:isContainer true
			:opposite state
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_State
			:type Matlab_Event
			:location "339:6-339:61"
			:isContainer true
			:opposite state
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_State
			:type Matlab_Transition
			:location "340:6-340:71"
			:isContainer true
			:opposite state
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_State
			:type Matlab_Data
			:location "341:6-341:58"
			:isContainer true
			:opposite state
		) ( struct-map
			KM3_Reference
			:name "chart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_State
			:type Matlab_Chart
			:location "342:6-342:48"
			:isContainer false
			:opposite states
		) ( struct-map
			KM3_Reference
			:name "states"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_State
			:type Matlab_State
			:location "343:6-343:44"
			:isContainer true
		)]
	) ) ( def Matlab_Props ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "initialValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Props
			:type String
			:location "349:6-349:38"
		) ( struct-map
			KM3_Reference
			:name "arrays"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Props
			:type Matlab_Array
			:location "351:6-351:61"
			:isContainer true
			:opposite props
		) ( struct-map
			KM3_Reference
			:name "ranges"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Props
			:type Matlab_Range
			:location "352:6-352:61"
			:isContainer true
			:opposite props
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Props
			:type Matlab_Data
			:location "353:6-353:45"
			:isContainer false
			:opposite props
		)]
	) ) ( def Matlab_Range ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maximum"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Range
			:type String
			:location "358:6-358:33"
		) ( struct-map
			KM3_Attribute
			:name "minimum"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Range
			:type String
			:location "359:6-359:33"
		) ( struct-map
			KM3_Reference
			:name "props"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Range
			:type Matlab_Props
			:location "361:6-361:48"
			:isContainer false
			:opposite ranges
		)]
	) ) ( def Matlab_Array ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "firstIndex"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Array
			:type String
			:location "366:6-366:36"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Array
			:type String
			:location "367:6-367:30"
		) ( struct-map
			KM3_Reference
			:name "props"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_Array
			:type Matlab_Props
			:location "369:6-369:48"
			:isContainer false
			:opposite arrays
		)]
	) ) ( def Matlab_StateFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stateFlow"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_StateFlow
			:type String
			:location "374:6-374:35"
		) ( struct-map
			KM3_Reference
			:name "machines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_StateFlow
			:type Matlab_Machine
			:location "376:6-376:69"
			:isContainer true
			:opposite stateFlow
		) ( struct-map
			KM3_Reference
			:name "simulink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Matlab_StateFlow
			:type Matlab_Simulink
			:location "377:6-377:58"
			:isContainer false
			:opposite stateFlows
		)]
	) ) ( def Matlab_TransitionTerminal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "_id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_TransitionTerminal
			:type String
			:location "382:6-382:34"
		)]
	) ) ( def Matlab_Simulink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "simulink"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Matlab_Simulink
			:type String
			:location "387:6-387:39"
		) ( struct-map
			KM3_Reference
			:name "stateFlows"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Simulink
			:type Matlab_StateFlow
			:location "389:6-389:72"
			:isContainer true
			:opposite simulink
		) ( struct-map
			KM3_Reference
			:name "models"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Matlab_Simulink
			:type Matlab_Model
			:location "390:6-390:64"
			:isContainer true
			:opposite simulink
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "396:2-396:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "397:2-397:19"
	) )]
) )
