package world.sake.tasting;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.lastaflute.core.util.ContainerUtil;

import world.sake.assertjdbe.AssertDBEquals;
import world.sake.assertjdbe.ExpectedWorkbook;
import world.sake.dbflute.exbhv.NihonshuBhv;
import world.sake.dbflute.shochudb.exbhv.ShochuBhv;
import world.sake.unit.UnitAssertjdbeTestCase;

public class AssertJDBETest extends UnitAssertjdbeTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        AssertDBEquals jdbe = new AssertDBEquals(ContainerUtil.searchComponentsAll(DataSource.class)) {
            @Override
            protected ExpectedWorkbook createExpectedWorkbook() {
                return super.createExpectedWorkbook();
            }
        };
        log(jdbe.toString());
    }

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
