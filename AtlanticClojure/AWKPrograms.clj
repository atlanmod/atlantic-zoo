( defstruct AWKProgram :name :input :output :script )
( defstruct File :name )
( defstruct Record :r_file )
( defstruct Field :value :f_record )
( defstruct Script :name )
( defstruct Rule :r_script :pattern :action )
( defstruct Pattern :regularExpression )
( defstruct Action )
( defstruct Instruction :value :i_action )
( defstruct InitialRule :r_script :pattern :action )
( defstruct FinalRule :r_script :pattern :action )
