( defstruct Port :name :service :binding )
( defstruct Service :name )
( defstruct Param :name :message )
( defstruct Input :operation :name :message )
( defstruct Output :operation :name :message )
( defstruct PortType :name )
( defstruct Operation :name :type )
( defstruct StartWithExtensions )
( defstruct Binding :name :type )
( defstruct BindingFault :operation :binding )
( defstruct BindingOperation :name :bind :binding )
( defstruct Fault :name :operation :message )
( defstruct Message :name )
( defstruct Part :name :message )