package Dp_Questions;

import java.lang.annotation.Annotation;

public class MyAnnImpl implements MyAnn{
    @Override
    public String name() {

        return "";
    }

    @Override
    public int t() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
