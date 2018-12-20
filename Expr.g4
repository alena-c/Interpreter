grammar Expr;

/** Syntax rules **/
prgm :   asgmt* ;

asgmt:   ID '=' expr ';'             # assign
     ;

expr :   expr '+' term               # Add
     |   expr '-' term               # Sub
     |   term                        # term_
     ;

term :   term '*' fact               # Mul
     |   fact                        # fact_
     ;

fact :   '(' expr ')'                # parens
     |   '-' fact                    # unaryNeg
     |   '+' fact                    # unaryPos
     |   Literal                     # int
     |   ID                          # id
     ;

/** Lexical rules **/
ID           : Letter (Letter | Digit)* ;
Letter       : [a-zA-Z_] ;
Literal      : '0'
             | NonZeroDigit (Digit)*
             ;

NonZeroDigit : [1-9] ;
Digit        : [0-9] ;
MUL          : '*' ;
ADD          : '+' ;
SUB          : '-' ;
WS           : [ \t\r\n]+ -> skip ;
