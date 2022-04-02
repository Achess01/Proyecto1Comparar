
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.achess.client.jsonParserLexer;

import java.util.List;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class JsonParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public JsonParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public JsonParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public JsonParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\056\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\004\003\000\002\004\005\000\002\004\004" +
    "\000\002\004\004\000\002\005\003\000\002\005\003\000" +
    "\002\005\003\000\002\005\003\000\002\005\003\000\002" +
    "\006\005\000\002\007\007\000\002\013\002\000\002\013" +
    "\003\000\002\014\003\000\002\014\005\000\002\015\005" +
    "\000\002\016\007\000\002\010\007\000\002\017\002\000" +
    "\002\017\003\000\002\020\003\000\002\020\005\000\002" +
    "\021\005\000\002\022\007\000\002\011\007\000\002\023" +
    "\002\000\002\023\003\000\002\024\003\000\002\024\005" +
    "\000\002\025\005\000\002\026\003\000\002\012\007\000" +
    "\002\027\002\000\002\027\003\000\002\030\003\000\002" +
    "\030\005\000\002\031\005\000\002\032\003\000\002\033" +
    "\005\000\002\034\005\000\002\035\005\000\002\036\005" +
    "\000\002\037\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\140\000\004\004\005\001\002\000\004\002\142\001" +
    "\002\000\016\003\021\012\022\013\014\014\013\015\017" +
    "\016\007\001\002\000\004\002\000\001\002\000\004\011" +
    "\140\001\002\000\006\005\ufffe\010\ufffe\001\002\000\006" +
    "\005\ufffa\010\ufffa\001\002\000\006\005\ufff6\010\ufff6\001" +
    "\002\000\004\011\115\001\002\000\004\011\067\001\002" +
    "\000\006\005\ufff7\010\ufff7\001\002\000\006\005\065\010" +
    "\064\001\002\000\004\011\045\001\002\000\006\005\ufff8" +
    "\010\ufff8\001\002\000\016\007\044\012\022\013\014\014" +
    "\013\015\017\016\007\001\002\000\004\011\024\001\002" +
    "\000\006\005\ufff9\010\ufff9\001\002\000\004\006\025\001" +
    "\002\000\006\004\026\007\uffe5\001\002\000\004\017\035" +
    "\001\002\000\004\007\034\001\002\000\006\007\uffe4\010" +
    "\032\001\002\000\006\007\uffe3\010\uffe3\001\002\000\004" +
    "\004\026\001\002\000\006\007\uffe2\010\uffe2\001\002\000" +
    "\006\005\uffe6\010\uffe6\001\002\000\004\011\041\001\002" +
    "\000\004\005\uffe0\001\002\000\004\005\040\001\002\000" +
    "\006\007\uffe1\010\uffe1\001\002\000\004\025\042\001\002" +
    "\000\006\005\uffd8\010\uffd8\001\002\000\006\005\ufffc\010" +
    "\ufffc\001\002\000\006\005\ufffb\010\ufffb\001\002\000\004" +
    "\006\046\001\002\000\006\004\047\007\uffde\001\002\000" +
    "\004\023\057\001\002\000\006\007\uffdd\010\054\001\002" +
    "\000\006\007\uffdc\010\uffdc\001\002\000\004\007\053\001" +
    "\002\000\006\005\uffdf\010\uffdf\001\002\000\004\004\047" +
    "\001\002\000\006\007\uffdb\010\uffdb\001\002\000\004\005" +
    "\uffd9\001\002\000\004\011\062\001\002\000\004\005\061" +
    "\001\002\000\006\007\uffda\010\uffda\001\002\000\004\025" +
    "\063\001\002\000\004\005\uffd4\001\002\000\014\012\022" +
    "\013\014\014\013\015\017\016\007\001\002\000\004\002" +
    "\uffff\001\002\000\006\005\ufffd\010\ufffd\001\002\000\004" +
    "\006\070\001\002\000\006\004\071\007\uffec\001\002\000" +
    "\004\017\035\001\002\000\004\007\077\001\002\000\006" +
    "\007\uffeb\010\075\001\002\000\006\007\uffea\010\uffea\001" +
    "\002\000\004\004\071\001\002\000\006\007\uffe9\010\uffe9" +
    "\001\002\000\006\005\uffed\010\uffed\001\002\000\004\010" +
    "\103\001\002\000\004\005\102\001\002\000\006\007\uffe8" +
    "\010\uffe8\001\002\000\004\021\104\001\002\000\004\011" +
    "\113\001\002\000\004\010\106\001\002\000\004\022\107" +
    "\001\002\000\004\011\111\001\002\000\004\005\uffe7\001" +
    "\002\000\004\024\112\001\002\000\004\005\uffd5\001\002" +
    "\000\004\025\114\001\002\000\004\010\uffd7\001\002\000" +
    "\004\006\116\001\002\000\006\004\117\007\ufff3\001\002" +
    "\000\004\017\035\001\002\000\006\007\ufff1\010\ufff1\001" +
    "\002\000\004\007\125\001\002\000\006\007\ufff2\010\123" +
    "\001\002\000\004\004\117\001\002\000\006\007\ufff0\010" +
    "\ufff0\001\002\000\006\005\ufff4\010\ufff4\001\002\000\004" +
    "\005\137\001\002\000\004\010\130\001\002\000\004\021" +
    "\104\001\002\000\004\010\132\001\002\000\004\020\134" +
    "\001\002\000\004\005\uffee\001\002\000\004\011\135\001" +
    "\002\000\004\025\136\001\002\000\004\005\uffd6\001\002" +
    "\000\006\007\uffef\010\uffef\001\002\000\004\025\141\001" +
    "\002\000\006\005\ufff5\010\ufff5\001\002\000\004\002\001" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\140\000\006\002\003\003\005\001\001\000\002\001" +
    "\001\000\020\004\015\005\007\006\010\007\022\010\017" +
    "\011\014\012\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\016" +
    "\005\042\006\010\007\022\010\017\011\014\012\011\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\023\026\024\027\025\030\001\001\000\006\026" +
    "\036\033\035\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\025\032\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\027\051\030\047\031\050\001\001\000" +
    "\006\032\057\037\055\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\031" +
    "\054\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\005\065\006\010\007\022" +
    "\010\017\011\014\012\011\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\017\071\020\072" +
    "\021\073\001\001\000\006\022\100\033\077\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\021\075\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\034\104\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\036\107\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\013\120\014\121" +
    "\015\117\001\001\000\006\016\125\033\126\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\015\123\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\034\130\001\001" +
    "\000\002\001\001\000\004\035\132\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$JsonParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$JsonParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$JsonParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 	
  
    public JsonParser(JsonLexer lexer){
        super(lexer);		
    }

    public void syntax_error(Symbol cur_token) {        
		List<Integer> tokens = expected_token_ids();
        int line = cur_token.left;
        int column = cur_token.right;
        String lexeme = symbl_name_from_id(cur_token.sym);
        String des = "Se esperaba:    \n";
        boolean count = false;
		for(Integer i : tokens) {	
            String fromId = symbl_name_from_id(i);                        
			des += fromId +" o ";                        
            count = true;
		}
        des = des.substring(0, des.length() - 3);

		System.out.println("Error sintáctico ln:"+line+" col:"+column+ " " +lexeme + "\n");		
		if(count) System.out.println(des+"\n");
	}

    public void report_fatal_error(String message, Object info) {
		System.out.println("Message: " + message);
		System.out.println("Info: " + info.toString());		
	}
    


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$JsonParser$actions {
  private final JsonParser parser;

  /** Constructor */
  CUP$JsonParser$actions(JsonParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$JsonParser$do_action_part00000000(
    int                        CUP$JsonParser$act_num,
    java_cup.runtime.lr_parser CUP$JsonParser$parser,
    java.util.Stack            CUP$JsonParser$stack,
    int                        CUP$JsonParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$JsonParser$result;

      /* select the action based on the action number */
      switch (CUP$JsonParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= initialState EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-1)).value;
		RESULT = start_val;
              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-1)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$JsonParser$parser.done_parsing();
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // initialState ::= json_declaration 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("initialState",0, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // json_declaration ::= LBRACE json_body RBRACE 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_declaration",1, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // json_body ::= json_body_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body",2, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // json_body ::= json_body COMMA json_body_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body",2, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // json_body ::= error json_body_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body",2, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-1)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // json_body ::= error RBRACKET 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body",2, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-1)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // json_body_item ::= score_declaration 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body_item",3, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // json_body_item ::= variables_declaration 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body_item",3, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // json_body_item ::= methods_declaration 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body_item",3, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // json_body_item ::= classes_declaration 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body_item",3, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // json_body_item ::= comments_declaration 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("json_body_item",3, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // score_declaration ::= SCORE_LITERAL COLON STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("score_declaration",4, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // variables_declaration ::= VARIABLES_LITERAL COLON LBRACKET list_variables_opt RBRACKET 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("variables_declaration",5, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-4)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // list_variables_opt ::= 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_variables_opt",9, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // list_variables_opt ::= list_variables 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_variables_opt",9, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // list_variables ::= variable_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_variables",10, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // list_variables ::= list_variables COMMA variable_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_variables",10, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // variable_item ::= LBRACE variable_item_body RBRACE 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("variable_item",11, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // variable_item_body ::= name_item COMMA type_item COMMA function_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("variable_item_body",12, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-4)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // methods_declaration ::= METHODS_LITERAL COLON LBRACKET list_methods_opt RBRACKET 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("methods_declaration",6, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-4)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // list_methods_opt ::= 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_methods_opt",13, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // list_methods_opt ::= list_methods 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_methods_opt",13, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // list_methods ::= method_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_methods",14, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // list_methods ::= list_methods COMMA method_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_methods",14, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // method_item ::= LBRACE method_item_body RBRACE 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("method_item",15, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // method_item_body ::= name_item COMMA type_item COMMA parameters_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("method_item_body",16, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-4)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // classes_declaration ::= CLASSES_LITERAL COLON LBRACKET list_classes_opt RBRACKET 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("classes_declaration",7, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-4)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // list_classes_opt ::= 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_classes_opt",17, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // list_classes_opt ::= list_classes 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_classes_opt",17, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // list_classes ::= class_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_classes",18, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // list_classes ::= list_classes COMMA class_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_classes",18, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // class_item ::= LBRACE class_item_body RBRACE 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("class_item",19, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // class_item_body ::= name_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("class_item_body",20, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // comments_declaration ::= COMMENTS_LITERAL COLON LBRACKET list_comments_opt RBRACKET 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("comments_declaration",8, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-4)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // list_comments_opt ::= 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_comments_opt",21, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // list_comments_opt ::= list_comments 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_comments_opt",21, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // list_comments ::= comment_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_comments",22, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // list_comments ::= list_comments COMMA comment_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("list_comments",22, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // comment_item ::= LBRACE comment_item_body RBRACE 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("comment_item",23, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // comment_item_body ::= text_item 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("comment_item_body",24, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // name_item ::= NAME_LITERAL COLON STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("name_item",25, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // type_item ::= TYPE_LITERAL COLON STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("type_item",26, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // function_item ::= FUNCTION_LITERAL COLON STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("function_item",27, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // parameters_item ::= PARAMETERS_LITERAL COLON INTEGER_LITERAL 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("parameters_item",28, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // text_item ::= TEXT_LITERAL COLON STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$JsonParser$result = parser.getSymbolFactory().newSymbol("text_item",29, ((java_cup.runtime.Symbol)CUP$JsonParser$stack.elementAt(CUP$JsonParser$top-2)), ((java_cup.runtime.Symbol)CUP$JsonParser$stack.peek()), RESULT);
            }
          return CUP$JsonParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$JsonParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$JsonParser$do_action(
    int                        CUP$JsonParser$act_num,
    java_cup.runtime.lr_parser CUP$JsonParser$parser,
    java.util.Stack            CUP$JsonParser$stack,
    int                        CUP$JsonParser$top)
    throws java.lang.Exception
    {
              return CUP$JsonParser$do_action_part00000000(
                               CUP$JsonParser$act_num,
                               CUP$JsonParser$parser,
                               CUP$JsonParser$stack,
                               CUP$JsonParser$top);
    }
}

}
