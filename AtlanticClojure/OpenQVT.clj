( defstruct Variable :name :type :value :visibility :context )
( defstruct Context :rule )
( defstruct Rule :context :subRule :superRule )
( defstruct RootRule :ruleSet :context :subRule :superRule )
( defstruct RuleSetCall :ruleSet :context :subRule :superRule )
( defstruct QARule :query :action :context :subRule :superRule )
( defstruct RuleSet :rootRule )
( defstruct Service :visibility :signature :rule )
( defstruct OCLService :visibility :signature :rule )
( defstruct RTransService :visibility :signature :rule )
( defstruct JavaService :visibility :signature :rule )
( defstruct RulePart :service )
( defstruct Action :qARule :service )
( defstruct RTransAction :qARule :service )
( defstruct JavaAction :qARule :service )
( defstruct Query :qARule :service )
( defstruct OCLFilter :qARule :service )
( defstruct RTransQuery :qARule :service )
( defstruct JavaQuery :qARule :service )
( defstruct JavaFilter :qARule :service )