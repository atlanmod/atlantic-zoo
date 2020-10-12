( defstruct VarScope )
( defstruct AbstractVar :scope :varUse )
( defstruct VarUse :var :lesser :instance :greater :term )
( defstruct MOF::Property :part )
( defstruct Key :transformation )
( defstruct PatternScope )
( defstruct PatternDefn :scope :body )
( defstruct TRule :transformation )
( defstruct Transformation )
( defstruct Query :term )
( defstruct Term )
( defstruct TRuleVar :scope :varUse )
( defstruct PatternVar :query :patternDefn :scope :varUse )
( defstruct ExtentVar :src :scope :varUse )
( defstruct CompoundTerm :term )
( defstruct AndTerm :term )
( defstruct OrTerm :term )
( defstruct NotTerm :term )
( defstruct IfTerm :term )
( defstruct SimpleTerm )
( defstruct TrackingUse :featureNames :tracking )
( defstruct MOF::Class )
( defstruct PatternUse )
( defstruct MofTerm )
( defstruct Condition :reason )
( defstruct MofInstance :isExactly :typeName :instance )
( defstruct MofOrder :lesser :instance :greater )
( defstruct Expression :lesser :instance :greater :term )
( defstruct CoumpoundExpr :lesser :instance :greater :term )
( defstruct CollectionExpr :unique :ordered :lesser :instance :greater :term )
( defstruct FunctionExpr :function :lesser :instance :greater :term )
( defstruct FeatureExpr :collect :featureName :lesser :instance :greater :term )
( defstruct InstanceRef :obj :lesser :instance :greater :term )
( defstruct MOF::Object :obj :lesser :instance :greater :term )
( defstruct SimpleExpr :representation :lesser :instance :greater :term )
( defstruct StringConstant :representation :lesser :instance :greater :term )
( defstruct IntConstant :representation :lesser :instance :greater :term )
( defstruct BooleanConstant :representation :lesser :instance :greater :term )
( defstruct EnumConstant :representation :lesser :instance :greater :term )