CREATE TABLE FiniteAutomaton (
	__IDFiniteAutomaton__ Integer NOT NULL,
	FOREIGN KEY initialState (__FKinitialState__) REFERENCES State (__IDState__),
	PRIMARY KEY FiniteAutomaton (__IDFiniteAutomaton__),
	__FKinitialState__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	letter text,
	FOREIGN KEY source (__FKsource__) REFERENCES State (__IDState__),
	FOREIGN KEY target (__FKtarget__) REFERENCES State (__IDState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	name text,
	FOREIGN KEY combination (__FKcombination__) REFERENCES State (__IDState__),
	PRIMARY KEY State (__IDState__),
	__FKcombination__ Integer
) ;

CREATE TABLE FiniteAutomaton_StateSet_State (
	__IDFiniteAutomaton__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE FiniteAutomaton_finalStateSet_State (
	__IDFiniteAutomaton__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE FiniteAutomaton_transitionSet_Transition (
	__IDFiniteAutomaton__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
