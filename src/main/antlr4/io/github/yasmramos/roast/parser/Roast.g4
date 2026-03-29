// Roast Language Grammar
// An advanced programming language for JVM with modern features
// Package: io.github.yasmramos.roast

grammar Roast;

// Programa principal
program
    : (statement)* EOF
    ;

// Declaraciones y statements
statement
    : variableDeclaration SEMI                     # VarDeclStmt
    | functionDeclaration                          # FuncDeclStmt
    | classDeclaration                             # ClassDeclStmt
    | interfaceDeclaration                         # InterfaceDeclStmt
    | assignment SEMI                              # AssignmentStmt
    | returnStatement SEMI                         # ReturnStmt
    | ifStatement                                  # IfStmt
    | whenStatement                                # WhenStmt
    | whileStatement                               # WhileStmt
    | forStatement                                 # ForStmt
    | breakStatement SEMI                          # BreakStmt
    | continueStatement SEMI                       # ContinueStmt
    | expressionStatement                          # ExprStmt
    | tryCatchStatement                            # TryCatchStmt
    | throwStatement SEMI                          # ThrowStmt
    ;

// Statement de expresión
expressionStatement
    : expression SEMI
    ;

// Declaración de variables
variableDeclaration
    : VAL IDENTIFIER ASSIGN expression                    # ImmutableVar
    | VAR IDENTIFIER ASSIGN expression                    # MutableVar
    | type IDENTIFIER (ASSIGN expression)?                # TypedVar
    ;

// Asignación
assignment
    : IDENTIFIER ASSIGN expression
    | expression DOT IDENTIFIER ASSIGN expression
    ;

// Tipos del lenguaje
type
    : TYPE_INT                                              # IntType
    | TYPE_FLOAT                                            # FloatType
    | TYPE_DOUBLE                                           # DoubleType
    | TYPE_LONG                                             # LongType
    | TYPE_BYTE                                             # ByteType
    | TYPE_SHORT                                            # ShortType
    | TYPE_CHAR                                             # CharType
    | TYPE_BOOLEAN                                          # BooleanType
    | TYPE_STRING                                           # StringType
    | TYPE_ANY                                              # AnyType
    | UNIT                                                    # UnitType
    | TYPE_NOTHING                                          # NothingType
    | IDENTIFIER                                            # CustomType
    | type QMARK                                            # NullableType
    | type BANG                                             # PlatformType
    | type LBRACK RBRACK                                    # ArrayType
    | LPAREN type RPAREN                                    # ParenthesizedType
    | type ARROW type                                       # FunctionType
    | type LT type (COMMA type)* GT                         # GenericType
    ;

// Declaración de funciones
functionDeclaration
    : FUN IDENTIFIER parameters (COLON type)? 
      (ASSIGN expression | block)                           # FunctionDef
    | EXTERNAL FUN IDENTIFIER parameters (COLON type)?      # ExternalFunc
    | INLINE FUN IDENTIFIER parameters (COLON type)? 
      (ASSIGN expression | block)                           # InlineFunc
    | TAILREC FUN IDENTIFIER parameters (COLON type)? 
      (ASSIGN expression | block)                           # TailRecFunc
    | SUSPEND FUN IDENTIFIER parameters (COLON type)? 
      (ASSIGN expression | block)                           # SuspendFunc
    ;

// Parámetros de función
parameters
    : LPAREN (parameter (COMMA parameter)*)? RPAREN
    ;

parameter
    : VARARG? IDENTIFIER COLON type (ASSIGN expression)?
    ;

// Clases y objetos
classDeclaration
    : CLASS IDENTIFIER 
      (LT typeVariable (COMMA typeVariable)* GT)?
      primaryConstructor? 
      (COLON delegationSpecifiers)? 
      classBody                                    # ClassDef
    | OBJECT IDENTIFIER 
      (COLON delegationSpecifiers)? 
      classBody                                    # ObjectDef
    | COMPANION OBJECT IDENTIFIER? 
      (COLON delegationSpecifiers)? 
      classBody                                    # CompanionObj
    | DATA CLASS IDENTIFIER 
      (LT typeVariable (COMMA typeVariable)* GT)?
      primaryConstructor 
      (COLON delegationSpecifiers)? 
      classBody?                                   # DataClass
    | SEALED CLASS IDENTIFIER 
      (LT typeVariable (COMMA typeVariable)* GT)?
      primaryConstructor? 
      (COLON delegationSpecifiers)? 
      classBody                                    # SealedClass
    | ENUM CLASS IDENTIFIER 
      (LT typeVariable (COMMA typeVariable)* GT)?
      primaryConstructor? 
      (LPAREN enumEntries RPAREN)? 
      (SEMI enumClassBody)?                        # EnumClass
    ;

interfaceDeclaration
    : INTERFACE IDENTIFIER 
      (LT typeVariable (COMMA typeVariable)* GT)?
      (COLON delegationSpecifiers)? 
      interfaceBody                                # InterfaceDef
    ;

typeVariable
    : IDENTIFIER (COLON type)?
    ;

primaryConstructor
    : (PRIVATE | PROTECTED | PUBLIC | INTERNAL)?
      (INLINE)?
      constructorParameters
    ;

constructorParameters
    : LPAREN (constructorParameter (COMMA constructorParameter)*)? RPAREN
    ;

constructorParameter
    : (VAL | VAR)? IDENTIFIER COLON type (ASSIGN expression)?
    ;

delegationSpecifiers
    : type (COMMA type)*
    ;

classBody
    : LBRACE classMemberDeclaration* RBRACE
    ;

interfaceBody
    : LBRACE interfaceMemberDeclaration* RBRACE
    ;

enumEntries
    : enumEntry (COMMA enumEntry)*
    ;

enumEntry
    : IDENTIFIER (LPAREN expression (COMMA expression)* RPAREN)? classBody?
    ;

enumClassBody
    : classMemberDeclaration*
    ;

classMemberDeclaration
    : functionDeclaration
    | propertyDeclaration
    | initializerBlock
    | secondaryConstructor
    | nestedClass
    ;

interfaceMemberDeclaration
    : functionDeclaration
    | propertyDeclaration
    ;

propertyDeclaration
    : (VAL | VAR) IDENTIFIER (COLON type)? 
      (ASSIGN expression)? 
      (getter? setter? | setter? getter?)
    ;

getter
    : GET LPAREN RPAREN (ASSIGN expression | block)
    ;

setter
    : SET LPAREN IDENTIFIER COLON type RPAREN (ASSIGN expression | block)
    ;

initializerBlock
    : INIT block
    ;

secondaryConstructor
    : CONSTRUCTOR parameters (DOT thisOrSuperCall)? block
    ;

thisOrSuperCall
    : THIS LPAREN expression (COMMA expression)* RPAREN
    | SUPER LPAREN expression (COMMA expression)* RPAREN
    ;

nestedClass
    : classDeclaration
    ;

companionObject
    : COMPANION OBJECT IDENTIFIER? 
      (COLON delegationSpecifiers)? 
      classBody
    ;

// Control de flujo
ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?
    ;

whenStatement
    : WHEN LPAREN expression? RPAREN LBRACE whenEntry* RBRACE
    ;

whenEntry
    : whenCondition (COMMA whenCondition)* ARROW statement
    | ELSE ARROW statement
    ;

whenCondition
    : expression
    | IN expression
    | NOT_IN expression
    | IS type
    | NOT_IS type
    ;

whileStatement
    : WHILE LPAREN expression RPAREN statement
    ;

forStatement
    : FOR LPAREN IDENTIFIER (COLON type)? IN expression RPAREN statement
    ;

returnStatement
    : RETURN expression?
    ;

breakStatement
    : BREAK
    ;

continueStatement
    : CONTINUE
    ;

throwStatement
    : THROW expression
    ;

tryCatchStatement
    : TRY block (catchBlock+ finallyBlock? | finallyBlock)
    ;

catchBlock
    : CATCH LPAREN IDENTIFIER COLON type RPAREN block
    ;

finallyBlock
    : FINALLY block
    ;

// Expresiones
expression
    : literal                                                        # LiteralExpr
    | IDENTIFIER                                                     # IdentifierExpr
    | LPAREN expression RPAREN                                       # ParenthesizedExpr
    | expression DOT IDENTIFIER                                      # PropertyAccess
    | expression DOT functionCall                                    # MethodCall
    | expression LBRACK expression (COLON expression)? RBRACK        # IndexAccess
    | expression functionCall                                        # FuncCallExpr
    | expression POW expression                                      # PowerExpr
    | (PLUS|MINUS) expression                                        # UnaryExpr
    | expression (STAR|SLASH|PERCENT) expression                     # MultiplicativeExpr
    | expression (PLUS|MINUS) expression                             # AdditiveExpr
    | expression (LT|GT|LTE|GTE) expression                          # ComparisonExpr
    | expression (EQEQ|BANGEQ) expression                            # EqualityExpr
    | expression ANDAND expression                                   # LogicalAndExpr
    | expression OROR expression                                     # LogicalOrExpr
    | expression (ELVIS|QMARKQMARK) expression                       # NullCoalescingExpr
    | expression QMARK DOT IDENTIFIER                                # SafeCall
    | expression QMARK DOT functionCall                              # SafeMethodCall
    | expression AS type                                             # CastExpr
    | expression ASQ type                                            # SafeCastExpr
    | expression IS type                                             # IsExpr
    | expression BANG IS type                                        # IsNotExpr
    | expression ASSIGN expression                                   # AssignmentExpr
    | expression COMMA expression                                    # CommaExpr
    | LBRACE (IDENTIFIER COLON expression (COMMA IDENTIFIER COLON expression)*)? RBRACE  # MapLiteral
    | LBRACK (expression (COMMA expression)*)? RBRACK                # ListLiteral
    | LPAREN (expression (COMMA expression)*)? RPAREN                # TupleExpr
    | LAMBDA parameters ARROW expression                             # LambdaExpr
    | expression DOUBLECOLON IDENTIFIER                              # MethodReference
    | AT IDENTIFIER                                                  # Label
    | THIS                                                           # ThisExpr
    | SUPER                                                          # SuperExpr
    ;

functionCall
    : LPAREN (expression (COMMA expression)*)? RPAREN
    ;

block
    : LBRACE (statement)* RBRACE
    ;

// Literales
literal
    : INTEGER_LITERAL                                                # IntLiteral
    | FLOAT_LITERAL                                                  # FloatLit
    | DOUBLE_LITERAL                                                 # DoubleLit
    | LONG_LITERAL                                                   # LongLit
    | BYTE_LITERAL                                                   # ByteLit
    | SHORT_LITERAL                                                  # ShortLit
    | CHAR_LITERAL                                                   # CharLit
    | STRING_LITERAL                                                 # StringLit
    | BOOLEAN_LITERAL                                                # BoolLit
    | KW_NULL                                                        # NullLit
    | UNIT                                                           # UnitLit
    ;

// Keywords
VAL: 'val';
VAR: 'var';
FUN: 'fun';
EXTERNAL: 'external';
INLINE: 'inline';
TAILREC: 'tailrec';
SUSPEND: 'suspend';
CLASS: 'class';
OBJECT: 'object';
COMPANION: 'companion';
DATA: 'data';
SEALED: 'sealed';
ENUM: 'enum';
INTERFACE: 'interface';
PRIVATE: 'private';
PROTECTED: 'protected';
PUBLIC: 'public';
INTERNAL: 'internal';
INIT: 'init';
CONSTRUCTOR: 'constructor';
GET: 'get';
SET: 'set';
IF: 'if';
ELSE: 'else';
WHEN: 'when';
WHILE: 'while';
FOR: 'for';
IN: 'in';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
THROW: 'throw';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
IS: 'is';
AS: 'as';
THIS: 'this';
SUPER: 'super';
LAMBDA: 'lambda';
UNIT: 'Unit';
KW_NULL: 'null';

// Tipos
TYPE_INT: 'Int';
TYPE_FLOAT: 'Float';
TYPE_DOUBLE: 'Double';
TYPE_LONG: 'Long';
TYPE_BYTE: 'Byte';
TYPE_SHORT: 'Short';
TYPE_CHAR: 'Char';
TYPE_BOOLEAN: 'Boolean';
TYPE_STRING: 'String';
TYPE_ANY: 'Any';
TYPE_NOTHING: 'Nothing';

// Operadores
ARROW: '->';
ASSIGN: '=';
DOT: '.';
QMARK: '?';
QMARKQMARK: '??';
ELVIS: '?:';
DOUBLECOLON: '::';
AT: '@';
POW: '^';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
EQEQ: '==';
BANGEQ: '!=';
ANDAND: '&&';
OROR: '||';
NOT_IN: '!in';
NOT_IS: '!is';
VARARG: 'vararg';
ASQ: 'as?';
BANG: '!';

// Delimitadores
SEMI: ';';
COLON: ':';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';

// Literales
INTEGER_LITERAL
    : DIGIT+
    ;

FLOAT_LITERAL
    : DIGIT+ '.' DIGIT+ 'f'
    ;

DOUBLE_LITERAL
    : DIGIT+ '.' DIGIT+ 'd'?
    ;

LONG_LITERAL
    : DIGIT+ 'L'
    ;

BYTE_LITERAL
    : DIGIT+ 'b'
    ;

SHORT_LITERAL
    : DIGIT+ 's'
    ;

CHAR_LITERAL
    : '\'' (~['\n\r\\] | ESCAPE_SEQUENCE) '\''
    ;

STRING_LITERAL
    : '"' (~["\n\r\\] | ESCAPE_SEQUENCE)* '"'
    | '"""' .*? '"""'
    ;

BOOLEAN_LITERAL
    : 'true' | 'false'
    ;

IDENTIFIER
    : LETTER (LETTER | DIGIT | '_')*
    | '`' ~('`')+ '`'
    ;

// Fragment rules
fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [a-zA-Z$_]
    ;

fragment ESCAPE_SEQUENCE
    : '\\' ['"\\nrtbf]
    | '\\' UNICODE_ESCAPE
    ;

fragment UNICODE_ESCAPE
    : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment HEX_DIGIT
    : [0-9a-fA-F]
    ;

// Comentarios y whitespace - deben ir al final con skip
COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
