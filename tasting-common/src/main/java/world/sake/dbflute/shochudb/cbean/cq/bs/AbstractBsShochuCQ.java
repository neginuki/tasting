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
package world.sake.dbflute.shochudb.cbean.cq.bs;

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
import world.sake.dbflute.shochudb.allcommon.*;
import world.sake.dbflute.shochudb.cbean.*;
import world.sake.dbflute.shochudb.cbean.cq.*;

/**
 * The abstract condition-query of shochu.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsShochuCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsShochuCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "shochu";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuId The value of shochuId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShochuId_Equal(Long shochuId) {
        doSetShochuId_Equal(shochuId);
    }

    protected void doSetShochuId_Equal(Long shochuId) {
        regShochuId(CK_EQ, shochuId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuId The value of shochuId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShochuId_NotEqual(Long shochuId) {
        doSetShochuId_NotEqual(shochuId);
    }

    protected void doSetShochuId_NotEqual(Long shochuId) {
        regShochuId(CK_NES, shochuId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuId The value of shochuId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShochuId_GreaterThan(Long shochuId) {
        regShochuId(CK_GT, shochuId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuId The value of shochuId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShochuId_LessThan(Long shochuId) {
        regShochuId(CK_LT, shochuId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuId The value of shochuId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShochuId_GreaterEqual(Long shochuId) {
        regShochuId(CK_GE, shochuId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuId The value of shochuId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShochuId_LessEqual(Long shochuId) {
        regShochuId(CK_LE, shochuId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shochuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shochuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setShochuId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setShochuId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shochuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shochuId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setShochuId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShochuId(), "SHOCHU_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuIdList The collection of shochuId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShochuId_InScope(Collection<Long> shochuIdList) {
        doSetShochuId_InScope(shochuIdList);
    }

    protected void doSetShochuId_InScope(Collection<Long> shochuIdList) {
        regINS(CK_INS, cTL(shochuIdList), xgetCValueShochuId(), "SHOCHU_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shochuIdList The collection of shochuId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShochuId_NotInScope(Collection<Long> shochuIdList) {
        doSetShochuId_NotInScope(shochuIdList);
    }

    protected void doSetShochuId_NotInScope(Collection<Long> shochuIdList) {
        regINS(CK_NINS, cTL(shochuIdList), xgetCValueShochuId(), "SHOCHU_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShochuId_IsNull() { regShochuId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShochuId_IsNotNull() { regShochuId(CK_ISNN, DOBJ); }

    protected void regShochuId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShochuId(), "SHOCHU_ID"); }
    protected abstract ConditionValue xgetCValueShochuId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)}
     * @param shochuName The value of shochuName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShochuName_Equal(String shochuName) {
        doSetShochuName_Equal(fRES(shochuName));
    }

    protected void doSetShochuName_Equal(String shochuName) {
        regShochuName(CK_EQ, shochuName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setShochuName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shochuName The value of shochuName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShochuName_LikeSearch(String shochuName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShochuName_LikeSearch(shochuName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setShochuName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shochuName The value of shochuName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShochuName_LikeSearch(String shochuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shochuName), xgetCValueShochuName(), "SHOCHU_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)}
     * @param shochuName The value of shochuName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShochuName_NotLikeSearch(String shochuName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShochuName_NotLikeSearch(shochuName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)}
     * @param shochuName The value of shochuName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShochuName_NotLikeSearch(String shochuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shochuName), xgetCValueShochuName(), "SHOCHU_NAME", likeSearchOption);
    }

    protected void regShochuName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShochuName(), "SHOCHU_NAME"); }
    protected abstract ConditionValue xgetCValueShochuName();

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
    public HpSLCFunction<ShochuCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ShochuCB.class);
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
    public HpSLCFunction<ShochuCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ShochuCB.class);
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
    public HpSLCFunction<ShochuCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ShochuCB.class);
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
    public HpSLCFunction<ShochuCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ShochuCB.class);
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
    public HpSLCFunction<ShochuCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ShochuCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ShochuCB&gt;() {
     *     public void query(ShochuCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ShochuCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ShochuCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ShochuCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ShochuCQ sq);

    protected ShochuCB xcreateScalarConditionCB() {
        ShochuCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ShochuCB xcreateScalarConditionPartitionByCB() {
        ShochuCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ShochuCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ShochuCB cb = new ShochuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHOCHU_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ShochuCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ShochuCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ShochuCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ShochuCB cb = new ShochuCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHOCHU_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ShochuCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ShochuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ShochuCB cb = new ShochuCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ShochuCQ sq);

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
    protected ShochuCB newMyCB() {
        return new ShochuCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ShochuCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
