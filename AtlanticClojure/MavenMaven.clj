( defstruct Project :goals )
( defstruct Xmlns :name :value )
( defstruct AntProperty )
( defstruct AntPropertyName :name )
( defstruct AntPropertyValue :value :name )
( defstruct AntPropertyLocation :location :name )
( defstruct AntPropertyFile :file )
( defstruct AntPropertyEnv :environment )
( defstruct JellyCommand )
( defstruct JellySet :var :value )
( defstruct JellyForEach :items :var :indexVar :contents )
( defstruct AbstractGoal :contentsGoal )
( defstruct ContentsGoal )
( defstruct AttainGoal :attainGoal )
( defstruct PrePostGoal :contentsGoal )
( defstruct PreGoal :centralGoal :contentsGoal )
( defstruct PostGoal :centralGoal :contentsGoal )
( defstruct Goal :name :contentsGoal )
( defstruct Pattern )
( defstruct Basic )
( defstruct Mapper )
( defstruct InExcludes :name )
( defstruct Includes :name )
( defstruct Excludes :name )
( defstruct IncludesFile :name )
( defstruct ExcludesFile :name )
( defstruct FileList :dir :files )
( defstruct Filter :token :value )
( defstruct FiltersFile :file )
( defstruct PathElement :path :location )
( defstruct Set )
( defstruct PatternSet :inexcludes )
( defstruct FileSet :dir )
( defstruct FilterSet )
( defstruct Path :id )
( defstruct ClassPath :refid )
( defstruct Task )
( defstruct AntTaskDef :name :classname )
( defstruct NewTask :taskName )
( defstruct Attribut :name :value )
( defstruct PreDefinedTask )
( defstruct ExecutionTask )
( defstruct Exec :executable :dir )
( defstruct Java :classname )
( defstruct MiscellaneousTask )
( defstruct Echo :message )
( defstruct Tstamp )
( defstruct FormatTstamp :property :pattern )
( defstruct CompileTask )
( defstruct Javac :srcdir )
( defstruct DocumentationTask )
( defstruct Javadoc :sourcepath :destdir :packagenames :defaultexcludes :author :version :use :windowtitle )
( defstruct ArchiveTask )
( defstruct Jar :jarfile )
( defstruct FileTask )
( defstruct Mkdir :dir )
( defstruct Copy )
( defstruct Delete )
