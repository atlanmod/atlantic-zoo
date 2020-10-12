( defstruct Task :id :name :category :frequency :importance :structurationLevel :complexityLevel :criticity :centrality :terminationValue :taskType :taskItem )
( defstruct Operator :id :name )
( defstruct BinaryOperator :type :leftTask :rightTask :id :name )
( defstruct UnaryOperator :UnaryType :decoratedTask :id :name )
( defstruct FiniteInteration :interation :UnaryType :decoratedTask :id :name )
