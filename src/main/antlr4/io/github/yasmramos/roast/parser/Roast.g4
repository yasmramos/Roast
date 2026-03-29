grammar Roast;

// Reglas principales
program: (statement)* EOF;

statement
    : variableDeclaration
    | functionDeclaration
    | classDeclaration
    | interfaceDeclaration
    | objectDeclaration
    | companionObject
    | assignment
    | expressionStatement
    | returnStatement
    | ifStatement
    | whenStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | breakStatement
    | continueStatement
    | throwStatement
    | tryCatchFinally
    ;

// Declaraciones
variableDeclaration
    : ('val' | 'var') IDENTIFIER (':' type)? '=' expression ';'
    ;

functionDeclaration
    : 'fun' IDENTIFIER '(' (parameter (',' parameter)*)? ')' (':' type)? block
    ;

parameter
    : IDENTIFIER ':' type ('=' expression)?
    ;

classDeclaration
    : 'class' IDENTIFIER ('(' (parameter (',' parameter)*)? ')')? 
      (':' constructorCall (',' constructorCall)*)? 
      block
    ;

interfaceDeclaration
    : 'interface' IDENTIFIER ('(' (parameter (',' parameter)*)? ')')? 
      (':' constructorCall (',' constructorCall)*)? 
      block
    ;

objectDeclaration
    : 'object' IDENTIFIER ('(' (parameter (',' parameter)*)? ')')? 
      (':' constructorCall (',' constructorCall)*)? 
      block
    ;

companionObject
    : 'companion' 'object' ('(' (parameter (',' parameter)*)? ')')? 
      (':' constructorCall (',' constructorCall)*)? 
      block
    ;

constructorCall
    : 'constructor' '(' (expression (',' expression)*)? ')'
    ;

block
    : '{' (statement)* '}'
    ;

// Control de flujo
ifStatement
    : 'if' '(' expression ')' block ('else' block)?
    ;

whenStatement
    : 'when' '(' expression ')' '{' (whenEntry)+ '}'
    ;

whenEntry
    : (expression (',' expression)*)|'else' '->' block
    ;

forStatement
    : 'for' '(' IDENTIFIER 'in' expression ')' block
    ;

whileStatement
    : 'while' '(' expression ')' block
    ;

doWhileStatement
    : 'do' block 'while' '(' expression ')' ';'
    ;

breakStatement
    : 'break' ';'
    ;

continueStatement
    : 'continue' ';'
    ;

returnStatement
    : 'return' expression? ';'
    ;

throwStatement
    : 'throw' expression ';'
    ;

tryCatchFinally
    : 'try' block (('catch' '(' IDENTIFIER ':' type ')' block)+ | 'finally' block)?
    ;

assignment
    : IDENTIFIER '=' expression ';'
    ;

expressionStatement
    : expression ';'
    ;

// Expresiones
expression
    : lambdaExpression
    | assignmentExpression
    | ternaryExpression
    ;

lambdaExpression
    : '{' (parameter (',' parameter)*)? '->' expression '}'
    ;

assignmentExpression
    : ternaryExpression
    ;

ternaryExpression
    : logicalOrExpression ('?' expression ':' expression)?
    ;

logicalOrExpression
    : logicalAndExpression ('||' logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression ('&&' equalityExpression)*
    ;

equalityExpression
    : relationalExpression (('==' | '!=') relationalExpression)*
    ;

relationalExpression
    : additiveExpression (('<' | '>' | '<=' | '>=') additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression (('*' | '/' | '%') unaryExpression)*
    ;

unaryExpression
    : ('!' | '-' | '+' | '++' | '--') unaryExpression
    | postfixExpression
    ;

postfixExpression
    : primaryExpression (('++' | '--') | '.' IDENTIFIER ('(' (expression (',' expression)*)? ')')?)*
    ;

primaryExpression
    : literal
    | IDENTIFIER
    | '(' expression ')'
    | 'this'
    | 'super'
    ;

literal
    : INT_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    | BOOLEAN_LITERAL
    | 'null'
    ;

// Tipos
type
    : IDENTIFIER ('<' type (',' type)* '>')? ('?')?
    ;

// Tokens
IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

INT_LITERAL
    : [0-9]+
    ;

FLOAT_LITERAL
    : [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)? [fFdD]?
    ;

STRING_LITERAL
    : '"' (~["\\\r\n] | '\\' .)* '"'
    ;

CHAR_LITERAL
    : '\'' (~['\\\r\n] | '\\' .)* '\''
    ;

BOOLEAN_LITERAL
    : 'true' | 'false'
    ;

// Comentarios y espacios en blanco
COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
