module Ant {

	type Project {
		Name_Att : Text;
		Basedir_Att : Text;
		Description_Att : Text;
		Default_Ref : Target;
		Path_ContRef : Path?;
		Properties_ContRef : Property*;
		Taskdef_ContRef : TaskDef*;
		Targets_ContRef : Target+;
	};

	type Property;

	type PropertyName : Property {
		Name_Att : Text;
	};

	type PropertyValue : PropertyName {
		Value_Att : Text;
	};

	type PropertyLocation : PropertyName {
		Location_Att : Text;
	};

	type PropertyFile : Property {
		File_Att : Text;
	};

	type PropertyEnv : Property {
		Environment_Att : Text;
	};

	type Target {
		Name_Att : Text;
		Description_Att : Text;
		Unless_Att : Text;
		IfCondition_Att : Text;
		Depends_Ref : Target*;
		Tasks_ContRef : Task*;
	};

	type Pattern;

	type Basic : Pattern;

	type Mapper : Basic {
		Type_Att : Text;
		Classname_Att : Text;
		Classpath_Att : Text;
		Classpathref_Att : Text;
		From_Att : Text;
		To_Att : Text;
	};

	type InExcludes : Basic {
		Name_Att : Text;
		IfCondition_Att : Text;
		Unless_Att : Text;
	};

	type Includes : InExcludes;

	type Excludes : InExcludes;

	type IncludesFile : InExcludes;

	type ExcludesFile : InExcludes;

	type FileList : Basic {
		Dir_Att : Text;
		Files_Att : Text;
	};

	type Filter : Basic {
		Token_Att : Text;
		Value_Att : Text;
	};

	type FiltersFile : Basic {
		File_Att : Text;
	};

	type PathElement : Basic {
		Path_Att : Text;
		Location_Att : Text;
	};

	type Set : Pattern;

	type PatternSet : Set {
		Inexcludes_ContRef : InExcludes+;
	};

	type FileSet : Set {
		Dir_Att : Text;
		Patternset_ContRef : PatternSet*;
		Include_ContRef : Includes*;
		Exclude_ContRef : Excludes*;
	};

	type FilterSet : Set {
		Starttoken_Att : Text;
		Endtoken_Att : Text;
		Filter_ContRef : Filter*;
		Filtersfile_ContRef : FiltersFile*;
	};

	type Path : Set {
		Id_Att : Text;
		Refid_Att : Text;
		Path_ContRef : Path?;
		PathElement_ContRef : PathElement*;
		Fileset_ContRef : FileSet*;
	};

	type ClassPath : Set {
		Refid_Att : Text;
		PathElement_ContRef : PathElement*;
		Fileset_ContRef : FileSet*;
	};

	type Task {
		Target_Ref : Target;
	};

	type TaskDef {
		Name_Att : Text;
		Classname_Att : Text;
	};

	type NewTask : Task {
		TaskName_Ref : TaskDef;
		Attributes_ContRef : Attribut*;
	};

	type Attribut {
		Name_Att : Text;
		Value_Att : Text;
	};

	type PreDefinedTask : Task {
		Id_Att : Text;
		Taskname_Att : Text;
		Description_Att : Text;
	};

	type ExecutionTask : PreDefinedTask;

	type Exec : ExecutionTask {
		Executable_Att : Text;
		Dir_Att : Text;
	};

	type Java : ExecutionTask {
		Classname_Att : Text;
		Jar_Att : Text;
		Fork_Att : Text;
		ClassPath_ContRef : ClassPath?;
	};

	type MiscellaneousTask : PreDefinedTask;

	type Echo : MiscellaneousTask {
		Message_Att : Text;
		File_Att : Text;
		Append_Att : Text;
	};

	type Tstamp : MiscellaneousTask {
		Format_ContRef : FormatTstamp*;
	};

	type FormatTstamp {
		Property_Att : Text;
		Pattern_Att : Text;
		Offset_Att : Text;
		Unit_Att : Text;
		Locale_Att : Text;
	};

	type CompileTask : PreDefinedTask;

	type Javac : CompileTask {
		Srcdir_Att : Text;
		Destdir_Att : Text;
		Debug_Att : Text;
		Fork_Att : Text;
		Optimize_Att : Text;
		Deprecation_Att : Text;
		InExcludes_ContRef : InExcludes*;
		ClassPath_ContRef : ClassPath?;
	};

	type DocumentationTask : PreDefinedTask;

	type Javadoc : DocumentationTask {
		Sourcepath_Att : Text;
		Destdir_Att : Text;
		Packagenames_Att : Text;
		Defaultexcludes_Att : Text;
		Author_Att : Text;
		Version_Att : Text;
		Use_Att : Text;
		Windowtitle_Att : Text;
	};

	type ArchiveTask : PreDefinedTask;

	type Jar : ArchiveTask {
		Jarfile_Att : Text;
		Basedir_Att : Text;
		Compress_Att : Text;
		Encoding_Att : Text;
		Manifest_Att : Text;
	};

	type FileTask : PreDefinedTask;

	type Mkdir : FileTask {
		Dir_Att : Text;
	};

	type Copy : FileTask {
		File_Att : Text;
		Presservelastmodified_Att : Text;
		Tofile_Att : Text;
		Todir_Att : Text;
		Overwrite_Att : Text;
		Filtering_Att : Text;
		Flatten_Att : Text;
		IncludeEmptyDirs_Att : Text;
		Fileset_ContRef : FileSet?;
		Filterset_ContRef : FilterSet?;
		Mapper_ContRef : Mapper?;
	};

	type Delete : FileTask {
		File_Att : Text;
		Dir_Att : Text;
		Verbose_Att : Text;
		Quiet_Att : Text;
		Failonerror_Att : Text;
		IncludeEmptyDirs_Att : Text;
		Includes_Att : Text;
		Includesfile_Att : Text;
		Excludes_Att : Text;
		Excludesfile_Att : Text;
		Defaultexcludes_Att : Text;
	};
}