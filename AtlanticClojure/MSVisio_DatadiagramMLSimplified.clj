( defstruct CellType )
( defstruct VisioDocument )
( defstruct PageSheet :ss_shapes :me_master :pe_page )
( defstruct NamedElt )
( defstruct IdentifiedElt :ID )
( defstruct UniqueIdElt )
( defstruct Shape :ss_shapes )
( defstruct ShapeElt :sse_shapeSheet )
( defstruct IXElt )
( defstruct DelElt )
( defstruct Geom :sse_shapeSheet )
( defstruct XYElt )
( defstruct LineTo :lt_geom )
( defstruct MoveTo :mt_geom )
( defstruct XYAElt )
( defstruct ArcTo :ac_geom )
( defstruct SplineKnot :sk_geom )
( defstruct PolylineTo :pt_geom )
( defstruct XYABElt )
( defstruct InfiniteLine :il_geom )
( defstruct XYABCDElt )
( defstruct Ellipse :e_geom )
( defstruct EllipticalArcTo :eat_geom )
( defstruct SplineStart :ss_geom )
( defstruct XYABCDEElt )
( defstruct NURBSTo :nt_geom )
( defstruct Text :sse_shapeSheet )
( defstruct TextElt :te_text )
( defstruct StringElt :value :te_text )
( defstruct MastersCollection :ms_visioDocument )
( defstruct MasterShortCut :m_masterShortCuts :ID )
( defstruct Icon :i_masterShortCut :value :me_master )
( defstruct Master :m_masters :ID )
( defstruct ShapesCollection :me_master :pe_page )
( defstruct ConnectsCollection :me_master :pe_page )
( defstruct Connect :c_connects :fromSheet :toSheet )
( defstruct MasterElt :me_master )
( defstruct PagesCollection :ps_visioDocument )
( defstruct Page :p_pages :ID )
( defstruct PageElt :pe_page )
