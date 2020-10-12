( defstruct Strong )
( defstruct Start )
( defstruct End )
( defstruct FeedBack )
( defstruct Weak :precs )
( defstruct Grouping :precs )
( defstruct Precedence )
( defstruct DynPrecedence )
( defstruct DerPrecedence :precs )
( defstruct BasPrecedence )
( defstruct MetaTaskOccurence :dependencyUMLsupp :dependencyUMLcli )
( defstruct ParBinding :inclusion :precs :targetPar :sourcePar )
( defstruct ParameterPrec :parbindsTar :parbindsSour :dstParams :orParams :task :doc )
( defstruct ModelElement :dependencyUMLsupp :dependencyUMLcli )
( defstruct DependancyUML :suppier :client )
( defstruct MetaTask :params :dependencyUMLsupp :dependencyUMLcli )
( defstruct ParameterUML :task :doc )
( defstruct MetaDocument :params )