( defstruct Node :description :preliminary :object )
( defstruct Attribute :description :editable :key :value :name :node )
( defstruct Root :description :preliminary :object )
( defstruct Child :description :preliminary :object )
( defstruct XORGroup :preliminary :name )
( defstruct ORGroup :preliminary :name )