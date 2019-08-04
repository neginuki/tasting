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
package world.sake.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import world.sake.dbflute.exbhv.*;
import world.sake.dbflute.exentity.*;

/**
 * The referrer loader of (サンプル)SAMPLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SAMPLE_ID
 *
 * [column]
 *     SAMPLE_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SAMPLE_ID
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSample {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Sample> _selectedList;
    protected BehaviorSelector _selector;
    protected SampleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSample ready(List<Sample> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SampleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SampleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Sample> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
