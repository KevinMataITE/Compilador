// Generated from Operaciones.g4 by ANTLR 4.8
package kevin.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OperacionesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, ENTERO=2, PROYECTAR=3, GALLETA=4, SINO=5, TRUE=6, FALSE=7, MIENTRAS=8, 
		NOT=9, LLAVEA=10, LLAVEC=11, DOSPUNTOS=12, COMA=13, PYC=14, IGUAL=15, 
		POR=16, DIV=17, CORCH_A=18, CORCH_C=19, MAS=20, MENOS=21, PAR_A=22, PAR_C=23, 
		FLOTANTE=24, NUM_FLOTANTE=25, IGUALA=26, MAYORQUE=27, MENORQUE=28, MAYORIGUAL=29, 
		MENORIGUAL=30, DIFERENTE=31, AND=32, OR=33, INT=34, CADENA=35, ID=36, 
		ESPACIOS=37, LINE_COMMENT=38, COMMENT=39;
	public static final int
		RULE_start = 0, RULE_cuerpo = 1, RULE_mientras = 2, RULE_cuerpo2 = 3, 
		RULE_condicionSi = 4, RULE_condicionSiNoSi = 5, RULE_condicionSiNoHaz = 6, 
		RULE_comparacion = 7, RULE_validacion = 8, RULE_declaraciones = 9, RULE_expr = 10, 
		RULE_imprimir = 11, RULE_imprimirExpr = 12, RULE_imprimirCadena = 13, 
		RULE_imprimirVariable = 14, RULE_imprimirNum = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "cuerpo", "mientras", "cuerpo2", "condicionSi", "condicionSiNoSi", 
			"condicionSiNoHaz", "comparacion", "validacion", "declaraciones", "expr", 
			"imprimir", "imprimirExpr", "imprimirCadena", "imprimirVariable", "imprimirNum"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'camara'", "'int'", "'imprimir'", "'galleta'", "'esquina'", "'TRUE'", 
			"'FALSE'", "'mientras'", "'NO'", "'{'", "'}'", "':'", "','", "';'", "'='", 
			"'*'", "'/'", "'['", "']'", "'+'", "'-'", "'('", "')'", "'flotante'", 
			null, "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "ENTERO", "PROYECTAR", "GALLETA", "SINO", "TRUE", "FALSE", 
			"MIENTRAS", "NOT", "LLAVEA", "LLAVEC", "DOSPUNTOS", "COMA", "PYC", "IGUAL", 
			"POR", "DIV", "CORCH_A", "CORCH_C", "MAS", "MENOS", "PAR_A", "PAR_C", 
			"FLOTANTE", "NUM_FLOTANTE", "IGUALA", "MAYORQUE", "MENORQUE", "MAYORIGUAL", 
			"MENORIGUAL", "DIFERENTE", "AND", "OR", "INT", "CADENA", "ID", "ESPACIOS", 
			"LINE_COMMENT", "COMMENT"
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
	public String getGrammarFileName() { return "Operaciones.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OperacionesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LenguajeContext extends StartContext {
		public TerminalNode GALLETA() { return getToken(OperacionesParser.GALLETA, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public TerminalNode LLAVEA() { return getToken(OperacionesParser.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(OperacionesParser.LLAVEC, 0); }
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
		}
		public LenguajeContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitLenguaje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new LenguajeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(GALLETA);
			setState(33);
			match(ID);
			setState(34);
			match(PAR_A);
			setState(35);
			match(PAR_C);
			setState(36);
			match(LLAVEA);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SI) | (1L << ENTERO) | (1L << PROYECTAR) | (1L << MIENTRAS) | (1L << PAR_A) | (1L << FLOTANTE) | (1L << NUM_FLOTANTE) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(37);
				cuerpo();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(LLAVEC);
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

	public static class CuerpoContext extends ParserRuleContext {
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
	 
		public CuerpoContext() { }
		public void copyFrom(CuerpoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContenidoCuerpoContext extends CuerpoContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public CondicionSiContext condicionSi() {
			return getRuleContext(CondicionSiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public ContenidoCuerpoContext(CuerpoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitContenidoCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cuerpo);
		try {
			_localctx = new ContenidoCuerpoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(45);
				declaraciones();
				}
				break;
			case 2:
				{
				setState(46);
				expr(0);
				}
				break;
			case 3:
				{
				setState(47);
				imprimir();
				}
				break;
			case 4:
				{
				setState(48);
				condicionSi();
				}
				break;
			case 5:
				{
				setState(49);
				mientras();
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(OperacionesParser.MIENTRAS, 0); }
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public TerminalNode LLAVEA() { return getToken(OperacionesParser.LLAVEA, 0); }
		public Cuerpo2Context cuerpo2() {
			return getRuleContext(Cuerpo2Context.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(OperacionesParser.LLAVEC, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(MIENTRAS);
			setState(53);
			match(PAR_A);
			setState(54);
			comparacion();
			setState(55);
			match(PAR_C);
			setState(56);
			match(LLAVEA);
			setState(57);
			cuerpo2();
			setState(58);
			match(LLAVEC);
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

	public static class Cuerpo2Context extends ParserRuleContext {
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
		}
		public Cuerpo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitCuerpo2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo2Context cuerpo2() throws RecognitionException {
		Cuerpo2Context _localctx = new Cuerpo2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SI) | (1L << ENTERO) | (1L << PROYECTAR) | (1L << MIENTRAS) | (1L << PAR_A) | (1L << FLOTANTE) | (1L << NUM_FLOTANTE) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				cuerpo();
				}
				}
				setState(65);
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

	public static class CondicionSiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(OperacionesParser.SI, 0); }
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public TerminalNode LLAVEA() { return getToken(OperacionesParser.LLAVEA, 0); }
		public Cuerpo2Context cuerpo2() {
			return getRuleContext(Cuerpo2Context.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(OperacionesParser.LLAVEC, 0); }
		public CondicionSiNoSiContext condicionSiNoSi() {
			return getRuleContext(CondicionSiNoSiContext.class,0);
		}
		public CondicionSiNoHazContext condicionSiNoHaz() {
			return getRuleContext(CondicionSiNoHazContext.class,0);
		}
		public CondicionSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionSi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitCondicionSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionSiContext condicionSi() throws RecognitionException {
		CondicionSiContext _localctx = new CondicionSiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicionSi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(SI);
			setState(67);
			match(PAR_A);
			setState(68);
			comparacion();
			setState(69);
			match(PAR_C);
			setState(70);
			match(LLAVEA);
			setState(71);
			cuerpo2();
			setState(72);
			match(LLAVEC);
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
				condicionSiNoSi();
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(76);
				condicionSiNoHaz();
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

	public static class CondicionSiNoSiContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(OperacionesParser.SINO, 0); }
		public TerminalNode SI() { return getToken(OperacionesParser.SI, 0); }
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public TerminalNode LLAVEA() { return getToken(OperacionesParser.LLAVEA, 0); }
		public Cuerpo2Context cuerpo2() {
			return getRuleContext(Cuerpo2Context.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(OperacionesParser.LLAVEC, 0); }
		public List<CondicionSiNoSiContext> condicionSiNoSi() {
			return getRuleContexts(CondicionSiNoSiContext.class);
		}
		public CondicionSiNoSiContext condicionSiNoSi(int i) {
			return getRuleContext(CondicionSiNoSiContext.class,i);
		}
		public CondicionSiNoHazContext condicionSiNoHaz() {
			return getRuleContext(CondicionSiNoHazContext.class,0);
		}
		public CondicionSiNoSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionSiNoSi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitCondicionSiNoSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionSiNoSiContext condicionSiNoSi() throws RecognitionException {
		CondicionSiNoSiContext _localctx = new CondicionSiNoSiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicionSiNoSi);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(SINO);
			setState(80);
			match(SI);
			setState(81);
			match(PAR_A);
			setState(82);
			comparacion();
			setState(83);
			match(PAR_C);
			setState(84);
			match(LLAVEA);
			setState(85);
			cuerpo2();
			setState(86);
			match(LLAVEC);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(87);
					condicionSiNoSi();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(93);
				condicionSiNoHaz();
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

	public static class CondicionSiNoHazContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(OperacionesParser.SINO, 0); }
		public TerminalNode LLAVEA() { return getToken(OperacionesParser.LLAVEA, 0); }
		public Cuerpo2Context cuerpo2() {
			return getRuleContext(Cuerpo2Context.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(OperacionesParser.LLAVEC, 0); }
		public CondicionSiNoHazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionSiNoHaz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitCondicionSiNoHaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionSiNoHazContext condicionSiNoHaz() throws RecognitionException {
		CondicionSiNoHazContext _localctx = new CondicionSiNoHazContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicionSiNoHaz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(SINO);
			setState(97);
			match(LLAVEA);
			setState(98);
			cuerpo2();
			setState(99);
			match(LLAVEC);
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

	public static class ComparacionContext extends ParserRuleContext {
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	 
		public ComparacionContext() { }
		public void copyFrom(ComparacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends ComparacionContext {
		public List<ValidacionContext> validacion() {
			return getRuleContexts(ValidacionContext.class);
		}
		public ValidacionContext validacion(int i) {
			return getRuleContext(ValidacionContext.class,i);
		}
		public List<TerminalNode> PAR_A() { return getTokens(OperacionesParser.PAR_A); }
		public TerminalNode PAR_A(int i) {
			return getToken(OperacionesParser.PAR_A, i);
		}
		public List<TerminalNode> PAR_C() { return getTokens(OperacionesParser.PAR_C); }
		public TerminalNode PAR_C(int i) {
			return getToken(OperacionesParser.PAR_C, i);
		}
		public List<TerminalNode> OR() { return getTokens(OperacionesParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(OperacionesParser.OR, i);
		}
		public OrContext(ComparacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ComparacionContext {
		public List<ValidacionContext> validacion() {
			return getRuleContexts(ValidacionContext.class);
		}
		public ValidacionContext validacion(int i) {
			return getRuleContext(ValidacionContext.class,i);
		}
		public List<TerminalNode> PAR_A() { return getTokens(OperacionesParser.PAR_A); }
		public TerminalNode PAR_A(int i) {
			return getToken(OperacionesParser.PAR_A, i);
		}
		public List<TerminalNode> PAR_C() { return getTokens(OperacionesParser.PAR_C); }
		public TerminalNode PAR_C(int i) {
			return getToken(OperacionesParser.PAR_C, i);
		}
		public List<TerminalNode> AND() { return getTokens(OperacionesParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(OperacionesParser.AND, i);
		}
		public AndContext(ComparacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValiContext extends ComparacionContext {
		public ValidacionContext validacion() {
			return getRuleContext(ValidacionContext.class,0);
		}
		public List<TerminalNode> PAR_A() { return getTokens(OperacionesParser.PAR_A); }
		public TerminalNode PAR_A(int i) {
			return getToken(OperacionesParser.PAR_A, i);
		}
		public List<TerminalNode> PAR_C() { return getTokens(OperacionesParser.PAR_C); }
		public TerminalNode PAR_C(int i) {
			return getToken(OperacionesParser.PAR_C, i);
		}
		public ValiContext(ComparacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitVali(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparacion);
		try {
			int _alt;
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101);
						match(PAR_A);
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(107);
				validacion();
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(108);
						match(PAR_C);
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(114);
						match(AND);
						setState(118);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(115);
								match(PAR_A);
								}
								} 
							}
							setState(120);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						}
						setState(121);
						validacion();
						setState(125);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(122);
								match(PAR_C);
								}
								} 
							}
							setState(127);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						match(PAR_A);
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(139);
				validacion();
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(140);
						match(PAR_C);
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(146);
						match(OR);
						setState(150);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(147);
								match(PAR_A);
								}
								} 
							}
							setState(152);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						}
						setState(153);
						validacion();
						setState(157);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(154);
								match(PAR_C);
								}
								} 
							}
							setState(159);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ValiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						match(PAR_A);
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(171);
				validacion();
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(172);
						match(PAR_C);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
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

	public static class ValidacionContext extends ParserRuleContext {
		public ValidacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validacion; }
	 
		public ValidacionContext() { }
		public void copyFrom(ValidacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ValidacionContext {
		public TerminalNode NOT() { return getToken(OperacionesParser.NOT, 0); }
		public ValidacionContext validacion() {
			return getRuleContext(ValidacionContext.class,0);
		}
		public NotContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorContext extends ValidacionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYORQUE() { return getToken(OperacionesParser.MAYORQUE, 0); }
		public MayorContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorContext extends ValidacionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENORQUE() { return getToken(OperacionesParser.MENORQUE, 0); }
		public MenorContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorIgualContext extends ValidacionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYORIGUAL() { return getToken(OperacionesParser.MAYORIGUAL, 0); }
		public MayorIgualContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ValidacionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TrueContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualContext extends ValidacionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUALA() { return getToken(OperacionesParser.IGUALA, 0); }
		public IgualContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferenteDeContext extends ValidacionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIFERENTE() { return getToken(OperacionesParser.DIFERENTE, 0); }
		public DiferenteDeContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitDiferenteDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorIgualContext extends ValidacionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENORIGUAL() { return getToken(OperacionesParser.MENORIGUAL, 0); }
		public MenorIgualContext(ValidacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidacionContext validacion() throws RecognitionException {
		ValidacionContext _localctx = new ValidacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_validacion);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IgualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				expr(0);
				setState(181);
				match(IGUALA);
				setState(182);
				expr(0);
				}
				break;
			case 2:
				_localctx = new MayorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				expr(0);
				setState(185);
				match(MAYORQUE);
				setState(186);
				expr(0);
				}
				break;
			case 3:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				expr(0);
				setState(189);
				match(MENORQUE);
				setState(190);
				expr(0);
				}
				break;
			case 4:
				_localctx = new MayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				expr(0);
				setState(193);
				match(MAYORIGUAL);
				setState(194);
				expr(0);
				}
				break;
			case 5:
				_localctx = new MenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				expr(0);
				setState(197);
				match(MENORIGUAL);
				setState(198);
				expr(0);
				}
				break;
			case 6:
				_localctx = new DiferenteDeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				expr(0);
				setState(201);
				match(DIFERENTE);
				setState(202);
				expr(0);
				}
				break;
			case 7:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				expr(0);
				}
				break;
			case 8:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				match(NOT);
				setState(206);
				validacion();
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
	 
		public DeclaracionesContext() { }
		public void copyFrom(DeclaracionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionContext extends DeclaracionesContext {
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(OperacionesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(OperacionesParser.PYC, 0); }
		public AsignacionContext(DeclaracionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionesFlotanteContext extends DeclaracionesContext {
		public TerminalNode FLOTANTE() { return getToken(OperacionesParser.FLOTANTE, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode PYC() { return getToken(OperacionesParser.PYC, 0); }
		public DeclaracionesFlotanteContext(DeclaracionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitDeclaracionesFlotante(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends DeclaracionesContext {
		public TerminalNode ENTERO() { return getToken(OperacionesParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode PYC() { return getToken(OperacionesParser.PYC, 0); }
		public DeclaracionContext(DeclaracionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionConValorContext extends DeclaracionesContext {
		public TerminalNode ENTERO() { return getToken(OperacionesParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(OperacionesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(OperacionesParser.PYC, 0); }
		public DeclaracionConValorContext(DeclaracionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitDeclaracionConValor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionConValorFlotanteContext extends DeclaracionesContext {
		public TerminalNode FLOTANTE() { return getToken(OperacionesParser.FLOTANTE, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(OperacionesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(OperacionesParser.PYC, 0); }
		public DeclaracionConValorFlotanteContext(DeclaracionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitDeclaracionConValorFlotante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaraciones);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new DeclaracionConValorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(ENTERO);
				setState(210);
				match(ID);
				setState(211);
				match(IGUAL);
				setState(212);
				expr(0);
				setState(213);
				match(PYC);
				}
				break;
			case 2:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(ID);
				setState(216);
				match(IGUAL);
				setState(217);
				expr(0);
				setState(218);
				match(PYC);
				}
				break;
			case 3:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(ENTERO);
				setState(221);
				match(ID);
				setState(222);
				match(PYC);
				}
				break;
			case 4:
				_localctx = new DeclaracionConValorFlotanteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(FLOTANTE);
				setState(224);
				match(ID);
				setState(225);
				match(IGUAL);
				setState(226);
				expr(0);
				setState(227);
				match(PYC);
				}
				break;
			case 5:
				_localctx = new DeclaracionesFlotanteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(FLOTANTE);
				setState(230);
				match(ID);
				setState(231);
				match(PYC);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(OperacionesParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(OperacionesParser.MENOS, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumFlotanteContext extends ExprContext {
		public TerminalNode NUM_FLOTANTE() { return getToken(OperacionesParser.NUM_FLOTANTE, 0); }
		public NumFlotanteContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitNumFlotante(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(OperacionesParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MilDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(OperacionesParser.POR, 0); }
		public TerminalNode DIV() { return getToken(OperacionesParser.DIV, 0); }
		public MilDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitMilDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(235);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(ID);
				}
				break;
			case NUM_FLOTANTE:
				{
				_localctx = new NumFlotanteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(NUM_FLOTANTE);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(PAR_A);
				setState(239);
				expr(0);
				setState(240);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MilDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(245);
						((MilDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==DIV) ) {
							((MilDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(248);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode PROYECTAR() { return getToken(OperacionesParser.PROYECTAR, 0); }
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public TerminalNode PYC() { return getToken(OperacionesParser.PYC, 0); }
		public ImprimirVariableContext imprimirVariable() {
			return getRuleContext(ImprimirVariableContext.class,0);
		}
		public ImprimirCadenaContext imprimirCadena() {
			return getRuleContext(ImprimirCadenaContext.class,0);
		}
		public ImprimirNumContext imprimirNum() {
			return getRuleContext(ImprimirNumContext.class,0);
		}
		public ImprimirExprContext imprimirExpr() {
			return getRuleContext(ImprimirExprContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PROYECTAR);
			setState(256);
			match(PAR_A);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(257);
				imprimirVariable();
				}
				break;
			case 2:
				{
				setState(258);
				imprimirCadena();
				}
				break;
			case 3:
				{
				setState(259);
				imprimirNum();
				}
				break;
			case 4:
				{
				setState(260);
				imprimirExpr();
				}
				break;
			}
			setState(263);
			match(PAR_C);
			setState(264);
			match(PYC);
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

	public static class ImprimirExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimirExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitImprimirExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirExprContext imprimirExpr() throws RecognitionException {
		ImprimirExprContext _localctx = new ImprimirExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imprimirExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expr(0);
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

	public static class ImprimirCadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(OperacionesParser.CADENA, 0); }
		public ImprimirCadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirCadena; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitImprimirCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirCadenaContext imprimirCadena() throws RecognitionException {
		ImprimirCadenaContext _localctx = new ImprimirCadenaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_imprimirCadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CADENA);
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

	public static class ImprimirVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public ImprimirVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitImprimirVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirVariableContext imprimirVariable() throws RecognitionException {
		ImprimirVariableContext _localctx = new ImprimirVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imprimirVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
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

	public static class ImprimirNumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OperacionesParser.INT, 0); }
		public ImprimirNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitImprimirNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirNumContext imprimirNum() throws RecognitionException {
		ImprimirNumContext _localctx = new ImprimirNumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imprimirNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(INT);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5@\n\5\f\5\16\5C\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\5\6P\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\5\7a\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t\3\t"+
		"\3\t\7\tw\n\t\f\t\16\tz\13\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\7\t"+
		"\u0083\n\t\f\t\16\t\u0086\13\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3"+
		"\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\t\3\t\7\t\u0097\n\t\f\t\16"+
		"\t\u009a\13\t\3\t\3\t\7\t\u009e\n\t\f\t\16\t\u00a1\13\t\7\t\u00a3\n\t"+
		"\f\t\16\t\u00a6\13\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\t\3\t\7\t"+
		"\u00b0\n\t\f\t\16\t\u00b3\13\t\5\t\u00b5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00d2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00eb\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f5\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00fd\n\f\f\f\16\f\u0100\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0108\n\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\n\\q\177\u0084\u0091\u009f\u00a4\u00b1\3\26\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\4\3\2\22\23\3\2\26\27\2\u012f\2\"\3\2\2\2\4\64"+
		"\3\2\2\2\6\66\3\2\2\2\bA\3\2\2\2\nD\3\2\2\2\fQ\3\2\2\2\16b\3\2\2\2\20"+
		"\u00b4\3\2\2\2\22\u00d1\3\2\2\2\24\u00ea\3\2\2\2\26\u00f4\3\2\2\2\30\u0101"+
		"\3\2\2\2\32\u010c\3\2\2\2\34\u010e\3\2\2\2\36\u0110\3\2\2\2 \u0112\3\2"+
		"\2\2\"#\7\6\2\2#$\7&\2\2$%\7\30\2\2%&\7\31\2\2&*\7\f\2\2\')\5\4\3\2(\'"+
		"\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\r\2\2."+
		"\3\3\2\2\2/\65\5\24\13\2\60\65\5\26\f\2\61\65\5\30\r\2\62\65\5\n\6\2\63"+
		"\65\5\6\4\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\5\3\2\2\2\66\67\7\n\2\2\678\7\30\2\289\5\20\t\29:\7\31\2\2"+
		":;\7\f\2\2;<\5\b\5\2<=\7\r\2\2=\7\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CA\3\2\2\2DE\7\3\2\2EF\7\30\2\2FG\5\20"+
		"\t\2GH\7\31\2\2HI\7\f\2\2IJ\5\b\5\2JL\7\r\2\2KM\5\f\7\2LK\3\2\2\2LM\3"+
		"\2\2\2MO\3\2\2\2NP\5\16\b\2ON\3\2\2\2OP\3\2\2\2P\13\3\2\2\2QR\7\7\2\2"+
		"RS\7\3\2\2ST\7\30\2\2TU\5\20\t\2UV\7\31\2\2VW\7\f\2\2WX\5\b\5\2X\\\7\r"+
		"\2\2Y[\5\f\7\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2_a\5\16\b\2`_\3\2\2\2`a\3\2\2\2a\r\3\2\2\2bc\7\7\2\2cd\7\f\2\2"+
		"de\5\b\5\2ef\7\r\2\2f\17\3\2\2\2gi\7\30\2\2hg\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mq\5\22\n\2np\7\31\2\2on\3\2\2\2ps\3"+
		"\2\2\2qr\3\2\2\2qo\3\2\2\2r\u0084\3\2\2\2sq\3\2\2\2tx\7\"\2\2uw\7\30\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\177\5"+
		"\22\n\2|~\7\31\2\2}|\3\2\2\2~\u0081\3\2\2\2\177\u0080\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082t\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u00b5\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0089\7\30\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0091\5\22\n\2\u008e\u0090\7\31\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u00a4\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\7#\2\2\u0095\u0097\7\30"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\5\22"+
		"\n\2\u009c\u009e\7\31\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u0094\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00b5\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\30"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\5\22"+
		"\n\2\u00ae\u00b0\7\31\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4j\3\2\2\2\u00b4\u008a\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b5\21\3"+
		"\2\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\5\26\f\2"+
		"\u00b9\u00d2\3\2\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd"+
		"\5\26\f\2\u00bd\u00d2\3\2\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7\36\2"+
		"\2\u00c0\u00c1\5\26\f\2\u00c1\u00d2\3\2\2\2\u00c2\u00c3\5\26\f\2\u00c3"+
		"\u00c4\7\37\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00d2\3\2\2\2\u00c6\u00c7\5"+
		"\26\f\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\5\26\f\2\u00c9\u00d2\3\2\2\2\u00ca"+
		"\u00cb\5\26\f\2\u00cb\u00cc\7!\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00d2\3"+
		"\2\2\2\u00ce\u00d2\5\26\f\2\u00cf\u00d0\7\13\2\2\u00d0\u00d2\5\22\n\2"+
		"\u00d1\u00b6\3\2\2\2\u00d1\u00ba\3\2\2\2\u00d1\u00be\3\2\2\2\u00d1\u00c2"+
		"\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\23\3\2\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5\7&\2\2"+
		"\u00d5\u00d6\7\21\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\7\20\2\2\u00d8"+
		"\u00eb\3\2\2\2\u00d9\u00da\7&\2\2\u00da\u00db\7\21\2\2\u00db\u00dc\5\26"+
		"\f\2\u00dc\u00dd\7\20\2\2\u00dd\u00eb\3\2\2\2\u00de\u00df\7\4\2\2\u00df"+
		"\u00e0\7&\2\2\u00e0\u00eb\7\20\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e3\7"+
		"&\2\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5\5\26\f\2\u00e5\u00e6\7\20\2\2\u00e6"+
		"\u00eb\3\2\2\2\u00e7\u00e8\7\32\2\2\u00e8\u00e9\7&\2\2\u00e9\u00eb\7\20"+
		"\2\2\u00ea\u00d3\3\2\2\2\u00ea\u00d9\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea"+
		"\u00e1\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\25\3\2\2\2\u00ec\u00ed\b\f\1"+
		"\2\u00ed\u00f5\7$\2\2\u00ee\u00f5\7&\2\2\u00ef\u00f5\7\33\2\2\u00f0\u00f1"+
		"\7\30\2\2\u00f1\u00f2\5\26\f\2\u00f2\u00f3\7\31\2\2\u00f3\u00f5\3\2\2"+
		"\2\u00f4\u00ec\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0"+
		"\3\2\2\2\u00f5\u00fe\3\2\2\2\u00f6\u00f7\f\b\2\2\u00f7\u00f8\t\2\2\2\u00f8"+
		"\u00fd\5\26\f\t\u00f9\u00fa\f\7\2\2\u00fa\u00fb\t\3\2\2\u00fb\u00fd\5"+
		"\26\f\b\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\27\3\2\2\2\u0100\u00fe\3\2\2"+
		"\2\u0101\u0102\7\5\2\2\u0102\u0107\7\30\2\2\u0103\u0108\5\36\20\2\u0104"+
		"\u0108\5\34\17\2\u0105\u0108\5 \21\2\u0106\u0108\5\32\16\2\u0107\u0103"+
		"\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\31\2\2\u010a\u010b\7\20\2\2\u010b\31\3\2"+
		"\2\2\u010c\u010d\5\26\f\2\u010d\33\3\2\2\2\u010e\u010f\7%\2\2\u010f\35"+
		"\3\2\2\2\u0110\u0111\7&\2\2\u0111\37\3\2\2\2\u0112\u0113\7$\2\2\u0113"+
		"!\3\2\2\2\34*\64ALO\\`jqx\177\u0084\u008a\u0091\u0098\u009f\u00a4\u00aa"+
		"\u00b1\u00b4\u00d1\u00ea\u00f4\u00fc\u00fe\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}