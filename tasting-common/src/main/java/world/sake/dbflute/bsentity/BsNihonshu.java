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
package world.sake.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import world.sake.dbflute.allcommon.DBMetaInstanceHandler;
import world.sake.dbflute.exentity.*;

/**
 * The entity of (日本酒)NIHONSHU as TABLE. <br>
 * <pre>
 * [primary-key]
 *     NIHONSHU_ID
 *
 * [column]
 *     NIHONSHU_ID, NIHONSHU_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIHONSHU_ID
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
 * Long nihonshuId = entity.getNihonshuId();
 * String nihonshuName = entity.getNihonshuName();
 * entity.setNihonshuId(nihonshuId);
 * entity.setNihonshuName(nihonshuName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNihonshu extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _nihonshuId;

    /** (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)} */
    protected String _nihonshuName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "nihonshu";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_nihonshuId == null) { return false; }
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
        if (obj instanceof BsNihonshu) {
            BsNihonshu other = (BsNihonshu)obj;
            if (!xSV(_nihonshuId, other._nihonshuId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _nihonshuId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_nihonshuId));
        sb.append(dm).append(xfND(_nihonshuName));
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
    public Nihonshu clone() {
        return (Nihonshu)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'NIHONSHU_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNihonshuId() {
        checkSpecifiedProperty("nihonshuId");
        return _nihonshuId;
    }

    /**
     * [set] (日本酒ID)NIHONSHU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param nihonshuId The value of the column 'NIHONSHU_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNihonshuId(Long nihonshuId) {
        registerModifiedProperty("nihonshuId");
        _nihonshuId = nihonshuId;
    }

    /**
     * [get] (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'NIHONSHU_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getNihonshuName() {
        checkSpecifiedProperty("nihonshuName");
        return convertEmptyToNull(_nihonshuName);
    }

    /**
     * [set] (日本酒名)NIHONSHU_NAME: {NotNull, VARCHAR(255)} <br>
     * @param nihonshuName The value of the column 'NIHONSHU_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setNihonshuName(String nihonshuName) {
        registerModifiedProperty("nihonshuName");
        _nihonshuName = nihonshuName;
    }
}
