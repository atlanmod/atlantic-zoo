( defstruct Simulink )
( defstruct System :name :simulink :blocks :lines )
( defstruct Connector )
( defstruct Line :name :block :system )
( defstruct BranchPoint )
( defstruct Port :units )
( defstruct Block :description :name :priority :natagme :blockType :system )
( defstruct BlockRef )
( defstruct Primitive :deadLine :period :executionTime :description :name :priority :natagme :blockType :system )
( defstruct OutPut :number :units )
( defstruct TriggerPort :triggerType :units )
( defstruct EnablePort :statesWhenEnabling :units )
( defstruct Reference :sourceBlock :sourceType :description :name :priority :natagme :blockType :system )
( defstruct Annotation :text :block )
( defstruct Parameter :value :block )