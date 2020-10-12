( defstruct SeminarSchedulingSystem )
( defstruct Presenter :name :seminarSchedulingSystem )
( defstruct Seminar :title :seminarSchedulingSystem )
( defstruct Offering :is_cancelled :date )
( defstruct Date :year :month :day )
( defstruct Attendee :name )
