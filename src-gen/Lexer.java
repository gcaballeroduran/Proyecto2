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
      Object preKW=$fix(GCollections.asSet("p","pl","plu","plus","t","ti","tim","time","times"));
      $line=62;
      Object Q=$fix(GCollections.asSet("I","Id","p","pl","plu","plus","t","ti","tim","time","times","Num","Err"));
      $line=64;
      Object \u03A3=$fix($opUnionY($opUnionY($opIntvlY('0','9'),$opIntvlY('a','z')),GCollections.asSet('(',')',' ','\n')));
      $line=65;
      Object Out=$fix(GCollections.asSet('(',')','+','*','v','n'));
      $line=66;
      Object q_0=$fix("I");
      $line=67;
      Object F=$fix(GCollections.asSet("I"));
      $line=68;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Lexer.class,"\u03B4"),new GMethod(Lexer.class,"g"),new GMethod(Lexer.class,"h")});
      if (true) break $try;
      $line=69;
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
      $line=72;
      if ($bool($opEqualY(q,"Err"))) {
        $line=72;
        $result="Err";
        if (true) break $try;
      }
      else {
        $line=73;
        if ($opMembrY(\u03C3,GCollections.asSet('(',')',' ','\n'))) {
          $line=73;
          $result="I";
          if (true) break $try;
        }
        else {
          $line=74;
          if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'p'))) {
            $line=74;
            $result="p";
            if (true) break $try;
          }
          else {
            $line=75;
            if (($opEqualY(q,"I")&&$opEqualY(\u03C3,'t'))) {
              $line=75;
              $result="t";
              if (true) break $try;
            }
            else {
              $line=76;
              if (($opEqualY(q,"I")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                $line=76;
                $result="Num";
                if (true) break $try;
              }
              else {
                $line=77;
                if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                  $line=77;
                  $result="Num";
                  if (true) break $try;
                }
                else {
                  $line=78;
                  if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,$opIntvlY('a','z')))) {
                    $line=78;
                    $result="Err";
                    if (true) break $try;
                  }
                  else {
                    $line=80;
                    if (($opEqualY(q,"p")&&$opEqualY(\u03C3,'l'))) {
                      $line=80;
                      $result="pl";
                      if (true) break $try;
                    }
                    else {
                      $line=81;
                      if (($opEqualY(q,"pl")&&$opEqualY(\u03C3,'u'))) {
                        $line=81;
                        $result="plu";
                        if (true) break $try;
                      }
                      else {
                        $line=82;
                        if (($opEqualY(q,"plu")&&$opEqualY(\u03C3,'s'))) {
                          $line=82;
                          $result="plus";
                          if (true) break $try;
                        }
                        else {
                          $line=83;
                          if (($opEqualY(q,"t")&&$opEqualY(\u03C3,'i'))) {
                            $line=83;
                            $result="ti";
                            if (true) break $try;
                          }
                          else {
                            $line=84;
                            if (($opEqualY(q,"ti")&&$opEqualY(\u03C3,'m'))) {
                              $line=84;
                              $result="tim";
                              if (true) break $try;
                            }
                            else {
                              $line=85;
                              if (($opEqualY(q,"tim")&&$opEqualY(\u03C3,'e'))) {
                                $line=85;
                                $result="time";
                                if (true) break $try;
                              }
                              else {
                                $line=86;
                                if (($opEqualY(q,"time")&&$opEqualY(\u03C3,'s'))) {
                                  $line=86;
                                  $result="times";
                                  if (true) break $try;
                                }
                                else {
                                  $line=89;
                                  $result="Id";
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
      $line=91;
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
      $line=96;
      $result="";
      if (true) break $try;
      $line=97;
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
      $line=100;
      String s=null;
      s=$defaultValue(String.class);
      $line=101;
      s=$cast(String.class,$fix(""));
      $line=103;
      if ((!$opMembrY(q,GCollections.asSet("Err"))&&$opMembrY(\u03C3,GCollections.asSet('(',')',' ','\n')))) {
        $line=104;
        if (!$opMembrY(\u03C3,GCollections.asSet(' ','\n'))) {
          $line=104;
          s=$cast(String.class,$fix($invokeMethod(String.class,"valueOf",true,null,new Object[]{\u03C3})));
        }
        $line=105;
        if ($opEqualY(q,"I")) {
          $line=105;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=106;
          if ($opEqualY(q,"plus")) {
            $line=106;
            $result=$opAdditY("+",s);
            if (true) break $try;
          }
          else {
            $line=107;
            if ($opEqualY(q,"times")) {
              $line=107;
              $result=$opAdditY("*",s);
              if (true) break $try;
            }
            else {
              $line=108;
              if ($opEqualY(q,"Num")) {
                $line=108;
                $result=$opAdditY("n",s);
                if (true) break $try;
              }
              else {
                $line=109;
                $result=$opAdditY("v",s);
                if (true) break $try;
              }
            }
          }
        }
      }
      else {
        $line=111;
        $result="";
        if (true) break $try;
      }
      $line=112;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer.class,"h",$line);
    }
    return $result;
  }
}
