/* Generated By:JJTree&JavaCC: Do not edit this line. OrientSqlConstants.java */
package com.orientechnologies.orient.core.sql.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface OrientSqlConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 8;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 9;
  /** RegularExpression Id. */
  int SELECT = 11;
  /** RegularExpression Id. */
  int TRAVERSE = 12;
  /** RegularExpression Id. */
  int MATCH = 13;
  /** RegularExpression Id. */
  int INSERT = 14;
  /** RegularExpression Id. */
  int CREATE = 15;
  /** RegularExpression Id. */
  int DELETE = 16;
  /** RegularExpression Id. */
  int VERTEX = 17;
  /** RegularExpression Id. */
  int EDGE = 18;
  /** RegularExpression Id. */
  int UPDATE = 19;
  /** RegularExpression Id. */
  int UPSERT = 20;
  /** RegularExpression Id. */
  int FROM = 21;
  /** RegularExpression Id. */
  int TO = 22;
  /** RegularExpression Id. */
  int WHERE = 23;
  /** RegularExpression Id. */
  int WHILE = 24;
  /** RegularExpression Id. */
  int INTO = 25;
  /** RegularExpression Id. */
  int VALUES = 26;
  /** RegularExpression Id. */
  int SET = 27;
  /** RegularExpression Id. */
  int ADD = 28;
  /** RegularExpression Id. */
  int PUT = 29;
  /** RegularExpression Id. */
  int MERGE = 30;
  /** RegularExpression Id. */
  int CONTENT = 31;
  /** RegularExpression Id. */
  int REMOVE = 32;
  /** RegularExpression Id. */
  int INCREMENT = 33;
  /** RegularExpression Id. */
  int AND = 34;
  /** RegularExpression Id. */
  int OR = 35;
  /** RegularExpression Id. */
  int NULL = 36;
  /** RegularExpression Id. */
  int DEFINED = 37;
  /** RegularExpression Id. */
  int ORDER = 38;
  /** RegularExpression Id. */
  int GROUP = 39;
  /** RegularExpression Id. */
  int BY = 40;
  /** RegularExpression Id. */
  int LIMIT = 41;
  /** RegularExpression Id. */
  int SKIP2 = 42;
  /** RegularExpression Id. */
  int BATCH = 43;
  /** RegularExpression Id. */
  int OFFSET = 44;
  /** RegularExpression Id. */
  int TIMEOUT = 45;
  /** RegularExpression Id. */
  int ASC = 46;
  /** RegularExpression Id. */
  int AS = 47;
  /** RegularExpression Id. */
  int DESC = 48;
  /** RegularExpression Id. */
  int FETCHPLAN = 49;
  /** RegularExpression Id. */
  int RETURN = 50;
  /** RegularExpression Id. */
  int BEFORE = 51;
  /** RegularExpression Id. */
  int AFTER = 52;
  /** RegularExpression Id. */
  int LOCK = 53;
  /** RegularExpression Id. */
  int RECORD = 54;
  /** RegularExpression Id. */
  int WAIT = 55;
  /** RegularExpression Id. */
  int RETRY = 56;
  /** RegularExpression Id. */
  int LET = 57;
  /** RegularExpression Id. */
  int NOCACHE = 58;
  /** RegularExpression Id. */
  int UNSAFE = 59;
  /** RegularExpression Id. */
  int PARALLEL = 60;
  /** RegularExpression Id. */
  int STRATEGY = 61;
  /** RegularExpression Id. */
  int DEPTH_FIRST = 62;
  /** RegularExpression Id. */
  int BREADTH_FIRST = 63;
  /** RegularExpression Id. */
  int LUCENE = 64;
  /** RegularExpression Id. */
  int NEAR = 65;
  /** RegularExpression Id. */
  int WITHIN = 66;
  /** RegularExpression Id. */
  int UNWIND = 67;
  /** RegularExpression Id. */
  int MAXDEPTH = 68;
  /** RegularExpression Id. */
  int MINDEPTH = 69;
  /** RegularExpression Id. */
  int CLASS = 70;
  /** RegularExpression Id. */
  int SUPERCLASS = 71;
  /** RegularExpression Id. */
  int CLASSES = 72;
  /** RegularExpression Id. */
  int SUPERCLASSES = 73;
  /** RegularExpression Id. */
  int EXCEPTION = 74;
  /** RegularExpression Id. */
  int PROFILE = 75;
  /** RegularExpression Id. */
  int STORAGE = 76;
  /** RegularExpression Id. */
  int ON = 77;
  /** RegularExpression Id. */
  int OFF = 78;
  /** RegularExpression Id. */
  int TRUNCATE = 79;
  /** RegularExpression Id. */
  int POLYMORPHIC = 80;
  /** RegularExpression Id. */
  int FIND = 81;
  /** RegularExpression Id. */
  int REFERENCES = 82;
  /** RegularExpression Id. */
  int EXTENDS = 83;
  /** RegularExpression Id. */
  int CLUSTERS = 84;
  /** RegularExpression Id. */
  int ABSTRACT = 85;
  /** RegularExpression Id. */
  int ALTER = 86;
  /** RegularExpression Id. */
  int NAME = 87;
  /** RegularExpression Id. */
  int SHORTNAME = 88;
  /** RegularExpression Id. */
  int OVERSIZE = 89;
  /** RegularExpression Id. */
  int STRICTMODE = 90;
  /** RegularExpression Id. */
  int ADDCLUSTER = 91;
  /** RegularExpression Id. */
  int REMOVECLUSTER = 92;
  /** RegularExpression Id. */
  int CUSTOM = 93;
  /** RegularExpression Id. */
  int CLUSTERSELECTION = 94;
  /** RegularExpression Id. */
  int DESCRIPTION = 95;
  /** RegularExpression Id. */
  int ENCRYPTION = 96;
  /** RegularExpression Id. */
  int THIS = 97;
  /** RegularExpression Id. */
  int RECORD_ATTRIBUTE = 98;
  /** RegularExpression Id. */
  int RID_ATTR = 99;
  /** RegularExpression Id. */
  int CLASS_ATTR = 100;
  /** RegularExpression Id. */
  int VERSION_ATTR = 101;
  /** RegularExpression Id. */
  int SIZE_ATTR = 102;
  /** RegularExpression Id. */
  int TYPE_ATTR = 103;
  /** RegularExpression Id. */
  int RAW_ATTR = 104;
  /** RegularExpression Id. */
  int RID_ID_ATTR = 105;
  /** RegularExpression Id. */
  int RID_POS_ATTR = 106;
  /** RegularExpression Id. */
  int FIELDS_ATTR = 107;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 108;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 109;
  /** RegularExpression Id. */
  int HEX_LITERAL = 110;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 111;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 112;
  /** RegularExpression Id. */
  int DECIMAL_FLOATING_POINT_LITERAL = 113;
  /** RegularExpression Id. */
  int DECIMAL_EXPONENT = 114;
  /** RegularExpression Id. */
  int HEXADECIMAL_FLOATING_POINT_LITERAL = 115;
  /** RegularExpression Id. */
  int HEXADECIMAL_EXPONENT = 116;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 117;
  /** RegularExpression Id. */
  int STRING_LITERAL = 118;
  /** RegularExpression Id. */
  int INTEGER_RANGE = 119;
  /** RegularExpression Id. */
  int TRUE = 120;
  /** RegularExpression Id. */
  int FALSE = 121;
  /** RegularExpression Id. */
  int LPAREN = 122;
  /** RegularExpression Id. */
  int RPAREN = 123;
  /** RegularExpression Id. */
  int LBRACE = 124;
  /** RegularExpression Id. */
  int RBRACE = 125;
  /** RegularExpression Id. */
  int LBRACKET = 126;
  /** RegularExpression Id. */
  int RBRACKET = 127;
  /** RegularExpression Id. */
  int SEMICOLON = 128;
  /** RegularExpression Id. */
  int COMMA = 129;
  /** RegularExpression Id. */
  int DOT = 130;
  /** RegularExpression Id. */
  int AT = 131;
  /** RegularExpression Id. */
  int DOLLAR = 132;
  /** RegularExpression Id. */
  int BACKTICK = 133;
  /** RegularExpression Id. */
  int EQ = 134;
  /** RegularExpression Id. */
  int EQEQ = 135;
  /** RegularExpression Id. */
  int LT = 136;
  /** RegularExpression Id. */
  int GT = 137;
  /** RegularExpression Id. */
  int BANG = 138;
  /** RegularExpression Id. */
  int TILDE = 139;
  /** RegularExpression Id. */
  int HOOK = 140;
  /** RegularExpression Id. */
  int COLON = 141;
  /** RegularExpression Id. */
  int LE = 142;
  /** RegularExpression Id. */
  int GE = 143;
  /** RegularExpression Id. */
  int NE = 144;
  /** RegularExpression Id. */
  int NEQ = 145;
  /** RegularExpression Id. */
  int SC_OR = 146;
  /** RegularExpression Id. */
  int SC_AND = 147;
  /** RegularExpression Id. */
  int INCR = 148;
  /** RegularExpression Id. */
  int DECR = 149;
  /** RegularExpression Id. */
  int PLUS = 150;
  /** RegularExpression Id. */
  int MINUS = 151;
  /** RegularExpression Id. */
  int STAR = 152;
  /** RegularExpression Id. */
  int SLASH = 153;
  /** RegularExpression Id. */
  int BIT_AND = 154;
  /** RegularExpression Id. */
  int BIT_OR = 155;
  /** RegularExpression Id. */
  int XOR = 156;
  /** RegularExpression Id. */
  int REM = 157;
  /** RegularExpression Id. */
  int LSHIFT = 158;
  /** RegularExpression Id. */
  int PLUSASSIGN = 159;
  /** RegularExpression Id. */
  int MINUSASSIGN = 160;
  /** RegularExpression Id. */
  int STARASSIGN = 161;
  /** RegularExpression Id. */
  int SLASHASSIGN = 162;
  /** RegularExpression Id. */
  int ANDASSIGN = 163;
  /** RegularExpression Id. */
  int ORASSIGN = 164;
  /** RegularExpression Id. */
  int XORASSIGN = 165;
  /** RegularExpression Id. */
  int REMASSIGN = 166;
  /** RegularExpression Id. */
  int LSHIFTASSIGN = 167;
  /** RegularExpression Id. */
  int RSIGNEDSHIFTASSIGN = 168;
  /** RegularExpression Id. */
  int RUNSIGNEDSHIFTASSIGN = 169;
  /** RegularExpression Id. */
  int ELLIPSIS = 170;
  /** RegularExpression Id. */
  int RANGE = 171;
  /** RegularExpression Id. */
  int NOT = 172;
  /** RegularExpression Id. */
  int IN = 173;
  /** RegularExpression Id. */
  int LIKE = 174;
  /** RegularExpression Id. */
  int IS = 175;
  /** RegularExpression Id. */
  int BETWEEN = 176;
  /** RegularExpression Id. */
  int CONTAINS = 177;
  /** RegularExpression Id. */
  int CONTAINSALL = 178;
  /** RegularExpression Id. */
  int CONTAINSKEY = 179;
  /** RegularExpression Id. */
  int CONTAINSVALUE = 180;
  /** RegularExpression Id. */
  int CONTAINSTEXT = 181;
  /** RegularExpression Id. */
  int MATCHES = 182;
  /** RegularExpression Id. */
  int KEY = 183;
  /** RegularExpression Id. */
  int INSTANCEOF = 184;
  /** RegularExpression Id. */
  int CLUSTER = 185;
  /** RegularExpression Id. */
  int IDENTIFIER = 186;
  /** RegularExpression Id. */
  int QUOTED_IDENTIFIER = 187;
  /** RegularExpression Id. */
  int INDEX_IDENTIFIER = 188;
  /** RegularExpression Id. */
  int INDEXVALUES_IDENTIFIER = 189;
  /** RegularExpression Id. */
  int INDEXVALUESASC_IDENTIFIER = 190;
  /** RegularExpression Id. */
  int INDEXVALUESDESC_IDENTIFIER = 191;
  /** RegularExpression Id. */
  int CLUSTER_IDENTIFIER = 192;
  /** RegularExpression Id. */
  int CLUSTER_NUMBER_IDENTIFIER = 193;
  /** RegularExpression Id. */
  int METADATA_IDENTIFIER = 194;
  /** RegularExpression Id. */
  int LETTER = 195;
  /** RegularExpression Id. */
  int PART_LETTER = 196;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_FORMAL_COMMENT = 1;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<token of kind 6>",
    "\"/*\"",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 10>",
    "<SELECT>",
    "<TRAVERSE>",
    "<MATCH>",
    "<INSERT>",
    "<CREATE>",
    "<DELETE>",
    "<VERTEX>",
    "<EDGE>",
    "<UPDATE>",
    "<UPSERT>",
    "<FROM>",
    "<TO>",
    "<WHERE>",
    "<WHILE>",
    "<INTO>",
    "<VALUES>",
    "<SET>",
    "<ADD>",
    "<PUT>",
    "<MERGE>",
    "<CONTENT>",
    "<REMOVE>",
    "<INCREMENT>",
    "<AND>",
    "<OR>",
    "<NULL>",
    "<DEFINED>",
    "<ORDER>",
    "<GROUP>",
    "<BY>",
    "<LIMIT>",
    "<SKIP2>",
    "<BATCH>",
    "<OFFSET>",
    "<TIMEOUT>",
    "<ASC>",
    "<AS>",
    "<DESC>",
    "<FETCHPLAN>",
    "<RETURN>",
    "<BEFORE>",
    "<AFTER>",
    "<LOCK>",
    "<RECORD>",
    "<WAIT>",
    "<RETRY>",
    "<LET>",
    "<NOCACHE>",
    "<UNSAFE>",
    "<PARALLEL>",
    "<STRATEGY>",
    "<DEPTH_FIRST>",
    "<BREADTH_FIRST>",
    "<LUCENE>",
    "<NEAR>",
    "<WITHIN>",
    "<UNWIND>",
    "<MAXDEPTH>",
    "<MINDEPTH>",
    "<CLASS>",
    "<SUPERCLASS>",
    "<CLASSES>",
    "<SUPERCLASSES>",
    "<EXCEPTION>",
    "<PROFILE>",
    "<STORAGE>",
    "<ON>",
    "<OFF>",
    "<TRUNCATE>",
    "<POLYMORPHIC>",
    "<FIND>",
    "<REFERENCES>",
    "<EXTENDS>",
    "<CLUSTERS>",
    "<ABSTRACT>",
    "<ALTER>",
    "<NAME>",
    "<SHORTNAME>",
    "<OVERSIZE>",
    "<STRICTMODE>",
    "<ADDCLUSTER>",
    "<REMOVECLUSTER>",
    "<CUSTOM>",
    "<CLUSTERSELECTION>",
    "<DESCRIPTION>",
    "<ENCRYPTION>",
    "<THIS>",
    "<RECORD_ATTRIBUTE>",
    "<RID_ATTR>",
    "<CLASS_ATTR>",
    "<VERSION_ATTR>",
    "<SIZE_ATTR>",
    "<TYPE_ATTR>",
    "<RAW_ATTR>",
    "<RID_ID_ATTR>",
    "<RID_POS_ATTR>",
    "<FIELDS_ATTR>",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<DECIMAL_FLOATING_POINT_LITERAL>",
    "<DECIMAL_EXPONENT>",
    "<HEXADECIMAL_FLOATING_POINT_LITERAL>",
    "<HEXADECIMAL_EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "<INTEGER_RANGE>",
    "\"true\"",
    "\"false\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"@\"",
    "\"$\"",
    "\"`\"",
    "\"=\"",
    "\"==\"",
    "\"<\"",
    "\">\"",
    "\"!\"",
    "\"~\"",
    "\"?\"",
    "\":\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"<>\"",
    "\"||\"",
    "\"&&\"",
    "\"++\"",
    "\"--\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"&\"",
    "\"|\"",
    "\"^\"",
    "\"%\"",
    "\"<<\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"%=\"",
    "\"<<=\"",
    "\">>=\"",
    "\">>>=\"",
    "\"...\"",
    "\"..\"",
    "<NOT>",
    "<IN>",
    "<LIKE>",
    "<IS>",
    "<BETWEEN>",
    "<CONTAINS>",
    "<CONTAINSALL>",
    "<CONTAINSKEY>",
    "<CONTAINSVALUE>",
    "<CONTAINSTEXT>",
    "<MATCHES>",
    "<KEY>",
    "<INSTANCEOF>",
    "<CLUSTER>",
    "<IDENTIFIER>",
    "<QUOTED_IDENTIFIER>",
    "<INDEX_IDENTIFIER>",
    "<INDEXVALUES_IDENTIFIER>",
    "<INDEXVALUESASC_IDENTIFIER>",
    "<INDEXVALUESDESC_IDENTIFIER>",
    "<CLUSTER_IDENTIFIER>",
    "<CLUSTER_NUMBER_IDENTIFIER>",
    "<METADATA_IDENTIFIER>",
    "<LETTER>",
    "<PART_LETTER>",
    "\"#\"",
    "\"round-robin\"",
  };

}
