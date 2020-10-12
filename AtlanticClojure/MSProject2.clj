( defstruct MSPProject )
( defstruct MSPTask :finishDate :startDate :project )
( defstruct MSPLink :project :succ :pred )
( defstruct MSPAssignment :task :resource )
( defstruct MSPResource :cost :project )
( defstruct MSPHumanResource :email :cost :project )
( defstruct MSPMachine :cost :project )
( defstruct Date :day :month :year )
