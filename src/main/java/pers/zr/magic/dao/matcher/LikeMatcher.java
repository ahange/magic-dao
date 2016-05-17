package pers.zr.magic.dao.matcher;

import pers.zr.magic.dao.constants.MatchType;

/**
 * Created by zhurong on 2016-4-29.
 */
public class LikeMatcher extends Matcher {

    private String value;

    public LikeMatcher(String column, String value) {
        this.column = column;
        this.value = "%" + convertSpecialChar(value, MatchType.LIKE) + "%"; //转义特殊字符
    }

    public Object[] getValues() {
        return new String[]{value};
    }

    @Override
    public MatchType getMatchType() {
        return MatchType.LIKE;
    }
}
