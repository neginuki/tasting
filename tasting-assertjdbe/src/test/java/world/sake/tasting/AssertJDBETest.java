package world.sake.tasting;

import javax.annotation.Resource;

import world.sake.dbflute.exbhv.NihonshuBhv;
import world.sake.dbflute.shochudb.exbhv.ShochuBhv;
import world.sake.unit.UnitAssertjdbeTestCase;

public class AssertJDBETest extends UnitAssertjdbeTestCase {

    @Resource
    private NihonshuBhv nihonshuBhv;

    @Resource
    private ShochuBhv shochuBhv;

    public void test_xxx() throws Exception {
        nihonshuBhv.selectList(cb -> {}).forEach(nihonshu -> {
            System.out.println(nihonshu.getNihonshuName());
        });

        shochuBhv.selectList(cb -> {}).forEach(shochu -> {
            System.out.println(shochu.getShochuName());
        });
    }
}
