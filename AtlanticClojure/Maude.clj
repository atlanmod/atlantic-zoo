( defstruct MaudeSpec )
( defstruct MaudeTopEl :name )
( defstruct ModExpression )
( defstruct InstModExp :modExp :views )
( defstruct RenModExp :modExp :renamings )
( defstruct CompModExp :modExps )
( defstruct ModuleIdModExp :module )
( defstruct TheoryIdModExp :theory )
( defstruct Parameter :label :modExp )
( defstruct Theory :name )
( defstruct FTheory :name )
( defstruct STheory :name )
( defstruct Module :name )
( defstruct FModule :name )
( defstruct SModule :name )
( defstruct ModElement )
( defstruct ModImportation :imports :mode )
( defstruct Type :name )
( defstruct Sort :kind :name )
( defstruct Kind :sorts :name )
( defstruct SubsortRel :subsorts :supersorts )
( defstruct Operation :name :coarity )
( defstruct Statement )
( defstruct Membership :term :sort )
( defstruct Equation :lhs :rhs )
( defstruct Rule )
( defstruct Condition :lhs )
( defstruct EquationalCond :lhs )
( defstruct RewriteCond :rhs :lhs )
( defstruct MembershipCond :rhs :lhs )
( defstruct BooleanCond :lhs )
( defstruct MatchingCond :rhs :lhs )
( defstruct EqualCond :rhs :lhs )
( defstruct Term :type )
( defstruct Constant :op :type )
( defstruct RecTerm :op :args :type )
( defstruct Variable :name :type )
( defstruct View :from :to :name )
( defstruct ViewMapping )
( defstruct RenMapping )
( defstruct TermMapping :from :to )
( defstruct SortMapping :from :to )
( defstruct OpTypedMapping :from :to )
( defstruct OpMapping :from :to )
( defstruct LabelMapping :from :to )