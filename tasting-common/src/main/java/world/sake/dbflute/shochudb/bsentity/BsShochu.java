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
package world.sake.dbflute.shochudb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import world.sake.dbflute.shochudb.allcommon.DBMetaInstanceHandler;
import world.sake.dbflute.shochudb.exentity.*;

/**
 * The entity of (焼酎)SHOCHU as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SHOCHU_ID
 *
 * [column]
 *     SHOCHU_ID, SHOCHU_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHOCHU_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shochuId = entity.getShochuId();
 * String shochuName = entity.getShochuName();
 * entity.setShochuId(shochuId);
 * entity.setShochuName(shochuName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsShochu extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _shochuId;

    /** (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)} */
    protected String _shochuName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "shochu";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_shochuId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsShochu) {
            BsShochu other = (BsShochu)obj;
            if (!xSV(_shochuId, other._shochuId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shochuId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shochuId));
        sb.append(dm).append(xfND(_shochuName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Shochu clone() {
        return (Shochu)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'SHOCHU_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShochuId() {
        checkSpecifiedProperty("shochuId");
        return _shochuId;
    }

    /**
     * [set] (焼酎ID)SHOCHU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param shochuId The value of the column 'SHOCHU_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShochuId(Long shochuId) {
        registerModifiedProperty("shochuId");
        _shochuId = shochuId;
    }

    /**
     * [get] (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'SHOCHU_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getShochuName() {
        checkSpecifiedProperty("shochuName");
        return convertEmptyToNull(_shochuName);
    }

    /**
     * [set] (焼酎名)SHOCHU_NAME: {NotNull, VARCHAR(255)} <br>
     * @param shochuName The value of the column 'SHOCHU_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setShochuName(String shochuName) {
        registerModifiedProperty("shochuName");
        _shochuName = shochuName;
    }
}
