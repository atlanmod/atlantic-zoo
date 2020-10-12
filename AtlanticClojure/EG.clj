( defstruct ExecutionGraph :node :nodeNested )
( defstruct Node :executionGraph )
( defstruct Start :executionGraph )
( defstruct End :executionGraph )
( defstruct Control :executionGraph )
( defstruct Basic :executionGraph )
( defstruct Branch :executionGraph )
( defstruct Loop :executionGraph )
( defstruct Fork :executionGraph )
( defstruct Join :executionGraph )
( defstruct Acquire :executionGraph )
( defstruct Release :executionGraph )
( defstruct Split :executionGraph )
