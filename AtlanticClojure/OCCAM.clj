( defstruct OCCAM_Program )
( defstruct OCCAM_Element )
( defstruct Process :declaration :toChannel )
( defstruct Channel :name :type :toServer :toProcess )
( defstruct Action :constructor :while :if )
( defstruct Assignment :constructor :while :if )
( defstruct Input :constructor :while :if )
( defstruct Output :constructor :while :if )
( defstruct Constructor :process )
( defstruct Buckel :constructor )
( defstruct If :constructor )
( defstruct While :constructor )
( defstruct Condition :elementRight :elementLeft :typeCondition :if :while )
( defstruct Sequential :process )
( defstruct Parallel :process )
( defstruct Alternative :process )
( defstruct DataType :dataType )
( defstruct Library :name )
( defstruct File :name )
( defstruct Server :name :toChannel )
( defstruct Declaration :name :process )