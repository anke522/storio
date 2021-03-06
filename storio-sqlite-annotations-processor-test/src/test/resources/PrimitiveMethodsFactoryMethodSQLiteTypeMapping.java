package com.pushtorefresh.storio3.sqlite.annotations;

import com.pushtorefresh.storio3.sqlite.SQLiteTypeMapping;

/**
 * Generated mapping with collection of resolvers.
 */
public class PrimitiveMethodsFactoryMethodSQLiteTypeMapping extends SQLiteTypeMapping<PrimitiveMethodsFactoryMethod> {
    public PrimitiveMethodsFactoryMethodSQLiteTypeMapping() {
        super(new PrimitiveMethodsFactoryMethodStorIOSQLitePutResolver(),
                new PrimitiveMethodsFactoryMethodStorIOSQLiteGetResolver(),
                new PrimitiveMethodsFactoryMethodStorIOSQLiteDeleteResolver());
    }
}