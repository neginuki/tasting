/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package world.sake.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import world.sake.dbflute.allcommon.*;
import world.sake.dbflute.cbean.*;
import world.sake.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of nihonshu.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsNihonshuCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNihonshuCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "nihonshu";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuId The value of nihonshuId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNihonshuId_Equal(Long nihonshuId) {
        doSetNihonshuId_Equal(nihonshuId);
    }

    protected void doSetNihonshuId_Equal(Long nihonshuId) {
        regNihonshuId(CK_EQ, nihonshuId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuId The value of nihonshuId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNihonshuId_NotEqual(Long nihonshuId) {
        doSetNihonshuId_NotEqual(nihonshuId);
    }

    protected void doSetNihonshuId_NotEqual(Long nihonshuId) {
        regNihonshuId(CK_NES, nihonshuId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuId The value of nihonshuId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNihonshuId_GreaterThan(Long nihonshuId) {
        regNihonshuId(CK_GT, nihonshuId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuId The value of nihonshuId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNihonshuId_LessThan(Long nihonshuId) {
        regNihonshuId(CK_LT, nihonshuId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuId The value of nihonshuId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNihonshuId_GreaterEqual(Long nihonshuId) {
        regNihonshuId(CK_GE, nihonshuId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuId The value of nihonshuId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNihonshuId_LessEqual(Long nihonshuId) {
        regNihonshuId(CK_LE, nihonshuId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of nihonshuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nihonshuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNihonshuId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNihonshuId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of nihonshuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nihonshuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNihonshuId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNihonshuId(), "NIHONSHU_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuIdList The collection of nihonshuId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNihonshuId_InScope(Collection<Long> nihonshuIdList) {
        doSetNihonshuId_InScope(nihonshuIdList);
    }

    protected void doSetNihonshuId_InScope(Collection<Long> nihonshuIdList) {
        regINS(CK_INS, cTL(nihonshuIdList), xgetCValueNihonshuId(), "NIHONSHU_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nihonshuIdList The collection of nihonshuId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNihonshuId_NotInScope(Collection<Long> nihonshuIdList) {
        doSetNihonshuId_NotInScope(nihonshuIdList);
    }

    protected void doSetNihonshuId_NotInScope(Collection<Long> nihonshuIdList) {
        regINS(CK_NINS, cTL(nihonshuIdList), xgetCValueNihonshuId(), "NIHONSHU_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setNihonshuId_IsNull() { regNihonshuId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setNihonshuId_IsNotNull() { regNihonshuId(CK_ISNN, DOBJ); }

    protected void regNihonshuId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNihonshuId(), "NIHONSHU_ID"); }
    protected abstract ConditionValue xgetCValueNihonshuId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)}
     * @param nihonshuName The value of nihonshuName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNihonshuName_Equal(String nihonshuName) {
        doSetNihonshuName_Equal(fRES(nihonshuName));
    }

    protected void doSetNihonshuName_Equal(String nihonshuName) {
        regNihonshuName(CK_EQ, nihonshuName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setNihonshuName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nihonshuName The value of nihonshuName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNihonshuName_LikeSearch(String nihonshuName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNihonshuName_LikeSearch(nihonshuName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setNihonshuName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nihonshuName The value of nihonshuName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNihonshuName_LikeSearch(String nihonshuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nihonshuName), xgetCValueNihonshuName(), "NIHONSHU_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)}
     * @param nihonshuName The value of nihonshuName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNihonshuName_NotLikeSearch(String nihonshuName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNihonshuName_NotLikeSearch(nihonshuName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)}
     * @param nihonshuName The value of nihonshuName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNihonshuName_NotLikeSearch(String nihonshuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nihonshuName), xgetCValueNihonshuName(), "NIHONSHU_NAME", likeSearchOption);
    }

    protected void regNihonshuName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNihonshuName(), "NIHONSHU_NAME"); }
    protected abstract ConditionValue xgetCValueNihonshuName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NihonshuCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, NihonshuCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NihonshuCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, NihonshuCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NihonshuCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, NihonshuCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NihonshuCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, NihonshuCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NihonshuCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, NihonshuCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NihonshuCB&gt;() {
     *     public void query(NihonshuCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NihonshuCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, NihonshuCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        NihonshuCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(NihonshuCQ sq);

    protected NihonshuCB xcreateScalarConditionCB() {
        NihonshuCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected NihonshuCB xcreateScalarConditionPartitionByCB() {
        NihonshuCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<NihonshuCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NihonshuCB cb = new NihonshuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NIHONSHU_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(NihonshuCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NihonshuCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(NihonshuCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NihonshuCB cb = new NihonshuCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NIHONSHU_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(NihonshuCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<NihonshuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        NihonshuCB cb = new NihonshuCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(NihonshuCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected NihonshuCB newMyCB() {
        return new NihonshuCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return NihonshuCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
