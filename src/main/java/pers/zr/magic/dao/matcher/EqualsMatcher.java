package pers.zr.magic.dao.matcher;

import pers.zr.magic.dao.constants.MatchType;

/**
 * Created by zhurong on 2016-4-29.
 */
public class EqualsMatcher extends Matcher {

    private Object value;

    public EqualsMatcher(String column, Object value) {

        //转义特殊字符
        if(value instanceof String) {
            value = convertSpecialChar(String.valueOf(value), MatchType.EQUALS);
        }
        this.value = value;
        this.column = column;
    }

    @Override
    public MatchType getMatchType() {
        return MatchType.EQUALS;
    }

    public Object[] getValues() {
        return new Object[]{value};
    }
}
