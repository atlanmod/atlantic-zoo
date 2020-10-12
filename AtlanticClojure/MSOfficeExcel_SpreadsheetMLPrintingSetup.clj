( defstruct DateTimeType :year :month :day :hour :minute :second )
( defstruct VersionType :n :nn )
( defstruct ValueType :vt_data )
( defstruct StringValue :value :vt_data )
( defstruct NumberValue :value :vt_data )
( defstruct DateTimeTypeValue :value :vt_data )
( defstruct BooleanValue :value :vt_data )
( defstruct ErrorValue :vt_data )
( defstruct DocumentPropertiesCollection :dp_workbook )
( defstruct CustomDocumentPropertiesCollection :cdp_workbook :customDocumentProperties )
( defstruct CustomDocumentProperty :customDocumentProperty_cdpe :name :value )
( defstruct SmartTagType :smartTagType_ste :namespaceuri :name )
( defstruct SmartTagsCollection :st_workbook :st_cell )
( defstruct Workbook )
( defstruct Worksheet :ws_workbook :name )
( defstruct StyledElement )
( defstruct Table :t_worksheet )
( defstruct TableElement )
( defstruct ColOrRowElement )
( defstruct Column :c_table )
( defstruct Row :r_table )
( defstruct Cell :c_row )
( defstruct Comment :c_cell :com_data )
( defstruct Data :d_cell :d_comment :value )
( defstruct ExcelWorkbook :ew_workbook )
( defstruct WorksheetOptionsElt :wo_worksheet )
( defstruct PageSetup :ps_worksheetOptions )
( defstruct Layout :l_pageSetup )
( defstruct HeaderOrFooterElt )
( defstruct Header :h_pageSetup )
( defstruct Footer :f_pageSetup )
( defstruct PageMarginsInfo :pm_pageSetup )
( defstruct Print :p_worksheetOptions )