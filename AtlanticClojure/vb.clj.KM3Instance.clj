( declare resources_LocatedElement )
( declare resources_VB_LangElement )
( declare core_VB_Content )
( declare core_VB_GlobalVariable )
( declare core_VB_ContentElement )
( declare core_VB_FileAttribute )
( declare core_VB_Option )
( declare core_VB_Imports )
( declare core_VB_Implements )
( declare core_VB_Assembly )
( declare core_VB_Class )
( declare core_VB_Module )
( declare core_VB_Type )
( declare core_VB_Data )
( declare core_VB_SimpleType )
( declare core_VB_Enum )
( declare preprocessing_VB_PreprocIf )
( declare features_VB_Feature )
( declare features_VB_Region )
( declare features_VB_Sub )
( declare features_VB_Function )
( declare features_VB_DeclareFunction )
( declare features_VB_DeclareSub )
( declare features_VB_Parameter )
( declare features_VB_Property )
( declare features_VB_Modifier )
( declare features_VB_Set )
( declare features_VB_Get )
( declare features_VB_Attribute )
( declare graphicals_VB_GraphicalElement )
( declare graphicals_VB_GraphicalField )
( declare graphicals_VB_GraphicalPropertySet )
( declare graphicals_VB_GraphicalProperty )
( declare statements_VB_Statement )
( declare statements_VB_Call )
( declare statements_VB_CallArgument )
( declare statements_VB_CallEmptyArgument )
( declare statements_VB_CallExpressionArgument )
( declare statements_VB_Case )
( declare statements_VB_RawBody )
( declare expressions_VB_Expression )
( declare expressions_VB_AssignmentExpression )
( declare expressions_VB_TypeOfExpression )
( declare expressions_VB_OperatorExpression )
( declare expressions_VB_NewExpression )
( declare expressions_VB_NotExpression )
( declare expressions_VB_NegativeExpression )
( declare expressions_VB_ParenthesisExpression )
( declare expressions_VB_TabValuesExpression )
( declare expressions_VB_ByValExpression )
( declare expressions_VB_Value )
( declare expressions_VB_NegativeValue )
( declare expressions_VB_VariableSystem )
( declare expressions_VB_Literal )
( declare expressions_VB_Literal_Literal )
( declare expressions_VB_Literal_Number )
( declare expressions_VB_Literal_Value )
( declare references_VB_FullTypeRef )
( declare references_VB_TypeRef )
( declare references_VB_FullDataRef )
( declare references_VB_DataRef )
( declare references_VB_LabelRef )
( declare enumerations_EnablementEnum )
( declare enumerations_VisibilityEnum )
( declare enumerations_QualifierEnum )
( declare enumerations_Qualifier_2Enum )
( declare enumerations_NameEnum )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def fr ( struct-map
	KM3_Package
	:contents[( def obeo ( struct-map
		KM3_Package
		:contents[( def psm ( struct-map
			KM3_Package
			:contents[( def vb ( struct-map
				KM3_Package
				:contents[( def resources ( struct-map
					KM3_Package
					:contents[( def resources_LocatedElement ( struct-map
						KM3_Class
						:isAbstract true
						:supertypes[]
						:structuralFeatures[( struct-map
							KM3_Attribute
							:name "location"
							:upper 1
							:lower 1
							:isOrdered false
							:owner resources_LocatedElement
							:type String
							:location "20:7-20:35"
						) ( struct-map
							KM3_Attribute
							:name "commentsBefore"
							:upper -1
							:lower 0
							:isOrdered true
							:owner resources_LocatedElement
							:type String
							:location "21:7-21:52"
						) ( struct-map
							KM3_Attribute
							:name "commentsAfter"
							:upper -1
							:lower 0
							:isOrdered true
							:owner resources_LocatedElement
							:type String
							:location "22:7-22:51"
						)]
					) ) ( def resources_VB_LangElement ( struct-map
						KM3_Class
						:isAbstract true
						:supertypes[resources_LocatedElement]
						:structuralFeatures[]
					) )]
				) ) ( def projects ( struct-map
					KM3_Package
					:contents[( def VB_1 ( struct-map
						KM3_Package
						:contents[( def core ( struct-map
							KM3_Package
							:contents[( def core_VB_Content ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasVersion"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Content
									:type Boolean
									:location "37:9-37:40"
								) ( struct-map
									KM3_Attribute
									:name "version"
									:upper 1
									:lower 0
									:isOrdered false
									:owner core_VB_Content
									:type String
									:location "38:9-38:41"
								) ( struct-map
									KM3_Attribute
									:name "hasClass"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Content
									:type Boolean
									:location "39:9-39:38"
								) ( struct-map
									KM3_Attribute
									:name "hasBeginEnd"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Content
									:type Boolean
									:location "40:9-40:41"
								) ( struct-map
									KM3_Reference
									:name "beginEndGlobalVariables"
									:upper -1
									:lower 0
									:isOrdered true
									:owner core_VB_Content
									:type core_VB_GlobalVariable
									:location "41:9-41:84"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "globalVariables"
									:upper -1
									:lower 0
									:isOrdered true
									:owner core_VB_Content
									:type core_VB_GlobalVariable
									:location "42:9-42:76"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "elements"
									:upper -1
									:lower 0
									:isOrdered true
									:owner core_VB_Content
									:type core_VB_ContentElement
									:location "43:9-43:69"
									:isContainer true
								)]
							) ) ( def core_VB_GlobalVariable ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_GlobalVariable
									:type String
									:location "47:9-47:33"
								) ( struct-map
									KM3_Reference
									:name "value"
									:upper -1
									:lower 1
									:isOrdered true
									:owner core_VB_GlobalVariable
									:type expressions_VB_Expression
									:location "48:9-48:64"
									:isContainer true
								)]
							) ) ( def core_VB_ContentElement ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[]
							) ) ( def core_VB_FileAttribute ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_FileAttribute
									:type String
									:location "56:9-56:33"
								) ( struct-map
									KM3_Reference
									:name "initialValue"
									:upper -1
									:lower 1
									:isOrdered true
									:owner core_VB_FileAttribute
									:type expressions_VB_Expression
									:location "57:9-57:71"
									:isContainer true
								)]
							) ) ( def core_VB_Option ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Option
									:type String
									:location "61:9-61:33"
								) ( struct-map
									KM3_Attribute
									:name "hasEnablement"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Option
									:type Boolean
									:location "62:9-62:43"
								) ( struct-map
									KM3_Attribute
									:name "enablement"
									:upper 1
									:lower 0
									:isOrdered false
									:owner core_VB_Option
									:type EnablementEnum
									:location "63:9-63:52"
								)]
							) ) ( def core_VB_Imports ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "imports"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Imports
									:type references_VB_FullTypeRef
									:location "67:9-67:54"
									:isContainer true
								)]
							) ) ( def core_VB_Implements ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "implements"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Implements
									:type references_VB_FullTypeRef
									:location "71:9-71:57"
									:isContainer true
								)]
							) ) ( def core_VB_Assembly ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "call"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Assembly
									:type statements_VB_Call
									:location "75:9-75:44"
									:isContainer true
								)]
							) ) ( def core_VB_Class ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement core_VB_Type]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "isFriend"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Class
									:type Boolean
									:location "79:9-79:38"
								) ( struct-map
									KM3_Attribute
									:name "hasVisibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Class
									:type Boolean
									:location "80:9-80:43"
								) ( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 0
									:isOrdered false
									:owner core_VB_Class
									:type VisibilityEnum
									:location "81:9-81:52"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Class
									:type String
									:location "82:9-82:33"
								) ( struct-map
									KM3_Attribute
									:name "hasInherits"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Class
									:type Boolean
									:location "83:9-83:41"
								) ( struct-map
									KM3_Reference
									:name "inherits"
									:upper 1
									:lower 0
									:isOrdered false
									:owner core_VB_Class
									:type references_VB_FullTypeRef
									:location "84:9-84:60"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "features"
									:upper -1
									:lower 0
									:isOrdered true
									:owner core_VB_Class
									:type features_VB_Feature
									:location "85:9-85:62"
									:isContainer true
								)]
							) ) ( def core_VB_Module ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Module
									:type String
									:location "89:9-89:33"
								) ( struct-map
									KM3_Reference
									:name "features"
									:upper -1
									:lower 0
									:isOrdered true
									:owner core_VB_Module
									:type features_VB_Feature
									:location "90:9-90:62"
									:isContainer true
								)]
							) ) ( def core_VB_Type ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[]
							) ) ( def core_VB_Data ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[]
							) ) ( def core_VB_SimpleType ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 0
									:isOrdered false
									:owner core_VB_SimpleType
									:type VisibilityEnum
									:location "101:9-101:52"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_SimpleType
									:type String
									:location "102:9-102:33"
								) ( struct-map
									KM3_Reference
									:name "features"
									:upper -1
									:lower 0
									:isOrdered true
									:owner core_VB_SimpleType
									:type features_VB_Feature
									:location "103:9-103:62"
									:isContainer true
								)]
							) ) ( def core_VB_Enum ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Enum
									:type VisibilityEnum
									:location "107:9-107:47"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner core_VB_Enum
									:type String
									:location "108:9-108:33"
								) ( struct-map
									KM3_Reference
									:name "features"
									:upper -1
									:lower 0
									:isOrdered true
									:owner core_VB_Enum
									:type features_VB_Feature
									:location "109:9-109:62"
									:isContainer true
								)]
							) )]
						) ) ( def preprocessing ( struct-map
							KM3_Package
							:contents[( def preprocessing_VB_PreprocIf ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "condition"
									:upper 1
									:lower 1
									:isOrdered false
									:owner preprocessing_VB_PreprocIf
									:type expressions_VB_Expression
									:location "116:9-116:55"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "features"
									:upper -1
									:lower 0
									:isOrdered true
									:owner preprocessing_VB_PreprocIf
									:type features_VB_Feature
									:location "117:9-117:62"
									:isContainer true
								)]
							) )]
						) ) ( def features ( struct-map
							KM3_Package
							:contents[( def features_VB_Feature ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[core_VB_Data core_VB_ContentElement]
								:structuralFeatures[]
							) ) ( def features_VB_Region ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Feature]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Region
									:type String
									:location "128:9-128:33"
								) ( struct-map
									KM3_Reference
									:name "features"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Region
									:type features_VB_Feature
									:location "129:9-129:62"
									:isContainer true
								)]
							) ) ( def features_VB_Sub ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Feature]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasAnnotation"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Sub
									:type Boolean
									:location "133:9-133:43"
								) ( struct-map
									KM3_Attribute
									:name "isFriend"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Sub
									:type Boolean
									:location "135:9-135:38"
								) ( struct-map
									KM3_Attribute
									:name "hasVisibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Sub
									:type Boolean
									:location "136:9-136:43"
								) ( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Sub
									:type VisibilityEnum
									:location "137:9-137:52"
								) ( struct-map
									KM3_Attribute
									:name "isOverloads"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Sub
									:type Boolean
									:location "138:9-138:41"
								) ( struct-map
									KM3_Attribute
									:name "isOverrides"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Sub
									:type Boolean
									:location "139:9-139:41"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Sub
									:type String
									:location "140:9-140:33"
								) ( struct-map
									KM3_Attribute
									:name "hasHandles"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Sub
									:type Boolean
									:location "142:9-142:40"
								) ( struct-map
									KM3_Reference
									:name "annotation"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Sub
									:type statements_VB_Call
									:location "134:9-134:55"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "parameters"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Sub
									:type features_VB_Parameter
									:location "141:9-141:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "handles"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Sub
									:type references_VB_FullTypeRef
									:location "143:9-143:65"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "statements"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Sub
									:type statements_VB_Statement
									:location "144:9-144:66"
									:isContainer true
								)]
							) ) ( def features_VB_Function ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Feature]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "isFriend"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Function
									:type Boolean
									:location "148:9-148:38"
								) ( struct-map
									KM3_Attribute
									:name "hasVisibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Function
									:type Boolean
									:location "149:9-149:43"
								) ( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Function
									:type VisibilityEnum
									:location "150:9-150:52"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Function
									:type String
									:location "151:9-151:33"
								) ( struct-map
									KM3_Reference
									:name "parameters"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Function
									:type features_VB_Parameter
									:location "152:9-152:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "return"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Function
									:type references_VB_FullTypeRef
									:location "153:9-153:58"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "statements"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Function
									:type statements_VB_Statement
									:location "154:9-154:66"
									:isContainer true
								)]
							) ) ( def features_VB_DeclareFunction ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Feature]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasVisibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type Boolean
									:location "158:9-158:43"
								) ( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type VisibilityEnum
									:location "159:9-159:52"
								) ( struct-map
									KM3_Attribute
									:name "isAuto"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type Boolean
									:location "160:9-160:36"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type String
									:location "161:9-161:33"
								) ( struct-map
									KM3_Attribute
									:name "lib"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type String
									:location "162:9-162:32"
								) ( struct-map
									KM3_Attribute
									:name "isAlias"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type Boolean
									:location "163:9-163:37"
								) ( struct-map
									KM3_Attribute
									:name "alias"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type String
									:location "164:9-164:39"
								) ( struct-map
									KM3_Reference
									:name "parameters"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_DeclareFunction
									:type features_VB_Parameter
									:location "165:9-165:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "return"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareFunction
									:type references_VB_FullTypeRef
									:location "166:9-166:53"
									:isContainer true
								)]
							) ) ( def features_VB_DeclareSub ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Feature]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasVisibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareSub
									:type Boolean
									:location "170:9-170:43"
								) ( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_DeclareSub
									:type VisibilityEnum
									:location "171:9-171:52"
								) ( struct-map
									KM3_Attribute
									:name "isAuto"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareSub
									:type Boolean
									:location "172:9-172:36"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareSub
									:type String
									:location "173:9-173:33"
								) ( struct-map
									KM3_Attribute
									:name "lib"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareSub
									:type String
									:location "174:9-174:32"
								) ( struct-map
									KM3_Attribute
									:name "isAlias"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_DeclareSub
									:type Boolean
									:location "175:9-175:37"
								) ( struct-map
									KM3_Attribute
									:name "alias"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_DeclareSub
									:type String
									:location "176:9-176:39"
								) ( struct-map
									KM3_Reference
									:name "parameters"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_DeclareSub
									:type features_VB_Parameter
									:location "177:9-177:66"
									:isContainer true
								)]
							) ) ( def features_VB_Parameter ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_Data]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "isOptional"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Parameter
									:type Boolean
									:location "181:9-181:40"
								) ( struct-map
									KM3_Attribute
									:name "hasQualifier"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Parameter
									:type Boolean
									:location "182:9-182:42"
								) ( struct-map
									KM3_Attribute
									:name "qualifier"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Parameter
									:type QualifierEnum
									:location "183:9-183:50"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Parameter
									:type String
									:location "184:9-184:33"
								) ( struct-map
									KM3_Attribute
									:name "isArray"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Parameter
									:type Boolean
									:location "185:9-185:37"
								) ( struct-map
									KM3_Attribute
									:name "hasType"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Parameter
									:type Boolean
									:location "187:9-187:37"
								) ( struct-map
									KM3_Attribute
									:name "hasInitialValue"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Parameter
									:type Boolean
									:location "189:9-189:45"
								) ( struct-map
									KM3_Reference
									:name "arrayExpression"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Parameter
									:type expressions_VB_Expression
									:location "186:9-186:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "type"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Parameter
									:type references_VB_FullTypeRef
									:location "188:9-188:56"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "value"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Parameter
									:type expressions_VB_Expression
									:location "190:9-190:56"
									:isContainer true
								)]
							) ) ( def features_VB_Property ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Feature]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Property
									:type VisibilityEnum
									:location "194:9-194:47"
								) ( struct-map
									KM3_Attribute
									:name "isShared"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Property
									:type Boolean
									:location "195:9-195:38"
								) ( struct-map
									KM3_Attribute
									:name "isGetOnly"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Property
									:type Boolean
									:location "196:9-196:39"
								) ( struct-map
									KM3_Attribute
									:name "isSet"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Property
									:type Boolean
									:location "197:9-197:35"
								) ( struct-map
									KM3_Attribute
									:name "isLet"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Property
									:type Boolean
									:location "198:9-198:35"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Property
									:type String
									:location "199:9-199:33"
								) ( struct-map
									KM3_Reference
									:name "parameters"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Property
									:type features_VB_Parameter
									:location "200:9-200:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "type"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Property
									:type references_VB_FullTypeRef
									:location "201:9-201:56"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "modifiers"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Property
									:type features_VB_Modifier
									:location "202:9-202:64"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "statements"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Property
									:type statements_VB_Statement
									:location "203:9-203:66"
									:isContainer true
								)]
							) ) ( def features_VB_Modifier ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[]
							) ) ( def features_VB_Set ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Modifier]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasParameters"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Set
									:type Boolean
									:location "211:9-211:43"
								) ( struct-map
									KM3_Reference
									:name "parameters"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Set
									:type features_VB_Parameter
									:location "212:9-212:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "statements"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Set
									:type statements_VB_Statement
									:location "213:9-213:66"
									:isContainer true
								)]
							) ) ( def features_VB_Get ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Modifier]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasParameters"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Get
									:type Boolean
									:location "217:9-217:43"
								) ( struct-map
									KM3_Reference
									:name "parameters"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Get
									:type features_VB_Parameter
									:location "218:9-218:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "statements"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Get
									:type statements_VB_Statement
									:location "219:9-219:66"
									:isContainer true
								)]
							) ) ( def features_VB_Attribute ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[features_VB_Feature]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasVisibility"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "223:9-223:43"
								) ( struct-map
									KM3_Attribute
									:name "visibility"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Attribute
									:type VisibilityEnum
									:location "224:9-224:52"
								) ( struct-map
									KM3_Attribute
									:name "hasQualifier"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "225:9-225:42"
								) ( struct-map
									KM3_Attribute
									:name "qualifier"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Attribute
									:type Qualifier_2Enum
									:location "226:9-226:52"
								) ( struct-map
									KM3_Attribute
									:name "isFriend"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "227:9-227:38"
								) ( struct-map
									KM3_Attribute
									:name "isWithEvents"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "228:9-228:42"
								) ( struct-map
									KM3_Attribute
									:name "isShared"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "229:9-229:38"
								) ( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type String
									:location "230:9-230:33"
								) ( struct-map
									KM3_Attribute
									:name "isArray"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "231:9-231:37"
								) ( struct-map
									KM3_Attribute
									:name "hasType"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "233:9-233:37"
								) ( struct-map
									KM3_Attribute
									:name "hasInitialValue"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "235:9-235:45"
								) ( struct-map
									KM3_Attribute
									:name "hasNext"
									:upper 1
									:lower 1
									:isOrdered false
									:owner features_VB_Attribute
									:type Boolean
									:location "237:9-237:37"
								) ( struct-map
									KM3_Reference
									:name "arrayExpressions"
									:upper -1
									:lower 0
									:isOrdered true
									:owner features_VB_Attribute
									:type expressions_VB_Expression
									:location "232:9-232:73"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "type"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Attribute
									:type expressions_VB_Expression
									:location "234:9-234:55"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "initialValue"
									:upper 1
									:lower 0
									:isOrdered false
									:owner features_VB_Attribute
									:type expressions_VB_Expression
									:location "236:9-236:63"
									:isContainer true
								)]
							) )]
						) ) ( def graphicals ( struct-map
							KM3_Package
							:contents[( def graphicals_VB_GraphicalElement ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_ContentElement core_VB_Data]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner graphicals_VB_GraphicalElement
									:type String
									:location "245:9-245:33"
								) ( struct-map
									KM3_Reference
									:name "type"
									:upper 1
									:lower 1
									:isOrdered false
									:owner graphicals_VB_GraphicalElement
									:type references_VB_FullTypeRef
									:location "244:9-244:51"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "fields"
									:upper -1
									:lower 0
									:isOrdered true
									:owner graphicals_VB_GraphicalElement
									:type graphicals_VB_GraphicalField
									:location "246:9-246:67"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "children"
									:upper -1
									:lower 0
									:isOrdered true
									:owner graphicals_VB_GraphicalElement
									:type graphicals_VB_GraphicalElement
									:location "247:9-247:71"
									:isContainer true
								)]
							) ) ( def graphicals_VB_GraphicalField ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[]
							) ) ( def graphicals_VB_GraphicalPropertySet ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[graphicals_VB_GraphicalField]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner graphicals_VB_GraphicalPropertySet
									:type String
									:location "255:9-255:33"
								) ( struct-map
									KM3_Attribute
									:name "hasArguments"
									:upper 1
									:lower 1
									:isOrdered false
									:owner graphicals_VB_GraphicalPropertySet
									:type Boolean
									:location "256:9-256:42"
								) ( struct-map
									KM3_Attribute
									:name "hasBrackets"
									:upper 1
									:lower 1
									:isOrdered false
									:owner graphicals_VB_GraphicalPropertySet
									:type Boolean
									:location "258:9-258:41"
								) ( struct-map
									KM3_Reference
									:name "arguments"
									:upper -1
									:lower 0
									:isOrdered true
									:owner graphicals_VB_GraphicalPropertySet
									:type expressions_VB_Expression
									:location "257:9-257:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "fields"
									:upper -1
									:lower 0
									:isOrdered true
									:owner graphicals_VB_GraphicalPropertySet
									:type graphicals_VB_GraphicalField
									:location "259:9-259:67"
									:isContainer true
								)]
							) ) ( def graphicals_VB_GraphicalProperty ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[core_VB_Data graphicals_VB_GraphicalField]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "property"
									:upper 1
									:lower 1
									:isOrdered false
									:owner graphicals_VB_GraphicalProperty
									:type references_VB_FullDataRef
									:location "263:9-263:55"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "value"
									:upper 1
									:lower 1
									:isOrdered false
									:owner graphicals_VB_GraphicalProperty
									:type expressions_VB_Expression
									:location "264:9-264:51"
									:isContainer true
								)]
							) )]
						) ) ( def statements ( struct-map
							KM3_Package
							:contents[( def statements_VB_Statement ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[features_VB_Modifier]
								:structuralFeatures[]
							) ) ( def statements_VB_Call ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[statements_VB_Statement]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "expression"
									:upper 1
									:lower 1
									:isOrdered false
									:owner statements_VB_Call
									:type references_VB_FullDataRef
									:location "275:9-275:57"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "arguments"
									:upper -1
									:lower 0
									:isOrdered true
									:owner statements_VB_Call
									:type statements_VB_CallArgument
									:location "276:9-276:68"
									:isContainer true
								)]
							) ) ( def statements_VB_CallArgument ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[]
							) ) ( def statements_VB_CallEmptyArgument ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[statements_VB_CallArgument]
								:structuralFeatures[]
							) ) ( def statements_VB_CallExpressionArgument ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[statements_VB_CallArgument]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasSeparator"
									:upper 1
									:lower 1
									:isOrdered false
									:owner statements_VB_CallExpressionArgument
									:type Boolean
									:location "289:9-289:42"
								) ( struct-map
									KM3_Reference
									:name "expression"
									:upper 1
									:lower 1
									:isOrdered false
									:owner statements_VB_CallExpressionArgument
									:type expressions_VB_Expression
									:location "288:9-288:56"
									:isContainer true
								)]
							) ) ( def statements_VB_Case ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasSeparator"
									:upper 1
									:lower 1
									:isOrdered false
									:owner statements_VB_Case
									:type Boolean
									:location "294:9-294:42"
								) ( struct-map
									KM3_Reference
									:name "values"
									:upper -1
									:lower 1
									:isOrdered true
									:owner statements_VB_Case
									:type expressions_VB_Expression
									:location "293:9-293:65"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "statements"
									:upper -1
									:lower 0
									:isOrdered true
									:owner statements_VB_Case
									:type statements_VB_Statement
									:location "295:9-295:66"
									:isContainer true
								)]
							) ) ( def statements_VB_RawBody ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[statements_VB_Statement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "value"
									:upper 1
									:lower 0
									:isOrdered false
									:owner statements_VB_RawBody
									:type String
									:location "299:9-299:39"
								)]
							) )]
						) ) ( def expressions ( struct-map
							KM3_Package
							:contents[( def expressions_VB_Expression ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[]
							) ) ( def expressions_VB_AssignmentExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "variable"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_AssignmentExpression
									:type references_VB_FullDataRef
									:location "310:9-310:55"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "expression"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_AssignmentExpression
									:type expressions_VB_Expression
									:location "311:9-311:56"
									:isContainer true
								)]
							) ) ( def expressions_VB_TypeOfExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "variable"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_TypeOfExpression
									:type references_VB_FullDataRef
									:location "315:9-315:55"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "type"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_TypeOfExpression
									:type references_VB_FullTypeRef
									:location "316:9-316:51"
									:isContainer true
								)]
							) ) ( def expressions_VB_OperatorExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "operatorName"
									:upper 1
									:lower 0
									:isOrdered false
									:owner expressions_VB_OperatorExpression
									:type String
									:location "322:9-322:46"
								) ( struct-map
									KM3_Reference
									:name "leftHand"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_OperatorExpression
									:type expressions_VB_Expression
									:location "320:9-320:54"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "rightHand"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_OperatorExpression
									:type expressions_VB_Expression
									:location "321:9-321:55"
									:isContainer true
								)]
							) ) ( def expressions_VB_NewExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "hasArguments"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_NewExpression
									:type Boolean
									:location "327:9-327:42"
								) ( struct-map
									KM3_Attribute
									:name "hasInitialization"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_NewExpression
									:type Boolean
									:location "329:9-329:47"
								) ( struct-map
									KM3_Reference
									:name "type"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_NewExpression
									:type references_VB_FullTypeRef
									:location "326:9-326:51"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "arguments"
									:upper -1
									:lower 0
									:isOrdered true
									:owner expressions_VB_NewExpression
									:type expressions_VB_Expression
									:location "328:9-328:66"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "initializations"
									:upper -1
									:lower 0
									:isOrdered true
									:owner expressions_VB_NewExpression
									:type expressions_VB_Expression
									:location "330:9-330:72"
									:isContainer true
								)]
							) ) ( def expressions_VB_NotExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "expression"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_NotExpression
									:type expressions_VB_Expression
									:location "334:9-334:56"
									:isContainer true
								)]
							) ) ( def expressions_VB_NegativeExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "expression"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_NegativeExpression
									:type expressions_VB_Expression
									:location "338:9-338:56"
									:isContainer true
								)]
							) ) ( def expressions_VB_ParenthesisExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "expression"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_ParenthesisExpression
									:type expressions_VB_Expression
									:location "342:9-342:56"
									:isContainer true
								)]
							) ) ( def expressions_VB_TabValuesExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "arguments"
									:upper -1
									:lower 0
									:isOrdered true
									:owner expressions_VB_TabValuesExpression
									:type expressions_VB_Expression
									:location "346:9-346:66"
									:isContainer true
								)]
							) ) ( def expressions_VB_ByValExpression ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "value"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_ByValExpression
									:type expressions_VB_Expression
									:location "350:9-350:51"
									:isContainer true
								)]
							) ) ( def expressions_VB_Value ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[]
							) ) ( def expressions_VB_NegativeValue ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Value]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "value"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_NegativeValue
									:type expressions_VB_Value
									:location "358:9-358:46"
									:isContainer true
								)]
							) ) ( def expressions_VB_VariableSystem ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Value]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "name"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_VariableSystem
									:type NameEnum
									:location "362:9-362:35"
								)]
							) ) ( def expressions_VB_Literal ( struct-map
								KM3_Class
								:isAbstract true
								:supertypes[expressions_VB_Value]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "value"
									:upper 1
									:lower 1
									:isOrdered false
									:owner expressions_VB_Literal
									:type String
									:location "366:9-366:34"
								)]
							) ) ( def expressions_VB_Literal_Literal ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Literal]
								:structuralFeatures[]
							) ) ( def expressions_VB_Literal_Number ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Literal]
								:structuralFeatures[]
							) ) ( def expressions_VB_Literal_Value ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Literal]
								:structuralFeatures[]
							) )]
						) ) ( def references ( struct-map
							KM3_Package
							:contents[( def references_VB_FullTypeRef ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[( struct-map
									KM3_Reference
									:name "members"
									:upper -1
									:lower 1
									:isOrdered true
									:owner references_VB_FullTypeRef
									:type references_VB_TypeRef
									:location "382:9-382:63"
									:isContainer true
								)]
							) ) ( def references_VB_TypeRef ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "typeValue"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_TypeRef
									:type String
									:location "387:9-387:38"
								) ( struct-map
									KM3_Reference
									:name "type"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_TypeRef
									:type resources_VB_LangElement
									:location "386:9-386:41"
									:isContainer false
								)]
							) ) ( def references_VB_FullDataRef ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[expressions_VB_Expression]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "self"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_FullDataRef
									:type Boolean
									:location "391:9-391:34"
								) ( struct-map
									KM3_Attribute
									:name "hasRecSet"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_FullDataRef
									:type Boolean
									:location "393:9-393:39"
								) ( struct-map
									KM3_Reference
									:name "members"
									:upper -1
									:lower 1
									:isOrdered true
									:owner references_VB_FullDataRef
									:type references_VB_DataRef
									:location "392:9-392:63"
									:isContainer true
								) ( struct-map
									KM3_Reference
									:name "recSetMember"
									:upper 1
									:lower 0
									:isOrdered false
									:owner references_VB_FullDataRef
									:type references_VB_DataRef
									:location "394:9-394:60"
									:isContainer true
								)]
							) ) ( def references_VB_DataRef ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "dataValue"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_DataRef
									:type String
									:location "399:9-399:38"
								) ( struct-map
									KM3_Attribute
									:name "hasArguments"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_DataRef
									:type Boolean
									:location "400:9-400:42"
								) ( struct-map
									KM3_Attribute
									:name "hasRefMarker"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_DataRef
									:type Boolean
									:location "402:9-402:42"
								) ( struct-map
									KM3_Attribute
									:name "hasSubMarker"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_DataRef
									:type Boolean
									:location "403:9-403:42"
								) ( struct-map
									KM3_Reference
									:name "data"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_DataRef
									:type resources_VB_LangElement
									:location "398:9-398:41"
									:isContainer false
								) ( struct-map
									KM3_Reference
									:name "arguments"
									:upper -1
									:lower 0
									:isOrdered true
									:owner references_VB_DataRef
									:type statements_VB_CallArgument
									:location "401:9-401:68"
									:isContainer true
								)]
							) ) ( def references_VB_LabelRef ( struct-map
								KM3_Class
								:isAbstract false
								:supertypes[resources_VB_LangElement]
								:structuralFeatures[( struct-map
									KM3_Attribute
									:name "labelValue"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_LabelRef
									:type String
									:location "408:9-408:39"
								) ( struct-map
									KM3_Reference
									:name "label"
									:upper 1
									:lower 1
									:isOrdered false
									:owner references_VB_LabelRef
									:type resources_VB_LangElement
									:location "407:9-407:42"
									:isContainer false
								)]
							) )]
						) ) ( def enumerations ( struct-map
							KM3_Package
							:contents[( def EnablementEnum ( :literals[( struct-map
								KM3_EnumLiteral
								:name "Off"
								:location "415:9-415:21"
							) ( struct-map
								KM3_EnumLiteral
								:name "On"
								:location "416:9-416:20"
							)] ) ) ( def VisibilityEnum ( :literals[( struct-map
								KM3_EnumLiteral
								:name "private"
								:location "420:9-420:25"
							) ( struct-map
								KM3_EnumLiteral
								:name "protected"
								:location "421:9-421:27"
							) ( struct-map
								KM3_EnumLiteral
								:name "public"
								:location "422:9-422:24"
							)] ) ) ( def QualifierEnum ( :literals[( struct-map
								KM3_EnumLiteral
								:name "byRef"
								:location "426:9-426:23"
							) ( struct-map
								KM3_EnumLiteral
								:name "byVal"
								:location "427:9-427:23"
							)] ) ) ( def Qualifier_2Enum ( :literals[( struct-map
								KM3_EnumLiteral
								:name "static"
								:location "431:9-431:24"
							) ( struct-map
								KM3_EnumLiteral
								:name "const"
								:location "432:9-432:23"
							) ( struct-map
								KM3_EnumLiteral
								:name "dim"
								:location "433:9-433:21"
							)] ) ) ( def NameEnum ( :literals[( struct-map
								KM3_EnumLiteral
								:name "trueLit"
								:location "437:9-437:25"
							) ( struct-map
								KM3_EnumLiteral
								:name "falseLit"
								:location "438:9-438:26"
							) ( struct-map
								KM3_EnumLiteral
								:name "nothing"
								:location "439:9-439:25"
							)] ) )]
						) )]
					) )]
				) )]
			) )]
		) )]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "452:2-452:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "454:2-454:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "456:2-456:19"
	) )]
) )
