( defstruct Place :net )
( defstruct Transition :net :in :out )
( defstruct Net :place :transition )
( defstruct PTArc :dst :src )
( defstruct TPArc :src :dst )
