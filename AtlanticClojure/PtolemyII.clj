( defstruct EDataType :value )
( defstruct NamedObject :name )
( defstruct Attribute :att_container :value :name )
( defstruct Entity :name )
( defstruct Port :po_container :name )
( defstruct Relation :name )
( defstruct Director :ca_container :name )
( defstruct Parameter :pa_container :dataType :att_container :value :name )
( defstruct ComponentPort :po_container :name )
( defstruct ComponentRelation :re_container :name )
( defstruct ComponentEntity :ce_container :att_container :value :name )
( defstruct AtomicActor :ce_container :att_container :value :name )
( defstruct CompositeEntity :ce_container :att_container :value :name )
( defstruct WorkSpace :ce_container :att_container :value :name )
( defstruct CompositeActor :ce_container :att_container :value :name )
