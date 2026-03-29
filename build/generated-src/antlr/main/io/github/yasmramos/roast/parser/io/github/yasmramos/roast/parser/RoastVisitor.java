// Generated from io/github/yasmramos/roast/parser/Roast.g4 by ANTLR 4.13.1
package io.github.yasmramos.roast.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RoastParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RoastVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RoastParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RoastParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(RoastParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclStmt(RoastParser.FuncDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclStmt(RoastParser.ClassDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclStmt(RoastParser.InterfaceDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(RoastParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(RoastParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(RoastParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhenStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStmt(RoastParser.WhenStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(RoastParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(RoastParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(RoastParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(RoastParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(RoastParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatchStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStmt(RoastParser.TryCatchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStmt(RoastParser.ThrowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(RoastParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImmutableVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmutableVar(RoastParser.ImmutableVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MutableVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutableVar(RoastParser.MutableVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedVar(RoastParser.TypedVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RoastParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomType(RoastParser.CustomTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(RoastParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongType(RoastParser.LongTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(RoastParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(RoastParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortType(RoastParser.ShortTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(RoastParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(RoastParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteType(RoastParser.ByteTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullableType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(RoastParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(RoastParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(RoastParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(RoastParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(RoastParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitType(RoastParser.UnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(RoastParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlatformType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatformType(RoastParser.PlatformTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyType(RoastParser.AnyTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NothingType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothingType(RoastParser.NothingTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(RoastParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExternalFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalFunc(RoastParser.ExternalFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineFunc(RoastParser.InlineFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TailRecFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTailRecFunc(RoastParser.TailRecFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuspendFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuspendFunc(RoastParser.SuspendFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(RoastParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(RoastParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(RoastParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectDef}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDef(RoastParser.ObjectDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompanionObj}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompanionObj(RoastParser.CompanionObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataClass(RoastParser.DataClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SealedClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSealedClass(RoastParser.SealedClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClass(RoastParser.EnumClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDef}
	 * labeled alternative in {@link RoastParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDef(RoastParser.InterfaceDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(RoastParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(RoastParser.PrimaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#constructorParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameters(RoastParser.ConstructorParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#constructorParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameter(RoastParser.ConstructorParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifiers(RoastParser.DelegationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(RoastParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(RoastParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#enumEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntries(RoastParser.EnumEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(RoastParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#enumClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClassBody(RoastParser.EnumClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(RoastParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(RoastParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(RoastParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(RoastParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(RoastParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#initializerBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerBlock(RoastParser.InitializerBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryConstructor(RoastParser.SecondaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#thisOrSuperCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisOrSuperCall(RoastParser.ThisOrSuperCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#nestedClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedClass(RoastParser.NestedClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#companionObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompanionObject(RoastParser.CompanionObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(RoastParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#whenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStatement(RoastParser.WhenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#whenEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenEntry(RoastParser.WhenEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(RoastParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(RoastParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(RoastParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(RoastParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(RoastParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(RoastParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(RoastParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(RoastParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(RoastParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(RoastParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNotExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotExpr(RoastParser.IsNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaExpr(RoastParser.CommaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(RoastParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(RoastParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(RoastParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(RoastParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeCastExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeCastExpr(RoastParser.SafeCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeCall(RoastParser.SafeCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(RoastParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullCoalescingExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCoalescingExpr(RoastParser.NullCoalescingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(RoastParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(RoastParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(RoastParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpr(RoastParser.IsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(RoastParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(RoastParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(RoastParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpr(RoastParser.SuperExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(RoastParser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(RoastParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(RoastParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(RoastParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpr(RoastParser.TupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeMethodCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeMethodCall(RoastParser.SafeMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(RoastParser.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(RoastParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(RoastParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapLiteral}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(RoastParser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(RoastParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(RoastParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(RoastParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodReference}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(RoastParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(RoastParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoastParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RoastParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(RoastParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLit(RoastParser.FloatLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLit(RoastParser.DoubleLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLit(RoastParser.LongLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ByteLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteLit(RoastParser.ByteLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortLit(RoastParser.ShortLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLit(RoastParser.CharLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit(RoastParser.StringLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLit(RoastParser.BoolLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLit(RoastParser.NullLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitLit(RoastParser.UnitLitContext ctx);
}