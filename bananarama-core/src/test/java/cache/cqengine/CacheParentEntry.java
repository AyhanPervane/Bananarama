/* 
 * Copyright 2016 BananaRama.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cache.cqengine;

import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;
import org.bananarama.cache.annotation.Indexed;

/**
 *
 * @author Guglielmo De Concini
 */
public class CacheParentEntry {
    private int idno;

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }
    
    @Indexed
    public static final Attribute<CacheParentEntry,Integer> IDNO = new SimpleAttribute<CacheParentEntry, Integer>("idno") {
        @Override
        public Integer getValue(CacheParentEntry object, QueryOptions queryOptions) {
            return object.idno;
        }
    };
    
    @Indexed
    public static final Attribute<CacheParentEntry,Integer> IDNO_OVERRIDE = new SimpleAttribute<CacheParentEntry, Integer>("idno") {
        @Override
        public Integer getValue(CacheParentEntry object, QueryOptions queryOptions) {
            return object.idno;
        }
    };
}
