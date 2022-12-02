grammar Operaciones;


start: GALLETA ID PAR_A PAR_C LLAVEA cuerpo* LLAVEC  #lenguaje;

cuerpo: (declaraciones | expr | imprimir | condicionSi | mientras ) #contenidoCuerpo;

mientras: MIENTRAS PAR_A comparacion PAR_C LLAVEA cuerpo2 LLAVEC;

cuerpo2: cuerpo*;

condicionSi:
        SI PAR_A comparacion  PAR_C LLAVEA cuerpo2 LLAVEC condicionSiNoSi? condicionSiNoHaz?;

condicionSiNoSi:
         SINO SI PAR_A comparacion PAR_C LLAVEA cuerpo2 LLAVEC condicionSiNoSi*? condicionSiNoHaz?;

condicionSiNoHaz:
        SINO LLAVEA cuerpo2 LLAVEC;

comparacion:
        PAR_A* validacion PAR_C*?  (AND PAR_A* validacion PAR_C*?)*?     #and
        |
        PAR_A* validacion PAR_C*? (OR PAR_A* validacion PAR_C*?)*?      #or
        |
        PAR_A* validacion PAR_C*?   #vali
        ;

validacion:
        expr IGUALA expr        #igual
        |
        expr MAYORQUE expr         #mayor
        |
        expr MENORQUE expr         #menor
        |
        expr MAYORIGUAL expr    #mayorIgual
        |
        expr MENORIGUAL expr    #menorIgual
        |
        expr DIFERENTE expr     #diferenteDe
        |
        expr              #true
        |
        NOT validacion #not
        ;


declaraciones:
        ENTERO ID IGUAL expr PYC  #declaracionConValor
        |
        ID IGUAL expr PYC  #asignacion
        |
        ENTERO ID PYC #declaracion
        |
        FLOTANTE ID IGUAL expr PYC #declaracionConValorFlotante
        |
        FLOTANTE ID PYC #declaracionesFlotante
        ;

expr:
        expr op = (POR | DIV) expr       #MilDiv
        |
        expr op = (MAS | MENOS) expr     #SumRes
        |
        INT                         #int
        |
        ID                          #id
        |
        NUM_FLOTANTE    #numFlotante
        |
        PAR_A expr PAR_C            #parentesis
        ;



imprimir: PROYECTAR PAR_A (imprimirVariable | imprimirCadena | imprimirNum | imprimirExpr) PAR_C PYC;
imprimirExpr: expr;
imprimirCadena: CADENA;
imprimirVariable: ID;
imprimirNum: INT;

SI: 'camara';
ENTERO:      'int';
PROYECTAR:  'imprimir';
GALLETA:      'galleta';
SINO: 'esquina';
TRUE: 'TRUE';
FALSE: 'FALSE';
MIENTRAS: 'mientras';
NOT: 'NO';
LLAVEA:     '{';
LLAVEC:     '}';

DOSPUNTOS: ':';
COMA: ',';
PYC:        ';';
IGUAL:      '=';
POR:        '*';
DIV:        '/';
CORCH_A: '[';
CORCH_C: ']';
MAS:        '+';
MENOS:      '-';
PAR_A:      '(';
PAR_C:      ')';
FLOTANTE: 'flotante';
NUM_FLOTANTE: [0-9]+'.'[0-9]+;
IGUALA: '==';
MAYORQUE: '>';
MENORQUE: '<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
DIFERENTE: '!=';
AND: '&&';
OR: '||';
INT:        [0-9]+;
CADENA: '"'[a-zA-Z0-9:,¡! \t\r\n]*'"';
ID: [a-zA-Z][a-zA-Z0-9]*;
ESPACIOS:   [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' .*? '\n' ->skip;
COMMENT: '/*' .*? '*/'-> skip;
