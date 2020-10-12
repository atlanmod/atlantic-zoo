( declare Ant_Project )
( declare Ant_Property )
( declare Ant_PropertyName )
( declare Ant_PropertyValue )
( declare Ant_PropertyLocation )
( declare Ant_PropertyFile )
( declare Ant_PropertyEnv )
( declare Ant_Target )
( declare Ant_Pattern )
( declare Ant_Basic )
( declare Ant_Mapper )
( declare Ant_InExcludes )
( declare Ant_Includes )
( declare Ant_Excludes )
( declare Ant_IncludesFile )
( declare Ant_ExcludesFile )
( declare Ant_FileList )
( declare Ant_Filter )
( declare Ant_FiltersFile )
( declare Ant_PathElement )
( declare Ant_Set )
( declare Ant_PatternSet )
( declare Ant_FileSet )
( declare Ant_FilterSet )
( declare Ant_Path )
( declare Ant_ClassPath )
( declare Ant_Task )
( declare Ant_TaskDef )
( declare Ant_NewTask )
( declare Ant_Attribut )
( declare Ant_PreDefinedTask )
( declare Ant_ExecutionTask )
( declare Ant_Exec )
( declare Ant_Java )
( declare Ant_MiscellaneousTask )
( declare Ant_Echo )
( declare Ant_Tstamp )
( declare Ant_FormatTstamp )
( declare Ant_CompileTask )
( declare Ant_Javac )
( declare Ant_DocumentationTask )
( declare Ant_Javadoc )
( declare Ant_ArchiveTask )
( declare Ant_Jar )
( declare Ant_FileTask )
( declare Ant_Mkdir )
( declare Ant_Copy )
( declare Ant_Delete )
( declare PrimitiveTypes_String )
( def Ant ( struct-map
	KM3_Package
	:contents[( def Ant_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Project
			:type String
			:location "13:4-13:34"
		) ( struct-map
			KM3_Attribute
			:name "basedir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Project
			:type String
			:location "14:4-14:37"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Project
			:type String
			:location "15:4-15:41"
		) ( struct-map
			KM3_Reference
			:name "default"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Project
			:type Ant_Target
			:location "16:4-16:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Project
			:type Ant_Path
			:location "17:4-17:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Ant_Project
			:type Ant_Property
			:location "18:4-18:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "taskdef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_Project
			:type Ant_TaskDef
			:location "19:4-19:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "targets"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Ant_Project
			:type Ant_Target
			:location "20:4-20:55"
			:isContainer true
		)]
	) ) ( def Ant_Property ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Ant_PropertyName ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_Property]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_PropertyName
			:type String
			:location "30:4-30:28"
		)]
	) ) ( def Ant_PropertyValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_PropertyName]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_PropertyValue
			:type String
			:location "35:5-35:30"
		)]
	) ) ( def Ant_PropertyLocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_PropertyName]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_PropertyLocation
			:type String
			:location "40:5-40:33"
		)]
	) ) ( def Ant_PropertyFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Property]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_PropertyFile
			:type String
			:location "45:4-45:28"
		)]
	) ) ( def Ant_PropertyEnv ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Property]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "environment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_PropertyEnv
			:type String
			:location "50:4-50:35"
		)]
	) ) ( def Ant_Target ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Target
			:type String
			:location "58:4-58:28"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Target
			:type String
			:location "59:4-59:40"
		) ( struct-map
			KM3_Attribute
			:name "unless"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Target
			:type String
			:location "60:4-60:36"
		) ( struct-map
			KM3_Attribute
			:name "ifCondition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Target
			:type String
			:location "61:4-61:41"
		) ( struct-map
			KM3_Reference
			:name "depends"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_Target
			:type Ant_Target
			:location "62:4-62:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "tasks"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Ant_Target
			:type Ant_Task
			:location "63:4-63:67"
			:isContainer true
			:opposite target
		)]
	) ) ( def Ant_Pattern ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Ant_Basic ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_Pattern]
		:structuralFeatures[]
	) ) ( def Ant_Mapper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Mapper
			:type String
			:location "78:4-78:34"
		) ( struct-map
			KM3_Attribute
			:name "classname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Mapper
			:type String
			:location "79:4-79:39"
		) ( struct-map
			KM3_Attribute
			:name "classpath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Mapper
			:type String
			:location "80:4-80:39"
		) ( struct-map
			KM3_Attribute
			:name "classpathref"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Mapper
			:type String
			:location "81:4-81:42"
		) ( struct-map
			KM3_Attribute
			:name "from"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Mapper
			:type String
			:location "82:4-82:34"
		) ( struct-map
			KM3_Attribute
			:name "to"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Mapper
			:type String
			:location "83:4-83:32"
		)]
	) ) ( def Ant_InExcludes ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_InExcludes
			:type String
			:location "88:4-88:28"
		) ( struct-map
			KM3_Attribute
			:name "ifCondition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_InExcludes
			:type String
			:location "89:4-89:41"
		) ( struct-map
			KM3_Attribute
			:name "unless"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_InExcludes
			:type String
			:location "90:4-90:36"
		)]
	) ) ( def Ant_Includes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_InExcludes]
		:structuralFeatures[]
	) ) ( def Ant_Excludes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_InExcludes]
		:structuralFeatures[]
	) ) ( def Ant_IncludesFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_InExcludes]
		:structuralFeatures[]
	) ) ( def Ant_ExcludesFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_InExcludes]
		:structuralFeatures[]
	) ) ( def Ant_FileList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_FileList
			:type String
			:location "100:4-100:27"
		) ( struct-map
			KM3_Attribute
			:name "files"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_FileList
			:type String
			:location "101:4-101:29"
		)]
	) ) ( def Ant_Filter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "token"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Filter
			:type String
			:location "106:5-106:30"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Filter
			:type String
			:location "107:5-107:30"
		)]
	) ) ( def Ant_FiltersFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_FiltersFile
			:type String
			:location "112:4-112:28"
		)]
	) ) ( def Ant_PathElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Basic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_PathElement
			:type String
			:location "117:4-117:28"
		) ( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_PathElement
			:type String
			:location "118:4-118:32"
		)]
	) ) ( def Ant_Set ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_Pattern]
		:structuralFeatures[]
	) ) ( def Ant_PatternSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Set]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "inexcludes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Ant_PatternSet
			:type Ant_InExcludes
			:location "128:5-128:55"
			:isContainer true
		)]
	) ) ( def Ant_FileSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_FileSet
			:type String
			:location "133:4-133:27"
		) ( struct-map
			KM3_Reference
			:name "patternset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_FileSet
			:type Ant_PatternSet
			:location "134:4-134:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "include"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_FileSet
			:type Ant_Includes
			:location "135:4-135:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "exclude"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_FileSet
			:type Ant_Excludes
			:location "136:4-136:47"
			:isContainer true
		)]
	) ) ( def Ant_FilterSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "starttoken"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_FilterSet
			:type String
			:location "141:5-141:41"
		) ( struct-map
			KM3_Attribute
			:name "endtoken"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_FilterSet
			:type String
			:location "142:5-142:39"
		) ( struct-map
			KM3_Reference
			:name "filter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_FilterSet
			:type Ant_Filter
			:location "143:5-143:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "filtersfile"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_FilterSet
			:type Ant_FiltersFile
			:location "144:5-144:55"
			:isContainer true
		)]
	) ) ( def Ant_Path ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Path
			:type String
			:location "149:5-149:27"
		) ( struct-map
			KM3_Attribute
			:name "refid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Path
			:type String
			:location "150:5-150:36"
		) ( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Path
			:type Ant_Path
			:location "151:5-151:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pathElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_Path
			:type Ant_PathElement
			:location "152:5-152:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fileset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_Path
			:type Ant_FileSet
			:location "153:5-153:47"
			:isContainer true
		)]
	) ) ( def Ant_ClassPath ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Set]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "refid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_ClassPath
			:type String
			:location "158:5-158:30"
		) ( struct-map
			KM3_Reference
			:name "pathElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_ClassPath
			:type Ant_PathElement
			:location "159:5-159:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fileset"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_ClassPath
			:type Ant_FileSet
			:location "160:5-160:47"
			:isContainer true
		)]
	) ) ( def Ant_Task ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Task
			:type Ant_Target
			:location "169:5-169:48"
			:isContainer false
			:opposite tasks
		)]
	) ) ( def Ant_TaskDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_TaskDef
			:type String
			:location "175:4-175:28"
		) ( struct-map
			KM3_Attribute
			:name "classname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_TaskDef
			:type String
			:location "176:4-176:33"
		)]
	) ) ( def Ant_NewTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "taskName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_NewTask
			:type Ant_TaskDef
			:location "181:4-181:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_NewTask
			:type Ant_Attribut
			:location "182:4-182:49"
			:isContainer true
		)]
	) ) ( def Ant_Attribut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Attribut
			:type String
			:location "187:2-187:26"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Attribut
			:type String
			:location "188:5-188:30"
		)]
	) ) ( def Ant_PreDefinedTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_Task]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_PreDefinedTask
			:type String
			:location "196:4-196:32"
		) ( struct-map
			KM3_Attribute
			:name "taskname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_PreDefinedTask
			:type String
			:location "197:4-197:38"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_PreDefinedTask
			:type String
			:location "198:4-198:41"
		)]
	) ) ( def Ant_ExecutionTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def Ant_Exec ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_ExecutionTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "executable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Exec
			:type String
			:location "206:4-206:34"
		) ( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Exec
			:type String
			:location "207:4-207:27"
		)]
	) ) ( def Ant_Java ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_ExecutionTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "classname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Java
			:type String
			:location "212:4-212:33"
		) ( struct-map
			KM3_Attribute
			:name "jar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Java
			:type String
			:location "213:4-213:33"
		) ( struct-map
			KM3_Attribute
			:name "fork"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Java
			:type String
			:location "214:4-214:34"
		) ( struct-map
			KM3_Reference
			:name "classPath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Java
			:type Ant_ClassPath
			:location "215:4-215:52"
			:isContainer true
		)]
	) ) ( def Ant_MiscellaneousTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def Ant_Echo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_MiscellaneousTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "message"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Echo
			:type String
			:location "225:4-225:31"
		) ( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Echo
			:type String
			:location "226:4-226:34"
		) ( struct-map
			KM3_Attribute
			:name "append"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Echo
			:type String
			:location "227:4-227:36"
		)]
	) ) ( def Ant_Tstamp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_MiscellaneousTask]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "format"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_Tstamp
			:type Ant_FormatTstamp
			:location "232:5-232:50"
			:isContainer true
		)]
	) ) ( def Ant_FormatTstamp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "property"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_FormatTstamp
			:type String
			:location "236:4-236:32"
		) ( struct-map
			KM3_Attribute
			:name "pattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_FormatTstamp
			:type String
			:location "237:4-237:31"
		) ( struct-map
			KM3_Attribute
			:name "offset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_FormatTstamp
			:type String
			:location "238:4-238:36"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_FormatTstamp
			:type String
			:location "239:4-239:34"
		) ( struct-map
			KM3_Attribute
			:name "locale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_FormatTstamp
			:type String
			:location "240:4-240:36"
		)]
	) ) ( def Ant_CompileTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def Ant_Javac ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_CompileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "srcdir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javac
			:type String
			:location "249:4-249:30"
		) ( struct-map
			KM3_Attribute
			:name "destdir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Javac
			:type String
			:location "250:4-250:36"
		) ( struct-map
			KM3_Attribute
			:name "debug"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Javac
			:type String
			:location "251:4-251:35"
		) ( struct-map
			KM3_Attribute
			:name "fork"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Javac
			:type String
			:location "252:4-252:34"
		) ( struct-map
			KM3_Attribute
			:name "optimize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Javac
			:type String
			:location "253:4-253:38"
		) ( struct-map
			KM3_Attribute
			:name "deprecation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Javac
			:type String
			:location "254:4-254:41"
		) ( struct-map
			KM3_Reference
			:name "inExcludes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Ant_Javac
			:type Ant_InExcludes
			:location "255:4-255:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "classPath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Javac
			:type Ant_ClassPath
			:location "256:4-256:52"
			:isContainer true
		)]
	) ) ( def Ant_DocumentationTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def Ant_Javadoc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_DocumentationTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourcepath"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "264:4-264:34"
		) ( struct-map
			KM3_Attribute
			:name "destdir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "265:4-265:31"
		) ( struct-map
			KM3_Attribute
			:name "packagenames"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "266:4-266:36"
		) ( struct-map
			KM3_Attribute
			:name "defaultexcludes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "267:4-267:39"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "268:4-268:30"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "269:4-269:31"
		) ( struct-map
			KM3_Attribute
			:name "use"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "270:4-270:27"
		) ( struct-map
			KM3_Attribute
			:name "windowtitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Javadoc
			:type String
			:location "271:4-271:35"
		)]
	) ) ( def Ant_ArchiveTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def Ant_Jar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_ArchiveTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "jarfile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Jar
			:type String
			:location "280:4-280:31"
		) ( struct-map
			KM3_Attribute
			:name "basedir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Jar
			:type String
			:location "281:4-281:37"
		) ( struct-map
			KM3_Attribute
			:name "compress"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Jar
			:type String
			:location "282:4-282:38"
		) ( struct-map
			KM3_Attribute
			:name "encoding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Jar
			:type String
			:location "283:4-283:38"
		) ( struct-map
			KM3_Attribute
			:name "manifest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Jar
			:type String
			:location "284:4-284:38"
		)]
	) ) ( def Ant_FileTask ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Ant_PreDefinedTask]
		:structuralFeatures[]
	) ) ( def Ant_Mkdir ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_FileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Ant_Mkdir
			:type String
			:location "293:5-293:28"
		)]
	) ) ( def Ant_Copy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_FileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "298:4-298:34"
		) ( struct-map
			KM3_Attribute
			:name "presservelastmodified"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "299:4-299:51"
		) ( struct-map
			KM3_Attribute
			:name "tofile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "300:4-300:36"
		) ( struct-map
			KM3_Attribute
			:name "todir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "301:4-301:35"
		) ( struct-map
			KM3_Attribute
			:name "overwrite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "302:4-302:39"
		) ( struct-map
			KM3_Attribute
			:name "filtering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "303:4-303:39"
		) ( struct-map
			KM3_Attribute
			:name "flatten"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "304:4-304:37"
		) ( struct-map
			KM3_Attribute
			:name "includeEmptyDirs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type String
			:location "305:4-305:46"
		) ( struct-map
			KM3_Reference
			:name "fileset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type Ant_FileSet
			:location "306:4-306:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "filterset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type Ant_FilterSet
			:location "307:4-307:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "mapper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Copy
			:type Ant_Mapper
			:location "308:4-308:46"
			:isContainer true
		)]
	) ) ( def Ant_Delete ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Ant_FileTask]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "313:4-313:34"
		) ( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "314:4-314:33"
		) ( struct-map
			KM3_Attribute
			:name "verbose"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "315:4-315:37"
		) ( struct-map
			KM3_Attribute
			:name "quiet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "316:4-316:35"
		) ( struct-map
			KM3_Attribute
			:name "failonerror"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "317:4-317:41"
		) ( struct-map
			KM3_Attribute
			:name "includeEmptyDirs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "318:4-318:46"
		) ( struct-map
			KM3_Attribute
			:name "includes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "319:4-319:38"
		) ( struct-map
			KM3_Attribute
			:name "includesfile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "320:4-320:42"
		) ( struct-map
			KM3_Attribute
			:name "excludes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "321:4-321:38"
		) ( struct-map
			KM3_Attribute
			:name "excludesfile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "322:4-322:42"
		) ( struct-map
			KM3_Attribute
			:name "defaultexcludes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Ant_Delete
			:type String
			:location "323:4-323:45"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "330:2-330:18"
	) )]
) )
