( defstruct PLIClassifier :name )
( defstruct PLISimpleType :alias :name )
( defstruct PLINamedType :name )
( defstruct PLIComposedType :name )
( defstruct PLIAlias :type :contains )
( defstruct PLIAttribute )
( defstruct PLIComputationalType :alias :name )
( defstruct PLINonComputationalType :alias :name )
( defstruct PLIElement :level :name :source )
( defstruct PLIElementInitialValue :initialValue )
( defstruct PLISourceText :source :fileName )
( defstruct PLIArray )
( defstruct PLIFixedBoundArray :IBound :uBound :referredTo )
( defstruct PLIFixedLboundArray :IBound :uBoundToAllocate :referredTo )
( defstruct PLIHBoundArray :uBound :IBoundToAllocate :referredTo )
( defstruct PLIVariableBoundArray :IBoundToAllocate :hBoundToAllocate :referredTo )