( defstruct Element )
( defstruct CPL )
( defstruct NodeContainer )
( defstruct SubAction :id )
( defstruct Outgoing )
( defstruct Incoming )
( defstruct NotPresent )
( defstruct Otherwise )
( defstruct SwitchedAddress )
( defstruct SwitchedString )
( defstruct SwitchedLanguage :matches )
( defstruct SwitchedTime :dtstart :interval :wkst )
( defstruct SwitchedPriority )
( defstruct Busy )
( defstruct NoAnswer )
( defstruct Redirection )
( defstruct Failure )
( defstruct Default )
( defstruct Node )
( defstruct Switch )
( defstruct AddressSwitch :field )
( defstruct StringSwitch :field )
( defstruct LanguageSwitch )
( defstruct TimeSwitch )
( defstruct PrioritySwitch )
( defstruct Location :url :clear )
( defstruct SubCall :ref )
( defstruct Action )
( defstruct SignallingAction )
( defstruct Proxy :recurse :ordering )
( defstruct Redirect :permanent )
( defstruct Reject :status )
