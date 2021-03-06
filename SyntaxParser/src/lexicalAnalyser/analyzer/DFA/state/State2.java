package lexicalAnalyser.analyzer.DFA.state;


import lexicalAnalyser.analyzer.DFA.TerminalType;

/**
 * Created by Thpffcj on 2017/10/20.
 */
public class State2 implements State {

    public static int STATE_INDEX = 2;

    @Override
    public int nextState(char c, String lexeme) {
        if ('.' == c) {
            return State3.STATE_INDEX;
        } else if (c >= '0' && c <= '9') {
            return State2.STATE_INDEX;
        } else {
            return -1;
        }
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public TerminalType getTokenType() {
        return TerminalType.CONSTANT;
    }
}
