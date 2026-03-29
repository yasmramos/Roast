// Generated from io/github/yasmramos/roast/parser/Roast.g4 by ANTLR 4.13.1
package io.github.yasmramos.roast.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RoastParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, VAL=2, IDENTIFIER=3, ASSIGN=4, VAR=5, DOT=6, TYPE_INT=7, TYPE_FLOAT=8, 
		TYPE_DOUBLE=9, TYPE_LONG=10, TYPE_BYTE=11, TYPE_SHORT=12, TYPE_CHAR=13, 
		TYPE_BOOLEAN=14, TYPE_STRING=15, TYPE_ANY=16, TYPE_UNIT=17, TYPE_NOTHING=18, 
		LPAREN=19, RPAREN=20, ARROW=21, QUESTION=22, EXCLAMATION=23, LBRACK=24, 
		RBRACK=25, LT=26, COMMA=27, GT=28, FUN=29, COLON=30, EXTERNAL=31, INLINE=32, 
		TAILREC=33, SUSPEND=34, VARARG=35, CLASS=36, OBJECT=37, COMPANION=38, 
		DATA=39, SEALED=40, ENUM=41, INTERFACE=42, PRIVATE=43, PROTECTED=44, PUBLIC=45, 
		INTERNAL=46, LBRACE=47, RBRACE=48, GET=49, SET=50, INIT=51, CONSTRUCTOR=52, 
		THIS=53, SUPER=54, IF=55, ELSE=56, WHEN=57, IN=58, NOT_IN=59, IS=60, NOT_IS=61, 
		WHILE=62, FOR=63, RETURN=64, BREAK=65, CONTINUE=66, THROW=67, TRY=68, 
		CATCH=69, FINALLY=70, PLUS=71, MINUS=72, LAMBDA=73, AT=74, POW=75, STAR=76, 
		SLASH=77, PERCENT=78, LTE=79, GTE=80, EQEQ=81, BANGEQ=82, ANDAND=83, OROR=84, 
		ELVIS=85, QMARKQMARK=86, QMARK=87, AS=88, ASQ=89, BANG=90, DOUBLECOLON=91, 
		INTEGER_LITERAL=92, FLOAT_LITERAL=93, DOUBLE_LITERAL=94, LONG_LITERAL=95, 
		BYTE_LITERAL=96, SHORT_LITERAL=97, CHAR_LITERAL=98, STRING_LITERAL=99, 
		BOOLEAN_LITERAL=100, KW_NULL=101, UNIT=102;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expressionStatement = 2, RULE_variableDeclaration = 3, 
		RULE_assignment = 4, RULE_type = 5, RULE_functionDeclaration = 6, RULE_parameters = 7, 
		RULE_parameter = 8, RULE_classDeclaration = 9, RULE_interfaceDeclaration = 10, 
		RULE_typeVariable = 11, RULE_primaryConstructor = 12, RULE_constructorParameters = 13, 
		RULE_constructorParameter = 14, RULE_delegationSpecifiers = 15, RULE_classBody = 16, 
		RULE_interfaceBody = 17, RULE_enumEntries = 18, RULE_enumEntry = 19, RULE_enumClassBody = 20, 
		RULE_classMemberDeclaration = 21, RULE_interfaceMemberDeclaration = 22, 
		RULE_propertyDeclaration = 23, RULE_getter = 24, RULE_setter = 25, RULE_initializerBlock = 26, 
		RULE_secondaryConstructor = 27, RULE_thisOrSuperCall = 28, RULE_nestedClass = 29, 
		RULE_companionObject = 30, RULE_ifStatement = 31, RULE_whenStatement = 32, 
		RULE_whenEntry = 33, RULE_whenCondition = 34, RULE_whileStatement = 35, 
		RULE_forStatement = 36, RULE_returnStatement = 37, RULE_breakStatement = 38, 
		RULE_continueStatement = 39, RULE_throwStatement = 40, RULE_tryCatchStatement = 41, 
		RULE_catchBlock = 42, RULE_finallyBlock = 43, RULE_expression = 44, RULE_functionCall = 45, 
		RULE_block = 46, RULE_literal = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expressionStatement", "variableDeclaration", 
			"assignment", "type", "functionDeclaration", "parameters", "parameter", 
			"classDeclaration", "interfaceDeclaration", "typeVariable", "primaryConstructor", 
			"constructorParameters", "constructorParameter", "delegationSpecifiers", 
			"classBody", "interfaceBody", "enumEntries", "enumEntry", "enumClassBody", 
			"classMemberDeclaration", "interfaceMemberDeclaration", "propertyDeclaration", 
			"getter", "setter", "initializerBlock", "secondaryConstructor", "thisOrSuperCall", 
			"nestedClass", "companionObject", "ifStatement", "whenStatement", "whenEntry", 
			"whenCondition", "whileStatement", "forStatement", "returnStatement", 
			"breakStatement", "continueStatement", "throwStatement", "tryCatchStatement", 
			"catchBlock", "finallyBlock", "expression", "functionCall", "block", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "VAL", "IDENTIFIER", "ASSIGN", "VAR", "DOT", "TYPE_INT", 
			"TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_LONG", "TYPE_BYTE", "TYPE_SHORT", 
			"TYPE_CHAR", "TYPE_BOOLEAN", "TYPE_STRING", "TYPE_ANY", "TYPE_UNIT", 
			"TYPE_NOTHING", "LPAREN", "RPAREN", "ARROW", "QUESTION", "EXCLAMATION", 
			"LBRACK", "RBRACK", "LT", "COMMA", "GT", "FUN", "COLON", "EXTERNAL", 
			"INLINE", "TAILREC", "SUSPEND", "VARARG", "CLASS", "OBJECT", "COMPANION", 
			"DATA", "SEALED", "ENUM", "INTERFACE", "PRIVATE", "PROTECTED", "PUBLIC", 
			"INTERNAL", "LBRACE", "RBRACE", "GET", "SET", "INIT", "CONSTRUCTOR", 
			"THIS", "SUPER", "IF", "ELSE", "WHEN", "IN", "NOT_IN", "IS", "NOT_IS", 
			"WHILE", "FOR", "RETURN", "BREAK", "CONTINUE", "THROW", "TRY", "CATCH", 
			"FINALLY", "PLUS", "MINUS", "LAMBDA", "AT", "POW", "STAR", "SLASH", "PERCENT", 
			"LTE", "GTE", "EQEQ", "BANGEQ", "ANDAND", "OROR", "ELVIS", "QMARKQMARK", 
			"QMARK", "AS", "ASQ", "BANG", "DOUBLECOLON", "INTEGER_LITERAL", "FLOAT_LITERAL", 
			"DOUBLE_LITERAL", "LONG_LITERAL", "BYTE_LITERAL", "SHORT_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_LITERAL", "KW_NULL", "UNIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Roast.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoastParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RoastParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4404370937939492948L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549487380383L) != 0)) {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclStmtContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterClassDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitClassDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitClassDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclStmtContext extends StatementContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterInterfaceDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitInterfaceDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitInterfaceDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStmtContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public VarDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitVarDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclStmtContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FuncDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFuncDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFuncDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFuncDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public AssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStmtContext extends StatementContext {
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public ThrowStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterThrowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitThrowStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitThrowStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhenStmtContext extends StatementContext {
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public WhenStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterWhenStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitWhenStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitWhenStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStmtContext extends StatementContext {
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public TryCatchStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterTryCatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitTryCatchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitTryCatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				variableDeclaration();
				setState(105);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new FuncDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				functionDeclaration();
				}
				break;
			case 3:
				_localctx = new ClassDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				classDeclaration();
				}
				break;
			case 4:
				_localctx = new InterfaceDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				interfaceDeclaration();
				}
				break;
			case 5:
				_localctx = new AssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				assignment();
				setState(111);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				returnStatement();
				setState(114);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				ifStatement();
				}
				break;
			case 8:
				_localctx = new WhenStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				whenStatement();
				}
				break;
			case 9:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				whileStatement();
				}
				break;
			case 10:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				forStatement();
				}
				break;
			case 11:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				breakStatement();
				setState(121);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(123);
				continueStatement();
				setState(124);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(126);
				expressionStatement();
				}
				break;
			case 14:
				_localctx = new TryCatchStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(127);
				tryCatchStatement();
				}
				break;
			case 15:
				_localctx = new ThrowStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(128);
				throwStatement();
				setState(129);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			expression(0);
			setState(134);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImmutableVarContext extends VariableDeclarationContext {
		public TerminalNode VAL() { return getToken(RoastParser.VAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImmutableVarContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterImmutableVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitImmutableVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitImmutableVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedVarContext extends VariableDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypedVarContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterTypedVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitTypedVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitTypedVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MutableVarContext extends VariableDeclarationContext {
		public TerminalNode VAR() { return getToken(RoastParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MutableVarContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterMutableVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitMutableVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitMutableVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL:
				_localctx = new ImmutableVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(VAL);
				setState(137);
				match(IDENTIFIER);
				setState(138);
				match(ASSIGN);
				setState(139);
				expression(0);
				}
				break;
			case VAR:
				_localctx = new MutableVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(VAR);
				setState(141);
				match(IDENTIFIER);
				setState(142);
				match(ASSIGN);
				setState(143);
				expression(0);
				}
				break;
			case IDENTIFIER:
			case TYPE_INT:
			case TYPE_FLOAT:
			case TYPE_DOUBLE:
			case TYPE_LONG:
			case TYPE_BYTE:
			case TYPE_SHORT:
			case TYPE_CHAR:
			case TYPE_BOOLEAN:
			case TYPE_STRING:
			case TYPE_ANY:
			case TYPE_UNIT:
			case TYPE_NOTHING:
			case LPAREN:
				_localctx = new TypedVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				type(0);
				setState(145);
				match(IDENTIFIER);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(146);
					match(ASSIGN);
					setState(147);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(RoastParser.DOT, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(IDENTIFIER);
				setState(153);
				match(ASSIGN);
				setState(154);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				expression(0);
				setState(156);
				match(DOT);
				setState(157);
				match(IDENTIFIER);
				setState(158);
				match(ASSIGN);
				setState(159);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomTypeContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public CustomTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCustomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCustomType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCustomType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LT() { return getToken(RoastParser.LT, 0); }
		public TerminalNode GT() { return getToken(RoastParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public GenericTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LongTypeContext extends TypeContext {
		public TerminalNode TYPE_LONG() { return getToken(RoastParser.TYPE_LONG, 0); }
		public LongTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterLongType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitLongType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitLongType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedTypeContext extends TypeContext {
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public ParenthesizedTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitParenthesizedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends TypeContext {
		public TerminalNode TYPE_STRING() { return getToken(RoastParser.TYPE_STRING, 0); }
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortTypeContext extends TypeContext {
		public TerminalNode TYPE_SHORT() { return getToken(RoastParser.TYPE_SHORT, 0); }
		public ShortTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterShortType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitShortType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitShortType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(RoastParser.ARROW, 0); }
		public FunctionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends TypeContext {
		public TerminalNode TYPE_BOOLEAN() { return getToken(RoastParser.TYPE_BOOLEAN, 0); }
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByteTypeContext extends TypeContext {
		public TerminalNode TYPE_BYTE() { return getToken(RoastParser.TYPE_BYTE, 0); }
		public ByteTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterByteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitByteType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitByteType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullableTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RoastParser.QUESTION, 0); }
		public NullableTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitNullableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitNullableType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public TerminalNode TYPE_INT() { return getToken(RoastParser.TYPE_INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends TypeContext {
		public TerminalNode TYPE_FLOAT() { return getToken(RoastParser.TYPE_FLOAT, 0); }
		public FloatTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(RoastParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(RoastParser.RBRACK, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleTypeContext extends TypeContext {
		public TerminalNode TYPE_DOUBLE() { return getToken(RoastParser.TYPE_DOUBLE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitTypeContext extends TypeContext {
		public TerminalNode TYPE_UNIT() { return getToken(RoastParser.TYPE_UNIT, 0); }
		public UnitTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitUnitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitUnitType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends TypeContext {
		public TerminalNode TYPE_CHAR() { return getToken(RoastParser.TYPE_CHAR, 0); }
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlatformTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(RoastParser.EXCLAMATION, 0); }
		public PlatformTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterPlatformType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitPlatformType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitPlatformType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyTypeContext extends TypeContext {
		public TerminalNode TYPE_ANY() { return getToken(RoastParser.TYPE_ANY, 0); }
		public AnyTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitAnyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitAnyType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NothingTypeContext extends TypeContext {
		public TerminalNode TYPE_NOTHING() { return getToken(RoastParser.TYPE_NOTHING, 0); }
		public NothingTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterNothingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitNothingType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitNothingType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				{
				_localctx = new IntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				match(TYPE_INT);
				}
				break;
			case TYPE_FLOAT:
				{
				_localctx = new FloatTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(TYPE_FLOAT);
				}
				break;
			case TYPE_DOUBLE:
				{
				_localctx = new DoubleTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(TYPE_DOUBLE);
				}
				break;
			case TYPE_LONG:
				{
				_localctx = new LongTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(TYPE_LONG);
				}
				break;
			case TYPE_BYTE:
				{
				_localctx = new ByteTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(TYPE_BYTE);
				}
				break;
			case TYPE_SHORT:
				{
				_localctx = new ShortTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(TYPE_SHORT);
				}
				break;
			case TYPE_CHAR:
				{
				_localctx = new CharTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(TYPE_CHAR);
				}
				break;
			case TYPE_BOOLEAN:
				{
				_localctx = new BooleanTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(TYPE_BOOLEAN);
				}
				break;
			case TYPE_STRING:
				{
				_localctx = new StringTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(TYPE_STRING);
				}
				break;
			case TYPE_ANY:
				{
				_localctx = new AnyTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(TYPE_ANY);
				}
				break;
			case TYPE_UNIT:
				{
				_localctx = new UnitTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(TYPE_UNIT);
				}
				break;
			case TYPE_NOTHING:
				{
				_localctx = new NothingTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(TYPE_NOTHING);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new CustomTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesizedTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(LPAREN);
				setState(178);
				type(0);
				setState(179);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new FunctionTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						match(ARROW);
						setState(185);
						type(3);
						}
						break;
					case 2:
						{
						_localctx = new NullableTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						match(QUESTION);
						}
						break;
					case 3:
						{
						_localctx = new PlatformTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(EXCLAMATION);
						}
						break;
					case 4:
						{
						_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
						match(LBRACK);
						setState(192);
						match(RBRACK);
						}
						break;
					case 5:
						{
						_localctx = new GenericTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(193);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(194);
						match(LT);
						setState(195);
						type(0);
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(196);
							match(COMMA);
							setState(197);
							type(0);
							}
							}
							setState(202);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(203);
						match(GT);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineFuncContext extends FunctionDeclarationContext {
		public TerminalNode INLINE() { return getToken(RoastParser.INLINE, 0); }
		public TerminalNode FUN() { return getToken(RoastParser.FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InlineFuncContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterInlineFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitInlineFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitInlineFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuspendFuncContext extends FunctionDeclarationContext {
		public TerminalNode SUSPEND() { return getToken(RoastParser.SUSPEND, 0); }
		public TerminalNode FUN() { return getToken(RoastParser.FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SuspendFuncContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSuspendFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSuspendFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSuspendFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExternalFuncContext extends FunctionDeclarationContext {
		public TerminalNode EXTERNAL() { return getToken(RoastParser.EXTERNAL, 0); }
		public TerminalNode FUN() { return getToken(RoastParser.FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExternalFuncContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterExternalFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitExternalFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitExternalFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TailRecFuncContext extends FunctionDeclarationContext {
		public TerminalNode TAILREC() { return getToken(RoastParser.TAILREC, 0); }
		public TerminalNode FUN() { return getToken(RoastParser.FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TailRecFuncContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterTailRecFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitTailRecFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitTailRecFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends FunctionDeclarationContext {
		public TerminalNode FUN() { return getToken(RoastParser.FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDefContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				_localctx = new FunctionDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(FUN);
				setState(211);
				match(IDENTIFIER);
				setState(212);
				parameters();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(213);
					match(COLON);
					setState(214);
					type(0);
					}
				}

				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(217);
					match(ASSIGN);
					setState(218);
					expression(0);
					}
					break;
				case LBRACE:
					{
					setState(219);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case EXTERNAL:
				_localctx = new ExternalFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(EXTERNAL);
				setState(223);
				match(FUN);
				setState(224);
				match(IDENTIFIER);
				setState(225);
				parameters();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(226);
					match(COLON);
					setState(227);
					type(0);
					}
				}

				}
				break;
			case INLINE:
				_localctx = new InlineFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(INLINE);
				setState(231);
				match(FUN);
				setState(232);
				match(IDENTIFIER);
				setState(233);
				parameters();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(234);
					match(COLON);
					setState(235);
					type(0);
					}
				}

				setState(241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(238);
					match(ASSIGN);
					setState(239);
					expression(0);
					}
					break;
				case LBRACE:
					{
					setState(240);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case TAILREC:
				_localctx = new TailRecFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(TAILREC);
				setState(244);
				match(FUN);
				setState(245);
				match(IDENTIFIER);
				setState(246);
				parameters();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(247);
					match(COLON);
					setState(248);
					type(0);
					}
				}

				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(251);
					match(ASSIGN);
					setState(252);
					expression(0);
					}
					break;
				case LBRACE:
					{
					setState(253);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SUSPEND:
				_localctx = new SuspendFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(SUSPEND);
				setState(257);
				match(FUN);
				setState(258);
				match(IDENTIFIER);
				setState(259);
				parameters();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(260);
					match(COLON);
					setState(261);
					type(0);
					}
				}

				setState(267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(264);
					match(ASSIGN);
					setState(265);
					expression(0);
					}
					break;
				case LBRACE:
					{
					setState(266);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LPAREN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==VARARG) {
				{
				setState(272);
				parameter();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					parameter();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(282);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARARG() { return getToken(RoastParser.VARARG, 0); }
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARARG) {
				{
				setState(284);
				match(VARARG);
				}
			}

			setState(287);
			match(IDENTIFIER);
			setState(288);
			match(COLON);
			setState(289);
			type(0);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(290);
				match(ASSIGN);
				setState(291);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(RoastParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode LT() { return getToken(RoastParser.LT, 0); }
		public List<TypeVariableContext> typeVariable() {
			return getRuleContexts(TypeVariableContext.class);
		}
		public TypeVariableContext typeVariable(int i) {
			return getRuleContext(TypeVariableContext.class,i);
		}
		public TerminalNode GT() { return getToken(RoastParser.GT, 0); }
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public ClassDefContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompanionObjContext extends ClassDeclarationContext {
		public TerminalNode COMPANION() { return getToken(RoastParser.COMPANION, 0); }
		public TerminalNode OBJECT() { return getToken(RoastParser.OBJECT, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public CompanionObjContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCompanionObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCompanionObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCompanionObj(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataClassContext extends ClassDeclarationContext {
		public TerminalNode DATA() { return getToken(RoastParser.DATA, 0); }
		public TerminalNode CLASS() { return getToken(RoastParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode LT() { return getToken(RoastParser.LT, 0); }
		public List<TypeVariableContext> typeVariable() {
			return getRuleContexts(TypeVariableContext.class);
		}
		public TypeVariableContext typeVariable(int i) {
			return getRuleContext(TypeVariableContext.class,i);
		}
		public TerminalNode GT() { return getToken(RoastParser.GT, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public DataClassContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterDataClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitDataClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitDataClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SealedClassContext extends ClassDeclarationContext {
		public TerminalNode SEALED() { return getToken(RoastParser.SEALED, 0); }
		public TerminalNode CLASS() { return getToken(RoastParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode LT() { return getToken(RoastParser.LT, 0); }
		public List<TypeVariableContext> typeVariable() {
			return getRuleContexts(TypeVariableContext.class);
		}
		public TypeVariableContext typeVariable(int i) {
			return getRuleContext(TypeVariableContext.class,i);
		}
		public TerminalNode GT() { return getToken(RoastParser.GT, 0); }
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public SealedClassContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSealedClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSealedClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSealedClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumClassContext extends ClassDeclarationContext {
		public TerminalNode ENUM() { return getToken(RoastParser.ENUM, 0); }
		public TerminalNode CLASS() { return getToken(RoastParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode LT() { return getToken(RoastParser.LT, 0); }
		public List<TypeVariableContext> typeVariable() {
			return getRuleContexts(TypeVariableContext.class);
		}
		public TypeVariableContext typeVariable(int i) {
			return getRuleContext(TypeVariableContext.class,i);
		}
		public TerminalNode GT() { return getToken(RoastParser.GT, 0); }
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public EnumEntriesContext enumEntries() {
			return getRuleContext(EnumEntriesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RoastParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public EnumClassContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterEnumClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitEnumClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitEnumClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDefContext extends ClassDeclarationContext {
		public TerminalNode OBJECT() { return getToken(RoastParser.OBJECT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ObjectDefContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterObjectDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitObjectDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitObjectDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new ClassDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(CLASS);
				setState(295);
				match(IDENTIFIER);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(296);
					match(LT);
					setState(297);
					typeVariable();
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(298);
						match(COMMA);
						setState(299);
						typeVariable();
						}
						}
						setState(304);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(305);
					match(GT);
					}
				}

				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(309);
					primaryConstructor();
					}
					break;
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(312);
					match(COLON);
					setState(313);
					delegationSpecifiers();
					}
				}

				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(316);
					classBody();
					}
					break;
				}
				}
				break;
			case OBJECT:
				_localctx = new ObjectDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(OBJECT);
				setState(320);
				match(IDENTIFIER);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(321);
					match(COLON);
					setState(322);
					delegationSpecifiers();
					}
				}

				setState(325);
				classBody();
				}
				break;
			case COMPANION:
				_localctx = new CompanionObjContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(COMPANION);
				setState(327);
				match(OBJECT);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(328);
					match(IDENTIFIER);
					}
				}

				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(331);
					match(COLON);
					setState(332);
					delegationSpecifiers();
					}
				}

				setState(335);
				classBody();
				}
				break;
			case DATA:
				_localctx = new DataClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(DATA);
				setState(337);
				match(CLASS);
				setState(338);
				match(IDENTIFIER);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(339);
					match(LT);
					setState(340);
					typeVariable();
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(341);
						match(COMMA);
						setState(342);
						typeVariable();
						}
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(348);
					match(GT);
					}
				}

				setState(352);
				primaryConstructor();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(353);
					match(COLON);
					setState(354);
					delegationSpecifiers();
					}
				}

				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(357);
					classBody();
					}
					break;
				}
				}
				break;
			case SEALED:
				_localctx = new SealedClassContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(SEALED);
				setState(361);
				match(CLASS);
				setState(362);
				match(IDENTIFIER);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(363);
					match(LT);
					setState(364);
					typeVariable();
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(365);
						match(COMMA);
						setState(366);
						typeVariable();
						}
						}
						setState(371);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(372);
					match(GT);
					}
				}

				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(376);
					primaryConstructor();
					}
					break;
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(379);
					match(COLON);
					setState(380);
					delegationSpecifiers();
					}
				}

				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(383);
					classBody();
					}
					break;
				}
				}
				break;
			case ENUM:
				_localctx = new EnumClassContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				match(ENUM);
				setState(387);
				match(CLASS);
				setState(388);
				match(IDENTIFIER);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(389);
					match(LT);
					setState(390);
					typeVariable();
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(391);
						match(COMMA);
						setState(392);
						typeVariable();
						}
						}
						setState(397);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(398);
					match(GT);
					}
				}

				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(402);
					primaryConstructor();
					}
					break;
				}
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(405);
					match(LPAREN);
					setState(406);
					enumEntries();
					setState(407);
					match(RPAREN);
					}
					break;
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(411);
					match(SEMI);
					setState(413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(412);
						enumClassBody();
						}
						break;
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	 
		public InterfaceDeclarationContext() { }
		public void copyFrom(InterfaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDefContext extends InterfaceDeclarationContext {
		public TerminalNode INTERFACE() { return getToken(RoastParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode LT() { return getToken(RoastParser.LT, 0); }
		public List<TypeVariableContext> typeVariable() {
			return getRuleContexts(TypeVariableContext.class);
		}
		public TypeVariableContext typeVariable(int i) {
			return getRuleContext(TypeVariableContext.class,i);
		}
		public TerminalNode GT() { return getToken(RoastParser.GT, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public InterfaceDefContext(InterfaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterInterfaceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitInterfaceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitInterfaceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceDeclaration);
		int _la;
		try {
			_localctx = new InterfaceDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(INTERFACE);
			setState(420);
			match(IDENTIFIER);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(421);
				match(LT);
				setState(422);
				typeVariable();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(423);
					match(COMMA);
					setState(424);
					typeVariable();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(GT);
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(434);
				match(COLON);
				setState(435);
				delegationSpecifiers();
				}
			}

			setState(438);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(IDENTIFIER);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(441);
				match(COLON);
				setState(442);
				type(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryConstructorContext extends ParserRuleContext {
		public ConstructorParametersContext constructorParameters() {
			return getRuleContext(ConstructorParametersContext.class,0);
		}
		public TerminalNode INLINE() { return getToken(RoastParser.INLINE, 0); }
		public TerminalNode PRIVATE() { return getToken(RoastParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(RoastParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(RoastParser.PUBLIC, 0); }
		public TerminalNode INTERNAL() { return getToken(RoastParser.INTERNAL, 0); }
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterPrimaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitPrimaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitPrimaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) {
				{
				setState(445);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INLINE) {
				{
				setState(448);
				match(INLINE);
				}
			}

			setState(451);
			constructorParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public ConstructorParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterConstructorParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitConstructorParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitConstructorParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParametersContext constructorParameters() throws RecognitionException {
		ConstructorParametersContext _localctx = new ConstructorParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(LPAREN);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44L) != 0)) {
				{
				setState(454);
				constructorParameter();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(455);
					match(COMMA);
					setState(456);
					constructorParameter();
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(464);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAL() { return getToken(RoastParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(RoastParser.VAR, 0); }
		public ConstructorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterConstructorParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitConstructorParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitConstructorParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterContext constructorParameter() throws RecognitionException {
		ConstructorParameterContext _localctx = new ConstructorParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(466);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(469);
			match(IDENTIFIER);
			setState(470);
			match(COLON);
			setState(471);
			type(0);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(472);
				match(ASSIGN);
				setState(473);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelegationSpecifiersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public DelegationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterDelegationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitDelegationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitDelegationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegationSpecifiersContext delegationSpecifiers() throws RecognitionException {
		DelegationSpecifiersContext _localctx = new DelegationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delegationSpecifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			type(0);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(477);
				match(COMMA);
				setState(478);
				type(0);
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RoastParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RoastParser.RBRACE, 0); }
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(LBRACE);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6759761517215780L) != 0)) {
				{
				{
				setState(485);
				classMemberDeclaration();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RoastParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RoastParser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(LBRACE);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32749125668L) != 0)) {
				{
				{
				setState(494);
				interfaceMemberDeclaration();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumEntriesContext extends ParserRuleContext {
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public EnumEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterEnumEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitEnumEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitEnumEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntriesContext enumEntries() throws RecognitionException {
		EnumEntriesContext _localctx = new EnumEntriesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			enumEntry();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(503);
				match(COMMA);
				setState(504);
				enumEntry();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumEntryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitEnumEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitEnumEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(IDENTIFIER);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(511);
				match(LPAREN);
				setState(512);
				expression(0);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513);
					match(COMMA);
					setState(514);
					expression(0);
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				match(RPAREN);
				}
			}

			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(524);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumClassBodyContext extends ParserRuleContext {
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public EnumClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterEnumClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitEnumClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitEnumClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumClassBodyContext enumClassBody() throws RecognitionException {
		EnumClassBodyContext _localctx = new EnumClassBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumClassBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(527);
					classMemberDeclaration();
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public InitializerBlockContext initializerBlock() {
			return getRuleContext(InitializerBlockContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public NestedClassContext nestedClass() {
			return getRuleContext(NestedClassContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classMemberDeclaration);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
			case EXTERNAL:
			case INLINE:
			case TAILREC:
			case SUSPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				functionDeclaration();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				propertyDeclaration();
				}
				break;
			case INIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				initializerBlock();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				secondaryConstructor();
				}
				break;
			case CLASS:
			case OBJECT:
			case COMPANION:
			case DATA:
			case SEALED:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				nestedClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceMemberDeclaration);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
			case EXTERNAL:
			case INLINE:
			case TAILREC:
			case SUSPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				functionDeclaration();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				propertyDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode VAL() { return getToken(RoastParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(RoastParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(545);
			match(IDENTIFIER);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(546);
				match(COLON);
				setState(547);
				type(0);
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(550);
				match(ASSIGN);
				setState(551);
				expression(0);
				}
			}

			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET) {
					{
					setState(554);
					getter();
					}
				}

				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(557);
					setter();
					}
				}

				}
				break;
			case 2:
				{
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(560);
					setter();
					}
				}

				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET) {
					{
					setState(563);
					getter();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(RoastParser.GET, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(GET);
			setState(569);
			match(LPAREN);
			setState(570);
			match(RPAREN);
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(571);
				match(ASSIGN);
				setState(572);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(573);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(RoastParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(SET);
			setState(577);
			match(LPAREN);
			setState(578);
			match(IDENTIFIER);
			setState(579);
			match(COLON);
			setState(580);
			type(0);
			setState(581);
			match(RPAREN);
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(582);
				match(ASSIGN);
				setState(583);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(584);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerBlockContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(RoastParser.INIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InitializerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterInitializerBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitInitializerBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitInitializerBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerBlockContext initializerBlock() throws RecognitionException {
		InitializerBlockContext _localctx = new InitializerBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(INIT);
			setState(588);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SecondaryConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(RoastParser.CONSTRUCTOR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RoastParser.DOT, 0); }
		public ThisOrSuperCallContext thisOrSuperCall() {
			return getRuleContext(ThisOrSuperCallContext.class,0);
		}
		public SecondaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSecondaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSecondaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSecondaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondaryConstructorContext secondaryConstructor() throws RecognitionException {
		SecondaryConstructorContext _localctx = new SecondaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(CONSTRUCTOR);
			setState(591);
			parameters();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(592);
				match(DOT);
				setState(593);
				thisOrSuperCall();
				}
			}

			setState(596);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThisOrSuperCallContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(RoastParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public TerminalNode SUPER() { return getToken(RoastParser.SUPER, 0); }
		public ThisOrSuperCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisOrSuperCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterThisOrSuperCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitThisOrSuperCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitThisOrSuperCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisOrSuperCallContext thisOrSuperCall() throws RecognitionException {
		ThisOrSuperCallContext _localctx = new ThisOrSuperCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_thisOrSuperCall);
		int _la;
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(THIS);
				setState(599);
				match(LPAREN);
				setState(600);
				expression(0);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(601);
					match(COMMA);
					setState(602);
					expression(0);
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(608);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(SUPER);
				setState(611);
				match(LPAREN);
				setState(612);
				expression(0);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(613);
					match(COMMA);
					setState(614);
					expression(0);
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(620);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedClassContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public NestedClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterNestedClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitNestedClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitNestedClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedClassContext nestedClass() throws RecognitionException {
		NestedClassContext _localctx = new NestedClassContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nestedClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompanionObjectContext extends ParserRuleContext {
		public TerminalNode COMPANION() { return getToken(RoastParser.COMPANION, 0); }
		public TerminalNode OBJECT() { return getToken(RoastParser.OBJECT, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public CompanionObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_companionObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCompanionObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCompanionObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCompanionObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompanionObjectContext companionObject() throws RecognitionException {
		CompanionObjectContext _localctx = new CompanionObjectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(COMPANION);
			setState(627);
			match(OBJECT);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(628);
				match(IDENTIFIER);
				}
			}

			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(631);
				match(COLON);
				setState(632);
				delegationSpecifiers();
				}
			}

			setState(635);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RoastParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(RoastParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(IF);
			setState(638);
			match(LPAREN);
			setState(639);
			expression(0);
			setState(640);
			match(RPAREN);
			setState(641);
			statement();
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(642);
				match(ELSE);
				setState(643);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenStatementContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(RoastParser.WHEN, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(RoastParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RoastParser.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<WhenEntryContext> whenEntry() {
			return getRuleContexts(WhenEntryContext.class);
		}
		public WhenEntryContext whenEntry(int i) {
			return getRuleContext(WhenEntryContext.class,i);
		}
		public WhenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterWhenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitWhenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitWhenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementContext whenStatement() throws RecognitionException {
		WhenStatementContext _localctx = new WhenStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(WHEN);
			setState(647);
			match(LPAREN);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27162335269879816L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 4292870159L) != 0)) {
				{
				setState(648);
				expression(0);
				}
			}

			setState(651);
			match(RPAREN);
			setState(652);
			match(LBRACE);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4422675571583483912L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 4292870159L) != 0)) {
				{
				{
				setState(653);
				whenEntry();
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(RoastParser.ARROW, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public TerminalNode ELSE() { return getToken(RoastParser.ELSE, 0); }
		public WhenEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterWhenEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitWhenEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitWhenEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenEntryContext whenEntry() throws RecognitionException {
		WhenEntryContext _localctx = new WhenEntryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whenEntry);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case LPAREN:
			case LBRACK:
			case LBRACE:
			case THIS:
			case SUPER:
			case IN:
			case NOT_IN:
			case IS:
			case NOT_IS:
			case PLUS:
			case MINUS:
			case LAMBDA:
			case AT:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case LONG_LITERAL:
			case BYTE_LITERAL:
			case SHORT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case KW_NULL:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				whenCondition();
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(662);
					match(COMMA);
					setState(663);
					whenCondition();
					}
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(669);
				match(ARROW);
				setState(670);
				statement();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(ELSE);
				setState(673);
				match(ARROW);
				setState(674);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(RoastParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(RoastParser.NOT_IN, 0); }
		public TerminalNode IS() { return getToken(RoastParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT_IS() { return getToken(RoastParser.NOT_IS, 0); }
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitWhenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitWhenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whenCondition);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case LPAREN:
			case LBRACK:
			case LBRACE:
			case THIS:
			case SUPER:
			case PLUS:
			case MINUS:
			case LAMBDA:
			case AT:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case LONG_LITERAL:
			case BYTE_LITERAL:
			case SHORT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case KW_NULL:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				expression(0);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(IN);
				setState(679);
				expression(0);
				}
				break;
			case NOT_IN:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
				match(NOT_IN);
				setState(681);
				expression(0);
				}
				break;
			case IS:
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				match(IS);
				setState(683);
				type(0);
				}
				break;
			case NOT_IS:
				enterOuterAlt(_localctx, 5);
				{
				setState(684);
				match(NOT_IS);
				setState(685);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RoastParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(WHILE);
			setState(689);
			match(LPAREN);
			setState(690);
			expression(0);
			setState(691);
			match(RPAREN);
			setState(692);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RoastParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(RoastParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(FOR);
			setState(695);
			match(LPAREN);
			setState(696);
			match(IDENTIFIER);
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(697);
				match(COLON);
				setState(698);
				type(0);
				}
			}

			setState(701);
			match(IN);
			setState(702);
			expression(0);
			setState(703);
			match(RPAREN);
			setState(704);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(RoastParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(RETURN);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27162335269879816L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 4292870159L) != 0)) {
				{
				setState(707);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(RoastParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(RoastParser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(RoastParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(THROW);
			setState(715);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(RoastParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(TRY);
			setState(718);
			block();
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				{
				setState(720); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(719);
					catchBlock();
					}
					}
					setState(722); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(724);
					finallyBlock();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(727);
				finallyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(RoastParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_catchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(CATCH);
			setState(731);
			match(LPAREN);
			setState(732);
			match(IDENTIFIER);
			setState(733);
			match(COLON);
			setState(734);
			type(0);
			setState(735);
			match(RPAREN);
			setState(736);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(RoastParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(FINALLY);
			setState(739);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(RoastParser.BANG, 0); }
		public TerminalNode IS() { return getToken(RoastParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IsNotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIsNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIsNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIsNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RoastParser.COMMA, 0); }
		public CommaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCommaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCommaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCommaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(RoastParser.LT, 0); }
		public TerminalNode GT() { return getToken(RoastParser.GT, 0); }
		public TerminalNode LTE() { return getToken(RoastParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(RoastParser.GTE, 0); }
		public ComparisonExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(RoastParser.AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public LabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(RoastParser.ANDAND, 0); }
		public LogicalAndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitLogicalAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RoastParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SafeCastExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASQ() { return getToken(RoastParser.ASQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SafeCastExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSafeCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSafeCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSafeCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SafeCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QMARK() { return getToken(RoastParser.QMARK, 0); }
		public TerminalNode DOT() { return getToken(RoastParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public SafeCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSafeCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSafeCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSafeCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(RoastParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(RoastParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RoastParser.PERCENT, 0); }
		public MultiplicativeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullCoalescingExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELVIS() { return getToken(RoastParser.ELVIS, 0); }
		public TerminalNode QMARKQMARK() { return getToken(RoastParser.QMARKQMARK, 0); }
		public NullCoalescingExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterNullCoalescingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitNullCoalescingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitNullCoalescingExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(RoastParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(RoastParser.BANGEQ, 0); }
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(RoastParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(RoastParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IsExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(RoastParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperExprContext extends ExpressionContext {
		public TerminalNode SUPER() { return getToken(RoastParser.SUPER, 0); }
		public SuperExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSuperExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSuperExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSuperExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexAccessContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(RoastParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(RoastParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(RoastParser.COLON, 0); }
		public IndexAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExprContext extends ExpressionContext {
		public TerminalNode LAMBDA() { return getToken(RoastParser.LAMBDA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(RoastParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(RoastParser.ASSIGN, 0); }
		public AssignmentExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RoastParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RoastParser.MINUS, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public TupleExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitTupleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitTupleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SafeMethodCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QMARK() { return getToken(RoastParser.QMARK, 0); }
		public TerminalNode DOT() { return getToken(RoastParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SafeMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterSafeMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitSafeMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitSafeMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RoastParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public PropertyAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(RoastParser.POW, 0); }
		public PowerExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitPowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OROR() { return getToken(RoastParser.OROR, 0); }
		public LogicalOrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitLogicalOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapLiteralContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(RoastParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RoastParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoastParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoastParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(RoastParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RoastParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public MapLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterMapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitMapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ExpressionContext {
		public TerminalNode LBRACK() { return getToken(RoastParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(RoastParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public ListLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(RoastParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RoastParser.MINUS, 0); }
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferenceContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLECOLON() { return getToken(RoastParser.DOUBLECOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoastParser.IDENTIFIER, 0); }
		public MethodReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(742);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(743);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(744);
				match(LPAREN);
				setState(745);
				expression(0);
				setState(746);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(748);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(749);
				expression(24);
				}
				break;
			case 5:
				{
				_localctx = new MapLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(750);
				match(LBRACE);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(751);
					match(IDENTIFIER);
					setState(752);
					match(COLON);
					setState(753);
					expression(0);
					setState(760);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(754);
						match(COMMA);
						setState(755);
						match(IDENTIFIER);
						setState(756);
						match(COLON);
						setState(757);
						expression(0);
						}
						}
						setState(762);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(765);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new ListLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(766);
				match(LBRACK);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27162335269879816L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 4292870159L) != 0)) {
					{
					setState(767);
					expression(0);
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(768);
						match(COMMA);
						setState(769);
						expression(0);
						}
						}
						setState(774);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(777);
				match(RBRACK);
				}
				break;
			case 7:
				{
				_localctx = new TupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(778);
				match(LPAREN);
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27162335269879816L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 4292870159L) != 0)) {
					{
					setState(779);
					expression(0);
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(780);
						match(COMMA);
						setState(781);
						expression(0);
						}
						}
						setState(786);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(789);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(790);
				match(LAMBDA);
				setState(791);
				parameters();
				setState(792);
				match(ARROW);
				setState(793);
				expression(5);
				}
				break;
			case 9:
				{
				_localctx = new LabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(795);
				match(AT);
				setState(796);
				match(IDENTIFIER);
				}
				break;
			case 10:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(797);
				match(THIS);
				}
				break;
			case 11:
				{
				_localctx = new SuperExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(798);
				match(SUPER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(801);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(802);
						match(POW);
						setState(803);
						expression(26);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(804);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(805);
						_la = _input.LA(1);
						if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(806);
						expression(24);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(807);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(808);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(809);
						expression(23);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(810);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(811);
						_la = _input.LA(1);
						if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 27021597764222981L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(812);
						expression(22);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(813);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(814);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==BANGEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(815);
						expression(21);
						}
						break;
					case 6:
						{
						_localctx = new LogicalAndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(816);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(817);
						match(ANDAND);
						setState(818);
						expression(20);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(819);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(820);
						match(OROR);
						setState(821);
						expression(19);
						}
						break;
					case 8:
						{
						_localctx = new NullCoalescingExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(822);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(823);
						_la = _input.LA(1);
						if ( !(_la==ELVIS || _la==QMARKQMARK) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(824);
						expression(18);
						}
						break;
					case 9:
						{
						_localctx = new AssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(825);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(826);
						match(ASSIGN);
						setState(827);
						expression(11);
						}
						break;
					case 10:
						{
						_localctx = new CommaExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(828);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(829);
						match(COMMA);
						setState(830);
						expression(10);
						}
						break;
					case 11:
						{
						_localctx = new PropertyAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(831);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(832);
						match(DOT);
						setState(833);
						match(IDENTIFIER);
						}
						break;
					case 12:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(834);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(835);
						match(DOT);
						setState(836);
						functionCall();
						}
						break;
					case 13:
						{
						_localctx = new IndexAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(837);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(838);
						match(LBRACK);
						setState(839);
						expression(0);
						setState(842);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(840);
							match(COLON);
							setState(841);
							expression(0);
							}
						}

						setState(844);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new FuncCallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(846);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(847);
						functionCall();
						}
						break;
					case 15:
						{
						_localctx = new SafeCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(848);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(849);
						match(QMARK);
						setState(850);
						match(DOT);
						setState(851);
						match(IDENTIFIER);
						}
						break;
					case 16:
						{
						_localctx = new SafeMethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(852);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(853);
						match(QMARK);
						setState(854);
						match(DOT);
						setState(855);
						functionCall();
						}
						break;
					case 17:
						{
						_localctx = new CastExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(856);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(857);
						match(AS);
						setState(858);
						type(0);
						}
						break;
					case 18:
						{
						_localctx = new SafeCastExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(859);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(860);
						match(ASQ);
						setState(861);
						type(0);
						}
						break;
					case 19:
						{
						_localctx = new IsExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(862);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(863);
						match(IS);
						setState(864);
						type(0);
						}
						break;
					case 20:
						{
						_localctx = new IsNotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(865);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(866);
						match(BANG);
						setState(867);
						match(IS);
						setState(868);
						type(0);
						}
						break;
					case 21:
						{
						_localctx = new MethodReferenceContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(869);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(870);
						match(DOUBLECOLON);
						setState(871);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RoastParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RoastParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoastParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoastParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(LPAREN);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27162335269879816L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 4292870159L) != 0)) {
				{
				setState(878);
				expression(0);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(879);
					match(COMMA);
					setState(880);
					expression(0);
					}
					}
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(888);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RoastParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RoastParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(LBRACE);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4404370937939492948L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549487380383L) != 0)) {
				{
				{
				setState(891);
				statement();
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(897);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLitContext extends LiteralContext {
		public TerminalNode KW_NULL() { return getToken(RoastParser.KW_NULL, 0); }
		public NullLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterNullLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitNullLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitNullLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLitContext extends LiteralContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(RoastParser.FLOAT_LITERAL, 0); }
		public FloatLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterFloatLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitFloatLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitFloatLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLitContext extends LiteralContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(RoastParser.DOUBLE_LITERAL, 0); }
		public DoubleLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterDoubleLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitDoubleLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitDoubleLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortLitContext extends LiteralContext {
		public TerminalNode SHORT_LITERAL() { return getToken(RoastParser.SHORT_LITERAL, 0); }
		public ShortLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterShortLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitShortLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitShortLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharLitContext extends LiteralContext {
		public TerminalNode CHAR_LITERAL() { return getToken(RoastParser.CHAR_LITERAL, 0); }
		public CharLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterCharLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitCharLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitCharLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitLitContext extends LiteralContext {
		public TerminalNode UNIT() { return getToken(RoastParser.UNIT, 0); }
		public UnitLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterUnitLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitUnitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitUnitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByteLitContext extends LiteralContext {
		public TerminalNode BYTE_LITERAL() { return getToken(RoastParser.BYTE_LITERAL, 0); }
		public ByteLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterByteLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitByteLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitByteLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(RoastParser.INTEGER_LITERAL, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LongLitContext extends LiteralContext {
		public TerminalNode LONG_LITERAL() { return getToken(RoastParser.LONG_LITERAL, 0); }
		public LongLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterLongLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitLongLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitLongLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitContext extends LiteralContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(RoastParser.BOOLEAN_LITERAL, 0); }
		public BoolLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterBoolLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitBoolLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLitContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(RoastParser.STRING_LITERAL, 0); }
		public StringLitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoastListener ) ((RoastListener)listener).exitStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoastVisitor ) return ((RoastVisitor<? extends T>)visitor).visitStringLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				_localctx = new FloatLitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				match(FLOAT_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleLitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(901);
				match(DOUBLE_LITERAL);
				}
				break;
			case LONG_LITERAL:
				_localctx = new LongLitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(902);
				match(LONG_LITERAL);
				}
				break;
			case BYTE_LITERAL:
				_localctx = new ByteLitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(903);
				match(BYTE_LITERAL);
				}
				break;
			case SHORT_LITERAL:
				_localctx = new ShortLitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(904);
				match(SHORT_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharLitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(905);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLitContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(906);
				match(STRING_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BoolLitContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(907);
				match(BOOLEAN_LITERAL);
				}
				break;
			case KW_NULL:
				_localctx = new NullLitContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(908);
				match(KW_NULL);
				}
				break;
			case UNIT:
				_localctx = new UnitLitContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(909);
				match(UNIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 44:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 25);
		case 6:
			return precpred(_ctx, 23);
		case 7:
			return precpred(_ctx, 22);
		case 8:
			return precpred(_ctx, 21);
		case 9:
			return precpred(_ctx, 20);
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 29);
		case 16:
			return precpred(_ctx, 28);
		case 17:
			return precpred(_ctx, 27);
		case 18:
			return precpred(_ctx, 26);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 15);
		case 21:
			return precpred(_ctx, 14);
		case 22:
			return precpred(_ctx, 13);
		case 23:
			return precpred(_ctx, 12);
		case 24:
			return precpred(_ctx, 11);
		case 25:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001f\u0391\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0005\u0000b\b\u0000"+
		"\n\u0000\f\u0000e\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0084\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0095\b\u0003\u0003\u0003\u0097\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00a2\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b6\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c7\b\u0005\n\u0005\f\u0005"+
		"\u00ca\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ce\b\u0005\n\u0005"+
		"\f\u0005\u00d1\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00d8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00dd\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ed\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f2\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00fa\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ff\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0107\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u010c\b\u0006\u0003\u0006\u010e\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0114\b\u0007\n\u0007\f\u0007\u0117"+
		"\t\u0007\u0003\u0007\u0119\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003"+
		"\b\u011e\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0125\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u012d\b\t\n\t"+
		"\f\t\u0130\t\t\u0001\t\u0001\t\u0003\t\u0134\b\t\u0001\t\u0003\t\u0137"+
		"\b\t\u0001\t\u0001\t\u0003\t\u013b\b\t\u0001\t\u0003\t\u013e\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0144\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u014a\b\t\u0001\t\u0001\t\u0003\t\u014e\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0158\b\t\n\t"+
		"\f\t\u015b\t\t\u0001\t\u0001\t\u0003\t\u015f\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0164\b\t\u0001\t\u0003\t\u0167\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0170\b\t\n\t\f\t\u0173\t\t\u0001"+
		"\t\u0001\t\u0003\t\u0177\b\t\u0001\t\u0003\t\u017a\b\t\u0001\t\u0001\t"+
		"\u0003\t\u017e\b\t\u0001\t\u0003\t\u0181\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u018a\b\t\n\t\f\t\u018d\t\t\u0001\t"+
		"\u0001\t\u0003\t\u0191\b\t\u0001\t\u0003\t\u0194\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u019a\b\t\u0001\t\u0001\t\u0003\t\u019e\b\t\u0003\t"+
		"\u01a0\b\t\u0003\t\u01a2\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u01aa\b\n\n\n\f\n\u01ad\t\n\u0001\n\u0001\n\u0003\n\u01b1\b"+
		"\n\u0001\n\u0001\n\u0003\n\u01b5\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u01bc\b\u000b\u0001\f\u0003\f\u01bf\b\f"+
		"\u0001\f\u0003\f\u01c2\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u01ca\b\r\n\r\f\r\u01cd\t\r\u0003\r\u01cf\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0003\u000e\u01d4\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01db\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u01e0\b\u000f\n\u000f\f\u000f\u01e3\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u01e7\b\u0010\n\u0010\f\u0010\u01ea"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u01f0"+
		"\b\u0011\n\u0011\f\u0011\u01f3\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u01fa\b\u0012\n\u0012\f\u0012\u01fd"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0204\b\u0013\n\u0013\f\u0013\u0207\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u020b\b\u0013\u0001\u0013\u0003\u0013\u020e\b\u0013\u0001"+
		"\u0014\u0005\u0014\u0211\b\u0014\n\u0014\f\u0014\u0214\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u021b\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u021f\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0225\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0229\b\u0017\u0001\u0017\u0003\u0017\u022c\b\u0017\u0001"+
		"\u0017\u0003\u0017\u022f\b\u0017\u0001\u0017\u0003\u0017\u0232\b\u0017"+
		"\u0001\u0017\u0003\u0017\u0235\b\u0017\u0003\u0017\u0237\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u023f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u024a"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0253\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u025c"+
		"\b\u001c\n\u001c\f\u001c\u025f\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0268\b\u001c"+
		"\n\u001c\f\u001c\u026b\t\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u026f"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0276\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u027a\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0285\b\u001f\u0001 "+
		"\u0001 \u0001 \u0003 \u028a\b \u0001 \u0001 \u0001 \u0005 \u028f\b \n"+
		" \f \u0292\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0005!\u0299\b!\n!\f"+
		"!\u029c\t!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02a4\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u02af\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u02bc\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0003%\u02c5\b%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0004)\u02d1\b)\u000b)\f)\u02d2\u0001)\u0003)\u02d6"+
		"\b)\u0001)\u0003)\u02d9\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u02f7\b,\n,\f,\u02fa\t,\u0003,\u02fc\b,\u0001,\u0001,"+
		"\u0001,\u0001,\u0001,\u0005,\u0303\b,\n,\f,\u0306\t,\u0003,\u0308\b,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0005,\u030f\b,\n,\f,\u0312\t,\u0003,\u0314"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0320\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u034b\b,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u0369\b,\n,\f,\u036c\t,\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u0372\b-\n-\f-\u0375\t-\u0003-\u0377\b-\u0001-\u0001-"+
		"\u0001.\u0001.\u0005.\u037d\b.\n.\f.\u0380\t.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u038f\b/\u0001/\u0000\u0002\nX0\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^\u0000\u0007\u0001\u0000+.\u0002\u0000\u0002\u0002\u0005"+
		"\u0005\u0001\u0000GH\u0001\u0000LN\u0003\u0000\u001a\u001a\u001c\u001c"+
		"OP\u0001\u0000QR\u0001\u0000UV\u041a\u0000c\u0001\u0000\u0000\u0000\u0002"+
		"\u0083\u0001\u0000\u0000\u0000\u0004\u0085\u0001\u0000\u0000\u0000\u0006"+
		"\u0096\u0001\u0000\u0000\u0000\b\u00a1\u0001\u0000\u0000\u0000\n\u00b5"+
		"\u0001\u0000\u0000\u0000\f\u010d\u0001\u0000\u0000\u0000\u000e\u010f\u0001"+
		"\u0000\u0000\u0000\u0010\u011d\u0001\u0000\u0000\u0000\u0012\u01a1\u0001"+
		"\u0000\u0000\u0000\u0014\u01a3\u0001\u0000\u0000\u0000\u0016\u01b8\u0001"+
		"\u0000\u0000\u0000\u0018\u01be\u0001\u0000\u0000\u0000\u001a\u01c5\u0001"+
		"\u0000\u0000\u0000\u001c\u01d3\u0001\u0000\u0000\u0000\u001e\u01dc\u0001"+
		"\u0000\u0000\u0000 \u01e4\u0001\u0000\u0000\u0000\"\u01ed\u0001\u0000"+
		"\u0000\u0000$\u01f6\u0001\u0000\u0000\u0000&\u01fe\u0001\u0000\u0000\u0000"+
		"(\u0212\u0001\u0000\u0000\u0000*\u021a\u0001\u0000\u0000\u0000,\u021e"+
		"\u0001\u0000\u0000\u0000.\u0220\u0001\u0000\u0000\u00000\u0238\u0001\u0000"+
		"\u0000\u00002\u0240\u0001\u0000\u0000\u00004\u024b\u0001\u0000\u0000\u0000"+
		"6\u024e\u0001\u0000\u0000\u00008\u026e\u0001\u0000\u0000\u0000:\u0270"+
		"\u0001\u0000\u0000\u0000<\u0272\u0001\u0000\u0000\u0000>\u027d\u0001\u0000"+
		"\u0000\u0000@\u0286\u0001\u0000\u0000\u0000B\u02a3\u0001\u0000\u0000\u0000"+
		"D\u02ae\u0001\u0000\u0000\u0000F\u02b0\u0001\u0000\u0000\u0000H\u02b6"+
		"\u0001\u0000\u0000\u0000J\u02c2\u0001\u0000\u0000\u0000L\u02c6\u0001\u0000"+
		"\u0000\u0000N\u02c8\u0001\u0000\u0000\u0000P\u02ca\u0001\u0000\u0000\u0000"+
		"R\u02cd\u0001\u0000\u0000\u0000T\u02da\u0001\u0000\u0000\u0000V\u02e2"+
		"\u0001\u0000\u0000\u0000X\u031f\u0001\u0000\u0000\u0000Z\u036d\u0001\u0000"+
		"\u0000\u0000\\\u037a\u0001\u0000\u0000\u0000^\u038e\u0001\u0000\u0000"+
		"\u0000`b\u0003\u0002\u0001\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0000\u0000\u0001"+
		"g\u0001\u0001\u0000\u0000\u0000hi\u0003\u0006\u0003\u0000ij\u0005\u0001"+
		"\u0000\u0000j\u0084\u0001\u0000\u0000\u0000k\u0084\u0003\f\u0006\u0000"+
		"l\u0084\u0003\u0012\t\u0000m\u0084\u0003\u0014\n\u0000no\u0003\b\u0004"+
		"\u0000op\u0005\u0001\u0000\u0000p\u0084\u0001\u0000\u0000\u0000qr\u0003"+
		"J%\u0000rs\u0005\u0001\u0000\u0000s\u0084\u0001\u0000\u0000\u0000t\u0084"+
		"\u0003>\u001f\u0000u\u0084\u0003@ \u0000v\u0084\u0003F#\u0000w\u0084\u0003"+
		"H$\u0000xy\u0003L&\u0000yz\u0005\u0001\u0000\u0000z\u0084\u0001\u0000"+
		"\u0000\u0000{|\u0003N\'\u0000|}\u0005\u0001\u0000\u0000}\u0084\u0001\u0000"+
		"\u0000\u0000~\u0084\u0003\u0004\u0002\u0000\u007f\u0084\u0003R)\u0000"+
		"\u0080\u0081\u0003P(\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083h\u0001\u0000\u0000\u0000\u0083k\u0001\u0000"+
		"\u0000\u0000\u0083l\u0001\u0000\u0000\u0000\u0083m\u0001\u0000\u0000\u0000"+
		"\u0083n\u0001\u0000\u0000\u0000\u0083q\u0001\u0000\u0000\u0000\u0083t"+
		"\u0001\u0000\u0000\u0000\u0083u\u0001\u0000\u0000\u0000\u0083v\u0001\u0000"+
		"\u0000\u0000\u0083w\u0001\u0000\u0000\u0000\u0083x\u0001\u0000\u0000\u0000"+
		"\u0083{\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0083\u007f"+
		"\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084\u0003"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0003X,\u0000\u0086\u0087\u0005\u0001"+
		"\u0000\u0000\u0087\u0005\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0002"+
		"\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0005\u0004"+
		"\u0000\u0000\u008b\u0097\u0003X,\u0000\u008c\u008d\u0005\u0005\u0000\u0000"+
		"\u008d\u008e\u0005\u0003\u0000\u0000\u008e\u008f\u0005\u0004\u0000\u0000"+
		"\u008f\u0097\u0003X,\u0000\u0090\u0091\u0003\n\u0005\u0000\u0091\u0094"+
		"\u0005\u0003\u0000\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0095"+
		"\u0003X,\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0088\u0001\u0000"+
		"\u0000\u0000\u0096\u008c\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000"+
		"\u0000\u0000\u0097\u0007\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0003"+
		"\u0000\u0000\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u00a2\u0003X,\u0000"+
		"\u009b\u009c\u0003X,\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u009e"+
		"\u0005\u0003\u0000\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f\u00a0"+
		"\u0003X,\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u0098\u0001\u0000"+
		"\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a2\t\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0006\u0005\uffff\uffff\u0000\u00a4\u00b6\u0005\u0007"+
		"\u0000\u0000\u00a5\u00b6\u0005\b\u0000\u0000\u00a6\u00b6\u0005\t\u0000"+
		"\u0000\u00a7\u00b6\u0005\n\u0000\u0000\u00a8\u00b6\u0005\u000b\u0000\u0000"+
		"\u00a9\u00b6\u0005\f\u0000\u0000\u00aa\u00b6\u0005\r\u0000\u0000\u00ab"+
		"\u00b6\u0005\u000e\u0000\u0000\u00ac\u00b6\u0005\u000f\u0000\u0000\u00ad"+
		"\u00b6\u0005\u0010\u0000\u0000\u00ae\u00b6\u0005\u0011\u0000\u0000\u00af"+
		"\u00b6\u0005\u0012\u0000\u0000\u00b0\u00b6\u0005\u0003\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0013\u0000\u0000\u00b2\u00b3\u0003\n\u0005\u0000\u00b3\u00b4"+
		"\u0005\u0014\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00a5\u0001\u0000\u0000\u0000\u00b5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b5\u00a9\u0001\u0000\u0000\u0000\u00b5\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b5\u00ab\u0001\u0000\u0000\u0000\u00b5\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b6\u00cf"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\n\u0002\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0015\u0000\u0000\u00b9\u00ce\u0003\n\u0005\u0003\u00ba\u00bb\n\u0006"+
		"\u0000\u0000\u00bb\u00ce\u0005\u0016\u0000\u0000\u00bc\u00bd\n\u0005\u0000"+
		"\u0000\u00bd\u00ce\u0005\u0017\u0000\u0000\u00be\u00bf\n\u0004\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0018\u0000\u0000\u00c0\u00ce\u0005\u0019\u0000\u0000"+
		"\u00c1\u00c2\n\u0001\u0000\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3"+
		"\u00c8\u0003\n\u0005\u0000\u00c4\u00c5\u0005\u001b\u0000\u0000\u00c5\u00c7"+
		"\u0003\n\u0005\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\u001c\u0000\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00b7\u0001\u0000\u0000\u0000\u00cd\u00ba\u0001"+
		"\u0000\u0000\u0000\u00cd\u00bc\u0001\u0000\u0000\u0000\u00cd\u00be\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c1\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u000b\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u001d\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0003\u0000\u0000\u00d4\u00d7\u0003\u000e\u0007\u0000\u00d5\u00d6\u0005"+
		"\u001e\u0000\u0000\u00d6\u00d8\u0003\n\u0005\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00dc\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u0004\u0000\u0000\u00da\u00dd\u0003X,\u0000"+
		"\u00db\u00dd\u0003\\.\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u010e\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005\u001f\u0000\u0000\u00df\u00e0\u0005\u001d\u0000\u0000\u00e0"+
		"\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e4\u0003\u000e\u0007\u0000\u00e2"+
		"\u00e3\u0005\u001e\u0000\u0000\u00e3\u00e5\u0003\n\u0005\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u010e"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005 \u0000\u0000\u00e7\u00e8\u0005"+
		"\u001d\u0000\u0000\u00e8\u00e9\u0005\u0003\u0000\u0000\u00e9\u00ec\u0003"+
		"\u000e\u0007\u0000\u00ea\u00eb\u0005\u001e\u0000\u0000\u00eb\u00ed\u0003"+
		"\n\u0005\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00f1\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0004"+
		"\u0000\u0000\u00ef\u00f2\u0003X,\u0000\u00f0\u00f2\u0003\\.\u0000\u00f1"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u010e\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005!\u0000\u0000\u00f4\u00f5"+
		"\u0005\u001d\u0000\u0000\u00f5\u00f6\u0005\u0003\u0000\u0000\u00f6\u00f9"+
		"\u0003\u000e\u0007\u0000\u00f7\u00f8\u0005\u001e\u0000\u0000\u00f8\u00fa"+
		"\u0003\n\u0005\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fe\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0004\u0000\u0000\u00fc\u00ff\u0003X,\u0000\u00fd\u00ff\u0003\\.\u0000"+
		"\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u010e\u0001\u0000\u0000\u0000\u0100\u0101\u0005\"\u0000\u0000\u0101"+
		"\u0102\u0005\u001d\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000\u0103"+
		"\u0106\u0003\u000e\u0007\u0000\u0104\u0105\u0005\u001e\u0000\u0000\u0105"+
		"\u0107\u0003\n\u0005\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u010b\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\u0004\u0000\u0000\u0109\u010c\u0003X,\u0000\u010a\u010c\u0003\\"+
		".\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u00d2\u0001\u0000\u0000"+
		"\u0000\u010d\u00de\u0001\u0000\u0000\u0000\u010d\u00e6\u0001\u0000\u0000"+
		"\u0000\u010d\u00f3\u0001\u0000\u0000\u0000\u010d\u0100\u0001\u0000\u0000"+
		"\u0000\u010e\r\u0001\u0000\u0000\u0000\u010f\u0118\u0005\u0013\u0000\u0000"+
		"\u0110\u0115\u0003\u0010\b\u0000\u0111\u0112\u0005\u001b\u0000\u0000\u0112"+
		"\u0114\u0003\u0010\b\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0117"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0118\u0110\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005\u0014\u0000\u0000\u011b\u000f\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u0005#\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"\u0003\u0000\u0000\u0120\u0121\u0005\u001e\u0000\u0000\u0121\u0124\u0003"+
		"\n\u0005\u0000\u0122\u0123\u0005\u0004\u0000\u0000\u0123\u0125\u0003X"+
		",\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0011\u0001\u0000\u0000\u0000\u0126\u0127\u0005$\u0000\u0000"+
		"\u0127\u0133\u0005\u0003\u0000\u0000\u0128\u0129\u0005\u001a\u0000\u0000"+
		"\u0129\u012e\u0003\u0016\u000b\u0000\u012a\u012b\u0005\u001b\u0000\u0000"+
		"\u012b\u012d\u0003\u0016\u000b\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u001c\u0000\u0000"+
		"\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0128\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0003\u0018\f\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0005\u001e\u0000\u0000\u0139\u013b\u0003\u001e\u000f\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013d\u0001\u0000\u0000\u0000\u013c\u013e\u0003 \u0010\u0000\u013d\u013c"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u01a2"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0005%\u0000\u0000\u0140\u0143\u0005"+
		"\u0003\u0000\u0000\u0141\u0142\u0005\u001e\u0000\u0000\u0142\u0144\u0003"+
		"\u001e\u000f\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u01a2\u0003"+
		" \u0010\u0000\u0146\u0147\u0005&\u0000\u0000\u0147\u0149\u0005%\u0000"+
		"\u0000\u0148\u014a\u0005\u0003\u0000\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0005\u001e\u0000\u0000\u014c\u014e\u0003\u001e\u000f"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u01a2\u0003 \u0010\u0000"+
		"\u0150\u0151\u0005\'\u0000\u0000\u0151\u0152\u0005$\u0000\u0000\u0152"+
		"\u015e\u0005\u0003\u0000\u0000\u0153\u0154\u0005\u001a\u0000\u0000\u0154"+
		"\u0159\u0003\u0016\u000b\u0000\u0155\u0156\u0005\u001b\u0000\u0000\u0156"+
		"\u0158\u0003\u0016\u000b\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u001c\u0000\u0000\u015d"+
		"\u015f\u0001\u0000\u0000\u0000\u015e\u0153\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u0163\u0003\u0018\f\u0000\u0161\u0162\u0005\u001e\u0000\u0000\u0162\u0164"+
		"\u0003\u001e\u000f\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0167"+
		"\u0003 \u0010\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u01a2\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		"(\u0000\u0000\u0169\u016a\u0005$\u0000\u0000\u016a\u0176\u0005\u0003\u0000"+
		"\u0000\u016b\u016c\u0005\u001a\u0000\u0000\u016c\u0171\u0003\u0016\u000b"+
		"\u0000\u016d\u016e\u0005\u001b\u0000\u0000\u016e\u0170\u0003\u0016\u000b"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000"+
		"\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005\u001c\u0000\u0000\u0175\u0177\u0001\u0000\u0000"+
		"\u0000\u0176\u016b\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u017a\u0003\u0018\f\u0000"+
		"\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000"+
		"\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u001e\u0000\u0000"+
		"\u017c\u017e\u0003\u001e\u000f\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000"+
		"\u017f\u0181\u0003 \u0010\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0001\u0000\u0000\u0000\u0181\u01a2\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0005)\u0000\u0000\u0183\u0184\u0005$\u0000\u0000\u0184\u0190\u0005"+
		"\u0003\u0000\u0000\u0185\u0186\u0005\u001a\u0000\u0000\u0186\u018b\u0003"+
		"\u0016\u000b\u0000\u0187\u0188\u0005\u001b\u0000\u0000\u0188\u018a\u0003"+
		"\u0016\u000b\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018d\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001"+
		"\u0000\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018b\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0005\u001c\u0000\u0000\u018f\u0191\u0001"+
		"\u0000\u0000\u0000\u0190\u0185\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0194\u0003"+
		"\u0018\f\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u0199\u0001\u0000\u0000\u0000\u0195\u0196\u0005\u0013"+
		"\u0000\u0000\u0196\u0197\u0003$\u0012\u0000\u0197\u0198\u0005\u0014\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0195\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019f\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\u0005\u0001\u0000\u0000\u019c\u019e\u0003(\u0014\u0000"+
		"\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a1\u0126\u0001\u0000\u0000\u0000\u01a1\u013f\u0001\u0000\u0000\u0000"+
		"\u01a1\u0146\u0001\u0000\u0000\u0000\u01a1\u0150\u0001\u0000\u0000\u0000"+
		"\u01a1\u0168\u0001\u0000\u0000\u0000\u01a1\u0182\u0001\u0000\u0000\u0000"+
		"\u01a2\u0013\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005*\u0000\u0000\u01a4"+
		"\u01b0\u0005\u0003\u0000\u0000\u01a5\u01a6\u0005\u001a\u0000\u0000\u01a6"+
		"\u01ab\u0003\u0016\u000b\u0000\u01a7\u01a8\u0005\u001b\u0000\u0000\u01a8"+
		"\u01aa\u0003\u0016\u000b\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u001c\u0000\u0000\u01af"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b0\u01a5\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0005\u001e\u0000\u0000\u01b3\u01b5\u0003\u001e\u000f\u0000\u01b4"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003\"\u0011\u0000\u01b7\u0015"+
		"\u0001\u0000\u0000\u0000\u01b8\u01bb\u0005\u0003\u0000\u0000\u01b9\u01ba"+
		"\u0005\u001e\u0000\u0000\u01ba\u01bc\u0003\n\u0005\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u0017\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bf\u0007\u0000\u0000\u0000\u01be\u01bd\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c2\u0005 \u0000\u0000\u01c1\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0003\u001a\r\u0000\u01c4\u0019\u0001\u0000\u0000"+
		"\u0000\u01c5\u01ce\u0005\u0013\u0000\u0000\u01c6\u01cb\u0003\u001c\u000e"+
		"\u0000\u01c7\u01c8\u0005\u001b\u0000\u0000\u01c8\u01ca\u0003\u001c\u000e"+
		"\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01c6\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005\u0014\u0000"+
		"\u0000\u01d1\u001b\u0001\u0000\u0000\u0000\u01d2\u01d4\u0007\u0001\u0000"+
		"\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005\u0003\u0000"+
		"\u0000\u01d6\u01d7\u0005\u001e\u0000\u0000\u01d7\u01da\u0003\n\u0005\u0000"+
		"\u01d8\u01d9\u0005\u0004\u0000\u0000\u01d9\u01db\u0003X,\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u001d"+
		"\u0001\u0000\u0000\u0000\u01dc\u01e1\u0003\n\u0005\u0000\u01dd\u01de\u0005"+
		"\u001b\u0000\u0000\u01de\u01e0\u0003\n\u0005\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u001f\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e8\u0005/\u0000"+
		"\u0000\u01e5\u01e7\u0003*\u0015\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ec\u00050\u0000\u0000\u01ec"+
		"!\u0001\u0000\u0000\u0000\u01ed\u01f1\u0005/\u0000\u0000\u01ee\u01f0\u0003"+
		",\u0016\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u00050\u0000\u0000\u01f5#\u0001\u0000\u0000\u0000"+
		"\u01f6\u01fb\u0003&\u0013\u0000\u01f7\u01f8\u0005\u001b\u0000\u0000\u01f8"+
		"\u01fa\u0003&\u0013\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fc%\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fe\u020a\u0005\u0003\u0000\u0000\u01ff\u0200\u0005"+
		"\u0013\u0000\u0000\u0200\u0205\u0003X,\u0000\u0201\u0202\u0005\u001b\u0000"+
		"\u0000\u0202\u0204\u0003X,\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204"+
		"\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207"+
		"\u0205\u0001\u0000\u0000\u0000\u0208\u0209\u0005\u0014\u0000\u0000\u0209"+
		"\u020b\u0001\u0000\u0000\u0000\u020a\u01ff\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0001\u0000\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c"+
		"\u020e\u0003 \u0010\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0001\u0000\u0000\u0000\u020e\'\u0001\u0000\u0000\u0000\u020f\u0211\u0003"+
		"*\u0015\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211\u0214\u0001\u0000"+
		"\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000"+
		"\u0000\u0000\u0213)\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000"+
		"\u0000\u0215\u021b\u0003\f\u0006\u0000\u0216\u021b\u0003.\u0017\u0000"+
		"\u0217\u021b\u00034\u001a\u0000\u0218\u021b\u00036\u001b\u0000\u0219\u021b"+
		"\u0003:\u001d\u0000\u021a\u0215\u0001\u0000\u0000\u0000\u021a\u0216\u0001"+
		"\u0000\u0000\u0000\u021a\u0217\u0001\u0000\u0000\u0000\u021a\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b+\u0001\u0000"+
		"\u0000\u0000\u021c\u021f\u0003\f\u0006\u0000\u021d\u021f\u0003.\u0017"+
		"\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021d\u0001\u0000\u0000"+
		"\u0000\u021f-\u0001\u0000\u0000\u0000\u0220\u0221\u0007\u0001\u0000\u0000"+
		"\u0221\u0224\u0005\u0003\u0000\u0000\u0222\u0223\u0005\u001e\u0000\u0000"+
		"\u0223\u0225\u0003\n\u0005\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005\u0004\u0000\u0000\u0227\u0229\u0003X,\u0000\u0228\u0226\u0001"+
		"\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u0236\u0001"+
		"\u0000\u0000\u0000\u022a\u022c\u00030\u0018\u0000\u022b\u022a\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022e\u0001\u0000"+
		"\u0000\u0000\u022d\u022f\u00032\u0019\u0000\u022e\u022d\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0237\u0001\u0000\u0000"+
		"\u0000\u0230\u0232\u00032\u0019\u0000\u0231\u0230\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234\u0001\u0000\u0000\u0000"+
		"\u0233\u0235\u00030\u0018\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236"+
		"\u022b\u0001\u0000\u0000\u0000\u0236\u0231\u0001\u0000\u0000\u0000\u0237"+
		"/\u0001\u0000\u0000\u0000\u0238\u0239\u00051\u0000\u0000\u0239\u023a\u0005"+
		"\u0013\u0000\u0000\u023a\u023e\u0005\u0014\u0000\u0000\u023b\u023c\u0005"+
		"\u0004\u0000\u0000\u023c\u023f\u0003X,\u0000\u023d\u023f\u0003\\.\u0000"+
		"\u023e\u023b\u0001\u0000\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000"+
		"\u023f1\u0001\u0000\u0000\u0000\u0240\u0241\u00052\u0000\u0000\u0241\u0242"+
		"\u0005\u0013\u0000\u0000\u0242\u0243\u0005\u0003\u0000\u0000\u0243\u0244"+
		"\u0005\u001e\u0000\u0000\u0244\u0245\u0003\n\u0005\u0000\u0245\u0249\u0005"+
		"\u0014\u0000\u0000\u0246\u0247\u0005\u0004\u0000\u0000\u0247\u024a\u0003"+
		"X,\u0000\u0248\u024a\u0003\\.\u0000\u0249\u0246\u0001\u0000\u0000\u0000"+
		"\u0249\u0248\u0001\u0000\u0000\u0000\u024a3\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u00053\u0000\u0000\u024c\u024d\u0003\\.\u0000\u024d5\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u00054\u0000\u0000\u024f\u0252\u0003\u000e\u0007"+
		"\u0000\u0250\u0251\u0005\u0006\u0000\u0000\u0251\u0253\u00038\u001c\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0003\\.\u0000\u0255"+
		"7\u0001\u0000\u0000\u0000\u0256\u0257\u00055\u0000\u0000\u0257\u0258\u0005"+
		"\u0013\u0000\u0000\u0258\u025d\u0003X,\u0000\u0259\u025a\u0005\u001b\u0000"+
		"\u0000\u025a\u025c\u0003X,\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c"+
		"\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0001\u0000\u0000\u0000\u025f"+
		"\u025d\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u0014\u0000\u0000\u0261"+
		"\u026f\u0001\u0000\u0000\u0000\u0262\u0263\u00056\u0000\u0000\u0263\u0264"+
		"\u0005\u0013\u0000\u0000\u0264\u0269\u0003X,\u0000\u0265\u0266\u0005\u001b"+
		"\u0000\u0000\u0266\u0268\u0003X,\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000"+
		"\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026d\u0005\u0014\u0000\u0000"+
		"\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u0256\u0001\u0000\u0000\u0000"+
		"\u026e\u0262\u0001\u0000\u0000\u0000\u026f9\u0001\u0000\u0000\u0000\u0270"+
		"\u0271\u0003\u0012\t\u0000\u0271;\u0001\u0000\u0000\u0000\u0272\u0273"+
		"\u0005&\u0000\u0000\u0273\u0275\u0005%\u0000\u0000\u0274\u0276\u0005\u0003"+
		"\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000"+
		"\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0278\u0005\u001e"+
		"\u0000\u0000\u0278\u027a\u0003\u001e\u000f\u0000\u0279\u0277\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u0003 \u0010\u0000\u027c=\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u00057\u0000\u0000\u027e\u027f\u0005\u0013\u0000\u0000\u027f"+
		"\u0280\u0003X,\u0000\u0280\u0281\u0005\u0014\u0000\u0000\u0281\u0284\u0003"+
		"\u0002\u0001\u0000\u0282\u0283\u00058\u0000\u0000\u0283\u0285\u0003\u0002"+
		"\u0001\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285?\u0001\u0000\u0000\u0000\u0286\u0287\u00059\u0000\u0000"+
		"\u0287\u0289\u0005\u0013\u0000\u0000\u0288\u028a\u0003X,\u0000\u0289\u0288"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\u0005\u0014\u0000\u0000\u028c\u0290"+
		"\u0005/\u0000\u0000\u028d\u028f\u0003B!\u0000\u028e\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000"+
		"\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293\u0001\u0000"+
		"\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0294\u00050\u0000"+
		"\u0000\u0294A\u0001\u0000\u0000\u0000\u0295\u029a\u0003D\"\u0000\u0296"+
		"\u0297\u0005\u001b\u0000\u0000\u0297\u0299\u0003D\"\u0000\u0298\u0296"+
		"\u0001\u0000\u0000\u0000\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u0298"+
		"\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029d"+
		"\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u029e"+
		"\u0005\u0015\u0000\u0000\u029e\u029f\u0003\u0002\u0001\u0000\u029f\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a1\u00058\u0000\u0000\u02a1\u02a2\u0005"+
		"\u0015\u0000\u0000\u02a2\u02a4\u0003\u0002\u0001\u0000\u02a3\u0295\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a0\u0001\u0000\u0000\u0000\u02a4C\u0001\u0000"+
		"\u0000\u0000\u02a5\u02af\u0003X,\u0000\u02a6\u02a7\u0005:\u0000\u0000"+
		"\u02a7\u02af\u0003X,\u0000\u02a8\u02a9\u0005;\u0000\u0000\u02a9\u02af"+
		"\u0003X,\u0000\u02aa\u02ab\u0005<\u0000\u0000\u02ab\u02af\u0003\n\u0005"+
		"\u0000\u02ac\u02ad\u0005=\u0000\u0000\u02ad\u02af\u0003\n\u0005\u0000"+
		"\u02ae\u02a5\u0001\u0000\u0000\u0000\u02ae\u02a6\u0001\u0000\u0000\u0000"+
		"\u02ae\u02a8\u0001\u0000\u0000\u0000\u02ae\u02aa\u0001\u0000\u0000\u0000"+
		"\u02ae\u02ac\u0001\u0000\u0000\u0000\u02afE\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0005>\u0000\u0000\u02b1\u02b2\u0005\u0013\u0000\u0000\u02b2\u02b3"+
		"\u0003X,\u0000\u02b3\u02b4\u0005\u0014\u0000\u0000\u02b4\u02b5\u0003\u0002"+
		"\u0001\u0000\u02b5G\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005?\u0000\u0000"+
		"\u02b7\u02b8\u0005\u0013\u0000\u0000\u02b8\u02bb\u0005\u0003\u0000\u0000"+
		"\u02b9\u02ba\u0005\u001e\u0000\u0000\u02ba\u02bc\u0003\n\u0005\u0000\u02bb"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0005:\u0000\u0000\u02be\u02bf"+
		"\u0003X,\u0000\u02bf\u02c0\u0005\u0014\u0000\u0000\u02c0\u02c1\u0003\u0002"+
		"\u0001\u0000\u02c1I\u0001\u0000\u0000\u0000\u02c2\u02c4\u0005@\u0000\u0000"+
		"\u02c3\u02c5\u0003X,\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c5K\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005"+
		"A\u0000\u0000\u02c7M\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005B\u0000"+
		"\u0000\u02c9O\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005C\u0000\u0000\u02cb"+
		"\u02cc\u0003X,\u0000\u02ccQ\u0001\u0000\u0000\u0000\u02cd\u02ce\u0005"+
		"D\u0000\u0000\u02ce\u02d8\u0003\\.\u0000\u02cf\u02d1\u0003T*\u0000\u02d0"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d6\u0003V+\u0000\u02d5\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d9\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d9\u0003V+\u0000\u02d8\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9S\u0001\u0000\u0000\u0000"+
		"\u02da\u02db\u0005E\u0000\u0000\u02db\u02dc\u0005\u0013\u0000\u0000\u02dc"+
		"\u02dd\u0005\u0003\u0000\u0000\u02dd\u02de\u0005\u001e\u0000\u0000\u02de"+
		"\u02df\u0003\n\u0005\u0000\u02df\u02e0\u0005\u0014\u0000\u0000\u02e0\u02e1"+
		"\u0003\\.\u0000\u02e1U\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005F\u0000"+
		"\u0000\u02e3\u02e4\u0003\\.\u0000\u02e4W\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e6\u0006,\uffff\uffff\u0000\u02e6\u0320\u0003^/\u0000\u02e7\u0320"+
		"\u0005\u0003\u0000\u0000\u02e8\u02e9\u0005\u0013\u0000\u0000\u02e9\u02ea"+
		"\u0003X,\u0000\u02ea\u02eb\u0005\u0014\u0000\u0000\u02eb\u0320\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0007\u0002\u0000\u0000\u02ed\u0320\u0003X,\u0018"+
		"\u02ee\u02fb\u0005/\u0000\u0000\u02ef\u02f0\u0005\u0003\u0000\u0000\u02f0"+
		"\u02f1\u0005\u001e\u0000\u0000\u02f1\u02f8\u0003X,\u0000\u02f2\u02f3\u0005"+
		"\u001b\u0000\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000\u02f4\u02f5\u0005"+
		"\u001e\u0000\u0000\u02f5\u02f7\u0003X,\u0000\u02f6\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb\u02ef\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fd\u0320\u00050\u0000\u0000\u02fe\u0307\u0005\u0018\u0000\u0000"+
		"\u02ff\u0304\u0003X,\u0000\u0300\u0301\u0005\u001b\u0000\u0000\u0301\u0303"+
		"\u0003X,\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000"+
		"\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000"+
		"\u0000\u0000\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000"+
		"\u0000\u0000\u0307\u02ff\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u0320\u0005\u0019"+
		"\u0000\u0000\u030a\u0313\u0005\u0013\u0000\u0000\u030b\u0310\u0003X,\u0000"+
		"\u030c\u030d\u0005\u001b\u0000\u0000\u030d\u030f\u0003X,\u0000\u030e\u030c"+
		"\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e"+
		"\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0314"+
		"\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u030b"+
		"\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0001\u0000\u0000\u0000\u0315\u0320\u0005\u0014\u0000\u0000\u0316\u0317"+
		"\u0005I\u0000\u0000\u0317\u0318\u0003\u000e\u0007\u0000\u0318\u0319\u0005"+
		"\u0015\u0000\u0000\u0319\u031a\u0003X,\u0005\u031a\u0320\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0005J\u0000\u0000\u031c\u0320\u0005\u0003\u0000\u0000"+
		"\u031d\u0320\u00055\u0000\u0000\u031e\u0320\u00056\u0000\u0000\u031f\u02e5"+
		"\u0001\u0000\u0000\u0000\u031f\u02e7\u0001\u0000\u0000\u0000\u031f\u02e8"+
		"\u0001\u0000\u0000\u0000\u031f\u02ec\u0001\u0000\u0000\u0000\u031f\u02ee"+
		"\u0001\u0000\u0000\u0000\u031f\u02fe\u0001\u0000\u0000\u0000\u031f\u030a"+
		"\u0001\u0000\u0000\u0000\u031f\u0316\u0001\u0000\u0000\u0000\u031f\u031b"+
		"\u0001\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u031e"+
		"\u0001\u0000\u0000\u0000\u0320\u036a\u0001\u0000\u0000\u0000\u0321\u0322"+
		"\n\u0019\u0000\u0000\u0322\u0323\u0005K\u0000\u0000\u0323\u0369\u0003"+
		"X,\u001a\u0324\u0325\n\u0017\u0000\u0000\u0325\u0326\u0007\u0003\u0000"+
		"\u0000\u0326\u0369\u0003X,\u0018\u0327\u0328\n\u0016\u0000\u0000\u0328"+
		"\u0329\u0007\u0002\u0000\u0000\u0329\u0369\u0003X,\u0017\u032a\u032b\n"+
		"\u0015\u0000\u0000\u032b\u032c\u0007\u0004\u0000\u0000\u032c\u0369\u0003"+
		"X,\u0016\u032d\u032e\n\u0014\u0000\u0000\u032e\u032f\u0007\u0005\u0000"+
		"\u0000\u032f\u0369\u0003X,\u0015\u0330\u0331\n\u0013\u0000\u0000\u0331"+
		"\u0332\u0005S\u0000\u0000\u0332\u0369\u0003X,\u0014\u0333\u0334\n\u0012"+
		"\u0000\u0000\u0334\u0335\u0005T\u0000\u0000\u0335\u0369\u0003X,\u0013"+
		"\u0336\u0337\n\u0011\u0000\u0000\u0337\u0338\u0007\u0006\u0000\u0000\u0338"+
		"\u0369\u0003X,\u0012\u0339\u033a\n\n\u0000\u0000\u033a\u033b\u0005\u0004"+
		"\u0000\u0000\u033b\u0369\u0003X,\u000b\u033c\u033d\n\t\u0000\u0000\u033d"+
		"\u033e\u0005\u001b\u0000\u0000\u033e\u0369\u0003X,\n\u033f\u0340\n\u001d"+
		"\u0000\u0000\u0340\u0341\u0005\u0006\u0000\u0000\u0341\u0369\u0005\u0003"+
		"\u0000\u0000\u0342\u0343\n\u001c\u0000\u0000\u0343\u0344\u0005\u0006\u0000"+
		"\u0000\u0344\u0369\u0003Z-\u0000\u0345\u0346\n\u001b\u0000\u0000\u0346"+
		"\u0347\u0005\u0018\u0000\u0000\u0347\u034a\u0003X,\u0000\u0348\u0349\u0005"+
		"\u001e\u0000\u0000\u0349\u034b\u0003X,\u0000\u034a\u0348\u0001\u0000\u0000"+
		"\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000"+
		"\u0000\u034c\u034d\u0005\u0019\u0000\u0000\u034d\u0369\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\n\u001a\u0000\u0000\u034f\u0369\u0003Z-\u0000\u0350"+
		"\u0351\n\u0010\u0000\u0000\u0351\u0352\u0005W\u0000\u0000\u0352\u0353"+
		"\u0005\u0006\u0000\u0000\u0353\u0369\u0005\u0003\u0000\u0000\u0354\u0355"+
		"\n\u000f\u0000\u0000\u0355\u0356\u0005W\u0000\u0000\u0356\u0357\u0005"+
		"\u0006\u0000\u0000\u0357\u0369\u0003Z-\u0000\u0358\u0359\n\u000e\u0000"+
		"\u0000\u0359\u035a\u0005X\u0000\u0000\u035a\u0369\u0003\n\u0005\u0000"+
		"\u035b\u035c\n\r\u0000\u0000\u035c\u035d\u0005Y\u0000\u0000\u035d\u0369"+
		"\u0003\n\u0005\u0000\u035e\u035f\n\f\u0000\u0000\u035f\u0360\u0005<\u0000"+
		"\u0000\u0360\u0369\u0003\n\u0005\u0000\u0361\u0362\n\u000b\u0000\u0000"+
		"\u0362\u0363\u0005Z\u0000\u0000\u0363\u0364\u0005<\u0000\u0000\u0364\u0369"+
		"\u0003\n\u0005\u0000\u0365\u0366\n\u0004\u0000\u0000\u0366\u0367\u0005"+
		"[\u0000\u0000\u0367\u0369\u0005\u0003\u0000\u0000\u0368\u0321\u0001\u0000"+
		"\u0000\u0000\u0368\u0324\u0001\u0000\u0000\u0000\u0368\u0327\u0001\u0000"+
		"\u0000\u0000\u0368\u032a\u0001\u0000\u0000\u0000\u0368\u032d\u0001\u0000"+
		"\u0000\u0000\u0368\u0330\u0001\u0000\u0000\u0000\u0368\u0333\u0001\u0000"+
		"\u0000\u0000\u0368\u0336\u0001\u0000\u0000\u0000\u0368\u0339\u0001\u0000"+
		"\u0000\u0000\u0368\u033c\u0001\u0000\u0000\u0000\u0368\u033f\u0001\u0000"+
		"\u0000\u0000\u0368\u0342\u0001\u0000\u0000\u0000\u0368\u0345\u0001\u0000"+
		"\u0000\u0000\u0368\u034e\u0001\u0000\u0000\u0000\u0368\u0350\u0001\u0000"+
		"\u0000\u0000\u0368\u0354\u0001\u0000\u0000\u0000\u0368\u0358\u0001\u0000"+
		"\u0000\u0000\u0368\u035b\u0001\u0000\u0000\u0000\u0368\u035e\u0001\u0000"+
		"\u0000\u0000\u0368\u0361\u0001\u0000\u0000\u0000\u0368\u0365\u0001\u0000"+
		"\u0000\u0000\u0369\u036c\u0001\u0000\u0000\u0000\u036a\u0368\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036bY\u0001\u0000\u0000"+
		"\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036d\u0376\u0005\u0013\u0000"+
		"\u0000\u036e\u0373\u0003X,\u0000\u036f\u0370\u0005\u001b\u0000\u0000\u0370"+
		"\u0372\u0003X,\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0372\u0375\u0001"+
		"\u0000\u0000\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001"+
		"\u0000\u0000\u0000\u0374\u0377\u0001\u0000\u0000\u0000\u0375\u0373\u0001"+
		"\u0000\u0000\u0000\u0376\u036e\u0001\u0000\u0000\u0000\u0376\u0377\u0001"+
		"\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0005"+
		"\u0014\u0000\u0000\u0379[\u0001\u0000\u0000\u0000\u037a\u037e\u0005/\u0000"+
		"\u0000\u037b\u037d\u0003\u0002\u0001\u0000\u037c\u037b\u0001\u0000\u0000"+
		"\u0000\u037d\u0380\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000"+
		"\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0381\u0001\u0000\u0000"+
		"\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0381\u0382\u00050\u0000\u0000"+
		"\u0382]\u0001\u0000\u0000\u0000\u0383\u038f\u0005\\\u0000\u0000\u0384"+
		"\u038f\u0005]\u0000\u0000\u0385\u038f\u0005^\u0000\u0000\u0386\u038f\u0005"+
		"_\u0000\u0000\u0387\u038f\u0005`\u0000\u0000\u0388\u038f\u0005a\u0000"+
		"\u0000\u0389\u038f\u0005b\u0000\u0000\u038a\u038f\u0005c\u0000\u0000\u038b"+
		"\u038f\u0005d\u0000\u0000\u038c\u038f\u0005e\u0000\u0000\u038d\u038f\u0005"+
		"f\u0000\u0000\u038e\u0383\u0001\u0000\u0000\u0000\u038e\u0384\u0001\u0000"+
		"\u0000\u0000\u038e\u0385\u0001\u0000\u0000\u0000\u038e\u0386\u0001\u0000"+
		"\u0000\u0000\u038e\u0387\u0001\u0000\u0000\u0000\u038e\u0388\u0001\u0000"+
		"\u0000\u0000\u038e\u0389\u0001\u0000\u0000\u0000\u038e\u038a\u0001\u0000"+
		"\u0000\u0000\u038e\u038b\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000"+
		"\u0000\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038f_\u0001\u0000\u0000"+
		"\u0000kc\u0083\u0094\u0096\u00a1\u00b5\u00c8\u00cd\u00cf\u00d7\u00dc\u00e4"+
		"\u00ec\u00f1\u00f9\u00fe\u0106\u010b\u010d\u0115\u0118\u011d\u0124\u012e"+
		"\u0133\u0136\u013a\u013d\u0143\u0149\u014d\u0159\u015e\u0163\u0166\u0171"+
		"\u0176\u0179\u017d\u0180\u018b\u0190\u0193\u0199\u019d\u019f\u01a1\u01ab"+
		"\u01b0\u01b4\u01bb\u01be\u01c1\u01cb\u01ce\u01d3\u01da\u01e1\u01e8\u01f1"+
		"\u01fb\u0205\u020a\u020d\u0212\u021a\u021e\u0224\u0228\u022b\u022e\u0231"+
		"\u0234\u0236\u023e\u0249\u0252\u025d\u0269\u026e\u0275\u0279\u0284\u0289"+
		"\u0290\u029a\u02a3\u02ae\u02bb\u02c4\u02d2\u02d5\u02d8\u02f8\u02fb\u0304"+
		"\u0307\u0310\u0313\u031f\u034a\u0368\u036a\u0373\u0376\u037e\u038e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}