( defstruct Place :net )
( defstruct Transition :net :in :out )
( defstruct Net :place :transition )
( defstruct Arc :weight )
( defstruct PTArc :dst :src :weight )
( defstruct TPArc :src :dst :weight )
( defstruct Token :place )
