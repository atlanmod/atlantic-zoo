( defstruct ModelElement :constraint )
( defstruct Constraint :constrainedElement :body :constraint )
( defstruct Expression )
( defstruct BooleanExpression )
( defstruct OCLExpression )
( defstruct PreCondition :constrainedElement :body :constraint )
( defstruct PortCondition :constrainedElement :body :constraint )
( defstruct Invariant :constrainedElement :body :constraint )
( defstruct Guard :constrainedElement :body :constraint )
