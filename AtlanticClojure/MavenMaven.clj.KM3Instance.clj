( declare MavenMaven_Project )
( declare MavenMaven_Xmlns )
( declare MavenMaven_AntProperty )
( declare MavenMaven_AntPropertyName )
( declare MavenMaven_AntPropertyValue )
( declare MavenMaven_AntPropertyLocation )
( declare MavenMaven_AntPropertyFile )
( declare MavenMaven_AntPropertyEnv )
( declare MavenMaven_JellyCommand )
( declare MavenMaven_JellySet )
( declare MavenMaven_JellyForEach )
( declare MavenMaven_AbstractGoal )
( declare MavenMaven_ContentsGoal )
( declare MavenMaven_AttainGoal )
( declare MavenMaven_PrePostGoal )
( declare MavenMaven_PreGoal )
( declare MavenMaven_PostGoal )
( declare MavenMaven_Goal )
( declare MavenMaven_Pattern )
( declare MavenMaven_Basic )
( declare MavenMaven_Mapper )
( declare MavenMaven_InExcludes )
( declare MavenMaven_Includes )
( declare MavenMaven_Excludes )
( declare MavenMaven_IncludesFile )
( declare MavenMaven_ExcludesFile )
( declare MavenMaven_FileList )
( declare MavenMaven_Filter )
( declare MavenMaven_FiltersFile )
( declare MavenMaven_PathElement )
( declare MavenMaven_Set )
( declare MavenMaven_PatternSet )
( declare MavenMaven_FileSet )
( declare MavenMaven_FilterSet )
( declare MavenMaven_Path )
( declare MavenMaven_ClassPath )
( declare MavenMaven_Task )
( declare MavenMaven_AntTaskDef )
( declare MavenMaven_NewTask )
( declare MavenMaven_Attribut )
( declare MavenMaven_PreDefinedTask )
( declare MavenMaven_ExecutionTask )
( declare MavenMaven_Exec )
( declare MavenMaven_Java )
( declare MavenMaven_MiscellaneousTask )
( declare MavenMaven_Echo )
( declare MavenMaven_Tstamp )
( declare MavenMaven_FormatTstamp )
( declare MavenMaven_CompileTask )
( declare MavenMaven_Javac )
( declare MavenMaven_DocumentationTask )
( declare MavenMaven_Javadoc )
( declare MavenMaven_ArchiveTask )
( declare MavenMaven_Jar )
( declare MavenMaven_FileTask )
( declare MavenMaven_Mkdir )
( declare MavenMaven_Copy )
( declare MavenMaven_Delete )
( declare PrimitiveTypes_String )
( def MavenMaven ( struct-map
	KM3_Package
	:contents[( def MavenMaven_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "xmlns"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Project
			:type MavenMaven_Xmlns
			:location "15:5-15:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "default"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Project
			:type MavenMaven_Goal
			:location "16:5-16:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Project
			:type MavenMaven_Path
			:location "17:5-17:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MavenMaven_Project
			:type MavenMaven_AntProperty
			:location "18:5-18:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "taskdefs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Project
			:type MavenMaven_AntTaskDef
			:location "19:5-19:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "prePostGoals"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Project
			:type MavenMaven_PrePostGoal
			:location "20:5-20:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "goals"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Project
			:type MavenMaven_Goal
			:location "21:5-21:44"
			:isContainer true
		)]
	) ) ( def MavenMaven_Xmlns ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Xmlns
			:type String
			:location "26:4-26:27"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Xmlns
			:type String
			:location "27:4-27:29"
		)]
	) ) ( def MavenMaven_AntProperty ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_ContentsGoal]
		:structuralFeatures[]
	) ) ( def MavenMaven_AntPropertyName ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_AntProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AntPropertyName
			:type String
			:location "35:5-35:29"
		)]
	) ) ( def MavenMaven_AntPropertyValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_AntPropertyName]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AntPropertyValue
			:type String
			:location "39:5-39:30"
		)]
	) ) ( def MavenMaven_AntPropertyLocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_AntPropertyName]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AntPropertyLocation
			:type String
			:location "43:5-43:33"
		)]
	) ) ( def MavenMaven_AntPropertyFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_AntProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AntPropertyFile
			:type String
			:location "47:5-47:29"
		)]
	) ) ( def MavenMaven_AntPropertyEnv ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_AntProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "environment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AntPropertyEnv
			:type String
			:location "51:5-51:36"
		)]
	) ) ( def MavenMaven_JellyCommand ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_ContentsGoal]
		:structuralFeatures[]
	) ) ( def MavenMaven_JellySet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_JellyCommand]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_JellySet
			:type String
			:location "60:4-60:27"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_JellySet
			:type String
			:location "61:5-61:30"
		)]
	) ) ( def MavenMaven_JellyForEach ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_JellyCommand]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "items"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_JellyForEach
			:type String
			:location "65:5-65:30"
		) ( struct-map
			KM3_Attribute
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_JellyForEach
			:type String
			:location "66:5-66:28"
		) ( struct-map
			KM3_Attribute
			:name "indexVar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_JellyForEach
			:type String
			:location "67:5-67:33"
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_JellyForEach
			:type MavenMaven_ContentsGoal
			:location "68:5-68:49"
			:isContainer true
		)]
	) ) ( def MavenMaven_AbstractGoal ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contentsGoal"
			:upper -1
			:lower 1
			:isOrdered true
			:owner MavenMaven_AbstractGoal
			:type MavenMaven_ContentsGoal
			:location "75:2-75:64"
			:isContainer true
		)]
	) ) ( def MavenMaven_ContentsGoal ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MavenMaven_AttainGoal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_ContentsGoal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attainGoal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AttainGoal
			:type MavenMaven_Goal
			:location "81:4-81:32"
			:isContainer false
		)]
	) ) ( def MavenMaven_PrePostGoal ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_AbstractGoal]
		:structuralFeatures[]
	) ) ( def MavenMaven_PreGoal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_PrePostGoal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "centralGoal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_PreGoal
			:type MavenMaven_Goal
			:location "88:5-88:53"
			:isContainer false
			:opposite preGoal
		)]
	) ) ( def MavenMaven_PostGoal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_PrePostGoal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "centralGoal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_PostGoal
			:type MavenMaven_Goal
			:location "92:4-92:53"
			:isContainer false
			:opposite postGoal
		)]
	) ) ( def MavenMaven_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_AbstractGoal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Goal
			:type String
			:location "97:5-97:29"
		) ( struct-map
			KM3_Reference
			:name "preGoal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Goal
			:type MavenMaven_PreGoal
			:location "98:2-98:59"
			:isContainer false
			:opposite centralGoal
		) ( struct-map
			KM3_Reference
			:name "postGoal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Goal
			:type MavenMaven_PostGoal
			:location "99:2-99:61"
			:isContainer false
			:opposite centralGoal
		)]
	) ) ( def MavenMaven_Pattern ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MavenMaven_Basic ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_Pattern]
		:structuralFeatures[]
	) ) ( def MavenMaven_Mapper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Mapper
			:type String
			:location "114:4-114:34"
		) ( struct-map
			KM3_Attribute
			:name "classname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Mapper
			:type String
			:location "115:4-115:39"
		) ( struct-map
			KM3_Attribute
			:name "classpath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Mapper
			:type String
			:location "116:4-116:39"
		) ( struct-map
			KM3_Attribute
			:name "classpathref"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Mapper
			:type String
			:location "117:4-117:42"
		) ( struct-map
			KM3_Attribute
			:name "from"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Mapper
			:type String
			:location "118:4-118:34"
		) ( struct-map
			KM3_Attribute
			:name "to"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Mapper
			:type String
			:location "119:4-119:32"
		)]
	) ) ( def MavenMaven_InExcludes ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_InExcludes
			:type String
			:location "124:4-124:28"
		) ( struct-map
			KM3_Attribute
			:name "ifCondition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_InExcludes
			:type String
			:location "125:4-125:41"
		) ( struct-map
			KM3_Attribute
			:name "unless"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_InExcludes
			:type String
			:location "126:4-126:36"
		)]
	) ) ( def MavenMaven_Includes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_InExcludes]
		:structuralFeatures[]
	) ) ( def MavenMaven_Excludes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_InExcludes]
		:structuralFeatures[]
	) ) ( def MavenMaven_IncludesFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_InExcludes]
		:structuralFeatures[]
	) ) ( def MavenMaven_ExcludesFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_InExcludes]
		:structuralFeatures[]
	) ) ( def MavenMaven_FileList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_FileList
			:type String
			:location "136:4-136:27"
		) ( struct-map
			KM3_Attribute
			:name "files"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_FileList
			:type String
			:location "137:4-137:29"
		)]
	) ) ( def MavenMaven_Filter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "token"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Filter
			:type String
			:location "142:5-142:30"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Filter
			:type String
			:location "143:5-143:30"
		)]
	) ) ( def MavenMaven_FiltersFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_FiltersFile
			:type String
			:location "148:4-148:28"
		)]
	) ) ( def MavenMaven_PathElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_PathElement
			:type String
			:location "153:4-153:28"
		) ( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_PathElement
			:type String
			:location "154:4-154:32"
		)]
	) ) ( def MavenMaven_Set ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_Pattern]
		:structuralFeatures[]
	) ) ( def MavenMaven_PatternSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Set]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "inexcludes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MavenMaven_PatternSet
			:type MavenMaven_InExcludes
			:location "164:5-164:55"
			:isContainer true
		)]
	) ) ( def MavenMaven_FileSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_FileSet
			:type String
			:location "169:4-169:27"
		) ( struct-map
			KM3_Reference
			:name "patternset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FileSet
			:type MavenMaven_PatternSet
			:location "170:4-170:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "include"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FileSet
			:type MavenMaven_Includes
			:location "171:4-171:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "exclude"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FileSet
			:type MavenMaven_Excludes
			:location "172:4-172:47"
			:isContainer true
		)]
	) ) ( def MavenMaven_FilterSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "starttoken"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FilterSet
			:type String
			:location "177:5-177:41"
		) ( struct-map
			KM3_Attribute
			:name "endtoken"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FilterSet
			:type String
			:location "178:5-178:39"
		) ( struct-map
			KM3_Reference
			:name "filter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FilterSet
			:type MavenMaven_Filter
			:location "179:5-179:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "filtersfile"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FilterSet
			:type MavenMaven_FiltersFile
			:location "180:5-180:55"
			:isContainer true
		)]
	) ) ( def MavenMaven_Path ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Path
			:type String
			:location "185:5-185:27"
		) ( struct-map
			KM3_Attribute
			:name "refid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Path
			:type String
			:location "186:5-186:36"
		) ( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Path
			:type MavenMaven_Path
			:location "187:5-187:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pathElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Path
			:type MavenMaven_PathElement
			:location "188:5-188:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fileset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Path
			:type MavenMaven_FileSet
			:location "189:5-189:47"
			:isContainer true
		)]
	) ) ( def MavenMaven_ClassPath ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "refid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_ClassPath
			:type String
			:location "194:5-194:30"
		) ( struct-map
			KM3_Reference
			:name "pathElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_ClassPath
			:type MavenMaven_PathElement
			:location "195:5-195:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fileset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_ClassPath
			:type MavenMaven_FileSet
			:location "196:5-196:47"
			:isContainer true
		)]
	) ) ( def MavenMaven_Task ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_ContentsGoal]
		:structuralFeatures[]
	) ) ( def MavenMaven_AntTaskDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_ContentsGoal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AntTaskDef
			:type String
			:location "208:4-208:28"
		) ( struct-map
			KM3_Attribute
			:name "classname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_AntTaskDef
			:type String
			:location "209:4-209:33"
		)]
	) ) ( def MavenMaven_NewTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "taskName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_NewTask
			:type MavenMaven_AntTaskDef
			:location "214:4-214:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_NewTask
			:type MavenMaven_Attribut
			:location "215:4-215:49"
			:isContainer true
		)]
	) ) ( def MavenMaven_Attribut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Attribut
			:type String
			:location "220:5-220:29"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Attribut
			:type String
			:location "221:5-221:30"
		)]
	) ) ( def MavenMaven_PreDefinedTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_Task]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_PreDefinedTask
			:type String
			:location "228:4-228:32"
		) ( struct-map
			KM3_Attribute
			:name "taskname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_PreDefinedTask
			:type String
			:location "229:4-229:38"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_PreDefinedTask
			:type String
			:location "230:4-230:41"
		)]
	) ) ( def MavenMaven_ExecutionTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def MavenMaven_Exec ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_ExecutionTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "executable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Exec
			:type String
			:location "239:4-239:34"
		) ( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Exec
			:type String
			:location "240:4-240:27"
		)]
	) ) ( def MavenMaven_Java ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_ExecutionTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "classname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Java
			:type String
			:location "245:4-245:33"
		) ( struct-map
			KM3_Attribute
			:name "jar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Java
			:type String
			:location "246:4-246:33"
		) ( struct-map
			KM3_Attribute
			:name "fork"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Java
			:type String
			:location "247:4-247:34"
		) ( struct-map
			KM3_Reference
			:name "classPath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Java
			:type MavenMaven_ClassPath
			:location "248:4-248:52"
			:isContainer true
		)]
	) ) ( def MavenMaven_MiscellaneousTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def MavenMaven_Echo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_MiscellaneousTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "message"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Echo
			:type String
			:location "257:4-257:31"
		) ( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Echo
			:type String
			:location "258:4-258:34"
		) ( struct-map
			KM3_Attribute
			:name "append"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Echo
			:type String
			:location "259:4-259:36"
		)]
	) ) ( def MavenMaven_Tstamp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_MiscellaneousTask]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "format"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Tstamp
			:type MavenMaven_FormatTstamp
			:location "264:5-264:50"
			:isContainer true
		)]
	) ) ( def MavenMaven_FormatTstamp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "property"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_FormatTstamp
			:type String
			:location "268:4-268:32"
		) ( struct-map
			KM3_Attribute
			:name "pattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_FormatTstamp
			:type String
			:location "269:4-269:31"
		) ( struct-map
			KM3_Attribute
			:name "offset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FormatTstamp
			:type String
			:location "270:4-270:36"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FormatTstamp
			:type String
			:location "271:4-271:34"
		) ( struct-map
			KM3_Attribute
			:name "locale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_FormatTstamp
			:type String
			:location "272:4-272:36"
		)]
	) ) ( def MavenMaven_CompileTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def MavenMaven_Javac ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_CompileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "srcdir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javac
			:type String
			:location "281:4-281:30"
		) ( struct-map
			KM3_Attribute
			:name "destdir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Javac
			:type String
			:location "282:4-282:36"
		) ( struct-map
			KM3_Attribute
			:name "debug"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Javac
			:type String
			:location "283:4-283:35"
		) ( struct-map
			KM3_Attribute
			:name "fork"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Javac
			:type String
			:location "284:4-284:34"
		) ( struct-map
			KM3_Attribute
			:name "optimize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Javac
			:type String
			:location "285:4-285:38"
		) ( struct-map
			KM3_Attribute
			:name "deprecation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Javac
			:type String
			:location "286:4-286:41"
		) ( struct-map
			KM3_Reference
			:name "inExcludes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Javac
			:type MavenMaven_InExcludes
			:location "287:4-287:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "classPath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Javac
			:type MavenMaven_ClassPath
			:location "288:4-288:52"
			:isContainer true
		)]
	) ) ( def MavenMaven_DocumentationTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def MavenMaven_Javadoc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_DocumentationTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourcepath"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "296:4-296:34"
		) ( struct-map
			KM3_Attribute
			:name "destdir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "297:4-297:31"
		) ( struct-map
			KM3_Attribute
			:name "packagenames"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "298:4-298:36"
		) ( struct-map
			KM3_Attribute
			:name "defaultexcludes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "299:4-299:39"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "300:4-300:30"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "301:4-301:31"
		) ( struct-map
			KM3_Attribute
			:name "use"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "302:4-302:27"
		) ( struct-map
			KM3_Attribute
			:name "windowtitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Javadoc
			:type String
			:location "303:4-303:35"
		)]
	) ) ( def MavenMaven_ArchiveTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def MavenMaven_Jar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_ArchiveTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "jarfile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Jar
			:type String
			:location "312:4-312:31"
		) ( struct-map
			KM3_Attribute
			:name "basedir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Jar
			:type String
			:location "313:4-313:37"
		) ( struct-map
			KM3_Attribute
			:name "compress"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Jar
			:type String
			:location "314:4-314:38"
		) ( struct-map
			KM3_Attribute
			:name "encoding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Jar
			:type String
			:location "315:4-315:38"
		) ( struct-map
			KM3_Attribute
			:name "manifest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Jar
			:type String
			:location "316:4-316:38"
		)]
	) ) ( def MavenMaven_FileTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MavenMaven_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def MavenMaven_Mkdir ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_FileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MavenMaven_Mkdir
			:type String
			:location "325:5-325:28"
		)]
	) ) ( def MavenMaven_Copy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_FileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "330:4-330:34"
		) ( struct-map
			KM3_Attribute
			:name "presservelastmodified"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "331:4-331:51"
		) ( struct-map
			KM3_Attribute
			:name "tofile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "332:4-332:36"
		) ( struct-map
			KM3_Attribute
			:name "todir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "333:4-333:35"
		) ( struct-map
			KM3_Attribute
			:name "overwrite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "334:4-334:39"
		) ( struct-map
			KM3_Attribute
			:name "filtering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "335:4-335:39"
		) ( struct-map
			KM3_Attribute
			:name "flatten"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "336:4-336:37"
		) ( struct-map
			KM3_Attribute
			:name "includeEmptyDirs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type String
			:location "337:4-337:46"
		) ( struct-map
			KM3_Reference
			:name "fileset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type MavenMaven_FileSet
			:location "338:4-338:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "filterset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type MavenMaven_FilterSet
			:location "339:4-339:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "mapper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Copy
			:type MavenMaven_Mapper
			:location "340:4-340:46"
			:isContainer true
		)]
	) ) ( def MavenMaven_Delete ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MavenMaven_FileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "345:4-345:34"
		) ( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "346:4-346:33"
		) ( struct-map
			KM3_Attribute
			:name "verbose"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "347:4-347:37"
		) ( struct-map
			KM3_Attribute
			:name "quiet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "348:4-348:35"
		) ( struct-map
			KM3_Attribute
			:name "failonerror"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "349:4-349:41"
		) ( struct-map
			KM3_Attribute
			:name "includeEmptyDirs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "350:4-350:46"
		) ( struct-map
			KM3_Attribute
			:name "includes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "351:4-351:38"
		) ( struct-map
			KM3_Attribute
			:name "includesfile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "352:4-352:42"
		) ( struct-map
			KM3_Attribute
			:name "excludes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "353:4-353:38"
		) ( struct-map
			KM3_Attribute
			:name "excludesfile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "354:4-354:42"
		) ( struct-map
			KM3_Attribute
			:name "defaultexcludes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MavenMaven_Delete
			:type String
			:location "355:4-355:45"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "363:5-363:21"
	) )]
) )
