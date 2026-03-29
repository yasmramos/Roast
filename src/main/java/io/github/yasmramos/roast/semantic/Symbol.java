package io.github.yasmramos.roast.semantic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Represents a symbol in the symbol table.
 */
public class Symbol {
    private final String name;
    private final String type;
    private final int scopeLevel;
    private boolean isMutable;
    private boolean isInitialized;

    public Symbol(String name, String type, int scopeLevel, boolean isMutable) {
        this.name = name;
        this.type = type;
        this.scopeLevel = scopeLevel;
        this.isMutable = isMutable;
        this.isInitialized = false;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getScopeLevel() {
        return scopeLevel;
    }

    public boolean isMutable() {
        return isMutable;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setInitialized(boolean initialized) {
        isInitialized = initialized;
    }

    @Override
    public String toString() {
        return String.format("Symbol{name='%s', type='%s', scope=%d, mutable=%b}", 
                           name, type, scopeLevel, isMutable);
    }
}
