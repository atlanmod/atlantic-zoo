( defstruct Architecture :describedBy )
( defstruct ArchitectureDescription :selects :organizedBy )
( defstruct ArchitectureView :selectedBy :constituents :conformsTo )
( defstruct ArchitectureViewPoint :defines :views )
( defstruct MainView :isProjectedOnto :consistsOf )
( defstruct ModelElement )