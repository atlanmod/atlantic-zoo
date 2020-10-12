grammar WikiMediaTable_ANTLR3;@header {package org.eclipse.gmt.tcs.injector;}@lexer::header {package org.eclipse.gmt.tcs.injector;}@lexer::members {

	private void newline() {}

	public org.eclipse.gmt.tcs.injector.TCSRuntime ei = null;

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		ei.reportError((Exception)e);
	}

	public Token emit() {
		org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken ret = null;

		ret = new org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken(input, type, channel, tokenStartCharIndex, getCharIndex()-1);
		ret.setLine(tokenStartLine);
		ret.setText(text);
	  	ret.setCharPositionInLine(tokenStartCharPositionInLine);
		ret.setEndLine(getLine());
		ret.setEndColumn(getCharPositionInLine());
		emit(ret);

		return ret;
	}

} @members {
    public org.eclipse.gmt.tcs.injector.TCSRuntime ei = null;
    
//	public void reportError(RecognitionException ex) {
//		ei.reportError((Exception)ex);
//	}
	
//	public void emitErrorMessage(String s) {
//		ei.reportError(s);
//	}

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		ei.reportError((Exception)e);
	}

	//TODO: what about warnings?
//	public void reportWarning(String s) {
//		ei.reportWarning(s);
//	}
	
    public static void main(String[] args) throws Exception {
						CharStream input = new ANTLRFileStream(args[0]);
    WikiMediaTable_ANTLR3Lexer lex = new 
    WikiMediaTable_ANTLR3Lexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lex);
						tokens.discardTokenType(WS);
						tokens.discardTokenType(COMMENT);
						tokens.discardTokenType(NL);
						
    WikiMediaTable_ANTLR3Parser parser = new 
    WikiMediaTable_ANTLR3Parser(tokens);
						parser.main();
					}
}

main returns[Object ret2] @init {}
	:	((ret=table) EOF)
        {
            ret2=ret;
        }

	;

identifier returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=NAME {ret = ast.getText(); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

stringSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=STRING {ret = ei.unescapeString(ast.getText(), 1); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

integerSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=INT {ret = Integer.valueOf(ast.getText()); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

floatSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=FLOAT {ret = Double.valueOf(ast.getText()); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

table returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Table", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('{|' (('border="' temp=integerSymbol {ei.set(ret, "border", temp);} '"') {}| () {}) (('style="' temp=identifier {ei.set(ret, "style", temp);} '"') {}| () {}) (('class="' temp=identifier {ei.set(ret, "class", temp);} '"') {}| () {}) '
' ((temp=row {ei.set(ret, "rows", temp);} ((temp=row {ei.set(ret, "rows", temp);}))*))? '|}')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

row returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Row", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('|-' '
' ((temp=cell {ei.set(ret, "cells", temp);} ((temp=cell {ei.set(ret, "cells", temp);}))*))?)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

cell returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Cell", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(((' ! ') {ei.set(ret, "isHeading", java.lang.Boolean.TRUE);}| (' | ') {ei.set(ret, "isHeading", java.lang.Boolean.FALSE);}) (('style="' temp=identifier {ei.set(ret, "style", temp);} '"|') {}| () {}) temp=identifier {ei.set(ret, "content", temp);} '
')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

	
// testLiterals = false;

NL
	:	(	'\r' '\n'
		|	'\n' '\r'	//Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;

WS
	:	(	' '
		|	'\t'
		)
	;

fragment
DIGIT
	:	'0'..'9'
	;

fragment
ALPHA
	:	'a'..'z'
	|	'A'..'Z'
	|	'_'
	//For Unicode compatibility (from 0000 to 00ff)
	|	'\u00C0' .. '\u00D6'
	|	'\u00D8' .. '\u00F6'
	|	'\u00F8' .. '\u00FF'
	;

fragment
SNAME
//	options {
//		testLiterals = true;
//	}
	:	(ALPHA) (ALPHA | DIGIT)*
;

NAME
	:	(
			SNAME
//			s:SNAME {if(s.getType() != SNAME) $setType(s.getType());}
		|	'"'!
			(	ESC
			|	'\n' {newline();}
			|	~('\\'|'\"'|'\n')
			)*
			'"'!
			{setText(ei.unescapeString(getText(), 1));}
		)
	;

INT
	:	(DIGIT)+
//		(('.' DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
	;

	FLOAT	:	DIGIT+ '.' DIGIT*	;

fragment
ESC
	:	'\\'!
		(	'n' //{setText("\n");}
		|	'r' //{setText("\r");}
		|	't' //{setText("\t");}
		|	'b' //{setText("\b");}
		|	'f' //{setText("\f");}
		|	'"' //{setText("\"");}
		|	'\'' //{setText("\'");}
		|	'\\' //{setText("\\");}
		|	(
				('0'..'3')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
					(
//						options {
//							warnWhenFollowAmbig = false;
//						}
					:	'0'..'7'
					)?
				)?
			|	('4'..'7')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
				)?
			)
				{
//					String s = getText();
//					int i;
//					int ret = 0;
//					String ans;
//					for (i=0; i<s.length(); ++i)
//						ret = ret*8 + s.charAt(i) - '0';
//					ans = String.valueOf((char) ret);
//					setText(ans);
				}
		)
	;
	

LSQUARE @init {}
	:	'['
        {
            
        }

	;

RSQUARE @init {}
	:	']'
        {
            
        }

	;

EXCL @init {}
	:	'!'
        {
            
        }

	;

COMA @init {}
	:	','
        {
            
        }

	;

LPAREN @init {}
	:	'('
        {
            
        }

	;

RPAREN @init {}
	:	')'
        {
            
        }

	;

LCURLY @init {}
	:	'{'
        {
            
        }

	;

RCURLY @init {}
	:	'}'
        {
            
        }

	;

SEMI @init {}
	:	';'
        {
            
        }

	;

COLON @init {}
	:	':'
        {
            
        }

	;

PIPE @init {}
	:	'|'
        {
            
        }

	;

SHARP @init {}
	:	'#'
        {
            
        }

	;

QMARK @init {}
	:	'?'
        {
            
        }

	;

COLONCOLON @init {}
	:	'::'
        {
            
        }

	;

POINT @init {}
	:	'.'
        {
            
        }

	;

RARROW @init {}
	:	'->'
        {
            
        }

	;

MINUS @init {}
	:	'-'
        {
            
        }

	;

STAR @init {}
	:	'*'
        {
            
        }

	;

SLASH @init {}
	:	'/'
        {
            
        }

	;

PLUS @init {}
	:	'+'
        {
            
        }

	;

EQ @init {}
	:	'='
        {
            
        }

	;

GT @init {}
	:	'>'
        {
            
        }

	;

LT @init {}
	:	'<'
        {
            
        }

	;

GE @init {}
	:	'>='
        {
            
        }

	;

LE @init {}
	:	'<='
        {
            
        }

	;

NE @init {}
	:	'<>'
        {
            
        }

	;

LARROW @init {}
	:	'<-'
        {
            
        }

	;

COMMENT @init {}
	:	(('--' (~('\r'| '\n'))*))
        {
            
        }

	;

STRING @init {}
	:	(('\'' (options {greedy = false;} : (('\\'! ~ '\n')| '\n'| ~('\\'| '\n')))* '\''))
        {
            
        }

	;
