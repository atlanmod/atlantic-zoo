( defstruct LocatedElement :location )
( defstruct SQLRoot :location )
( defstruct Statement :location )
( defstruct ViewStatement :name :columns :query :location )
( defstruct InsertStmt :tableName :location )
( defstruct QueryStmt :tables :location )
( defstruct QueryStmtCol :columns :tables :location )
( defstruct QueryStmtAllCol :tables :location )
( defstruct NamedElement :name :location )
( defstruct Table :alias :name :location )
( defstruct WhereClause :expression :location )
( defstruct Expression :location )
( defstruct BinaryExp :opName :leftExp :rightExp :location )
( defstruct OrExp :opName :leftExp :rightExp :location )
( defstruct AndExp :opName :leftExp :rightExp :location )
( defstruct NotExp :opName :valueExp :location )
( defstruct LikeExp :columnName :expression :location )
( defstruct InExp :columnName :elements :location )
( defstruct OperationExp :optName :opName :leftExp :rightExp :location )
( defstruct Predicate :location )
( defstruct QueryPredicate :query :location )
( defstruct ColumnExp :alias :type :location :name :location )
( defstruct ValueExp :location )
( defstruct StringValueExp :aValue :location )
( defstruct IntegerValueExp :aValue :location )
( defstruct ListExp :location )
( defstruct FunctionExp :name :location )
( defstruct DataType :name :location )