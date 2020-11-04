// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Lexer.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Lexer {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=5;
      Object lexer=$fix(Lexer.createTransducer());
      $line=6;
      Lexer.testLexer($cast(gold.structures.automaton.ITransducer.class,lexer));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer.class,"main",$line);
    }
  }
  public static Object testLexer(ITransducer M) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=12;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=14;
      Object input=$fix("");
      $line=17;
      System.out.println($message(new Object[]{"----------------------------"}));
      $line=18;
      System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
      $line=19;
      System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
      $line=20;
      Object string=$fix(((java.util.Scanner)sc).nextLine());
      $line=24;
      while (true) {
        if (!(!$opEqualY(string,"EXIT"))) break;
        $line=28;
        while (true) {
          if (!(!$opEqualY($invokeMethod("charAt",string,new Object[]{0}),'$'))) break;
          $line=29;
          input=$fix($opAdditY($opAdditY(input,string)," "));
          $line=30;
          string=$fix(((java.util.Scanner)sc).nextLine());
        }
        $line=33;
        Object result=$fix(((gold.structures.automaton.ITransducer)M).acceptsString($cast(java.lang.String.class,input)));
        $line=34;
        Object tokenStream=$fix(((gold.structures.automaton.ITransducer)M).getOutputString());
        $line=36;
        System.out.println($message(new Object[]{$opAdditY($opAdditY("The lexer did ",(($bool(result))?(""):("not ")))," accept the string.")}));
        $line=37;
        if ($bool(result)) {
          $line=37;
          System.out.println($message(new Object[]{$opAdditY("Token Stream: ",tokenStream)}));
        }
        $line=39;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=41;
        System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
        $line=42;
        System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
        $line=43;
        string=$fix(((java.util.Scanner)sc).nextLine());
      }
      $line=46;
      System.out.println($message(new Object[]{"Good bye"}));
      $line=47;
      System.out.println($message(new Object[]{""}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer.class,"testLexer",$line);
    }
    return $result;
  }
  public static Object names=null;
  public static ITransducer createTransducer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=61;
      Object Q=$fix(GCollections.asSet("E","EN","p","pu","F","FA","N","NO","t","tu","mo","M","B","I","E","P","R","V","n","RO","Err","A","AS","num","P","p2","n2"));
      $line=63;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY($opIntvlY('0','9'),$opIntvlY('a','z')),GCollections.asSet('(',')',',','_',' ','\n','{','}','[',']',';')),$opIntvlY('A','Z')));
      $line=64;
      Object Out=$fix($opUnionY(GCollections.asSet('(',')',',','{','}','[',']','v','n',';','!'),$opIntvlY('A','Z')));
      $line=65;
      Object q_0=$fix("I");
      $line=66;
      Object F=$fix(GCollections.asSet("I"));
      $line=67;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Lexer.class,"\u03B4"),new GMethod(Lexer.class,"g"),new GMethod(Lexer.class,"h")});
      if (true) break $try;
      $line=68;
      $rethrow(new RuntimeException("The function \"createTransducer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=71;
      if ($bool($opEqualY(q,"Err"))) {
        $line=71;
        $result="Err";
        if (true) break $try;
      }
      else {
        $line=73;
        if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'R'))) {
          $line=73;
          $result="R";
          if (true) break $try;
        }
        else {
          $line=74;
          if (($opEqualY(q,"R")&&$opEqualY(\u03C3,'O'))) {
            $line=74;
            $result="RO";
            if (true) break $try;
          }
          else {
            $line=75;
            if (($opEqualY(q,"RO")&&$opMembrY(\u03C3,$opIntvlY('A','Z')))) {
              $line=75;
              $result="RO";
              if (true) break $try;
            }
            else {
              $line=76;
              if (($opEqualY(q,"RO")&&$opEqualY(\u03C3,'_'))) {
                $line=76;
                $result="RO";
                if (true) break $try;
              }
              else {
                $line=78;
                if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'V'))) {
                  $line=78;
                  $result="V";
                  if (true) break $try;
                }
                else {
                  $line=79;
                  if (($opEqualY(q,"V")&&$opMembrY(\u03C3,$opIntvlY('A','Z')))) {
                    $line=79;
                    $result="V";
                    if (true) break $try;
                  }
                  else {
                    $line=80;
                    if (($opEqualY(q,"V")&&$opEqualY(\u03C3,' '))) {
                      $line=80;
                      $result="E";
                      if (true) break $try;
                    }
                    else {
                      $line=82;
                      if (($opEqualY(q,"E")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                        $line=82;
                        $result="n";
                        if (true) break $try;
                      }
                      else {
                        $line=83;
                        if (($opEqualY(q,"n")&&$opEqualY(\u03C3,' '))) {
                          $line=83;
                          $result="n";
                          if (true) break $try;
                        }
                        else {
                          $line=85;
                          if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'B'))) {
                            $line=85;
                            $result="B";
                            if (true) break $try;
                          }
                          else {
                            $line=86;
                            if (($opEqualY(q,"B")&&$opMembrY(\u03C3,$opIntvlY('A','Z')))) {
                              $line=86;
                              $result="B";
                              if (true) break $try;
                            }
                            else {
                              $line=88;
                              if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'a'))) {
                                $line=88;
                                $result="A";
                                if (true) break $try;
                              }
                              else {
                                $line=89;
                                if (($opEqualY(q,"A")&&$opEqualY(\u03C3,'s'))) {
                                  $line=89;
                                  $result="AS";
                                  if (true) break $try;
                                }
                                else {
                                  $line=90;
                                  if (($opEqualY(q,"AS")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                                    $line=90;
                                    $result="AS";
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=92;
                                    if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'('))) {
                                      $line=92;
                                      $result="P";
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=93;
                                      if (($opEqualY(q,"P")&&$opEqualY(\u03C3,' '))) {
                                        $line=93;
                                        $result="P";
                                        if (true) break $try;
                                      }
                                      else {
                                        $line=94;
                                        if (($opEqualY(q,"P")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                                          $line=94;
                                          $result="n";
                                          if (true) break $try;
                                        }
                                        else {
                                          $line=95;
                                          if (($opEqualY(q,"I")&&$opEqualY(\u03C3,','))) {
                                            $line=95;
                                            $result="I";
                                            if (true) break $try;
                                          }
                                          else {
                                            $line=96;
                                            if (($opEqualY(q,"I")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                                              $line=96;
                                              $result="num";
                                              if (true) break $try;
                                            }
                                            else {
                                              $line=98;
                                              if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'m'))) {
                                                $line=98;
                                                $result="M";
                                                if (true) break $try;
                                              }
                                              else {
                                                $line=99;
                                                if (($opEqualY(q,"M")&&$opEqualY(\u03C3,'o'))) {
                                                  $line=99;
                                                  $result="mo";
                                                  if (true) break $try;
                                                }
                                                else {
                                                  $line=100;
                                                  if (($opEqualY(q,"mo")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                                                    $line=100;
                                                    $result="mo";
                                                    if (true) break $try;
                                                  }
                                                  else {
                                                    $line=102;
                                                    if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'t'))) {
                                                      $line=102;
                                                      $result="t";
                                                      if (true) break $try;
                                                    }
                                                    else {
                                                      $line=103;
                                                      if (($opEqualY(q,"t")&&$opEqualY(\u03C3,'u'))) {
                                                        $line=103;
                                                        $result="tu";
                                                        if (true) break $try;
                                                      }
                                                      else {
                                                        $line=104;
                                                        if (($opEqualY(q,"tu")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                                                          $line=104;
                                                          $result="tu";
                                                          if (true) break $try;
                                                        }
                                                        else {
                                                          $line=106;
                                                          if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'n'))) {
                                                            $line=106;
                                                            $result="N";
                                                            if (true) break $try;
                                                          }
                                                          else {
                                                            $line=107;
                                                            if (($opEqualY(q,"N")&&$opEqualY(\u03C3,'o'))) {
                                                              $line=107;
                                                              $result="NO";
                                                              if (true) break $try;
                                                            }
                                                            else {
                                                              $line=108;
                                                              if (($opEqualY(q,"NO")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                                                                $line=108;
                                                                $result="NO";
                                                                if (true) break $try;
                                                              }
                                                              else {
                                                                $line=109;
                                                                if (($opEqualY(q,"NO")&&$opEqualY(\u03C3,'('))) {
                                                                  $line=109;
                                                                  $result="NO";
                                                                  if (true) break $try;
                                                                }
                                                                else {
                                                                  $line=112;
                                                                  if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'f'))) {
                                                                    $line=112;
                                                                    $result="F";
                                                                    if (true) break $try;
                                                                  }
                                                                  else {
                                                                    $line=113;
                                                                    if (($opEqualY(q,"F")&&$opEqualY(\u03C3,'a'))) {
                                                                      $line=113;
                                                                      $result="FA";
                                                                      if (true) break $try;
                                                                    }
                                                                    else {
                                                                      $line=114;
                                                                      if (($opEqualY(q,"FA")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                                                                        $line=114;
                                                                        $result="FA";
                                                                        if (true) break $try;
                                                                      }
                                                                      else {
                                                                        $line=117;
                                                                        if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'p'))) {
                                                                          $line=117;
                                                                          $result="p";
                                                                          if (true) break $try;
                                                                        }
                                                                        else {
                                                                          $line=118;
                                                                          if (($opEqualY(q,"p")&&$opEqualY(\u03C3,'u'))) {
                                                                            $line=118;
                                                                            $result="pu";
                                                                            if (true) break $try;
                                                                          }
                                                                          else {
                                                                            $line=119;
                                                                            if (($opEqualY(q,"pu")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                                                                              $line=119;
                                                                              $result="pu";
                                                                              if (true) break $try;
                                                                            }
                                                                            else {
                                                                              $line=122;
                                                                              if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'E'))) {
                                                                                $line=122;
                                                                                $result="E";
                                                                                if (true) break $try;
                                                                              }
                                                                              else {
                                                                                $line=123;
                                                                                if (($opEqualY(q,"E")&&$opMembrY(\u03C3,$opIntvlY('A','Z')))) {
                                                                                  $line=123;
                                                                                  $result="EN";
                                                                                  if (true) break $try;
                                                                                }
                                                                                else {
                                                                                  $line=126;
                                                                                  $result="I";
                                                                                  if (true) break $try;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=129;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=134;
      $result="";
      if (true) break $try;
      $line=135;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=138;
      String s=null;
      s=$defaultValue(String.class);
      $line=139;
      s=$cast(String.class,$fix(""));
      $line=141;
      if ((!$opMembrY(q,GCollections.asSet("Err"))&&$opMembrY(\u03C3,GCollections.asSet('(',')',',',' ','\n',';','{','}','[',']')))) {
        $line=142;
        if ((!$opMembrY(\u03C3,GCollections.asSet(' ','\n'))&&!$opMembrY(q,GCollections.asSet("num")))) {
          $line=142;
          s=$cast(String.class,$fix($invokeMethod(String.class,"valueOf",true,null,new Object[]{\u03C3})));
          $line=142;
          $result=s;
          if (true) break $try;
        }
        $line=144;
        if ($opEqualY(q,"RO")) {
          $line=144;
          s=$cast(String.class,$fix("R"));
          $line=144;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=145;
          if ($opEqualY(q,"V")) {
            $line=145;
            s=$cast(String.class,$fix("V"));
            $line=145;
            $result=s;
            if (true) break $try;
          }
          else {
            $line=146;
            if ($opEqualY(q,"n")) {
              $line=146;
              s=$cast(String.class,$fix("n"));
              $line=146;
              $result=s;
              if (true) break $try;
            }
            else {
              $line=147;
              if ($opEqualY(q,"AS")) {
                $line=147;
                s=$cast(String.class,$fix("A"));
                $line=147;
                $result=s;
                if (true) break $try;
              }
              else {
                $line=148;
                if ($opEqualY(q,"num")) {
                  $line=148;
                  s=$cast(String.class,$fix($opAdditY("v",")")));
                  $line=148;
                  $result=s;
                  if (true) break $try;
                }
                else {
                  $line=149;
                  if ($opEqualY(q,"B")) {
                    $line=149;
                    s=$cast(String.class,$fix("B"));
                    $line=149;
                    $result=s;
                    if (true) break $try;
                  }
                  else {
                    $line=150;
                    if ($opEqualY(q,"mo")) {
                      $line=150;
                      s=$cast(String.class,$fix("M"));
                      $line=150;
                      $result=s;
                      if (true) break $try;
                    }
                    else {
                      $line=151;
                      if ($opEqualY(q,"tu")) {
                        $line=151;
                        s=$cast(String.class,$fix("T"));
                        $line=151;
                        $result=s;
                        if (true) break $try;
                      }
                      else {
                        $line=152;
                        if ($opEqualY(q,"NO")) {
                          $line=152;
                          s=$cast(String.class,$fix("!"));
                          $line=152;
                          $result=s;
                          if (true) break $try;
                        }
                        else {
                          $line=153;
                          if ($opEqualY(q,"FA")) {
                            $line=153;
                            s=$cast(String.class,$fix("F"));
                            $line=153;
                            $result=s;
                            if (true) break $try;
                          }
                          else {
                            $line=154;
                            if ($opEqualY(q,"pu")) {
                              $line=154;
                              s=$cast(String.class,$fix("P"));
                              $line=154;
                              $result=s;
                              if (true) break $try;
                            }
                            else {
                              $line=155;
                              if ($opEqualY(q,"EN")) {
                                $line=155;
                                s=$cast(String.class,$fix("E"));
                                $line=155;
                                $result=s;
                                if (true) break $try;
                              }
                              else {
                                $line=156;
                                $result="";
                                if (true) break $try;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      else {
        $line=158;
        $result="";
        if (true) break $try;
      }
      $line=160;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer.class,"h",$line);
    }
    return $result;
  }
}
