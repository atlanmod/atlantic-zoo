( defstruct ValuedElement :value )
( defstruct Type :value )
( defstruct Title :value )
( defstruct Name :value )
( defstruct Date :value )
( defstruct Author :names )
( defstruct Adress :value )
( defstruct Organisation :names :adress :heading )
( defstruct Phone :value )
( defstruct Fax :value )
( defstruct EMail :value )
( defstruct Heading )
( defstruct Abstract :value )
( defstruct Keywords :value )
( defstruct SectionBody :section )
( defstruct Corps :sectionbody )
( defstruct Value :sectionbody :value )
( defstruct Cite :sectionbody :value )
( defstruct Path :value )
( defstruct Label :value )
( defstruct Figure :path :label :title :sectionbody )
( defstruct Item :value )
( defstruct Items :item :sectionbody )
( defstruct Enumerate :item :sectionbody )
( defstruct Section :title :sectionBody :sectionbody )
( defstruct Description :date :value )
( defstruct Citation :label :author :description :bibliography )
( defstruct Bibliography :citations :documentbody )
( defstruct DocumentBody :sections :document )
( defstruct Document :type :title :documentbody )
