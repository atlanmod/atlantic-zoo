( defstruct Element :name )
( defstruct IEEE1471Model :system :environment :architecture :architecturalDescription :rationale :name )
( defstruct System :fulfils :inhabits :hasAn :has :name )
( defstruct Mission :name )
( defstruct Environment :influences :name )
( defstruct Architecture :describedBy :name )
( defstruct Rationale :provides :name )
( defstruct ArchitecturalDescription :identifiesS :identifiesC :selects :organizedBy :aggregates :name )
( defstruct View :conformsTo :consitsOf :name )
( defstruct Model :participatesInV :participatesInAD :name )
( defstruct Stakeholder :has :name )
( defstruct Concern :isImportantTo :name )
( defstruct Viewpoint :usedToCover :establishesMethodsFor :name )
( defstruct LibraryViewpoint :name )
