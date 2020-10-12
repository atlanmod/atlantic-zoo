( defstruct ArtifactUsageName :isInput :isOutput :hasWorkPerArtifact :artifactKind :workDefinition )
( defstruct ProcessDefinitionElement )
( defstruct Guidance :processDefinitionElements )
( defstruct ArtifactKind )
( defstruct WorkItem )
( defstruct RoleKind )
( defstruct Condition )
( defstruct ProcessComponent )
( defstruct Goal :workDefinition )
( defstruct Precondition :workDefinition )
( defstruct WorkDefinition )
( defstruct ActivityKind :performer )
( defstruct Iteration )
( defstruct Phase )
( defstruct Lifecycle )
