( defstruct LocatedElement :location )
( defstruct ACG :metamodel :startsWith :location )
( defstruct ACGElement :acg :location )
( defstruct Function :context :name :body :acg :location )
( defstruct Attribute :context :name :body :acg :location )
( defstruct Parameter :name :location )
( defstruct Node :element :acg :location :location )
( defstruct ASMNode :name :element :acg :location :location )
( defstruct CodeNode :element :acg :location :location )
( defstruct SimpleNode :element :acg :location :location )
( defstruct StatementBlock :location )
( defstruct Statement :location )
( defstruct CompoundStat :location :location )
( defstruct ForEachStat :iterator :collection :location :location )
( defstruct OnceStat :location :location )
( defstruct VariableStat :definition :name :location :location )
( defstruct OperationStat :context :name :location :location )
( defstruct ConditionalStat :condition :location :location )
( defstruct LetStat :variable :value :location :location )
( defstruct AnalyzeStat :target :location :location )
( defstruct ReportStat :severity :message :location )
( defstruct FieldStat :name :type :location )
( defstruct ParamStat :name :type :location )
( defstruct EmitStat :location )
( defstruct LabelStat :name :location )
( defstruct NewStat :location )
( defstruct DupStat :location )
( defstruct DupX1Stat :location )
( defstruct PopStat :location )
( defstruct SwapStat :location )
( defstruct IterateStat :location )
( defstruct EndIterateStat :location )
( defstruct GetAsmStat :location )
( defstruct FindMEStat :location )
( defstruct PushTStat :location )
( defstruct PushFStat :location )
( defstruct EmitWithOperandStat :operand :location )
( defstruct PushStat :operand :location )
( defstruct PushIStat :operand :location )
( defstruct PushDStat :operand :location )
( defstruct LoadStat :operand :location )
( defstruct StoreStat :operand :location )
( defstruct CallStat :operand :location )
( defstruct PCallStat :operand :location )
( defstruct SuperCallStat :operand :location )
( defstruct GetStat :operand :location )
( defstruct SetStat :operand :location )
( defstruct EmitWithLabelRefStat :label :location )
( defstruct IfStat :label :location )
( defstruct GotoStat :label :location )
( defstruct VariableDecl :name :location )
( defstruct Expression :location )
( defstruct VariableExp :variable :location )
( defstruct SelfExp :location )
( defstruct LastExp :location )
( defstruct IfExp :condition :thenExp :elseExp :location )
( defstruct IsAExp :source :type :location )
( defstruct LetExp :variable :value :in :location )
( defstruct PropertyCallExp :source :name :location )
( defstruct NavigationExp :source :name :location )
( defstruct IteratorExp :iterator :body :source :name :location )
( defstruct OperationCallExp :source :name :location )
( defstruct OperatorCallExp :source :name :location )
( defstruct LiteralExp :location )
( defstruct OclUndefinedExp :location )
( defstruct CollectionExp :location )
( defstruct SequenceExp :location )
( defstruct BooleanExp :value :location )
( defstruct IntegerExp :value :location )
( defstruct StringExp :value :location )
