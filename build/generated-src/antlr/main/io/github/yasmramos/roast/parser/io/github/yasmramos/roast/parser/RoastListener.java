// Generated from io/github/yasmramos/roast/parser/Roast.g4 by ANTLR 4.13.1
package io.github.yasmramos.roast.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RoastParser}.
 */
public interface RoastListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RoastParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RoastParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RoastParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(RoastParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(RoastParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclStmt(RoastParser.FuncDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclStmt(RoastParser.FuncDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclStmt(RoastParser.ClassDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclStmt(RoastParser.ClassDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclStmt(RoastParser.InterfaceDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDeclStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclStmt(RoastParser.InterfaceDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(RoastParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(RoastParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(RoastParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(RoastParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(RoastParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(RoastParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhenStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhenStmt(RoastParser.WhenStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhenStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhenStmt(RoastParser.WhenStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(RoastParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(RoastParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(RoastParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(RoastParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(RoastParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(RoastParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(RoastParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(RoastParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(RoastParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(RoastParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatchStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStmt(RoastParser.TryCatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatchStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStmt(RoastParser.TryCatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmt(RoastParser.ThrowStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowStmt}
	 * labeled alternative in {@link RoastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmt(RoastParser.ThrowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(RoastParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(RoastParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImmutableVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImmutableVar(RoastParser.ImmutableVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImmutableVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImmutableVar(RoastParser.ImmutableVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MutableVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMutableVar(RoastParser.MutableVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MutableVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMutableVar(RoastParser.MutableVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedVar(RoastParser.TypedVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedVar}
	 * labeled alternative in {@link RoastParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedVar(RoastParser.TypedVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RoastParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RoastParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCustomType(RoastParser.CustomTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCustomType(RoastParser.CustomTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(RoastParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(RoastParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterLongType(RoastParser.LongTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitLongType(RoastParser.LongTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(RoastParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(RoastParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(RoastParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(RoastParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterShortType(RoastParser.ShortTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitShortType(RoastParser.ShortTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(RoastParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(RoastParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(RoastParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(RoastParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterByteType(RoastParser.ByteTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitByteType(RoastParser.ByteTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullableType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(RoastParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullableType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(RoastParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(RoastParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(RoastParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(RoastParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(RoastParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(RoastParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(RoastParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(RoastParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(RoastParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterUnitType(RoastParser.UnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitUnitType(RoastParser.UnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCharType(RoastParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCharType(RoastParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlatformType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPlatformType(RoastParser.PlatformTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlatformType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPlatformType(RoastParser.PlatformTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(RoastParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(RoastParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NothingType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNothingType(RoastParser.NothingTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NothingType}
	 * labeled alternative in {@link RoastParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNothingType(RoastParser.NothingTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(RoastParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(RoastParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExternalFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalFunc(RoastParser.ExternalFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExternalFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalFunc(RoastParser.ExternalFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInlineFunc(RoastParser.InlineFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInlineFunc(RoastParser.InlineFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TailRecFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTailRecFunc(RoastParser.TailRecFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TailRecFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTailRecFunc(RoastParser.TailRecFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuspendFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSuspendFunc(RoastParser.SuspendFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuspendFunc}
	 * labeled alternative in {@link RoastParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSuspendFunc(RoastParser.SuspendFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(RoastParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(RoastParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(RoastParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(RoastParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(RoastParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(RoastParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectDef}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDef(RoastParser.ObjectDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectDef}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDef(RoastParser.ObjectDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompanionObj}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObj(RoastParser.CompanionObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompanionObj}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObj(RoastParser.CompanionObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDataClass(RoastParser.DataClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDataClass(RoastParser.DataClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SealedClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSealedClass(RoastParser.SealedClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SealedClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSealedClass(RoastParser.SealedClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumClass(RoastParser.EnumClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumClass}
	 * labeled alternative in {@link RoastParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumClass(RoastParser.EnumClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDef}
	 * labeled alternative in {@link RoastParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDef(RoastParser.InterfaceDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDef}
	 * labeled alternative in {@link RoastParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDef(RoastParser.InterfaceDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(RoastParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(RoastParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(RoastParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(RoastParser.PrimaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#constructorParameters}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameters(RoastParser.ConstructorParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#constructorParameters}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameters(RoastParser.ConstructorParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#constructorParameter}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameter(RoastParser.ConstructorParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#constructorParameter}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameter(RoastParser.ConstructorParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(RoastParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(RoastParser.DelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(RoastParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(RoastParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(RoastParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(RoastParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(RoastParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(RoastParser.EnumEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(RoastParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(RoastParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(RoastParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(RoastParser.EnumClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(RoastParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(RoastParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(RoastParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(RoastParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(RoastParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(RoastParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(RoastParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(RoastParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(RoastParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(RoastParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#initializerBlock}.
	 * @param ctx the parse tree
	 */
	void enterInitializerBlock(RoastParser.InitializerBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#initializerBlock}.
	 * @param ctx the parse tree
	 */
	void exitInitializerBlock(RoastParser.InitializerBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(RoastParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(RoastParser.SecondaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#thisOrSuperCall}.
	 * @param ctx the parse tree
	 */
	void enterThisOrSuperCall(RoastParser.ThisOrSuperCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#thisOrSuperCall}.
	 * @param ctx the parse tree
	 */
	void exitThisOrSuperCall(RoastParser.ThisOrSuperCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#nestedClass}.
	 * @param ctx the parse tree
	 */
	void enterNestedClass(RoastParser.NestedClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#nestedClass}.
	 * @param ctx the parse tree
	 */
	void exitNestedClass(RoastParser.NestedClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(RoastParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(RoastParser.CompanionObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(RoastParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(RoastParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhenStatement(RoastParser.WhenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhenStatement(RoastParser.WhenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(RoastParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(RoastParser.WhenEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(RoastParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(RoastParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(RoastParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(RoastParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(RoastParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(RoastParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(RoastParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(RoastParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(RoastParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(RoastParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(RoastParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(RoastParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(RoastParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(RoastParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(RoastParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(RoastParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(RoastParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(RoastParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(RoastParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(RoastParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpr(RoastParser.IsNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpr(RoastParser.IsNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCommaExpr(RoastParser.CommaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCommaExpr(RoastParser.CommaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(RoastParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(RoastParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Label}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabel(RoastParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabel(RoastParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(RoastParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(RoastParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(RoastParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(RoastParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SafeCastExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSafeCastExpr(RoastParser.SafeCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeCastExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSafeCastExpr(RoastParser.SafeCastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SafeCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSafeCall(RoastParser.SafeCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSafeCall(RoastParser.SafeCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(RoastParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(RoastParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullCoalescingExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullCoalescingExpr(RoastParser.NullCoalescingExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullCoalescingExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullCoalescingExpr(RoastParser.NullCoalescingExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(RoastParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(RoastParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(RoastParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(RoastParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(RoastParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(RoastParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpr(RoastParser.IsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpr(RoastParser.IsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(RoastParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(RoastParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(RoastParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(RoastParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(RoastParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(RoastParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpr(RoastParser.SuperExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpr(RoastParser.SuperExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(RoastParser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(RoastParser.IndexAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(RoastParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(RoastParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(RoastParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(RoastParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(RoastParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(RoastParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpr(RoastParser.TupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpr(RoastParser.TupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SafeMethodCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSafeMethodCall(RoastParser.SafeMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeMethodCall}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSafeMethodCall(RoastParser.SafeMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(RoastParser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(RoastParser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(RoastParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(RoastParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(RoastParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(RoastParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapLiteral}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteral(RoastParser.MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapLiteral}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteral(RoastParser.MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(RoastParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(RoastParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(RoastParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(RoastParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(RoastParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(RoastParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodReference}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(RoastParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodReference}
	 * labeled alternative in {@link RoastParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(RoastParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(RoastParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(RoastParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoastParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RoastParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoastParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RoastParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(RoastParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(RoastParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatLit(RoastParser.FloatLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatLit(RoastParser.FloatLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLit(RoastParser.DoubleLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLit(RoastParser.DoubleLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LongLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLongLit(RoastParser.LongLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LongLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLongLit(RoastParser.LongLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ByteLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterByteLit(RoastParser.ByteLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ByteLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitByteLit(RoastParser.ByteLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterShortLit(RoastParser.ShortLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitShortLit(RoastParser.ShortLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterCharLit(RoastParser.CharLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitCharLit(RoastParser.CharLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(RoastParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(RoastParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolLit(RoastParser.BoolLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolLit(RoastParser.BoolLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLit(RoastParser.NullLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLit(RoastParser.NullLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterUnitLit(RoastParser.UnitLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitLit}
	 * labeled alternative in {@link RoastParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitUnitLit(RoastParser.UnitLitContext ctx);
}