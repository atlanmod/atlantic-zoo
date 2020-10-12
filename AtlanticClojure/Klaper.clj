( defstruct Resource :name :type :capacity :schedulingPolicy :description :acquire :release )
( defstruct Service :name :formalParams :speedAttr :failAttr :description :behavior )
( defstruct Behavior :stepn :stepb :service )
( defstruct WorkLoad :workLoadType :arrivalProcess :population :initialResource :behavior )
( defstruct Step :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct Start :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct End :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct Control :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct InternalActivity :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct ServiceCall :resourceType :serviceName :isSynch :step :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct ActualParam :value :serviceCall )
( defstruct Branch :branchProbs :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct Fork :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct Join :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct Acquire :resourceUnits :resource :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )
( defstruct Release :resourceUnits :resource :name :repetition :internalExecTime :internalFailProb :completionModel :behavior :stepn :stepb :service )