package Easy;

public class GoalParserInterpretation_1678 {
    public String interpret(String command) {
        StringBuilder builder=new StringBuilder();
        int i=0;
        while(i<command.length()){
            if(command.charAt(i)=='G'){
                builder.append(command.charAt(i));
                i++;
                continue;
            }
            if (command.charAt(i)=='('){
                i++;
                if (command.charAt(i)==')'){
                    builder.append('o');
                    i++;
                }else {
                    builder.append("al");
                    i+=3;
                }
            }
        }
        return builder.toString();
    }
}
