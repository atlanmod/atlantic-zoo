( defstruct ClientPage :hyperlink )
( defstruct ClientPageModule :consistsOf )
( defstruct LogicInterface :consistsOf )
( defstruct DesignElement :consistsOf )
( defstruct HyperLink )
( defstruct ServerPage :useBusinessLogic :useDesignTemplate )
( defstruct BusinessLogic )
( defstruct DesignTemplate )
