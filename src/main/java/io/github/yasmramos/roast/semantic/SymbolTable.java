package io.github.yasmramos.roast.semantic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Manages symbols and scopes for semantic analysis.
 */
public class SymbolTable {
    private final Stack<Map<String, Symbol>> scopes = new Stack<>();
    private int currentScopeLevel = 0;

    public SymbolTable() {
        enterScope(); // Global scope
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
        currentScopeLevel++;
    }

    public void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
            currentScopeLevel--;
        }
    }

    public boolean defineSymbol(String name, String type, boolean isMutable) {
        if (scopes.isEmpty()) {
            return false;
        }

        Map<String, Symbol> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
            return false; // Symbol already defined in this scope
        }

        Symbol symbol = new Symbol(name, type, currentScopeLevel, isMutable);
        currentScope.put(name, symbol);
        return true;
    }

    public Symbol resolveSymbol(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, Symbol> scope = scopes.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null; // Symbol not found
    }

    public int getCurrentScopeLevel() {
        return currentScopeLevel;
    }

    public boolean isInGlobalScope() {
        return scopes.size() == 1;
    }
}
