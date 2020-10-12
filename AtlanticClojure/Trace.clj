( defstruct Trace :name )
( defstruct Level :trace )
( defstruct Call :level :indexes :methodName :DBAccessesNumber :DBRowsNumber :CPUTime )
( defstruct Index :value )
