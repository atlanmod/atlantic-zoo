( defstruct LQN :name :comment :author :created_On :modified_On :task :processor )
( defstruct Task :name :type :priority :mutliplicity :replicas :entry :processor :lqn :activity )
( defstruct Processor :name :scheduling :mutliplicity :replicas :spped :task :lqn )
( defstruct Entry :name :num_Phase :arrival_Rate :contained_In :replay_To :callreceives :callsends :phase :task )
( defstruct Phase :number :type :think_Time :execution_Demand :COV :entry :activity )
( defstruct Activity :name :arrival_Rate :contained_In :replay_To :linkPrecedes :linkfollows :phase :entry :task )
( defstruct Link :type :mean_Links :fromActivity :toActivity :activityPrecedes :activityfollows )
( defstruct CallPhase :mean_Calls :refers_To :call )
( defstruct Call :toEntry :num_Phases :type :callPhase :activity )
( defstruct EntryCall :from_Entry :toEntry :num_Phases :type :callPhase :activity )
( defstruct ActivityCall :fromActivity :toEntry :num_Phases :type :callPhase :activity )
( defstruct Date :day :month :year )
