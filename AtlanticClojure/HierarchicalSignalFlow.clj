( defstruct Port :asso_Port_Signalsrc :asso_Port_Signaldst )
( defstruct Signal :base :asso_Port_Signal )
( defstruct Base :compound )
( defstruct Compound :compound )
( defstruct InputPort :base :asso_Port_Signalsrc :asso_Port_Signaldst )
( defstruct OutputPort :base :asso_Port_Signalsrc :asso_Port_Signaldst )
( defstruct LocalPort :compound :asso_Port_Signalsrc :asso_Port_Signaldst )
( defstruct Primitive :compound )
( defstruct Asso_Port_Signal :src :dst :signal )
