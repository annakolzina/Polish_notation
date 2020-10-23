import java.util.Stack;

public class Logic{
    private Stack operands;

    private Stack polichWrite;

    private Stack result;

    private String steamString;

    private static char[] arrayNumbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public Logic(String steamString){
        this.steamString = steamString;
    }

    public void setStreamString(String steamString){
        this.steamString = steamString;
    }

    public String getStreamString(){
        return steamString;
    }

    private static boolean findElement(char n){
        for(char item : arrayNumbers){
            if(n == item)
                return true;
        }
        return false;
    }

    //создание обратной польской записи
    /*private void CreatePolichWrite(){
      for(int i=0; i<2; i++){
        if(findElement(steamString.charAt(i))== true)
          polichWrite.push(steamString.charAt(i));
      }
        for(int i=0; i<steamString.lenght(); i++){
            //проверка операнда
            if(findElement(steamString.charAt(i))==true)
                polichWrite.push(steamString.charAt(i));
            //проверка оператора
            else{
                if(steamString.charAt(i) == '/' || steamString.charAt(i) == '*')
                {
                    if(operands.peek()=='*'|| operands.peek()=='/')
                        {
                            polichWrite.push(operands.pop());
                            operands.push(steamString.charAt(i));
                        }
                    else if(operands.peek()=='+' || operands.peek()=='-'){
                        polichWrite.push(steamString.charAt(i));
                        polichWrite.push(operands.pop());
                    }
                    else
                        operands.push(steamString.charAt(i));
                }
                else if(steamString.charAt(i) == "+" || steamString.charAt(i) =="-"){
                    if(operands.peek()=="*" || operands.peek()=="/")
                        polichWrite.push(steamString.charAt(i));
                    else if(operands.peek()=='+'||operands.peek()=='-'){
                        polichWrite.push(operators.pop());
                        operands.push(steamString.charAt(i));
                    }
                    else
                        operands.push(steamString.charAt(i));
                }
                else if(steamString.charAt(i) == '(' || steamString.charAt(i) ==')'){
                    if(item == ')'){
                        while(operands.peek()!=')'){
                            polichWrite.push(operands.pop());
                        }
                        operands.pop();
                    }
                    else
                        operands.push();
                }
            }
        }
    }

    public void Foo(){
      CreatePolichWrite();
      System.out.println(polichWrite.pop());
    }*/

}
