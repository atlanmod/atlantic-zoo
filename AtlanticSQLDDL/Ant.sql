CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	name text,
	basedir text,
	description text,
	FOREIGN KEY "default" (__FKdefault__) REFERENCES Target (__IDTarget__),
	FOREIGN KEY path (__FKpath__) REFERENCES Path (__IDPath__),
	PRIMARY KEY Project (__IDProject__),
	__FKdefault__ Integer,
	__FKpath__ Integer
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE PropertyName (
	__IDPropertyName__ Integer NOT NULL,
	name text,
	PRIMARY KEY PropertyName (__IDPropertyName__)
) ;

CREATE TABLE PropertyValue (
	__IDPropertyValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY PropertyValue (__IDPropertyValue__)
) ;

CREATE TABLE PropertyLocation (
	__IDPropertyLocation__ Integer NOT NULL,
	location text,
	PRIMARY KEY PropertyLocation (__IDPropertyLocation__)
) ;

CREATE TABLE PropertyFile (
	__IDPropertyFile__ Integer NOT NULL,
	file text,
	PRIMARY KEY PropertyFile (__IDPropertyFile__)
) ;

CREATE TABLE PropertyEnv (
	__IDPropertyEnv__ Integer NOT NULL,
	environment text,
	PRIMARY KEY PropertyEnv (__IDPropertyEnv__)
) ;

CREATE TABLE Target (
	__IDTarget__ Integer NOT NULL,
	name text,
	description text,
	unless text,
	ifCondition text,
	PRIMARY KEY Target (__IDTarget__)
) ;

CREATE TABLE Pattern (
	__IDPattern__ Integer NOT NULL,
	PRIMARY KEY Pattern (__IDPattern__)
) ;

CREATE TABLE Basic (
	__IDBasic__ Integer NOT NULL,
	PRIMARY KEY Basic (__IDBasic__)
) ;

CREATE TABLE Mapper (
	__IDMapper__ Integer NOT NULL,
	type text,
	classname text,
	classpath text,
	classpathref text,
	"from" text,
	"to" text,
	PRIMARY KEY Mapper (__IDMapper__)
) ;

CREATE TABLE InExcludes (
	__IDInExcludes__ Integer NOT NULL,
	name text,
	ifCondition text,
	unless text,
	PRIMARY KEY InExcludes (__IDInExcludes__)
) ;

CREATE TABLE Includes (
	__IDIncludes__ Integer NOT NULL,
	PRIMARY KEY Includes (__IDIncludes__)
) ;

CREATE TABLE Excludes (
	__IDExcludes__ Integer NOT NULL,
	PRIMARY KEY Excludes (__IDExcludes__)
) ;

CREATE TABLE IncludesFile (
	__IDIncludesFile__ Integer NOT NULL,
	PRIMARY KEY IncludesFile (__IDIncludesFile__)
) ;

CREATE TABLE ExcludesFile (
	__IDExcludesFile__ Integer NOT NULL,
	PRIMARY KEY ExcludesFile (__IDExcludesFile__)
) ;

CREATE TABLE FileList (
	__IDFileList__ Integer NOT NULL,
	dir text,
	files text,
	PRIMARY KEY FileList (__IDFileList__)
) ;

CREATE TABLE Filter (
	__IDFilter__ Integer NOT NULL,
	token text,
	value text,
	PRIMARY KEY Filter (__IDFilter__)
) ;

CREATE TABLE FiltersFile (
	__IDFiltersFile__ Integer NOT NULL,
	file text,
	PRIMARY KEY FiltersFile (__IDFiltersFile__)
) ;

CREATE TABLE PathElement (
	__IDPathElement__ Integer NOT NULL,
	path text,
	location text,
	PRIMARY KEY PathElement (__IDPathElement__)
) ;

CREATE TABLE "Set" (
	__IDSet__ Integer NOT NULL,
	PRIMARY KEY "Set" (__IDSet__)
) ;

CREATE TABLE PatternSet (
	__IDPatternSet__ Integer NOT NULL,
	PRIMARY KEY PatternSet (__IDPatternSet__)
) ;

CREATE TABLE FileSet (
	__IDFileSet__ Integer NOT NULL,
	dir text,
	PRIMARY KEY FileSet (__IDFileSet__)
) ;

CREATE TABLE FilterSet (
	__IDFilterSet__ Integer NOT NULL,
	starttoken text,
	endtoken text,
	PRIMARY KEY FilterSet (__IDFilterSet__)
) ;

CREATE TABLE Path (
	__IDPath__ Integer NOT NULL,
	id text,
	refid text,
	FOREIGN KEY path (__FKpath__) REFERENCES Path (__IDPath__),
	PRIMARY KEY Path (__IDPath__),
	__FKpath__ Integer
) ;

CREATE TABLE ClassPath (
	__IDClassPath__ Integer NOT NULL,
	refid text,
	PRIMARY KEY ClassPath (__IDClassPath__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES Target (__IDTarget__),
	PRIMARY KEY Task (__IDTask__),
	__FKtarget__ Integer
) ;

CREATE TABLE TaskDef (
	__IDTaskDef__ Integer NOT NULL,
	name text,
	classname text,
	PRIMARY KEY TaskDef (__IDTaskDef__)
) ;

CREATE TABLE NewTask (
	__IDNewTask__ Integer NOT NULL,
	FOREIGN KEY taskName (__FKtaskName__) REFERENCES TaskDef (__IDTaskDef__),
	PRIMARY KEY NewTask (__IDNewTask__),
	__FKtaskName__ Integer
) ;

CREATE TABLE Attribut (
	__IDAttribut__ Integer NOT NULL,
	name text,
	value text,
	PRIMARY KEY Attribut (__IDAttribut__)
) ;

CREATE TABLE PreDefinedTask (
	__IDPreDefinedTask__ Integer NOT NULL,
	id text,
	taskname text,
	description text,
	PRIMARY KEY PreDefinedTask (__IDPreDefinedTask__)
) ;

CREATE TABLE ExecutionTask (
	__IDExecutionTask__ Integer NOT NULL,
	PRIMARY KEY ExecutionTask (__IDExecutionTask__)
) ;

CREATE TABLE Exec (
	__IDExec__ Integer NOT NULL,
	executable text,
	dir text,
	PRIMARY KEY Exec (__IDExec__)
) ;

CREATE TABLE Java (
	__IDJava__ Integer NOT NULL,
	classname text,
	jar text,
	fork text,
	FOREIGN KEY classPath (__FKclassPath__) REFERENCES ClassPath (__IDClassPath__),
	PRIMARY KEY Java (__IDJava__),
	__FKclassPath__ Integer
) ;

CREATE TABLE MiscellaneousTask (
	__IDMiscellaneousTask__ Integer NOT NULL,
	PRIMARY KEY MiscellaneousTask (__IDMiscellaneousTask__)
) ;

CREATE TABLE Echo (
	__IDEcho__ Integer NOT NULL,
	message text,
	file text,
	append text,
	PRIMARY KEY Echo (__IDEcho__)
) ;

CREATE TABLE Tstamp (
	__IDTstamp__ Integer NOT NULL,
	PRIMARY KEY Tstamp (__IDTstamp__)
) ;

CREATE TABLE FormatTstamp (
	__IDFormatTstamp__ Integer NOT NULL,
	property text,
	pattern text,
	offset text,
	unit text,
	locale text,
	PRIMARY KEY FormatTstamp (__IDFormatTstamp__)
) ;

CREATE TABLE CompileTask (
	__IDCompileTask__ Integer NOT NULL,
	PRIMARY KEY CompileTask (__IDCompileTask__)
) ;

CREATE TABLE Javac (
	__IDJavac__ Integer NOT NULL,
	srcdir text,
	destdir text,
	debug text,
	fork text,
	"optimize" text,
	deprecation text,
	FOREIGN KEY classPath (__FKclassPath__) REFERENCES ClassPath (__IDClassPath__),
	PRIMARY KEY Javac (__IDJavac__),
	__FKclassPath__ Integer
) ;

CREATE TABLE DocumentationTask (
	__IDDocumentationTask__ Integer NOT NULL,
	PRIMARY KEY DocumentationTask (__IDDocumentationTask__)
) ;

CREATE TABLE Javadoc (
	__IDJavadoc__ Integer NOT NULL,
	sourcepath text,
	destdir text,
	packagenames text,
	defaultexcludes text,
	author text,
	version text,
	"use" text,
	windowtitle text,
	PRIMARY KEY Javadoc (__IDJavadoc__)
) ;

CREATE TABLE ArchiveTask (
	__IDArchiveTask__ Integer NOT NULL,
	PRIMARY KEY ArchiveTask (__IDArchiveTask__)
) ;

CREATE TABLE Jar (
	__IDJar__ Integer NOT NULL,
	jarfile text,
	basedir text,
	compress text,
	encoding text,
	manifest text,
	PRIMARY KEY Jar (__IDJar__)
) ;

CREATE TABLE FileTask (
	__IDFileTask__ Integer NOT NULL,
	PRIMARY KEY FileTask (__IDFileTask__)
) ;

CREATE TABLE Mkdir (
	__IDMkdir__ Integer NOT NULL,
	dir text,
	PRIMARY KEY Mkdir (__IDMkdir__)
) ;

CREATE TABLE Copy (
	__IDCopy__ Integer NOT NULL,
	file text,
	presservelastmodified text,
	tofile text,
	todir text,
	overwrite text,
	filtering text,
	flatten text,
	includeEmptyDirs text,
	FOREIGN KEY fileset (__FKfileset__) REFERENCES FileSet (__IDFileSet__),
	FOREIGN KEY filterset (__FKfilterset__) REFERENCES FilterSet (__IDFilterSet__),
	FOREIGN KEY mapper (__FKmapper__) REFERENCES Mapper (__IDMapper__),
	PRIMARY KEY Copy (__IDCopy__),
	__FKmapper__ Integer,
	__FKfileset__ Integer,
	__FKfilterset__ Integer
) ;

CREATE TABLE "Delete" (
	__IDDelete__ Integer NOT NULL,
	file text,
	dir text,
	verbose text,
	quiet text,
	failonerror text,
	includeEmptyDirs text,
	includes text,
	includesfile text,
	excludes text,
	excludesfile text,
	defaultexcludes text,
	PRIMARY KEY "Delete" (__IDDelete__)
) ;

CREATE TABLE Javac_inExcludes_InExcludes (
	__IDJavac__ Integer NOT NULL,
	__IDInExcludes__ Integer NOT NULL
) ;

CREATE TABLE FileSet_exclude_Excludes (
	__IDFileSet__ Integer NOT NULL,
	__IDExcludes__ Integer NOT NULL
) ;

CREATE TABLE Path_fileset_FileSet (
	__IDPath__ Integer NOT NULL,
	__IDFileSet__ Integer NOT NULL
) ;

CREATE TABLE Project_targets_Target (
	__IDProject__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE ClassPath_pathElement_PathElement (
	__IDClassPath__ Integer NOT NULL,
	__IDPathElement__ Integer NOT NULL
) ;

CREATE TABLE Target_tasks_Task (
	__IDTarget__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE FileSet_include_Includes (
	__IDFileSet__ Integer NOT NULL,
	__IDIncludes__ Integer NOT NULL
) ;

CREATE TABLE Project_taskdef_TaskDef (
	__IDProject__ Integer NOT NULL,
	__IDTaskDef__ Integer NOT NULL
) ;

CREATE TABLE FileSet_patternset_PatternSet (
	__IDFileSet__ Integer NOT NULL,
	__IDPatternSet__ Integer NOT NULL
) ;

CREATE TABLE Tstamp_format_FormatTstamp (
	__IDTstamp__ Integer NOT NULL,
	__IDFormatTstamp__ Integer NOT NULL
) ;

CREATE TABLE Target_depends_Target (
	__IDTarget__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE PatternSet_inexcludes_InExcludes (
	__IDPatternSet__ Integer NOT NULL,
	__IDInExcludes__ Integer NOT NULL
) ;

CREATE TABLE NewTask_attributes_Attribut (
	__IDNewTask__ Integer NOT NULL,
	__IDAttribut__ Integer NOT NULL
) ;

CREATE TABLE FilterSet_filtersfile_FiltersFile (
	__IDFilterSet__ Integer NOT NULL,
	__IDFiltersFile__ Integer NOT NULL
) ;

CREATE TABLE ClassPath_fileset_FileSet (
	__IDClassPath__ Integer NOT NULL,
	__IDFileSet__ Integer NOT NULL
) ;

CREATE TABLE FilterSet_filter_Filter (
	__IDFilterSet__ Integer NOT NULL,
	__IDFilter__ Integer NOT NULL
) ;

CREATE TABLE Project_properties_Property (
	__IDProject__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Path_pathElement_PathElement (
	__IDPath__ Integer NOT NULL,
	__IDPathElement__ Integer NOT NULL
) ;
